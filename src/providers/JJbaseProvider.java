/*
 * JJbaseProvider.java
 *
 * Created on 2007年7月28日, 下午4:46
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package providers;

import com.sun.data.provider.impl.ObjectListDataProvider;
import entity.*;
import java.util.ArrayList;
import java.util.List;
import wgimgdoc.search.*;

/**
 *
 * @author Administrator
 */
public class JJbaseProvider extends ObjectListDataProvider{
    
    /** Creates a new instance of JJbaseProvider */
    public JJbaseProvider() {
        this.setObjectType(TJjbaseSearch.class);
    }
    
    public void refreshJJBase(SearchConditionJJ conjj, List popes,
            int nStart, int nMax){
        //解析Tpopedom中的有效类目,将其放入cats列表
        List cats = new ArrayList();
        for (int i = 0; i < popes.size(); i++) {
            TPopedom pop = (TPopedom) popes.get(i);
            if(pop.getMemo() != null && pop.getMemo().startsWith("507")){
                cats.add(pop.getMemo().trim());
            }
        }
        getList().clear();
        getList().addAll(
                searchUtil.searchJJBlueprint(
                    conjj.getSN(),
                    conjj.getTzName(),
                    conjj.getGcName(),
                    conjj.getXmName(),
                    conjj.isAllMatch(),
                    //conjj.getCat(),
                    cats,
                    nMax, nStart)
                );
    }
    

    
}
