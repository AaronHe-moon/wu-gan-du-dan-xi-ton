package filters;
/*
 * UserCheck.java
 *
 * Created on 2007年10月10日, 下午5:45
 */

import entity.TPopedom;
import java.io.*;
import java.util.List;
import javax.servlet.*;
import javax.servlet.http.*;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import wgimgdoc.globe.CurrentUser;

/**
 *
 * @author  Administrator
 * @version
 */

public class UserCheck implements Filter {
    
    // The filter configuration object we are associated with.  If
    // this value is null, this filter instance is not currently
    // configured.
    private FilterConfig filterConfig = null;
    public static final String programEntrance="Login.jsp";
    public static final String excludedPage="DeleteRoleFailure.jsp," +
            "DeleteRoleSuccess.jsp," +
            "Failure.jsp,ModifyNotAllowed.jsp," +
            "Success.jsp," +
//            "Login.jsp," +
            "main.jsp," +
            "LoginFailed.jsp,NoPopedom.jsp," +
            "Welcome.jsp,searchCondition.jsp," +
            "searchJJ.jsp,searchSB.jsp," +
            "preview.jsp,download.jsp," +
           "ChangeAccountPassword.jsp,DBConnectionError.jsp";
 //           "ChangeAccountPassword.jsp";
    public UserCheck() {
    }
    
    private void doBeforeProcessing(ServletRequest request, ServletResponse response)
    throws IOException, ServletException {
        if (debug) log("UserCheck:DoBeforeProcessing");
        
//        HttpServletResponse res=(HttpServletResponse)response;
//        res.setHeader("Pragma","No-cache");
//        res.setHeader("Cache-Control","no-cache");
//        res.setDateHeader("Expires",0);
        //
        // Write code here to process the request and/or response before
        // the rest of the filter chain is invoked.
        //
        
        //
        // For example, a logging filter might log items on the request object,
        // such as the parameters.
        //
        /*
         for (Enumeration en = request.getParameterNames(); en.hasMoreElements(); ) {
             String name = (String)en.nextElement();
             String values[] = request.getParameterValues(name);
             int n = values.length;
             StringBuffer buf = new StringBuffer();
             buf.append(name);
             buf.append("=");
             for(int i=0; i < n; i++) {
                 buf.append(values[i]);
                 if (i < n-1)
                     buf.append(",");
             }
             log(buf.toString());
         }
         */
        
    }
    
    private void doAfterProcessing(ServletRequest request, ServletResponse response)
    throws IOException, ServletException {
        if (debug) log("UserCheck:DoAfterProcessing");
        //
        // Write code here to process the request and/or response after
        // the rest of the filter chain is invoked.
        //
        
        //
        // For example, a logging filter might log the attributes on the
        // request object after the request has been processed.
        //
        /*
        for (Enumeration en = request.getAttributeNames(); en.hasMoreElements(); ) {
            String name = (String)en.nextElement();
            Object value = request.getAttribute(name);
            log("attribute: " + name + "=" + value.toString());
         
        }
         */
        //
        
        //
        // For example, a filter might append something to the response.
        //
        /*
        PrintWriter respOut = new PrintWriter(response.getWriter());
        respOut.println("<P><B>This has been appended by an intrusive filter.</B>");
         */
    }
    
    /**
     *
     * @param request The servlet request we are processing
     * @param result The servlet response we are creating
     * @param chain The filter chain we are processing
     *
     * @exception IOException if an input/output error occurs
     * @exception ServletException if a servlet error occurs
     */
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        
        if (debug) log("UserCheck:doFilter()");
        
        doBeforeProcessing(request, response);
        
        Throwable problem = null;
        HttpServletRequest req=(HttpServletRequest)request;
        HttpServletResponse res=(HttpServletResponse)response;
        ServletContext sc=(ServletContext)getFilterConfig().getServletContext();
        String url = req.getRequestURI();
        
