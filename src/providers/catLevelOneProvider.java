/*
 * catLevelOneProvider.java
 *
 * Created on 2007年9月23日, 上午9:27
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package providers;

import com.sun.data.provider.impl.ObjectListDataProvider;
import entity.*;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


/**
 *
 * @author Administrator
 */
public class catLevelOneProvider extends ObjectListDataProvider{
    
    /**
     * Creates a new instance of catLevelOneProvider
     */
    public catLevelOneProvider() {
        setObjectType(TFixedCategory.class);
        getList().clear();
        getList().addAll(getL1());
    }
    
    public void refresh(){
        getList().clear();
        getList().addAll(getL1());
    }
    
    private List getL1(){
        Session session = HibernateSessionFactory.getSession();
        Criteria cr = session.createCriteria(TFixedCategory.class);
        cr.add(Restrictions.eq("categoryLevel", "1"));
        return cr.list();
    }
    
}
