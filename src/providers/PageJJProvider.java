/*
 * PageJJProvider.java
 *
 * Created on 2007年10月17日, 上午9:39
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package providers;

import com.sun.data.provider.impl.ObjectListDataProvider;
import entity.searchUtil;
import java.util.List;
import wgimgdoc.search.*;

/**
 *
 * @author Administrator
 */
public class PageJJProvider extends ObjectListDataProvider{
    
    /** Creates a new instance of PageJJProvider */
    public PageJJProvider() {
        this.setObjectType(PagesStructs.class);
    }
    
    public void refreshPages(String snBlueprint,
            String blueprintName,
            String blueprintProject,
            String projectName,
            boolean isAllMatch,
            //String categoryString,
            //以上为用户输入参数
            //以下为用户权限
            List cats){
        
        int nTotal = searchUtil.TotalNumOfSearchJJBlueprint(snBlueprint,
                blueprintName,  blueprintProject,
                projectName, isAllMatch, cats);
        
        int nPages = nTotal/10 + (nTotal % 10 == 0 ? 0 : 1);
        
        //形成数据
        this.getList().clear();
        
        for (int i = 0; i < nPages; i++) {
            PagesStructs ps = new PagesStructs("第"+Integer.toString(i+1)+"页",
                    i+1);
            this.getList().add(ps);
        }
    }
    
    
    private int SelectPage = 0;
    
    public int getSelectPage() {
        return SelectPage;
    }
    
    public void setSelectPage(int SelectPage) {
        this.SelectPage = SelectPage;
    }
    
}
