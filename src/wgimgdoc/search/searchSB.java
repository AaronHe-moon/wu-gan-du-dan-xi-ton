/*
 * searchSB.java
 *
 * Created on 2007年7月19日, 下午12:38
 * Copyright Administrator
 */
package wgimgdoc.search;

import com.sun.data.provider.RowKey;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.DropDown;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Hyperlink;
import com.sun.rave.web.ui.component.Label;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.Table;
import com.sun.rave.web.ui.component.TableColumn;
import com.sun.rave.web.ui.component.TableRowGroup;
import entity.TBlueprintDevice;
import entity.TDeviceSearch;
import entity.TPopedom;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.faces.FacesException;
import javax.faces.convert.IntegerConverter;
import javax.faces.event.ValueChangeEvent;
import providers.DeviceProvider;
import providers.PageSBProvider;
import providers.SearchConditionSB;
import wgimgdoc.ApplicationBean1;
import wgimgdoc.RequestBean1;
import wgimgdoc.SessionBean1;
import wgimgdoc.SessionBean1;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class searchSB extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private int __placeholder;
    
    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    
    private Page page1 = new Page();
    
    public Page getPage1() {
        return page1;
    }
    
    public void setPage1(Page p) {
        this.page1 = p;
    }
    
    private Html html1 = new Html();
    
    public Html getHtml1() {
        return html1;
    }
    
    public void setHtml1(Html h) {
        this.html1 = h;
    }
    
    private Head head1 = new Head();
    
    public Head getHead1() {
        return head1;
    }
    
    public void setHead1(Head h) {
        this.head1 = h;
    }
    
    private Link link1 = new Link();
    
    public Link getLink1() {
        return link1;
    }
    
    public void setLink1(Link l) {
        this.link1 = l;
    }
    
    private Body body1 = new Body();
    
    public Body getBody1() {
        return body1;
    }
    
    public void setBody1(Body b) {
        this.body1 = b;
    }
    
    private Form form1 = new Form();
    
    public Form getForm1() {
        return form1;
    }
    
    public void setForm1(Form f) {
        this.form1 = f;
    }
    
    private Label label1 = new Label();
    
    public Label getLabel1() {
        return label1;
    }
    
    public void setLabel1(Label l) {
        this.label1 = l;
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
    
    private Hyperlink hyperlink2 = new Hyperlink();
    
    public Hyperlink getHyperlink2() {
        return hyperlink2;
    }
    
    public void setHyperlink2(Hyperlink h) {
        this.hyperlink2 = h;
    }
    
    private DropDown ddPages = new DropDown();
    
    public DropDown getDdPages() {
        return ddPages;
    }
    
    public void setDdPages(DropDown dd) {
        this.ddPages = dd;
    }
    
    private Label label2 = new Label();
    
    public Label getLabel2() {
        return label2;
    }
    
    public void setLabel2(Label l) {
        this.label2 = l;
    }
    
    private IntegerConverter ddPagesConverter = new IntegerConverter();
    
    public IntegerConverter getDdPagesConverter() {
        return ddPagesConverter;
    }
    
    public void setDdPagesConverter(IntegerConverter ic) {
        this.ddPagesConverter = ic;
    }

    private Button button1 = new Button();

    public Button getButton1() {
        return button1;
    }

    public void setButton1(Button b) {
        this.button1 = b;
    }

    private TableColumn tableColumn4 = new TableColumn();

    public TableColumn getTableColumn4() {
        return tableColumn4;
    }

    public void setTableColumn4(TableColumn tc) {
        this.tableColumn4 = tc;
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
    
    // </editor-fold>
    
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public searchSB() {
    }
    
    /**
     * <p>Callback method that is called whenever a page is navigated to,
     * either directly via a URL, or indirectly via page navigation.
     * Customize this method to acquire resources that will be needed
     * for event handlers and lifecycle methods, whether or not this
     * page is performing post back processing.</p>
     *
     * <p>Note that, if the current request is a postback, the property
     * values of the components do <strong>not</strong> represent any
     * values submitted with this request.  Instead, they represent the
     * property values that were saved for this view when it was rendered.</p>
     */
    public void init() {
        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here
        
        // <editor-fold defaultstate="collapsed" desc="Managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("searchSB Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
        if(!this.isPostBack() && !getSessionBean1().getSessionMap()
            .containsKey("isReturnFromPreview") ){
            InitalSplitPages();
            InitalList();
        }else{
            if(getSessionBean1().getSessionMap().containsKey("isReturnFromPreview"))
                getSessionBean1().getSessionMap().remove("isReturnFromPreview");
            RestoreProviders();
        }
        
    }
    
    /**
     * <p>Callback method that is called after the component tree has been
     * restored, but before any event processing takes place.  This method
     * will <strong>only</strong> be called on a postback request that
     * is processing a form submit.  Customize this method to allocate
     * resources that will be required in your event handlers.</p>
     */
    public void preprocess() {
    }
    
    /**
     * <p>Callback method that is called just before rendering takes place.
     * This method will <strong>only</strong> be called for the page that
     * will actually be rendered (and not, for example, on a page that
     * handled a postback and then navigated to a different page).  Customize
     * this method to allocate resources that will be required for rendering
     * this page.</p>
     */
    public void prerender() {
    }
    
    /**
     * <p>Callback method that is called after rendering is completed for
     * this request, if <code>init()</code> was called (regardless of whether
     * or not this was the page that was actually rendered).  Customize this
     * method to release resources acquired in the <code>init()</code>,
     * <code>preprocess()</code>, or <code>prerender()</code> methods (or
     * acquired during execution of an event handler).</p>
     */
    public void destroy() {
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
    

    
    /**
     * 保存属性 deProvider 的值。
     */
    private DeviceProvider deProvider = new DeviceProvider();
    
    /**
     * 属性 deProvider 的获取方法。
     * @return 属性 deProvider 的值。
     */
    public DeviceProvider getDeProvider() {
        return this.deProvider;
    }
    
    /**
     * 属性 deProvider 的设置方法。
     * @param deProvider 属性 deProvider 的新值。
     */
    public void setDeProvider(DeviceProvider deProvider) {
        this.deProvider = deProvider;
    }
    
    private PageSBProvider ddprovider;
    
    public PageSBProvider getDdprovider() {
        return ddprovider;
    }
    
    public void setDdprovider(PageSBProvider ddprovider) {
        this.ddprovider = ddprovider;
    }
    
    public String hyperlink2_action() {
        // 待做事项：替换为您的代码
        RowKey rk = tableRowGroup1.getRowKey();
        TDeviceSearch sb = (TDeviceSearch) deProvider.getObject(rk);
        //设置Session中的preview_table和preview_id，然后点转到预览页面
        Map m = getSessionBean1().getSessionMap();
        m.put("preview_table", "SB");
        m.put("preview_id", sb.getIdBlueprint().toString());
        
        return "toPreivew";
    }
    
    public String hyperlink3_action() {
        // 待做事项：替换为您的代码
        RowKey rk = tableRowGroup1.getRowKey();
        TDeviceSearch sb = (TDeviceSearch) deProvider.getObject(rk);
        try {
            //调用下载的servlet
            getExternalContext().redirect("/ServletDownload?id=" +
                    sb.getIdBlueprint().toString());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    private List getCats(List popedomList){
        List lst = new ArrayList();
        
        Iterator it = popedomList.iterator();
        while (it.hasNext()) {
            TPopedom elem = (TPopedom) it.next();
            lst.add(elem.getMemo().trim());
        }
        return lst;
        
    }
    
    private void InitalSplitPages(){
        ddprovider = new PageSBProvider();
        getSessionBean1().getSessionMap()
        .put("sbPageProvider", ddprovider);
        SearchConditionSB consb = getSessionBean1().getConSB();
        List cats = getCats(
                getSessionBean1().getCurrentUser().getPopedomList()
                );
        ddprovider.refreshPages(consb.getSbAliasName(),
                consb.getSbName(),
                consb.getPartName(),
                consb.getBlueprintName(),
                consb.getSN(),
                consb.isAllMatch(),
                cats);
    }
    
    private void InitalList(){
        deProvider = new DeviceProvider();
        getSessionBean1().getSessionMap()
        .put("deProvider", deProvider);
        deProvider.refreshDevice(getSessionBean1().getConSB(), getSessionBean1()
        .getCurrentUser().getPopedomList(), 0, 10);
    }
    
    private void RestoreProviders() {
        ddprovider = (PageSBProvider) getSessionBean1().getSessionMap()
        .get("sbPageProvider");
        deProvider = (DeviceProvider) getSessionBean1().getSessionMap()
        .get("deProvider");
        ddPages.setSelected(Integer.valueOf(deProvider.getSelectPage()));
    }
    
    public void ddPages_processValueChange(ValueChangeEvent event) {
        // 待做事项：替换为您的代码
        int nPage = ((Integer) ddPages.getSelected()).intValue();
        deProvider.setSelectPage(nPage);
        deProvider.refreshDevice(getSessionBean1().getConSB(),
                getSessionBean1().getCurrentUser().getPopedomList(),
                10*(nPage-1), 10);
    }

    /**
     * <p>返回对已限定范围的数据 Bean 的引用。</p>
     */
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1)getBean("RequestBean1");
    }
    
}

