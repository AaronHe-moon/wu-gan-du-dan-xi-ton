/*
 * ReportUtil.java
 *
 * Created on 2007年10月21日, 下午8:30
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
 * 报表数据生成辅助类
 * @author 何亮
 */
public class ReportUtil {
    
    /** Creates a new instance of ReportUtil */
    public ReportUtil() {
    }
    
    /**
     * 得到记录表中数据
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
     * 得到报表数据
     */
    static public List getReportBeans(Date startDate, Date endDate, List users, List actionList){
        //先得到记录表中的数据，再进行下一步处理
        List records = getUserDocRecords(startDate, endDate, users, actionList);
        //报表数据列表
        List reportBeans = new ArrayList();
        Iterator it = records.iterator();
        while(it.hasNext()){//报表数据要根据记录中的数据来生成
            ReportBean rb = new ReportBean();
            TUserDocRecord udr = (TUserDocRecord) it.next();
            //用户名
            TUser user = (TUser)HibernateSessionFactory.getSession()
            .load(TUser.class, udr.getAcountName());
            rb.setUser(user.getAccountName());
            //下面一段代码，根据图纸ID号，得到真实图纸，并形成文字说明
            TBlueprintJjbase bjj = null;
            TBlueprintDevice bsb = null;
            try{//用主键得到基建图纸，可能会出错，只是跳过。
                bjj = (TBlueprintJjbase) HibernateSessionFactory
                        .getSession().load(TBlueprintJjbase.class, udr.getDocRecordId());
                
            }catch(Exception ex){
            }
            try {//用主键得到设备图纸，可能会出错，只是跳过。
                bsb = (TBlueprintDevice) HibernateSessionFactory
                        .getSession().load(TBlueprintDevice.class, udr.getDocRecordId());
            } catch (Exception e) {
                
            }//根据基建还是设备图纸，形成报表中的文字说明
            
            if(bjj != null){
                String strContext = "工程：%s；项目：%s；图纸名：%s；图号：%s";
                Object[] objs = {bjj.getBlueprintProject(), bjj.getProjectName(),
                bjj.getBlueprintName(), bjj.getSnBlueprint()};
                strContext = String.format(strContext, objs);
                rb.setBlueprintDescription(strContext);
            }
            if(bsb != null){
                String strContext = "设备：%s；部件：%s；图号：%s";
                Object[] objs = {bsb.getDeviceCode(), bsb.getPartName(),
                bsb.getSnBlueprint()};
                strContext = String.format(strContext, objs);
                rb.setBlueprintDescription(strContext);
            }//用户操作和日期
            rb.setAction(udr.getAction());
            
            //日期转为中文字
            DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, 
                    Locale.CHINESE);
            rb.setActionDate(df.format(udr.getActionDate()));
            reportBeans.add(rb);
        }
        return reportBeans;
    }
}
