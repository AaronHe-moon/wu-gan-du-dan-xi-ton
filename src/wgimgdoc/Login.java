/*
 * Login.java
 *
 * Created on 2007年9月24日, 上午10:56
 * Copyright Administrator
 */
package wgimgdoc;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.ImageComponent;
import com.sun.rave.web.ui.component.Label;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Message;
import com.sun.rave.web.ui.component.Page;
import com.sun.rave.web.ui.component.PageSeparator;
import com.sun.rave.web.ui.component.PanelLayout;
import com.sun.rave.web.ui.component.PasswordField;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.TextField;
import entity.TRole;
import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.event.ValueChangeEvent;
import util.TRoleUtil;
import entity.TUser;
import util.TUserUtil;
import java.util.List;
import javax.faces.FacesException;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import org.hibernate.HibernateException;
import wgimgdoc.globe.CurrentUser;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class Login extends AbstractPageBean {
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
    
    private PanelLayout layoutPanel2 = new PanelLayout();
    
    public PanelLayout getLayoutPanel2() {
        return layoutPanel2;
    }
    
    public void setLayoutPanel2(PanelLayout pl) {
        this.layoutPanel2 = pl;
    }
    
    private Message message1 = new Message();
    
    public Message getMessage1() {
        return message1;
    }
    
    public void setMessage1(Message m) {
        this.message1 = m;
    }
    
    private Message message2 = new Message();
    
    public Message getMessage2() {
        return message2;
    }
    
    public void setMessage2(Message m) {
        this.message2 = m;
    }
    
    private PasswordField txtPassword = new PasswordField();
    
    public PasswordField getTxtPassword() {
        return txtPassword;
    }
    
    public void setTxtPassword(PasswordField pf) {
        this.txtPassword = pf;
    }
    
    private TextField txtName = new TextField();
    
    public TextField getTxtName() {
        return txtName;
    }
    
    public void setTxtName(TextField tf) {
        this.txtName = tf;
    }
    
    private Button btnReset = new Button();
    
    public Button getBtnReset() {
        return btnReset;
    }
    
    public void setBtnReset(Button b) {
        this.btnReset = b;
    }
    
    private Label label1 = new Label();
    
    public Label getLabel1() {
        return label1;
    }
    
    public void setLabel1(Label l) {
        this.label1 = l;
    }
    
    private Button btnLogin = new Button();
    
    public Button getBtnLogin() {
        return btnLogin;
    }
    
    public void setBtnLogin(Button b) {
        this.btnLogin = b;
    }
    
    private Label label2 = new Label();
    
    public Label getLabel2() {
        return label2;
    }
    
    public void setLabel2(Label l) {
        this.label2 = l;
    }
    
    private StaticText txtInfo = new StaticText();
    
    public StaticText getTxtInfo() {
        return txtInfo;
    }
    
    public void setTxtInfo(StaticText st) {
        this.txtInfo = st;
    }

    private PanelLayout layoutPanel3 = new PanelLayout();

    public PanelLayout getLayoutPanel3() {
        return layoutPanel3;
    }

    public void setLayoutPanel3(PanelLayout pl) {
        this.layoutPanel3 = pl;
    }

    private StaticText staticText1 = new StaticText();

    public StaticText getStaticText1() {
        return staticText1;
    }

    public void setStaticText1(StaticText st) {
        this.staticText1 = st;
    }

    private PanelLayout layoutPanel4 = new PanelLayout();

    public PanelLayout getLayoutPanel4() {
        return layoutPanel4;
    }

    public void setLayoutPanel4(PanelLayout pl) {
        this.layoutPanel4 = pl;
    }

    private PageSeparator pageSeparator1 = new PageSeparator();

    public PageSeparator getPageSeparator1() {
        return pageSeparator1;
    }

    public void setPageSeparator1(PageSeparator ps) {
        this.pageSeparator1 = ps;
    }

    private Label label3 = new Label();

    public Label getLabel3() {
        return label3;
    }

    public void setLabel3(Label l) {
        this.label3 = l;
    }
    
    // </editor-fold>
    
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public Login() {
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
            log("Login Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
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
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1)getBean("RequestBean1");
    }
    
    /**
     * <p>返回对已限定范围的数据 Bean 的引用。</p>
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1)getBean("ApplicationBean1");
    }
    
    public String btnLogin_action() {
        try {
            // 待做事项：处理按钮单击操作。返回的值是一个导航
            // 条件名称，如果它为 Null，则返回到同一页。
            TUser tuser=TUserUtil.findByUserName((String)txtName.getText());
            if((tuser!=null)&&(tuser.getPassword().equals((String)txtPassword.getText()))){
                TRole trole=tuser.getTRole();
                CurrentUser currentUser=new CurrentUser();
                List popedomList=TRoleUtil.findRolePopedoms(trole.getRoleName());
                currentUser.setAccountName(tuser.getAccountName());
                currentUser.setRoleName(trole.getRoleName());
                currentUser.setTitle(tuser.getTitle());
                currentUser.setUserName(tuser.getUserName());
                currentUser.setMemo(tuser.getMemo());
                currentUser.setPopedomList(popedomList);
                getSessionBean1().setCurrentUser(currentUser);
                HttpSession httpSession=(HttpSession)getExternalContext().getSession(true);
                httpSession.setAttribute("currentUser",currentUser);
                return "Success";
            }else{
                txtName.setText("");
                txtPassword.setText("");
                txtInfo.setVisible(true);
                return null;//Go to error page
            }
        } catch (HibernateException ex) {
            ex.printStackTrace();
            txtName.setText("");
            txtPassword.setText("");
            txtInfo.setVisible(true);
            return null;
        }
    }
    
    public String btnReset_action() {
        // 待做事项：处理按钮单击操作。返回的值是一个导航
        // 条件名称，如果它为 Null，则返回到同一页。
        form1.discardSubmittedValues("form_submit");
        txtName.setText("");
        txtPassword.setText("");
        return null;
    }
    
    public void txtPassword_processValueChange(ValueChangeEvent event) {
        // 待做事项：替换为您的代码
        
    }
}

