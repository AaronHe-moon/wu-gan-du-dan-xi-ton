/*
 * catSelectProvider.java
 *
 * Created on 2007年9月23日, 下午12:36
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package providers;

import com.sun.data.provider.impl.ObjectListDataProvider;
import entity.TFixedCategory;
import entity.TFixedCategoryDAO;

/**
 *
 * @author Administrator
 */
public class catSelectProvider extends ObjectListDataProvider{
    
    /** Creates a new instance of catSelectProvider */
    public catSelectProvider() {
        setObjectType(TFixedCategory.class);
        getList().clear();
        setList(new TFixedCategoryDAO().
                findByProperty("categoryLevel", "1"));
    }
    
    public void refresh(){
        getList().clear();
        setList(new TFixedCategoryDAO().
                findByProperty("categoryLevel", "1"));
    }
}
