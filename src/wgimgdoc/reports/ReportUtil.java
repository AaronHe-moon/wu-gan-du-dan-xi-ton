/*
 * ReportUtil.java
 *
 * Created on 2007��10��21��, ����8:30
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package wgimgdoc.reports;

import entity.HibernateSessionFactory;
import entity.TBlueprintDevice;
import entity.TBlueprintJjbase;
import entity.TUser;
import entity.TUserDocRecord;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 * �����������ɸ�����
 * @author ����
 */
public class ReportUtil {
    
    /** Creates a new instance of ReportUtil */
    public ReportUtil() {
    }
    
    /**
     * �õ���¼��������
     */
    static private List getUserDocRecords(Date startDate, Date endDate, List users, List actionList){
        Criteria cr = HibernateSessionFactory.getSession()
        .createCriteria(TUserDocRecord.class);
        cr.add(Restrictions.ge("actionDate", startDate))
        .add(Restrictions.le("actionDate", endDate))
        .add(Restrictions.in("acountName", users))
        .add(Restrictions.in("action", actionList));
        
        return cr.list();
    }
    
    /**
     * �õ���������
     */
    static public List getReportBeans(Date startDate, Date endDate, List users, List actionList){
        //�ȵõ���¼���е����ݣ��ٽ�����һ������
        List records = getUserDocRecords(startDate, endDate, users, actionList);
        //���������б�
        List reportBeans = new ArrayList();
        Iterator it = records.iterator();
        while(it.hasNext()){//��������Ҫ���ݼ�¼�е�����������
            ReportBean rb = new ReportBean();
            TUserDocRecord udr = (TUserDocRecord) it.next();
            //�û���
            TUser user = (TUser)HibernateSessionFactory.getSession()
            .load(TUser.class, udr.getAcountName());
            rb.setUser(user.getAccountName());
            //����һ�δ��룬����ͼֽID�ţ��õ���ʵͼֽ�����γ�����˵��
            TBlueprintJjbase bjj = null;
            TBlueprintDevice bsb = null;
            try{//�������õ�����ͼֽ�����ܻ����ֻ��������
                bjj = (TBlueprintJjbase) HibernateSessionFactory
                        .getSession().load(TBlueprintJjbase.class, udr.getDocRecordId());
                
            }catch(Exception ex){
            }
            try {//�������õ��豸ͼֽ�����ܻ����ֻ��������
                bsb = (TBlueprintDevice) HibernateSessionFactory
                        .getSession().load(TBlueprintDevice.class, udr.getDocRecordId());
            } catch (Exception e) {
                
            }//���ݻ��������豸ͼֽ���γɱ����е�����˵��
            
            if(bjj != null){
                String strContext = "���̣�%s����Ŀ��%s��ͼֽ����%s��ͼ�ţ�%s";
                Object[] objs = {bjj.getBlueprintProject(), bjj.getProjectName(),
                bjj.getBlueprintName(), bjj.getSnBlueprint()};
                strContext = String.format(strContext, objs);
                rb.setBlueprintDescription(strContext);
            }
            if(bsb != null){
                String strContext = "�豸��%s��������%s��ͼ�ţ�%s";
                Object[] objs = {bsb.getDeviceCode(), bsb.getPartName(),
                bsb.getSnBlueprint()};
                strContext = String.format(strContext, objs);
                rb.setBlueprintDescription(strContext);
            }//�û�����������
            rb.setAction(udr.getAction());
            
            //����תΪ������
            DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, 
                    Locale.CHINESE);
            rb.setActionDate(df.format(udr.getActionDate()));
            reportBeans.add(rb);
        }
        return reportBeans;
    }
}
