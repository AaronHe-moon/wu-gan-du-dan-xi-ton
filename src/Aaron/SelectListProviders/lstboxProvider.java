/*
 * lstboxProvider.java
 *
 * Created on 2008年1月19日, 下午3:32
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Aaron.SelectListProviders;

import com.sun.data.provider.impl.*;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Administrator
 */
public class lstboxProvider extends ObjectListDataProvider{
    
    /** Creates a new instance of lstboxProvider */
    public lstboxProvider() {
        setObjectType(ListBoxItemStructs.class);
    }
    
    //DeviceAliaseList.getList() is a test version of this fuction; it has
    //passed the test
    public void refresh(Class tableType, String property, Map conditions){
        
        getList().clear();
        List lst = SelectListUtil.getList(
                tableType, property, conditions);
        Iterator it = lst.iterator();
        while(it.hasNext()){
            getList().add(new ListBoxItemStructs(it.next().toString()));
        }
    }
}
