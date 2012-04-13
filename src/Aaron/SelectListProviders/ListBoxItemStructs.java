/*
 * ListBoxItemStructs.java
 *
 * Created on 2008年1月19日, 下午5:09
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Aaron.SelectListProviders;

/**
 *
 * @author Administrator
 */
public class ListBoxItemStructs {
    
    /** Creates a new instance of ListBoxItemStructs */
    public ListBoxItemStructs() {
    }
    public ListBoxItemStructs(String content){
        this.content = content;
    }
    
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