        try {
            String exclude=excludedPage;
            url = url.substring(url.lastIndexOf("/") + 1, url.length());
            String ext=url.substring(url.lastIndexOf(".")+1,url.length());
            if(url.equals(UserCheck.programEntrance)|| url==null||url.equals("")){
                chain.doFilter(request,response);
            }else if(ext.equals("")||ext.equals("jsp")){
                CurrentUser us=(CurrentUser)req.getSession().getAttribute("currentUser");
                String accessPath = req.getContextPath();
                if(us==null){
                    res.sendRedirect("/wgImgDoc/faces/Login.jsp");
                }else{
                    if((!url.equals(""))&&(exclude.indexOf(url)==-1)){ //I have to check its popedom
                        List list=us.getPopedomList();
                        TPopedom temp;
                        String page;
                        //check page popedoms
                        int i=0;
                        for(i=0;(list!=null)&&(i<list.size());i++){
                            temp=(TPopedom)list.get(i);
                            if(temp.getTPopedomPage()!=null){
                                page=temp.getTPopedomPage().getPage();
                                if((page!=null)&&(page.indexOf(url)!=-1)){//I have found the page popedom
                                    //the currentUser has popedom and can access the page
                                    chain.doFilter(request,response);
                                    break;
                                }
                            }
                        }
                        if(i>=list.size()){//page not found
                            res.sendRedirect("/wgImgDoc/faces/Message/NoPopedom.jsp");
                        }
                    }else{
                        chain.doFilter(request,response);
                    }
                }
            }else{
                chain.doFilter(request,response);
            }
        } catch(Throwable t) {
            //
            // If an exception is thrown somewhere down the filter chain,
            // we still want to execute our after processing, and then
            // rethrow the problem after that.
            //
            problem = t;
            t.printStackTrace();
        }
        
        doAfterProcessing(request, response);
        
        //
        // If there was a problem, we want to rethrow it if it is
        // a known type, otherwise log it.
        //
        if (problem != null) {
            if (problem instanceof ServletException) throw (ServletException)problem;
            if (problem instanceof IOException) throw (IOException)problem;
            sendProcessingError(problem, response);
        }
    }
    
    
    /**
     * Return the filter configuration object for this filter.
     */
    public FilterConfig getFilterConfig() {
        return (this.filterConfig);
    }
    /**
     * Set the filter configuration object for this filter.
     *
     * @param filterConfig The filter configuration object
     */
    public void setFilterConfig(FilterConfig filterConfig) {
        
        this.filterConfig = filterConfig;
    }
    
    /**
     * Destroy method for this filter
     *
     */
    public void destroy() {
    }
    
    
    /**
     * Init method for this filter
     *
     */
    public void init(FilterConfig filterConfig) {
        
        this.filterConfig = filterConfig;
        if (filterConfig != null) {
            if (debug) {
                log("UserCheck:Initializing filter");
            }
        }
    }
    
    /**
     * Return a String representation of this object.
     */
    public String toString() {
        
        if (filterConfig == null) return ("UserCheck()");
        StringBuffer sb = new StringBuffer("UserCheck(");
        sb.append(filterConfig);
        sb.append(")");
        return (sb.toString());
        
    }
    
    
    
    private void sendProcessingError(Throwable t, ServletResponse response) {
        
        String stackTrace = getStackTrace(t);
        
        if(stackTrace != null && !stackTrace.equals("")) {
            
            try {
                
                response.setContentType("text/html");
                PrintStream ps = new PrintStream(response.getOutputStream());
                PrintWriter pw = new PrintWriter(ps);
                pw.print("<html>\n<head>\n<title>Error</title>\n</head>\n<body>\n"); //NOI18N
                
                // PENDING! Localize this for next official release
                pw.print("<h1>The resource did not process correctly</h1>\n<pre>\n");
                pw.print(stackTrace);
                pw.print("</pre></body>\n</html>"); //NOI18N
                pw.close();
                ps.close();
                response.getOutputStream().close();;
            }
            
            catch(Exception ex){ }
        } else {
            try {
                PrintStream ps = new PrintStream(response.getOutputStream());
                t.printStackTrace(ps);
                ps.close();
                response.getOutputStream().close();;
            } catch(Exception ex){ }
        }
    }
    
    public static String getStackTrace(Throwable t) {
        
        String stackTrace = null;
        
        try {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            t.printStackTrace(pw);
            pw.close();
            sw.close();
            stackTrace = sw.getBuffer().toString();
        } catch(Exception ex) {}
        return stackTrace;
    }
    
    public void log(String msg) {
        filterConfig.getServletContext().log(msg);
    }
    
    private static final boolean debug = true;
}
