package filters;
/*
 * ServletFilter.java
 *
 * Created on 2007年10月14日, 上午4:32
 */

import entity.TUserDocRecord;
import java.io.*;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import util.DBUtil;
import util.TUserDocRecordUtil;
import wgimgdoc.globe.CurrentUser;

/**
 *
 * @author  Administrator
 * @version
 */

public class ServletFilter implements Filter {
    
    private FilterConfig filterConfig = null;
    
    public ServletFilter() {
    }
    
    private void doBeforeProcessing(ServletRequest request, ServletResponse response)
    throws IOException, ServletException {
        if (debug) log("ServletFilter:DoBeforeProcessing");
    }
    
    private void doAfterProcessing(ServletRequest request, ServletResponse response)
    throws IOException, ServletException {
        if (debug) log("ServletFilter:DoAfterProcessing");
    }
    
    public void doFilter(ServletRequest request, ServletResponse response,FilterChain chain)throws IOException, ServletException {
        
        if (debug) log("ServletFilter:doFilter()");
        
        doBeforeProcessing(request, response);
        
        Throwable problem = null;
        
        try {
            HttpServletRequest req=(HttpServletRequest)request;
            HttpServletResponse res=(HttpServletResponse)response;
            ServletContext sc=(ServletContext)getFilterConfig().getServletContext();
            String url = req.getRequestURI();
            String parameter;
            String action=null;
            String id=null;
            int index=-1;
            CurrentUser cu=(CurrentUser)req.getSession().getAttribute("currentUser");
            if(url.lastIndexOf("ServletDownload")!=-1){
                parameter=req.getQueryString();
                if(parameter!=null){
                    action="下载";
                    String[] division=parameter.split("&");
                    for(int i=0;i<division.length;i++){
                        if(division[i].indexOf("id")!=-1){
                            id=division[i].substring(3,division[i].length());
                        }
                    }
                }
            }else if(url.lastIndexOf("renderImage")!=-1){
                parameter=req.getQueryString();
                if(parameter!=null){
                    action="查看";
                    String[] division=parameter.split("&");
                    for(int i=0;i<division.length;i++){
                        if(division[i].indexOf("id")!=-1){
                            id=division[i].substring(3,division[i].length());
                        }
                    }
                }
            } else if(url.lastIndexOf("ServletReport")!=-1){
                chain.doFilter(request, response);
            }
            
            if(id!=null){
                TUserDocRecord tuid=new TUserDocRecord();
                tuid.setAcountName(cu.getAccountName());
                tuid.setAction(action);
                tuid.setActionDate(new Date());
                tuid.setDocRecordId(Integer.valueOf(id));
                String memo=tuid.getAcountName()+"在"+tuid.getActionDate()+tuid.getAction()+tuid.getDocRecordId()+"号图档";
                tuid.setMemo(memo);
                TUserDocRecordUtil.save(tuid);
            }
            chain.doFilter(request, response);
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
                log("ServletFilter:Initializing filter");
            }
        }
    }
    
    /**
     * Return a String representation of this object.
     */
    public String toString() {
        
        if (filterConfig == null) return ("ServletFilter()");
        StringBuffer sb = new StringBuffer("ServletFilter(");
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
