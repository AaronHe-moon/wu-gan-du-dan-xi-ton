/*
 * InspectDeviceObjectListDataProvider.java
 *
 * Created on 2007年9月20日, 下午1:15
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package usky.search;

import com.sun.data.provider.impl.ObjectListDataProvider;
import util.InspectSBUtility;
import entity.TBlueprintDeviceInspect;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class InspectDeviceProvider extends ObjectListDataProvider{
    
    /** Creates a new instance of InspectDeviceObjectListDataProvider */
    public InspectDeviceProvider() {
        this.setObjectType(TBlueprintDeviceInspect.class);
    }
    
    public void refresh()
    {
                InspectSBUtility util=new InspectSBUtility();
//                    InspectJJUtility util = new InspectJJUtility();
        TBlueprintDeviceInspect temp=new TBlueprintDeviceInspect();
        List l = util.getBlueDeviceInspectsBySample(temp);
        this.getList().clear();
        getList().addAll(l);     
    }
    
    public void refreshByExample(TBlueprintDeviceInspect obj){
         InspectSBUtility util=new InspectSBUtility();
        List l = util.getBlueDeviceInspectsBySample(obj);
        this.getList().clear();
        getList().addAll(l);            
    }
    
}
