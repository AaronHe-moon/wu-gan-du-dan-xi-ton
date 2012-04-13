package util;

import entity.*;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Interceptor;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;

public class DBUtil {
    
    public static void saveOrUpdate(Object obj) throws HibernateException{
        Session session=HibernateSessionFactory.getSession();
        Transaction tx=session.beginTransaction();
        session.saveOrUpdate(obj);
        tx.commit();
        HibernateSessionFactory.closeSession();
    }
    
    public static void save(Object obj,InterceptorEx interceptor)throws HibernateException{
        Session session=HibernateSessionFactory.getSessionFactory().openSession(interceptor);
        Transaction tx=session.beginTransaction();
        interceptor.setSession(session);
        session.save(obj);
        tx.commit();
        HibernateSessionFactory.closeSession();
    }
    
    public static void save(Object obj) throws HibernateException {
        Session session=HibernateSessionFactory.getSession();
        Transaction tx=session.beginTransaction();
        
        session.save(obj);
        tx.commit();
       HibernateSessionFactory.closeSession();
    }
    
    
    public static void update(Object obj) throws HibernateException{
        Session session=HibernateSessionFactory.getSession();
        Transaction tx=session.beginTransaction();
        session.update(obj);
        tx.commit();
       HibernateSessionFactory.closeSession();
    }
    public static void delete(Object obj) throws HibernateException {
        Session session=HibernateSessionFactory.getSession();
        Transaction tx=session.beginTransaction();
        
        session.delete(obj);
        tx.commit();
        HibernateSessionFactory.closeSession();
    }
    
    //if there is no data found,return null
    //else return a List Object
    public static List findByExample(Object obj) throws HibernateException{
        Session session=HibernateSessionFactory.getSession();
        Criteria criteria=session.createCriteria(obj.getClass());
        
        criteria.add(Example.create(obj));
        
        List list=criteria.list();
        HibernateSessionFactory.closeSession();
        return list;
    }
    
    public static List findByProperty(String tableClassName,String propertyName, Object value){
        String strQuery = "from "+ tableClassName+" as modle where modle."
                + propertyName + " = ?";
       Session session= HibernateSessionFactory.getSession();
        Query query =session.createQuery(strQuery);
        query.setParameter(0, value);
         List list=query.list();
        HibernateSessionFactory.closeSession();
        return list;
    }
    
    
    public static void closeSession(){
        HibernateSessionFactory.closeSession();
    }
    
    public static boolean batchProcess(List list) throws HibernateException{
        Session session=HibernateSessionFactory.getSession();
        Transaction tx=session.beginTransaction();
        try {
            for(int i=0;(list!=null)&&(i<list.size());i++){
                DBOP dbop=(DBOP)list.get(i);
                if(dbop.getOpType().equals(DBOP.DELETE)){
                    session.delete(dbop.getEntity());
                }else if(dbop.getOpType().equals(DBOP.INSERT)){
                    session.save(dbop.getEntity());
                }else if(dbop.getOpType().equals(DBOP.UPDATE)){
                    session.update(dbop.getEntity());
                }
            }                   
             tx.commit();
             HibernateSessionFactory.closeSession();
             return true;
        } catch (HibernateException ex) {
            tx.rollback();
            return false;
        }
    }    
}
