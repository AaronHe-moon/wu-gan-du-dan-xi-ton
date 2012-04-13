/*
 * CurrentUser.java
 *
 * Created on 2007年9月28日, 上午10:21
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package wgimgdoc.globe;

import entity.TPopedom;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class CurrentUser {
    
    /** Creates a new instance of CurrentUser */
    public CurrentUser() {
    }
    
    private String accountName;    
    
    private String userName;
    
    private String title;
    
    private String userProf;
    
    private String memo;
    
    private String roleName;
    
    private List popedomList;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserProf() {
        return userProf;
    }

    public void setUserProf(String userProf) {
        this.userProf = userProf;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List getPopedomList() {
        return popedomList;
    }

    public void setPopedomList(List popedomList) {
        this.popedomList = popedomList;
    }

    public boolean canAccessThePage(String pageName){
        List list=getPopedomList();
        String page;
        for (Iterator it = list.iterator(); it.hasNext();) {
            TPopedom elem = (TPopedom) it.next();
            
            if(elem.getTPopedomPage()!=null){
                page=elem.getTPopedomPage().getPage();
                if((page!=null)&&page.equals(pageName)){
                    return true;
                }
            }            
        }
        if(pageName==null) return true;
        return false;
    }

}
