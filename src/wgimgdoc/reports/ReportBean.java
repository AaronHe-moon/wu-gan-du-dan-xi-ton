/*
 * ReportBean.java
 *
 * Created on 2007年10月21日, 下午7:55
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package wgimgdoc.reports;

import java.sql.Date;

/**
 * 
 * 此Bean用来生成报表
 * @author 何亮
 */
public class ReportBean {
    
    /** Creates a new instance of ReportBean */
    public ReportBean() {
    }
    
    private String user;
    private String action;
    private String actionDate;
    private String blueprintDescription;

    /**
     * 用户
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    /**
     * 用户行为
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * 用户操作日期
     */
    public String getActionDate() {
        return actionDate;
    }

    public void setActionDate(String actionDate) {
        this.actionDate = actionDate;
    }

    /**
     * 用户操作图纸描述信息
     */
    public String getBlueprintDescription() {
        return blueprintDescription;
    }

    public void setBlueprintDescription(String blueprintDescription) {
        this.blueprintDescription = blueprintDescription;
    }
    
    
}
