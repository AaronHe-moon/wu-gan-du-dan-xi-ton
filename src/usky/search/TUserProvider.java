/*
 * TUserObjectListDataProvider.java
 *
 * Created on 2007年9月22日, 下午9:16
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package usky.search;

import com.sun.data.provider.impl.ObjectListDataProvider;
import entity.TUser;
import util.TUserUtil;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class TUserProvider extends ObjectListDataProvider {
    
    /** Creates a new instance of TUserObjectListDataProvider */
    public TUserProvider() {
        this.setObjectType(TUser.class);
    }
    
    public void refresh(){
        TUser tuser=new TUser();
        List l=TUserUtil.findByExample(tuser);
        this.getList().clear();
        getList().addAll(l);
    }
    
    public void refreshByExample(TUser tuser){
        List l = TUserUtil.findByExample(tuser);
        this.getList().clear();
        getList().addAll(l);            
    }        
}
