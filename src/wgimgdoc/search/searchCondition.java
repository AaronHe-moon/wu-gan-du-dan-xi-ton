/*
 * serachCondition.java
 *
 * Created on 2007年7月19日, 下午12:17
 * Copyright Administrator
 */
package wgimgdoc.search;

import Aaron.SelectListProviders.lstboxProvider;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Label;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Listbox;
import com.sun.rave.web.ui.component.Page;
import com.sun.rave.web.ui.component.PanelLayout;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.Tab;
import com.sun.rave.web.ui.component.TabSet;
import com.sun.rave.web.ui.component.TextField;
import entity.TBlueprintDevice;
import entity.TBlueprintJjbase;
import entity.TDeviceSearch;
import entity.TJjbaseSearch;
import java.util.HashMap;
import javax.faces.FacesException;
import javax.faces.event.ValueChangeEvent;
import providers.SearchConditionJJ;
import providers.SearchConditionSB;
import wgimgdoc.ApplicationBean1;
import wgimgdoc.RequestBean1;
import wgimgdoc.SessionBean1;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class searchCondition extends AbstractPageBean {
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
    
    private TabSet tabSet1 = new TabSet();
    
    public TabSet getTabSet1() {
        return tabSet1;
    }
    
    public void setTabSet1(TabSet ts) {
        this.tabSet1 = ts;
    }
    
    private Tab tab1 = new Tab();
    
    public Tab getTab1() {
        return tab1;
    }
    
    public void setTab1(Tab t) {
        this.tab1 = t;
    }
    
    private PanelLayout layoutPanel1 = new PanelLayout();
    
    public PanelLayout getLayoutPanel1() {
        return layoutPanel1;
    }
    
    public void setLayoutPanel1(PanelLayout pl) {
        this.layoutPanel1 = pl;
    }
    
    private Tab tab2 = new Tab();
    
    public Tab getTab2() {
        return tab2;
    }
    
    public void setTab2(Tab t) {
        this.tab2 = t;
    }
    
    private PanelLayout layoutPanel2 = new PanelLayout();
    
    public PanelLayout getLayoutPanel2() {
        return layoutPanel2;
    }
    
    public void setLayoutPanel2(PanelLayout pl) {
        this.layoutPanel2 = pl;
    }
    
    private TextField txtBProject = new TextField();
    
    public TextField getTxtBProject() {
        return txtBProject;
    }
    
    public void setTxtBProject(TextField tf) {
        this.txtBProject = tf;
    }
    
    private TextField txtProjectName = new TextField();
    
    public TextField getTxtProjectName() {
        return txtProjectName;
    }
    
    public void setTxtProjectName(TextField tf) {
        this.txtProjectName = tf;
    }
    
    private TextField txtBName = new TextField();
    
    public TextField getTxtBName() {
        return txtBName;
    }
    
    public void setTxtBName(TextField tf) {
        this.txtBName = tf;
    }
    
    private TextField txtSNJJ = new TextField();
    
    public TextField getTxtSNJJ() {
        return txtSNJJ;
    }
    
    public void setTxtSNJJ(TextField tf) {
        this.txtSNJJ = tf;
    }
    
    private TextField txtCatJJ = new TextField();
    
    public TextField getTxtCatJJ() {
        return txtCatJJ;
    }
    
    public void setTxtCatJJ(TextField tf) {
        this.txtCatJJ = tf;
    }
    
    private Button btnQueryJJ = new Button();
    
    public Button getBtnQueryJJ() {
        return btnQueryJJ;
    }
    
    public void setBtnQueryJJ(Button b) {
        this.btnQueryJJ = b;
    }
    
    private TextField txtDevice = new TextField();
    
    public TextField getTxtDevice() {
        return txtDevice;
    }
    
    public void setTxtDevice(TextField tf) {
        this.txtDevice = tf;
    }
    
    private TextField txtSNSB = new TextField();
    
    public TextField getTxtSNSB() {
        return txtSNSB;
    }
    
    public void setTxtSNSB(TextField tf) {
        this.txtSNSB = tf;
    }
    
    private TextField txtPart = new TextField();
    
    public TextField getTxtPart() {
        return txtPart;
    }
    
    public void setTxtPart(TextField tf) {
        this.txtPart = tf;
    }
    
    private TextField txtCatSB = new TextField();
    
    public TextField getTxtCatSB() {
        return txtCatSB;
    }
    
    public void setTxtCatSB(TextField tf) {
        this.txtCatSB = tf;
    }
    
    private Button btnQuerySB = new Button();
    
    public Button getBtnQuerySB() {
        return btnQuerySB;
    }
    
    public void setBtnQuerySB(Button b) {
        this.btnQuerySB = b;
    }
    
    private Label label1 = new Label();
    
    public Label getLabel1() {
        return label1;
    }
    
    public void setLabel1(Label l) {
        this.label1 = l;
    }
    
    private TextField txtBNameSB = new TextField();
    
    public TextField getTxtBNameSB() {
        return txtBNameSB;
    }
    
    public void setTxtBNameSB(TextField tf) {
        this.txtBNameSB = tf;
    }
    
    private StaticText staticText1 = new StaticText();
    
    public StaticText getStaticText1() {
        return staticText1;
    }
    
    public void setStaticText1(StaticText st) {
        this.staticText1 = st;
    }
    
    private StaticText staticText2 = new StaticText();
    
    public StaticText getStaticText2() {
        return staticText2;
    }
    
    public void setStaticText2(StaticText st) {
        this.staticText2 = st;
    }
    
    private StaticText staticText3 = new StaticText();
    
    public StaticText getStaticText3() {
        return staticText3;
    }
    
    public void setStaticText3(StaticText st) {
        this.staticText3 = st;
    }
    
    private StaticText staticText4 = new StaticText();
    
    public StaticText getStaticText4() {
        return staticText4;
    }
    
    public void setStaticText4(StaticText st) {
        this.staticText4 = st;
    }
    
    private StaticText staticText5 = new StaticText();
    
    public StaticText getStaticText5() {
        return staticText5;
    }
    
    public void setStaticText5(StaticText st) {
        this.staticText5 = st;
    }
    
    private StaticText staticText6 = new StaticText();
    
    public StaticText getStaticText6() {
        return staticText6;
    }
    
    public void setStaticText6(StaticText st) {
        this.staticText6 = st;
    }
    
    private StaticText staticText7 = new StaticText();
    
    public StaticText getStaticText7() {
        return staticText7;
    }
    
    public void setStaticText7(StaticText st) {
        this.staticText7 = st;
    }
    
    private StaticText staticText8 = new StaticText();
    
    public StaticText getStaticText8() {
        return staticText8;
    }
    
    public void setStaticText8(StaticText st) {
        this.staticText8 = st;
    }
    
    private StaticText staticText9 = new StaticText();
    
    public StaticText getStaticText9() {
        return staticText9;
    }
    
    public void setStaticText9(StaticText st) {
        this.staticText9 = st;
    }
    
    private TextField txtDevice1 = new TextField();
    
    public TextField getTxtDevice1() {
        return txtDevice1;
    }
    
    public void setTxtDevice1(TextField tf) {
        this.txtDevice1 = tf;
    }
    
    private Tab tab3 = new Tab();
    
    public Tab getTab3() {
        return tab3;
    }
    
    public void setTab3(Tab t) {
        this.tab3 = t;
    }
    
    private PanelLayout layoutPanel3 = new PanelLayout();
    
    public PanelLayout getLayoutPanel3() {
        return layoutPanel3;
    }
    
    public void setLayoutPanel3(PanelLayout pl) {
        this.layoutPanel3 = pl;
    }
    
    private Tab tab4 = new Tab();
    
    public Tab getTab4() {
        return tab4;
    }
    
    public void setTab4(Tab t) {
        this.tab4 = t;
    }
    
    private PanelLayout layoutPanel4 = new PanelLayout();
    
    public PanelLayout getLayoutPanel4() {
        return layoutPanel4;
    }
    
    public void setLayoutPanel4(PanelLayout pl) {
        this.layoutPanel4 = pl;
    }
    
    private StaticText staticText10 = new StaticText();
    
    public StaticText getStaticText10() {
        return staticText10;
    }
    
    public void setStaticText10(StaticText st) {
        this.staticText10 = st;
    }
    
    private StaticText staticText11 = new StaticText();
    
    public StaticText getStaticText11() {
        return staticText11;
    }
    
    public void setStaticText11(StaticText st) {
        this.staticText11 = st;
    }
    
    private Listbox lstboxGC = new Listbox();
    
    public Listbox getLstboxGC() {
        return lstboxGC;
    }
    
    public void setLstboxGC(Listbox l) {
        this.lstboxGC = l;
    }
    
    private Listbox lstboxXM = new Listbox();
    
    public Listbox getLstboxXM() {
        return lstboxXM;
    }
    
    public void setLstboxXM(Listbox l) {
        this.lstboxXM = l;
    }
    
    private Button btnQueryJJWizard = new Button();
    
    public Button getBtnQueryJJWizard() {
        return btnQueryJJWizard;
    }
    
    public void setBtnQueryJJWizard(Button b) {
        this.btnQueryJJWizard = b;
    }
    
    private StaticText staticText12 = new StaticText();
    
    public StaticText getStaticText12() {
        return staticText12;
    }
    
    public void setStaticText12(StaticText st) {
        this.staticText12 = st;
    }
    
    private StaticText staticText13 = new StaticText();
    
    public StaticText getStaticText13() {
        return staticText13;
    }
    
    public void setStaticText13(StaticText st) {
        this.staticText13 = st;
    }
    
    private StaticText staticText14 = new StaticText();
    
    public StaticText getStaticText14() {
        return staticText14;
    }
    
    public void setStaticText14(StaticText st) {
        this.staticText14 = st;
    }
    
    private Listbox lstboxSB = new Listbox();
    
    public Listbox getLstboxSB() {
        return lstboxSB;
    }
    
    public void setLstboxSB(Listbox l) {
        this.lstboxSB = l;
    }
    
    private Listbox lstboxLX = new Listbox();
    
    public Listbox getLstboxLX() {
        return lstboxLX;
    }
    
    public void setLstboxLX(Listbox l) {
        this.lstboxLX = l;
    }
    
    private Listbox lstboxBJ = new Listbox();
    
    public Listbox getLstboxBJ() {
        return lstboxBJ;
    }
    
    public void setLstboxBJ(Listbox l) {
        this.lstboxBJ = l;
    }
    
    private Button btnQuerySBWizard = new Button();
    
    public Button getBtnQuerySBWizard() {
        return btnQuerySBWizard;
    }
    
    public void setBtnQuerySBWizard(Button b) {
        this.btnQuerySBWizard = b;
    }
    
    // </editor-fold>
    
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public searchCondition() {
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
            log("serachCondition Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
        if(!isPostBack()){
            InitialLstBoxProviders();
        }else{
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
        SaveProviders();
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
     * <p>返回对已限定范围的数据 Bean 的引用。</p>
     */
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1)getBean("RequestBean1");
    }
    
    public String btnQueryJJ_action() {
        // 待做事项：处理按钮单击操作。返回的值是一个导航
        // 条件名称，如果它为 Null，则返回到同一页。
        
        return "toJJ";
    }
    
    public String btnQuerySB_action() {
        // 待做事项：处理按钮单击操作。返回的值是一个导航
        // 条件名称，如果它为 Null，则返回到同一页。
        
        return "toSB";
    }
    
    public String tab1_actio() {
        // 待做事项：替换为您的代码
        
        return null;
    }
    
    private lstboxProvider jjLst1Provider = new lstboxProvider();
    private lstboxProvider jjLst2Provider = new lstboxProvider();
    private lstboxProvider sbLst1Provider = new lstboxProvider();
    private lstboxProvider sbLst2Provider = new lstboxProvider();
    private lstboxProvider sbLst3Provider = new lstboxProvider();
    
    public lstboxProvider getJjLst1Provider() {
        return jjLst1Provider;
    }
    
    public void setJjLst1Provider(lstboxProvider jjLst1Provider) {
        this.jjLst1Provider = jjLst1Provider;
    }
    
    public lstboxProvider getJjLst2Provider() {
        return jjLst2Provider;
    }
    
    public void setJjLst2Provider(lstboxProvider jjLst2Provider) {
        this.jjLst2Provider = jjLst2Provider;
    }
    
    public lstboxProvider getSbLst1Provider() {
        return sbLst1Provider;
    }
    
    public void setSbLst1Provider(lstboxProvider sbLst1Provider) {
        this.sbLst1Provider = sbLst1Provider;
    }
    
    public lstboxProvider getSbLst2Provider() {
        return sbLst2Provider;
    }
    
    public void setSbLst2Provider(lstboxProvider sbLst2Provider) {
        this.sbLst2Provider = sbLst2Provider;
    }
    
    public lstboxProvider getSbLst3Provider() {
        return sbLst3Provider;
    }
    
    public void setSbLst3Provider(lstboxProvider sbLst3Provider) {
        this.sbLst3Provider = sbLst3Provider;
    }
    
    private void InitialLstBoxProviders(){
        sbLst1Provider.refresh(TDeviceSearch.class,
                "deviceAliasName", new HashMap());
        jjLst1Provider.refresh(TJjbaseSearch.class,
                "blueprintProject", new HashMap());
    }
    
    
    private void SaveProviders(){
        getSessionBean1().getSessionMap().put("jjLst1Provider",
                jjLst1Provider);
        getSessionBean1().getSessionMap().put("jjLst2Provider",
                jjLst2Provider);
        getSessionBean1().getSessionMap().put("sbLst1Provider",
                sbLst1Provider);
        getSessionBean1().getSessionMap().put("sbLst2Provider",
                sbLst2Provider);
        getSessionBean1().getSessionMap().put("sbLst3Provider",
                sbLst3Provider);
        
    }
    
    private void RestoreProviders(){
        jjLst1Provider = (lstboxProvider)getSessionBean1().getSessionMap().
                get("jjLst1Provider");
        jjLst2Provider = (lstboxProvider)getSessionBean1().getSessionMap().
                get("jjLst2Provider");
        sbLst1Provider = (lstboxProvider)getSessionBean1().getSessionMap().
                get("sbLst1Provider");
        sbLst2Provider = (lstboxProvider)getSessionBean1().getSessionMap().
                get("sbLst2Provider");
        sbLst3Provider = (lstboxProvider)getSessionBean1().getSessionMap().
                get("sbLst3Provider");
    }
    
    public void lstboxSB_processValueChange(ValueChangeEvent event) {
        // 待做事项：替换为您的代码
        sbLst2Provider.clearObjectList();
        sbLst3Provider.clearObjectList();
        HashMap condition = new HashMap();
        condition.put("deviceAliasName", lstboxSB.getSelected().toString());
        sbLst2Provider.refresh(TDeviceSearch.class,
                "deviceCode", condition);
        lstboxLX.setSelected(null);
        lstboxBJ.setSelected(null);
    }
    
    public void lstboxLX_processValueChange(ValueChangeEvent event) {
        // 待做事项：替换为您的代码
        sbLst3Provider.clearObjectList();
        HashMap condition = new HashMap();
        condition.put("deviceAliasName", lstboxSB.getSelected().toString());
        condition.put("deviceCode", lstboxLX.getSelected().toString());
        sbLst3Provider.refresh(TDeviceSearch.class,
                "partName", condition);
        lstboxBJ.setSelected(null);
    }
    
    public void lstboxGC_processValueChange(ValueChangeEvent event) {
        // 待做事项：替换为您的代码
        jjLst2Provider.clearObjectList();
        HashMap condition = new HashMap();
        condition.put("blueprintProject", lstboxGC.getSelected().toString());
        jjLst2Provider.refresh(TJjbaseSearch.class,
                "projectName", condition);
        lstboxXM.setSelected(null);
    }
    
    public String btnQueryJJWizard_action() {
        // 待做事项：处理按钮单击操作。返回的值是一个导航
        // 条件名称，如果它为 Null，则返回到同一页。
        btnQueryJJWizard.setDisabled(true);
        SearchConditionJJ conJj = getSessionBean1().getConJJ();
        if(lstboxGC.getSelected() != null)
            conJj.setGcName(lstboxGC.getSelected().toString());
        else
            conJj.setGcName("");
        
        if(lstboxXM.getSelected() != null)
            conJj.setXmName(lstboxXM.getSelected().toString());
        else
            conJj.setXmName("");
        
        conJj.setTzName("");
        conJj.setSN("");
        
        conJj.setAllMatch(true);
        
        return "toJJw";
    }
    
    public String btnQuerySBWizard_action() {
        // 待做事项：处理按钮单击操作。返回的值是一个导航
        // 条件名称，如果它为 Null，则返回到同一页。
        btnQuerySBWizard.setDisabled(true);
        SearchConditionSB conSb = getSessionBean1().getConSB();
        
        if(lstboxSB.getSelected() != null)
            conSb.setSbAliasName(lstboxSB.getSelected().toString());
        else
            conSb.setSbAliasName("");
        
        if(lstboxLX.getSelected() != null)
            conSb.setSbName(lstboxLX.getSelected().toString());
        else
            conSb.setSbName("");
        
        if(lstboxBJ.getSelected() != null)
            conSb.setPartName(lstboxBJ.getSelected().toString());
        else
            conSb.setPartName("");
        
        conSb.setBlueprintName("");
        conSb.setSN("");
        
        conSb.setAllMatch(true);
        
        return "toSBw";
    }
}

