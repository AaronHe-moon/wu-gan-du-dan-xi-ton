/*
 * TRoleUtil.java
 *
 * Created on 2007年9月21日, 下午4:11
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package util;

import entity.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.hibernate.HibernateException;

/**
 *
 * @author Administrator
 */
public class TRoleUtil {
    
    /** Creates a new instance of TRoleUtil */
    public TRoleUtil() {
    }
    
    public static void saveOrUpdate(TRole trole) throws HibernateException{
        DBUtil.saveOrUpdate(trole);
    }
    
    public static void saveOrUpdate(String roleName,String memo)throws HibernateException{
        TRole trole=new TRole();
        trole.setRoleName(roleName);
        trole.setMemo(memo);
        DBUtil.saveOrUpdate(trole);        
    }
    public static void save(String roleName,String memo) throws HibernateException {
        TRole trole=new TRole();
        trole.setRoleName(roleName);
        trole.setMemo(memo);
        DBUtil.save(trole);
    }
    public static void save(TRole trole) throws HibernateException {
        DBUtil.save(trole);
    }
    
    /**
     *if the intended role not found,then return null
     *else return the role instance
     */
    public static TRole findByRoleName(String roleName)throws HibernateException {
        List list=DBUtil.findByProperty("TRole","roleName",roleName);
        return (TRole)((list!=null)&&(list.size()>0)?list.get(0):null);
    }
    
    /**
       *the example's primary is not useful
     *so the code 
     *    TRole trole=new TRole();
     *Equals: TRole trole=new TRole();trole.setRoleName("AAA");
     *
     *the two method's has no difference
     */
    public static List findByExample(TRole trole) throws HibernateException {
        return DBUtil.findByExample(trole);
    }
    
    public static void update(TRole trole) throws HibernateException{
       DBUtil.update(trole);
    }
    
    /**
     *Method: findRolePopedoms
     *Parameter:String roleName     --the intended role to be queried
     *instruction:
     * if the intended role has no popedoms,then it will return an empty list
     *else if the role contains some popedoms,it will return a list containing 
     *the TPopedom instances
     */
    public static List findRolePopedoms(String roleName){
        TRole trole=TRoleUtil.findByRoleName(roleName);
        Set set=trole.getTRolePopedoms();
        Iterator iterator=set.iterator();
        
        TRolePopedom temp;
        TPopedom popedom;
        List popedomList=new ArrayList();
        while(iterator.hasNext()){
            temp=(TRolePopedom)iterator.next();
//            popedom=temp.getId().getTPopedom();
//            popedom.getPopedomName();
            popedomList.add(temp.getId().getTPopedom());
        }
        
        return popedomList;
    }
    

}
