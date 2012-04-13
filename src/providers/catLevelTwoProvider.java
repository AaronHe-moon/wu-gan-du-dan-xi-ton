/*
 * catLevelTwoProvider.java
 *
 * Created on 2007年9月23日, 下午12:29
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package providers;

import com.sun.data.provider.impl.ObjectListDataProvider;
import entity.TFixedCategory;
import entity.TFixedCategoryDAO;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class catLevelTwoProvider extends ObjectListDataProvider{
    
    /** Creates a new instance of catLevelTwoProvider */
    public catLevelTwoProvider() {
        this.setObjectType(TFixedCategory.class);

        
    }
    
    public void refresh(Integer lookup){
        List l = new TFixedCategoryDAO().findByProperty("idUp", lookup);
        getList().clear();
        getList().addAll(l);
    }
    
}
