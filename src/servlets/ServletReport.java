/*
 * ServletReport.java
 *
 * Created on 2007年10月22日, 下午7:51
 */

package servlets;

import java.io.*;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;


import javax.servlet.*;
import javax.servlet.http.*;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import wgimgdoc.reports.*;


/**
 *
 * @author Administrator
 * @version
 */
public class ServletReport extends HttpServlet {
    
    /** Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        ServletOutputStream out = response.getOutputStream();
        InputStream is = getServletConfig().getServletContext()
        .getResourceAsStream("/reports/actionReport.jasper");
        //reportStartDate, reportEndDate, userList, exportType, actionList
        Date startDate = (Date)request.getSession().getAttribute("reportStartDate");
        Date endDate = (Date)request.getSession().getAttribute("reportEndDate");
        List userList = (List)request.getSession().getAttribute("userList");
        Integer exportType = Integer.valueOf((String)request
                .getSession().getAttribute("exportType"));
        List actionList = (List)request.getSession().getAttribute("actionList");
        
        
        
        List reportDataSourceList = ReportUtil.getReportBeans(startDate, endDate, 
                userList, actionList);
        JRDataSource jrds = new JRBeanCollectionDataSource(reportDataSourceList);
        
        HashMap hm = new HashMap();
        DateFormat de = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.CHINESE);
        
        hm.put("StartDate", de.format(startDate));
        hm.put("EndDate", de.format(endDate));
        JasperPrint jp;
        try {
            jp = JasperFillManager.fillReport(is, hm, jrds);
            JRExporter jrExport = null;
            String extendName = "txt";
            switch (exportType.intValue()){
                case 1 : jrExport = new JExcelApiExporter();
                         extendName = ".xls";
                         break;
                case 2 : jrExport = new JRRtfExporter();
                         extendName = ".rtf";
                         break;
                case 3 : jrExport = new JRHtmlExporter();
                         extendName = ".html";
                         break;
                case 4 : jrExport = new JRPdfExporter();
                         extendName = ".pdf";
                         break;
            }
            jrExport.setParameter(JRExporterParameter.JASPER_PRINT, jp);
            jrExport.setParameter(JRExporterParameter.OUTPUT_STREAM, out);
            
            response.setContentType("application/x-download");
            response.setHeader("Content-Disposition", 
                    "attachment;filename=report" + extendName);
            jrExport.exportReport();
            out.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally {
            out.close();
        }
        
        
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
