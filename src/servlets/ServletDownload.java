/*
 * ServletDownload.java
 *
 * Created on 2007年9月24日, 下午7:50
 */

package servlets;

import java.io.*;
import java.net.URLEncoder;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.http.*;
import entity.*;

/**
 *
 * @author Administrator
 * @version
 */
public class ServletDownload extends HttpServlet {
    
    /** Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, SQLException {
        String strId = request.getParameter("id");
        int id = Integer.parseInt(strId);
        BlueprintJJUtility util = new BlueprintJJUtility();
        TBlueprint blue = util.getBlueByID(id);
        
        String[] docTypes = blue.getDocType().split("/");
        String docType = docTypes[docTypes.length-1];
        
        InputStream fis=null;
        
        try {
            fis = blue.getBigImage().getBinaryStream();
            
        } catch (Exception ex) {
            ex.printStackTrace();
            displayErroPage(response);
            return;
        }
        
        
        //先设置头与内容
        response.setContentType("application/x-download");
        try {
            response.setHeader("Content-Disposition","attachment;filename="
                    + URLEncoder.encode(docType, "UTF-8"));
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
        //设置输入流（可以是文件，数据库数据等），缓冲区，用循环读入流数据到缓冲中，并写出到response输出流
        //FileInputStream fis = new FileInputStream(new File("x:/path/file"));
        
        byte[] buffer = new byte[1024];
        int length;
        try {
            while((length = fis.read(buffer)) > 0){
                response.getOutputStream().write(buffer, 0, length);
                if(length < 1024)
                    break;
            }
            //记得关闭
            response.getOutputStream().flush();
            response.getOutputStream().close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
    private void displayErroPage(final HttpServletResponse response) {
        //有错误就直接显示错误页面
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = null;
        try {
            out = response.getWriter();
        } catch (IOException exp) {
            exp.printStackTrace();
        }
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>下载错误</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>下载时出现错误！ </h1>");
        out.println("</body>");
        out.println("</html>");
        
        out.close();
    }
    
// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ServletException ex) {
            ex.printStackTrace();
        }
    }
    
    /** Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ServletException ex) {
            ex.printStackTrace();
        }
    }
    
    /** Returns a short description of the servlet.
     */
    public String getServletInfo() {
        return "Short description";
    }
// </editor-fold>
}
