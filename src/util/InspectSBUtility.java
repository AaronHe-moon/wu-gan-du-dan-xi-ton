package util;

import entity.*;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;

public class InspectSBUtility {
    public void save(TBlueprintInspect bi, TBlueprintDeviceInspect bdi)throws HibernateException{
        Session session = HibernateSessionFactory.getSession();
        bi.setTBlueprintDeviceInspect(bdi);
        bdi.setTBlueprintInspect(bi);
        
        Transaction tx = session.beginTransaction();
        session.save(bi);
        tx.commit();
        session.close();
    }
    
    public void delete(TBlueprintInspect bi)throws HibernateException{
        Session session = HibernateSessionFactory.getSession();
        Transaction tx = session.beginTransaction();
        session.delete(bi);
        tx.commit();
        session.close();
    }
    
    public void delete(int id)throws HibernateException{
        Session session = HibernateSessionFactory.getSession();
        TBlueprintInspect bi = (TBlueprintInspect) session.load(TBlueprintInspect.class, new Integer(id));
//		TBlueprintJjbaseInspect bij = (TBlueprintJjbaseInspect) session
//			.load(TBlueprintJjbaseInspect.class, id);
        Transaction tx = session.beginTransaction();
//		session.delete(bij);
        session.delete(bi);
        tx.commit();
        session.close();
    }
    
    public TBlueprintDeviceInspect getBlueDeviceInspectByID(int id)throws HibernateException{
        return getBlueInspectByID(id).getTBlueprintDeviceInspect();
    }
    
    
    public TBlueprintInspect getBlueInspectByID(int id)throws HibernateException{
        Session session = HibernateSessionFactory.getSession();
        return (TBlueprintInspect) session.load(TBlueprintInspect.class, new Integer(id));
        
    }
    
    public List getBlueInspectsBySample(TBlueprintInspect bi)throws HibernateException{
        return HibernateSessionFactory.getSession().createCriteria(TBlueprintInspect.class)
        .add(Example.create(bi)).list();
    }
    
    
    public List getBlueDeviceInspectsBySample(TBlueprintDeviceInspect bi)throws HibernateException{
        return HibernateSessionFactory.getSession().createCriteria(TBlueprintDeviceInspect.class)
        .add(Example.create(bi)).list();
    }
    
    
    public List getBlueInspectsByProperty(String propertyName, Object value)throws HibernateException{
        String strQuery = "from TBlueprintInspect as modle where modle."
                + propertyName + " = ?";
        Query query = HibernateSessionFactory.getSession().createQuery(strQuery);
        query.setParameter(0, value);
        return query.list();
    }
    
    
    public List getBlueDeviceInspectsByProperty(String propertyName, Object value){
        String strQuery = "from TBlueprintDeviceInspect as modle where modle."
                + propertyName + " = ?";
        Query query = HibernateSessionFactory.getSession().createQuery(strQuery);
        query.setParameter(0, value);
        return query.list();
    }
}
