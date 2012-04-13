/*
 * SBShowAll.java
 *
 * Created on 2007年9月11日, 下午2:25
 * Copyright Administrator
 */
package wgimgdoc.wgDocInputF;

import com.sun.data.provider.RowKey;
import com.sun.data.provider.impl.TableRowDataProvider;
import com.sun.rave.web.ui.appbase.AbstractFragmentBean;
import com.sun.rave.web.ui.component.Hyperlink;
import com.sun.rave.web.ui.component.MessageGroup;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.Table;
import com.sun.rave.web.ui.component.TableColumn;
import com.sun.rave.web.ui.component.TableRowGroup;
import entity.TBlueprintJjbaseInspect;
import java.util.Map;
import javax.faces.FacesException;
import org.hibernate.HibernateException;
import usky.search.InspectJjbaseProvider;
import wgimgdoc.ApplicationBean1;
import wgimgdoc.RequestBean1;
import wgimgdoc.SessionBean1;

/**
 * <p>Fragment bean that corresponds to a similarly named JSP page
 * fragment.  This class contains component definitions (and initialization
 * code) for all components that you have defined on this fragment, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class JJInspectShowAll extends AbstractFragmentBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private int __placeholder;
    
    /**
     * <p>Automatically managed component initialization. <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    
    private Table table1 = new Table();
    
    public Table getTable1() {
        return table1;
    }
    
    public void setTable1(Table t) {
        this.table1 = t;
    }
    
    private TableRowGroup tableRowGroup1 = new TableRowGroup();
    
    public TableRowGroup getTableRowGroup1() {
        return tableRowGroup1;
    }
    
    public void setTableRowGroup1(TableRowGroup trg) {
        this.tableRowGroup1 = trg;
    }
    
    private TableColumn tableColumn1 = new TableColumn();
    
    public TableColumn getTableColumn1() {
        return tableColumn1;
    }
    
    public void setTableColumn1(TableColumn tc) {
        this.tableColumn1 = tc;
    }
    
    private StaticText staticText1 = new StaticText();
    
    public StaticText getStaticText1() {
        return staticText1;
    }
    
    public void setStaticText1(StaticText st) {
        this.staticText1 = st;
    }
    
    private TableColumn tableColumn2 = new TableColumn();
    
    public TableColumn getTableColumn2() {
        return tableColumn2;
    }
    
    public void setTableColumn2(TableColumn tc) {
        this.tableColumn2 = tc;
    }
    
    private StaticText staticText2 = new StaticText();
    
    public StaticText getStaticText2() {
        return staticText2;
    }
    
    public void setStaticText2(StaticText st) {
        this.staticText2 = st;
    }
    
    private TableColumn tableColumn3 = new TableColumn();
    
    public TableColumn getTableColumn3() {
        return tableColumn3;
    }
    
    public void setTableColumn3(TableColumn tc) {
        this.tableColumn3 = tc;
    }
    
    private StaticText staticText3 = new StaticText();
    
    public StaticText getStaticText3() {
        return staticText3;
    }
    
    public void setStaticText3(StaticText st) {
        this.staticText3 = st;
    }
    
    private TableColumn tableColumn5 = new TableColumn();
    
    public TableColumn getTableColumn5() {
        return tableColumn5;
    }
    
    public void setTableColumn5(TableColumn tc) {
        this.tableColumn5 = tc;
    }
    
    private StaticText staticText4 = new StaticText();
    
    public StaticText getStaticText4() {
        return staticText4;
    }
    
    public void setStaticText4(StaticText st) {
        this.staticText4 = st;
    }
    
    private TableColumn tableColumn6 = new TableColumn();
    
    public TableColumn getTableColumn6() {
        return tableColumn6;
    }
    
    public void setTableColumn6(TableColumn tc) {
        this.tableColumn6 = tc;
    }
    
    private StaticText staticText5 = new StaticText();
    
    public StaticText getStaticText5() {
        return staticText5;
    }
    
    public void setStaticText5(StaticText st) {
        this.staticText5 = st;
    }
    
    private TableColumn tableColumn7 = new TableColumn();
    
    public TableColumn getTableColumn7() {
        return tableColumn7;
    }
    
    public void setTableColumn7(TableColumn tc) {
        this.tableColumn7 = tc;
    }
    
    private StaticText staticText6 = new StaticText();
    
    public StaticText getStaticText6() {
        return staticText6;
    }
    
    public void setStaticText6(StaticText st) {
        this.staticText6 = st;
    }
    
    private TableColumn tableColumn9 = new TableColumn();
    
    public TableColumn getTableColumn9() {
        return tableColumn9;
    }
    
    public void setTableColumn9(TableColumn tc) {
        this.tableColumn9 = tc;
    }
    
    private Hyperlink hyperlink_view = new Hyperlink();
    
    public Hyperlink getHyperlink_view() {
        return hyperlink_view;
    }
    
    public void setHyperlink_view(Hyperlink h) {
        this.hyperlink_view = h;
    }
    
    private MessageGroup messageGroup1 = new MessageGroup();
    
    public MessageGroup getMessageGroup1() {
        return messageGroup1;
    }
    
    public void setMessageGroup1(MessageGroup mg) {
        this.messageGroup1 = mg;
    }
    
    private TableColumn tableColumn4 = new TableColumn();
    
    public TableColumn getTableColumn4() {
        return tableColumn4;
    }
    
    public void setTableColumn4(TableColumn tc) {
        this.tableColumn4 = tc;
    }
    
    private Hyperlink hyperlink_inspectJJDoc = new Hyperlink();
    
    public Hyperlink getHyperlink_inspectJJDoc() {
        return hyperlink_inspectJJDoc;
    }
    
    public void setHyperlink_inspectJJDoc(Hyperlink h) {
        this.hyperlink_inspectJJDoc = h;
    }
    
    private TableColumn tableColumn8 = new TableColumn();
    
    public TableColumn getTableColumn8() {
        return tableColumn8;
    }
    
    public void setTableColumn8(TableColumn tc) {
        this.tableColumn8 = tc;
    }
    
    private Hyperlink hyperlink_modify = new Hyperlink();
    
    public Hyperlink getHyperlink_modify() {
        return hyperlink_modify;
    }
    
    public void setHyperlink_modify(Hyperlink h) {
        this.hyperlink_modify = h;
    }
    // </editor-fold>
    
    public JJInspectShowAll() {
    }
    
    /**
     * <p>Callback method that is called whenever a page containing
     * this page fragment is navigated to, either directly via a URL,
     * or indirectly via page navigation.  Override this method to acquire
     * resources that will be needed for event handlers and lifecycle methods.</p>
     *
     * <p>The default implementation does nothing.</p>
     */
    public void init() {
        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here
        
        
        // <editor-fold defaultstate="collapsed" desc="Visual-Web-managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("Page1 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
        
        initializeObjectDataProvider();
    }
    
    void initializeObjectDataProvider(){
        TBlueprintJjbaseInspect temp=new TBlueprintJjbaseInspect();
        temp.setIsChecked(Boolean.FALSE);
        jjiObjectProvider.refreshByExample(temp);
    }
    
    /**
     * <p>Callback method that is called after rendering is completed for
     * this request, if <code>init()</code> was called.  Override this
     * method to release resources acquired in the <code>init()</code>
     * resources that will be needed for event handlers and lifecycle methods.</p>
     *
     * <p>The default implementation does nothing.</p>
     */
    public void destroy() {
//        jjiObjectProvider.clearObjectList();
    }
    
    /**
     * <p>返回对已限定范围的数据 Bean 的引用。</p>
     */
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1)getBean("RequestBean1");
    }
    
    /**
     * <p>返回对已限定范围的数据 Bean 的引用。</p>
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1)getBean("SessionBean1");
    }
    
    /**
     * <p>返回对已限定范围的数据 Bean 的引用。</p>
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1)getBean("ApplicationBean1");
    }
    
    private InspectJjbaseProvider jjiObjectProvider=new InspectJjbaseProvider();
    
    public InspectJjbaseProvider getJjiObjectProvider() {
        return jjiObjectProvider;
    }
    
    public void setJjiObjectProvider(InspectJjbaseProvider jjiObjectProvider) {
        this.jjiObjectProvider = jjiObjectProvider;
    }
    
    public String hyperlink_view_action() {
        // 待做事项：替换为您的代码
        Map map=getSessionBean1().getSessionMap();
        
        TableRowDataProvider trdp=(TableRowDataProvider)getBean("currentRow");
        RowKey rk=trdp.getTableRow();
        
        TBlueprintJjbaseInspect temp=(TBlueprintJjbaseInspect)jjiObjectProvider.getObject(rk);
        
        map.put("BlueprintJjbaseInspectObject",temp);
        return "ToJJInspectPreview";
    }
    
    public String hyperlink_inspectJJDoc_action() {
        // 待做事项：替换为您的代码
        Map map=getSessionBean1().getSessionMap();
        
        TableRowDataProvider trdp=(TableRowDataProvider)getBean("currentRow");
        RowKey rk=trdp.getTableRow();
        
        TBlueprintJjbaseInspect temp=(TBlueprintJjbaseInspect)jjiObjectProvider.getObject(rk);
        
        map.put("BlueprintJjbaseInspectObject",temp);
        return "ToJJInspect";
    }
    
    public String hyperlink_modify_action() {
        // 待做事项：替换为您的代码
        Map map=getSessionBean1().getSessionMap();
        
        TableRowDataProvider trdp=(TableRowDataProvider)getBean("currentRow");
        RowKey rk=trdp.getTableRow();
        
        TBlueprintJjbaseInspect temp=(TBlueprintJjbaseInspect)jjiObjectProvider.getObject(rk);
        
        map.put("BlueprintJjbaseInspectObject",temp);
        return "ToJJEdit";
    }
}
