/*
 * PagesStructs.java
 *
 * Created on 2007年10月17日, 上午9:40
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package providers;

/**
 *
 * @author Administrator
 */
public class PagesStructs {
    
    /** Creates a new instance of PagesStructs */
    public PagesStructs() {
    }
    
    public PagesStructs(String pages, int idPage) {
        this.pages = pages;
        this.idPage = idPage;
    }
    
    private String pages;
    private int idPage;
    
    public String getPages() {
        return pages;
    }
    
    public void setPages(String pages) {
        this.pages = pages;
    }
    
    public int getIdPage() {
        return idPage;
    }
    
    public void setIdPage(int idPage) {
        this.idPage = idPage;
    }
}
