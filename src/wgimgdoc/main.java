/*
 * main.java
 *
 * Created on 2007年9月26日, 下午8:43
 * Copyright Administrator
 */
package wgimgdoc;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Hyperlink;
import com.sun.rave.web.ui.component.Label;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import com.sun.rave.web.ui.component.PageSeparator;
import com.sun.rave.web.ui.component.PanelLayout;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.Tab;
import com.sun.rave.web.ui.component.TabSet;
import javax.faces.FacesException;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class main extends AbstractPageBean {
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
    
    private PanelLayout layoutPanel1 = new PanelLayout();
    
    public PanelLayout getLayoutPanel1() {
        return layoutPanel1;
    }
    
    public void setLayoutPanel1(PanelLayout pl) {
        this.layoutPanel1 = pl;
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
    
    private Tab tab2 = new Tab();
    
    public Tab getTab2() {
        return tab2;
    }
    
    public void setTab2(Tab t) {
        this.tab2 = t;
    }
    
    private Tab tab3 = new Tab();
    
    public Tab getTab3() {
        return tab3;
    }
    
    public void setTab3(Tab t) {
        this.tab3 = t;
    }
    
    private Tab tab4 = new Tab();
    
    public Tab getTab4() {
        return tab4;
    }
    
    public void setTab4(Tab t) {
        this.tab4 = t;
    }
    
    private Tab tab5 = new Tab();
    
    public Tab getTab5() {
        return tab5;
    }
    
    public void setTab5(Tab t) {
        this.tab5 = t;
    }
    
    private Tab tab6 = new Tab();
    
    public Tab getTab6() {
        return tab6;
    }
    
    public void setTab6(Tab t) {
        this.tab6 = t;
    }
    
    private PanelLayout layoutPanel2 = new PanelLayout();
    
    public PanelLayout getLayoutPanel2() {
        return layoutPanel2;
    }
    
    public void setLayoutPanel2(PanelLayout pl) {
        this.layoutPanel2 = pl;
    }
    
    private PanelLayout palCat = new PanelLayout();
    
    public PanelLayout getPalCat() {
        return palCat;
    }
    
    public void setPalCat(PanelLayout pl) {
        this.palCat = pl;
    }
    
    private Hyperlink hyperlink1 = new Hyperlink();
    
    public Hyperlink getHyperlink1() {
        return hyperlink1;
    }
    
    public void setHyperlink1(Hyperlink h) {
        this.hyperlink1 = h;
    }
    
    private Hyperlink hyperlink2 = new Hyperlink();
    
    public Hyperlink getHyperlink2() {
        return hyperlink2;
    }
    
    public void setHyperlink2(Hyperlink h) {
        this.hyperlink2 = h;
    }
    
    private Hyperlink hyperlink3 = new Hyperlink();
    
    public Hyperlink getHyperlink3() {
        return hyperlink3;
    }
    
    public void setHyperlink3(Hyperlink h) {
        this.hyperlink3 = h;
    }
    
    private Hyperlink hyperlink4 = new Hyperlink();
    
    public Hyperlink getHyperlink4() {
        return hyperlink4;
    }
    
    public void setHyperlink4(Hyperlink h) {
        this.hyperlink4 = h;
    }
    
    private PanelLayout palInput = new PanelLayout();
    
    public PanelLayout getPalInput() {
        return palInput;
    }
    
    public void setPalInput(PanelLayout pl) {
        this.palInput = pl;
    }
    
    private Hyperlink hyperlink5 = new Hyperlink();
    
    public Hyperlink getHyperlink5() {
        return hyperlink5;
    }
    
    public void setHyperlink5(Hyperlink h) {
        this.hyperlink5 = h;
    }
    
    private Hyperlink hyperlink6 = new Hyperlink();
    
    public Hyperlink getHyperlink6() {
        return hyperlink6;
    }
    
    public void setHyperlink6(Hyperlink h) {
        this.hyperlink6 = h;
    }
    
    private Hyperlink hyperlink7 = new Hyperlink();
    
    public Hyperlink getHyperlink7() {
        return hyperlink7;
    }
    
    public void setHyperlink7(Hyperlink h) {
        this.hyperlink7 = h;
    }
    
    private Hyperlink hyperlink8 = new Hyperlink();
    
    public Hyperlink getHyperlink8() {
        return hyperlink8;
    }
    
    public void setHyperlink8(Hyperlink h) {
        this.hyperlink8 = h;
    }
    
    private PanelLayout palInspect = new PanelLayout();
    
    public PanelLayout getPalInspect() {
        return palInspect;
    }
    
    public void setPalInspect(PanelLayout pl) {
        this.palInspect = pl;
    }
    
    private Hyperlink hyperlink9 = new Hyperlink();
    
    public Hyperlink getHyperlink9() {
        return hyperlink9;
    }
    
    public void setHyperlink9(Hyperlink h) {
        this.hyperlink9 = h;
    }
    
    private Hyperlink hyperlink10 = new Hyperlink();
    
    public Hyperlink getHyperlink10() {
        return hyperlink10;
    }
    
    public void setHyperlink10(Hyperlink h) {
        this.hyperlink10 = h;
    }
    
    private PanelLayout palUser = new PanelLayout();
    
    public PanelLayout getPalUser() {
        return palUser;
    }
    
    public void setPalUser(PanelLayout pl) {
        this.palUser = pl;
    }
    
    private Hyperlink hyperlink11 = new Hyperlink();
    
    public Hyperlink getHyperlink11() {
        return hyperlink11;
    }
    
    public void setHyperlink11(Hyperlink h) {
        this.hyperlink11 = h;
    }
    
    private Hyperlink hyperlink12 = new Hyperlink();
    
    public Hyperlink getHyperlink12() {
        return hyperlink12;
    }
    
    public void setHyperlink12(Hyperlink h) {
        this.hyperlink12 = h;
    }
    
    private Hyperlink hyperlink13 = new Hyperlink();
    
    public Hyperlink getHyperlink13() {
        return hyperlink13;
    }
    
    public void setHyperlink13(Hyperlink h) {
        this.hyperlink13 = h;
    }
    
    private Hyperlink hyperlink14 = new Hyperlink();
    
    public Hyperlink getHyperlink14() {
        return hyperlink14;
    }
    
    public void setHyperlink14(Hyperlink h) {
        this.hyperlink14 = h;
    }
    
    private Hyperlink hyperlink15 = new Hyperlink();
    
    public Hyperlink getHyperlink15() {
        return hyperlink15;
    }
    
    public void setHyperlink15(Hyperlink h) {
        this.hyperlink15 = h;
    }
    
    private Label lblUser = new Label();
    
    public Label getLblUser() {
        return lblUser;
    }
    
    public void setLblUser(Label l) {
        this.lblUser = l;
    }
    
    private PanelLayout layoutPanel3 = new PanelLayout();
    
    public PanelLayout getLayoutPanel3() {
        return layoutPanel3;
    }
    
    public void setLayoutPanel3(PanelLayout pl) {
        this.layoutPanel3 = pl;
    }
    
    private StaticText txtCode = new StaticText();
    
    public StaticText getTxtCode() {
        return txtCode;
    }
    
    public void setTxtCode(StaticText st) {
        this.txtCode = st;
    }
    
    private PanelLayout layoutPanel4 = new PanelLayout();
    
    public PanelLayout getLayoutPanel4() {
        return layoutPanel4;
    }
    
    public void setLayoutPanel4(PanelLayout pl) {
        this.layoutPanel4 = pl;
    }
    
    private PanelLayout layoutPanel5 = new PanelLayout();
    
    public PanelLayout getLayoutPanel5() {
        return layoutPanel5;
    }
    
    public void setLayoutPanel5(PanelLayout pl) {
        this.layoutPanel5 = pl;
    }
    
    private PageSeparator pageSeparator1 = new PageSeparator();
    
    public PageSeparator getPageSeparator1() {
        return pageSeparator1;
    }
    
    public void setPageSeparator1(PageSeparator ps) {
        this.pageSeparator1 = ps;
    }
    
    private Label label1 = new Label();
    
    public Label getLabel1() {
        return label1;
    }
    
    public void setLabel1(Label l) {
        this.label1 = l;
    }
    
    private PanelLayout layoutPanel6 = new PanelLayout();
    
    public PanelLayout getLayoutPanel6() {
        return layoutPanel6;
    }
    
    public void setLayoutPanel6(PanelLayout pl) {
        this.layoutPanel6 = pl;
    }
    
    private Tab tab7 = new Tab();
    
    public Tab getTab7() {
        return tab7;
    }
    
    public void setTab7(Tab t) {
        this.tab7 = t;
    }

    private StaticText staticText1 = new StaticText();

    public StaticText getStaticText1() {
        return staticText1;
    }

    public void setStaticText1(StaticText st) {
        this.staticText1 = st;
    }

    private Hyperlink hyperlink_quit = new Hyperlink();

    public Hyperlink getHyperlink_quit() {
        return hyperlink_quit;
    }

    public void setHyperlink_quit(Hyperlink h) {
        this.hyperlink_quit = h;
    }

    private Hyperlink hyperlink_changePassword = new Hyperlink();

    public Hyperlink getHyperlink_changePassword() {
        return hyperlink_changePassword;
    }

    public void setHyperlink_changePassword(Hyperlink h) {
        this.hyperlink_changePassword = h;
    }
    
    // </editor-fold>
    
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public main() {
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
            log("main Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
//        InitialSideVisible();
//        if(!this.isPostBack())
        generateHtmlCode("Message\\Welcome.jsp");
        txtCode.setVisible(true);
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
        if(txtCode.getValue() == null)
            generateHtmlCode("Message\\Welcome.jsp");
        
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
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1)getBean("ApplicationBean1");
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
    
//    private Set panels = new HashSet();
//    {
//        panels.add(palCat);
//        panels.add(palInput);
//        panels.add(palInspect);
//        panels.add(palUser);
//    }
    
//    private void InitialSideVisible(){
//        for (Iterator it = panels.iterator(); it.hasNext();) {
//            PanelLayout elem = (PanelLayout) it.next();
//            elem.setVisible(false);
//        }
//    }
    
    private void chooseVisibleSide(PanelLayout panel){
//        if(panels.contains(panel)){
//            for (Iterator it = panels.iterator(); it.hasNext();) {
//                PanelLayout elem = (PanelLayout) it.next();
//                elem.setVisible(false);
//            }
//            panel.setVisible(true);
//        }
        palCat.setVisible(false);
        palInput.setVisible(false);
        palInspect.setVisible(false);
        palUser.setVisible(false);
        panel.setVisible(true);
        
        //设置iframe
        generateHtmlCode("Message\\Welcome.jsp");
//        txtCode.setText("请点击左边菜单");
    }
    
    public String tab2_action() {
        // 待做事项：替换为您的代码
        //检索tab的事件，先把边菜单设为不可见，然后直接引用页
        palCat.setVisible(false);
        palInput.setVisible(false);
        palInspect.setVisible(false);
        palUser.setVisible(false);
        generateHtmlCode("search\\searchCondition.jsp");
        return null;
    }
    
    public String tab3_action() {
        // 待做事项：替换为您的代码
        chooseVisibleSide(palCat);
        return null;
    }
    
    public String tab4_action() {
        // 待做事项：替换为您的代码
        chooseVisibleSide(palInput);
        return null;
    }
    
    public String tab5_action() {
        // 待做事项：替换为您的代码
        chooseVisibleSide(palInspect);
        return null;
    }
    
    public String tab6_action() {
        // 待做事项：替换为您的代码
        chooseVisibleSide(palUser);
        return null;
    }
    
    public String hyperlink1_action() {
        // 待做事项：替换为您的代码
        generateHtmlCode("category\\ShowLevelOne.jsp");
        return null;
    }
    
    public void generateHtmlCode(String path){
        String code ="<iframe frameborder=0 src='%s' width=800 height=500></iframe>";
        Object[] obj = {path};
        txtCode.setValue(String.format(code, obj));
        if(!txtCode.isVisible())
            txtCode.setVisible(true);
    }
    
    public String hyperlink2_action() {
        // 待做事项：替换为您的代码
        generateHtmlCode("category\\AddLevelOne.jsp");
        
        return null;
    }
    
    public String hyperlink3_action() {
        // 待做事项：替换为您的代码
        generateHtmlCode("category\\ShowLevelTwo.jsp");
        return null;
    }
    
    public String hyperlink4_action() {
        // 待做事项：替换为您的代码
        generateHtmlCode("category\\AddLevelTwo.jsp");
        return null;
    }
    
    public String hyperlink5_action() {
        // 待做事项：替换为您的代码
        generateHtmlCode("wgDocInput/JJInput.jsp");
        return null;
    }
    
    public String hyperlink6_action() {
        // 待做事项：替换为您的代码
        generateHtmlCode("wgDocInput/JJInspectShowAll.jsp");
        return null;
    }
    
    public String hyperlink7_action() {
        // 待做事项：替换为您的代码
        generateHtmlCode("wgDocInput/SBInput.jsp");
        return null;
    }
    
    public String hyperlink8_action() {
        // 待做事项：替换为您的代码
        generateHtmlCode("wgDocInput/SBInspectShowAll.jsp");
        return null;
    }
    
    public String hyperlink9_action() {
        // 待做事项：替换为您的代码
        generateHtmlCode("wgDocInput/JJInspectShowAll.jsp");
        return null;
    }
    
    public String hyperlink10_action() {
        // 待做事项：替换为您的代码
        generateHtmlCode("wgDocInput/SBInspectShowAll.jsp");
        return null;
    }
    
    public String hyperlink11_action() {
        // 待做事项：替换为您的代码
        generateHtmlCode("RoleOP/CreateRole.jsp");
        return null;
    }
    
    public String hyperlink12_action() {
        // 待做事项：替换为您的代码
        generateHtmlCode("AccountOP/CreateUserAccount.jsp");
        return null;
    }
    
    public String hyperlink13_action() {
        // 待做事项：替换为您的代码
        generateHtmlCode("RoleOP/ShowAllRole.jsp");
        return null;
    }
    
    public String hyperlink14_action() {
        // 待做事项：替换为您的代码
        generateHtmlCode("AccountOP/ShowAllAccount.jsp");
        return null;
    }
    
    public String hyperlink15_action() {
        // 待做事项：替换为您的代码
        generateHtmlCode("AccountOP/SearchUserAccount.jsp");
        return null;
    }
    
    public String tab7_action() {
        // 待做事项：替换为您的代码
        palCat.setVisible(false);
        palInput.setVisible(false);
        palInspect.setVisible(false);
        palUser.setVisible(false);
        generateHtmlCode("reports\\SelectPeriod.jsp");
        return null;
    }
    
    public String tab1_action() {
        // 待做事项：替换为您的代码
        palCat.setVisible(false);
        palInput.setVisible(false);
        palInspect.setVisible(false);
        palUser.setVisible(false);
        generateHtmlCode("Message\\Welcome.jsp");
        return null;
    }

    public String hyperlink_quit_action() {
        // 待做事项：替换为您的代码
        HttpSession session=(HttpSession)getExternalContext().getSession(false);
        session.setAttribute("currentUser",null);
        getSessionBean1().setCurrentUser(null);
        getSessionBean1().getSessionMap().clear();
        return "toLogin";
    }

    public String hyperlink_changePassword_action() {
        // 待做事项：替换为您的代码
        generateHtmlCode("AccountOP\\ChangeAccountPassword.jsp");
        return null;
    }
    
    
}

