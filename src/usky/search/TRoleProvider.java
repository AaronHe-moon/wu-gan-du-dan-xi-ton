/*
 * TRoleObjectListDataProvider.java
 *
 * Created on 2007年9月22日, 下午8:44
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package usky.search;

import com.sun.data.provider.impl.ObjectListDataProvider;
import entity.TRole;
import util.TRoleUtil;
import entity.TUser;
import util.TUserUtil;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class TRoleProvider extends ObjectListDataProvider{
    
    /** Creates a new instance of TRoleObjectListDataProvider */
    public TRoleProvider() {
        this.setObjectType(TRole.class);
    }
    
    public void refresh(){
        TRole trole=new TRole();
        List l=TRoleUtil.findByExample(trole);
        this.getList().clear();
        getList().addAll(l);
    }
    
    public void refreshByExample(TRole trole){
        List l = TRoleUtil.findByExample(trole);
        this.getList().clear();
        getList().addAll(l);            
    }
    
}
