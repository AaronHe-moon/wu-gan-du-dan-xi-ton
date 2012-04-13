/*
 * DeviceAliaseList.java
 *
 * Created on 2008年1月19日, 下午1:15
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Aaron.SelectListProviders;

import entity.*;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.hibernate.Criteria; 
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;   

/**
 *
 * @author Administrator
 */
public class SelectListUtil {
    
    /** Creates a new instance of DeviceAliaseList */
    public SelectListUtil() {
        
    }
    
  
    static public List getList(Class tableType, String property, Map conditions){
        if(tableType != TJjbaseSearch.class && 
                tableType != TDeviceSearch.class)
            return null;
        if(conditions == null) return null;
        Session session = HibernateSessionFactory.getSession();
        Criteria cr = session.createCriteria(tableType);
        cr.add(Restrictions.isNotNull(property));
        cr.setProjection(Projections.distinct(
                Projections.property(property)));

        cr.add(Restrictions.allEq(conditions));
        
//        Iterator it = conditions.keySet().iterator();
//        while(it.hasNext()){
//            Object key = it.next();
//            Object value = conditions.get(key);
//            cr.add(Restrictions.eq(key.toString(), value.toString()));
//        }
        
        return cr.list();
    }
}
