/*
 * InspectJjbaseObjectListProvider.java
 *
 * Created on 2007年9月20日, 下午12:28
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package usky.search;
import com.sun.data.provider.impl.ObjectListDataProvider;
import util.InspectJJUtility;
import entity.TBlueprintJjbaseInspect;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Administrator
 */
public class InspectJjbaseProvider extends ObjectListDataProvider{
    
    /** Creates a new instance of InspectJjbaseObjectListProvider */
    public InspectJjbaseProvider() {
        this.setObjectType(entity.TBlueprintJjbaseInspect.class);
    }
    
    public void refresh()throws HibernateException{
        InspectJJUtility util=new InspectJJUtility();
//                    InspectJJUtility util = new InspectJJUtility();
        TBlueprintJjbaseInspect temp=new TBlueprintJjbaseInspect();
        List l = util.getBlueJjbaseInspectsBySample(temp);
        this.getList().clear();
        getList().addAll(l);
    }
    
    public void refreshByExample(TBlueprintJjbaseInspect ob)throws HibernateException{
        InspectJJUtility util=new InspectJJUtility();
//                    InspectJJUtility util = new InspectJJUtility();
        List l = util.getBlueJjbaseInspectsBySample(ob);
        this.getList().clear();
        getList().addAll(l);
    }
    
    
    
}
