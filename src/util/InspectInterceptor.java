/*
 * InspectInterceptor.java
 *
 * Created on 2007年10月22日, 下午8:35
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package util;

import entity.HibernateSessionFactory;
import entity.TBlueprint;
import entity.TBlueprintInspect;
import entity.TUserDocRecord;
import java.io.Serializable;
import java.sql.Connection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.type.Type;
import wgimgdoc.globe.CurrentUser;

/**
 *
 * @author Administrator
 */
public class InspectInterceptor extends InterceptorEx{
    
    /** Creates a new instance of InspectInterceptor */
    public InspectInterceptor(String accountName) {
        setAccountName(accountName);
    }
    private Set inserts=new HashSet(0);

    public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
        if(entity instanceof TBlueprint){
            getInserts().add(entity);
        }
        return false;
    }

    public void postFlush(Iterator entities) {
        for (Iterator it = getInserts().iterator(); it.hasNext();) {
            TBlueprint elem = (TBlueprint) it.next();
            InspectInterceptor.AddLog(getAccountName(),"审核",elem.getIdBlueprint(),"AAA",getSession().connection());
        }
        inserts.clear();
    }

    public Set getInserts() {
        return inserts;
    }

    public void setInserts(Set inserts) {
        this.inserts = inserts;
    }
    
    public static void AddLog(String accountName,String action,Integer docId,String memo,Connection connection){
        TUserDocRecord tudr=new TUserDocRecord();
        tudr.setAcountName(accountName);
        tudr.setAction(action);
        tudr.setActionDate(new Date());
        tudr.setDocRecordId(docId);
        tudr.setMemo(memo);
        
        Session sn=HibernateSessionFactory.getSessionFactory().openSession(connection);
        sn.save(tudr);
        sn.flush();
        sn.close();
    }
    
    
    public static void main(String[] args){
        TBlueprint tblueprint=new TBlueprint();
        tblueprint.setSnBlueprint("AAAAAAAAA");
        InspectInterceptor interceptor=new InspectInterceptor("usky");
        CurrentUser cu=new CurrentUser();
        cu.setAccountName("usky");
        
//        HibernateSessionFactory.rebuildSessionFactory();
        DBUtil.save(tblueprint,interceptor);
    }

    private String accountName;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    
    

    
}
