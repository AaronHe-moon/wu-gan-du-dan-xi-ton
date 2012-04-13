/*
 * DeviceProvider.java
 *
 * Created on 2007年8月5日, 下午8:26
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package providers;

import com.sun.data.provider.impl.ObjectListDataProvider;
import entity.TBlueprintDevice;
import entity.TDeviceSearch;
import entity.TPopedom;
import entity.searchUtil;
import java.util.ArrayList;
import java.util.List;
import wgimgdoc.search.*;

/**
 *
 * @author Administrator
 */
public class DeviceProvider extends ObjectListDataProvider{
    
    /** Creates a new instance of DeviceProvider */
    public DeviceProvider() {
        setObjectType(TDeviceSearch.class);
    }
    
    public void refreshDevice(SearchConditionSB consb, List popes,
            int nStart, int nMax){
        //解析Tpopedom中的有效类目,将其放入cats列表
        List cats = new ArrayList();
        for (int i = 0; i < popes.size(); i++) {
            TPopedom pop = (TPopedom) popes.get(i);
            if(pop.getMemo() != null && pop.getMemo().startsWith("507")){
                cats.add(pop.getMemo());
            }
        }
        getList().clear();
        getList().addAll(
                searchUtil.searchSBBlueprint(
                consb.getSbAliasName(),
                consb.getSbName(),
                consb.getPartName(),
                consb.getBlueprintName(),
                consb.getSN(),
                consb.isAllMatch(),
                //consb.getCat(),
                cats,
                nMax, nStart)
                );
    }
    
    private int SelectPage = 0;
    
    public int getSelectPage() {
        return SelectPage;
    }
    
    public void setSelectPage(int SelectPage) {
        this.SelectPage = SelectPage;
    }
}
