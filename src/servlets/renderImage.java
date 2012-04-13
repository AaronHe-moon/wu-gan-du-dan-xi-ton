/*
 * renderImage.java
 *
 * Created on 2007��9��27��, ����12:22
 */

package servlets;

import entity.BlueprintJJUtility;
import entity.BlueprintSBUtility;
import util.InspectJJUtility;
import util.InspectSBUtility;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.io.*;
import java.sql.Blob;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Administrator
 * @version
 */
public class renderImage extends HttpServlet {
    
    /** Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter out = response.getWriter();
//        /* TODO output your page here
//        out.println("<html>");
//        out.println("<head>");
//        out.println("<title>Servlet renderImage</title>");
//        out.println("</head>");
//        out.println("<body>");
//        out.println("<h1>Servlet renderImage at " + request.getContextPath () + "</h1>");
//        out.println("</body>");
//        out.println("</html>");
//         */
//        out.close();
        
        try {
            renderImage(response, request);
        } catch (Exception ex){
            renderError(response);
        }
        
    }
    
    private void renderImage(HttpServletResponse response,
            HttpServletRequest request) throws IOException{
        BufferedImage img = processImage(imageFromHib(request),
                Integer.parseInt(request.getParameter("direction")));
        response.setContentType("image/jpeg");
        OutputStream out=response.getOutputStream();
        ImageIO.write(img, "jpg", out);
        out.close();
    }
    
    //���Ͳ����������£�
    //table:���ĸ���ֵΪ(inspectJJ, inspectSB, JJ, SB)
    //id:ͼֽ��ID
    //directionͼֽ�ķ���,ֵΪ(0Ϊ����1Ϊ��ת��2Ϊ���ã�3Ϊ��ת����������ֵתΪ��4���󣬽��д���)
    private Blob imageFromHib(HttpServletRequest request){
        String tablename = request.getParameter("table");
        int id = Integer.parseInt(request.getParameter("id"));
        //ȡ��ͼֽ
        if(tablename.equalsIgnoreCase("inspectJJ")){
            InspectJJUtility util = new InspectJJUtility();
            return util.getBlueJjbaseInspectByID(id).getSmallImage();
        }else if(tablename.equalsIgnoreCase("inspectSB")){
            InspectSBUtility util = new InspectSBUtility();
            return util.getBlueDeviceInspectByID(id).getSmallImage();
        }else if(tablename.equalsIgnoreCase("JJ")){
            BlueprintJJUtility util = new BlueprintJJUtility();
            return util.getBlueJjbaseByID(id).getSmallImage();
        }else if(tablename.equalsIgnoreCase("SB")){
            BlueprintSBUtility util = new BlueprintSBUtility();
            return util.getBlueDeviceByID(id).getSmallImage();
        }else{
            return null;
        }
    }
    
    private int processDirection(int nDirection){
        nDirection = nDirection % 4;
        if(nDirection < 0)
            nDirection += 4;
        return nDirection;
    }
    
    private BufferedImage processImage(Blob blob, int nDirection){
        BufferedImage img = null;
        try {
            img = ImageIO.read(blob.getBinaryStream());
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        //��ת����
        AffineTransform at = new AffineTransform();
        nDirection = processDirection(nDirection);
        if(nDirection == 1){//����ת
            at.rotate(Math.PI / 2, 0, img.getHeight());
            at.translate(-img.getHeight(), 0);
        }else if(nDirection == 2){//����
            at.rotate(Math.PI, 0, img.getHeight());
            at.translate(-img.getWidth(), img.getHeight());
        }else if(nDirection == 3){//����ת
            at.rotate(-Math.PI / 2, img.getWidth(), 0);
            at.translate(0, -img.getWidth());
        }
        
        AffineTransformOp ato = new AffineTransformOp(at, null);
        BufferedImageOp op = ato;
        return op.filter(img, null);
    }
    
    private void renderError(HttpServletResponse response){
        response.setContentType("image/jpeg");
        BufferedImage img = new BufferedImage(400, 60,
                BufferedImage.TYPE_INT_RGB);
        Graphics2D graphic = (Graphics2D) img.getGraphics();
        graphic.setBackground(Color.white);
        graphic.clearRect(0, 0, img.getWidth(), img.getHeight());
        graphic.setColor(Color.black);
        graphic.setFont(new Font("����", Font.PLAIN, 30));
        graphic.drawString("ͼֽͼƬ�����ڻ��������", 20, img.getHeight()/2);
        try {
            ImageIO.write(img, "jpg", response.getOutputStream());
            response.getOutputStream().close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
//        PrintWriter out = null;
//        try {
//            out = response.getWriter();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//        out.println("<html>");
//        out.println("<head>");
//        out.println("<title>Servlet renderImage ERROR</title>");
//        out.println("</head>");
//        out.println("<body>");
//        out.println("<h1>ͼֽͼƬ�����ڻ��������</h1>");
//        out.println("</body>");
//        out.println("</html>");
//        out.close();
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    /** Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    /** Returns a short description of the servlet.
     */
    public String getServletInfo() {
        return "Short description";
    }
    // </editor-fold>
}
