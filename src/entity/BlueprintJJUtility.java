package entity;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;

import entity.*;

public class BlueprintJJUtility {
	public void save(TBlueprint bi, TBlueprintJjbase bji){
		Session session = HibernateSessionFactory.getSession();
		bi.setTBlueprintJjbase(bji);
		bji.setTBlueprint(bi);
		
		Transaction tx = session.beginTransaction();
		session.save(bi);
		tx.commit();
                
	}
	
	public void delete(TBlueprint bi){
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		session.delete(bi);
		tx.commit();
		
	}
	
	public void delete(int id){
		Session session = HibernateSessionFactory.getSession();
		TBlueprint bi = (TBlueprint) session.load(TBlueprint.class, new Integer(id));
//		TBlueprintJjbase bij = (TBlueprintJjbase) session
//			.load(TBlueprintJjbase.class, id);
		Transaction tx = session.beginTransaction();
//		session.delete(bij);
		session.delete(bi);
		tx.commit();
	}
	
	public TBlueprintJjbase getBlueJjbaseByID(int id){
		 return getBlueByID(id).getTBlueprintJjbase();
	}
	
	
	public TBlueprint getBlueByID(int id){
		Session session = HibernateSessionFactory.getSession();
		try {
			return (TBlueprint) session.load(TBlueprint.class, new Integer(id));
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public List getBluesBySample(TBlueprint bi){
		return HibernateSessionFactory.getSession().createCriteria(TBlueprint.class)
			.add(Example.create(bi)).list();
	}
	
	
	public List getBlueJjbasesBySample(TBlueprintJjbase bi){
		return HibernateSessionFactory.getSession().createCriteria(TBlueprintJjbase.class)
			.add(Example.create(bi)).list();
	}
	
	
	public List getBluesByProperty(String propertyName, Object value){
		String strQuery = "from TBlueprint as modle where modle." 
			+ propertyName + " = ?";
		Query query = HibernateSessionFactory.getSession().createQuery(strQuery);
		query.setParameter(0, value);
		return query.list();
	}
	
	
	public List getBlueJjbasesByProperty(String propertyName, Object value){
		String strQuery = "from TBlueprintJjbase as modle where modle." 
			+ propertyName + " = ?";
		Query query = HibernateSessionFactory.getSession().createQuery(strQuery);
		query.setParameter(0, value);
		return query.list();
	}
        
        public List getBlueJjbaseByCateStringArray(String[] cats){
            String conditionCat = "";
            for (int i = 0; i < cats.length; i++) {
                if(i == 0){
                    conditionCat += "\'" +cats[i] + "\'";
                }
                else{
                    conditionCat += "," + "\'" +cats[i] + "\'";
                }
                    
            }
            String query = "from TBlueprintJjbase where categoryString in (%s)";
            Object[] obj = {conditionCat};
            query = String.format(query, obj);
            return HibernateSessionFactory.getSession()
                .createQuery(query).list();
 
        }
}
