/*
 * ServletDownload.java
 *
 * Created on 2007��9��24��, ����7:50
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
        
        
        //������ͷ������
        response.setContentType("application/x-download");
        try {
            response.setHeader("Content-Disposition","attachment;filename="
                    + URLEncoder.encode(docType, "UTF-8"));
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
        //�������������������ļ������ݿ����ݵȣ�������������ѭ�����������ݵ������У���д����response�����
        //FileInputStream fis = new FileInputStream(new File("x:/path/file"));
        
        byte[] buffer = new byte[1024];
        int length;
        try {
            while((length = fis.read(buffer)) > 0){
                response.getOutputStream().write(buffer, 0, length);
                if(length < 1024)
                    break;
            }
            //�ǵùر�
            response.getOutputStream().flush();
            response.getOutputStream().close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
    private void displayErroPage(final HttpServletResponse response) {
        //�д����ֱ����ʾ����ҳ��
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = null;
        try {
            out = response.getWriter();
        } catch (IOException exp) {
            exp.printStackTrace();
        }
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>���ش���</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>����ʱ���ִ��� </h1>");
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
