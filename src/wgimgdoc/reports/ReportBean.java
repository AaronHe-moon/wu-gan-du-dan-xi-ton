/*
 * ReportBean.java
 *
 * Created on 2007��10��21��, ����7:55
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package wgimgdoc.reports;

import java.sql.Date;

/**
 * 
 * ��Bean�������ɱ���
 * @author ����
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
     * �û�
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    /**
     * �û���Ϊ
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * �û���������
     */
    public String getActionDate() {
        return actionDate;
    }

    public void setActionDate(String actionDate) {
        this.actionDate = actionDate;
    }

    /**
     * �û�����ͼֽ������Ϣ
     */
    public String getBlueprintDescription() {
        return blueprintDescription;
    }

    public void setBlueprintDescription(String blueprintDescription) {
        this.blueprintDescription = blueprintDescription;
    }
    
    
}
