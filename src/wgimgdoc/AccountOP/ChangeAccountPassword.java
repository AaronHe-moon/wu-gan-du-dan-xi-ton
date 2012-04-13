/*
 * ChangeAccountPassword.java
 *
 * Created on 2007年10月14日, 上午3:36
 * Copyright Administrator
 */
package wgimgdoc.AccountOP;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Message;
import com.sun.rave.web.ui.component.Page;
import com.sun.rave.web.ui.component.PasswordField;
import com.sun.rave.web.ui.component.StaticText;
import entity.TUser;
import javax.faces.FacesException;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import org.hibernate.HibernateException;
import util.TRoleUtil;
import util.TUserUtil;
import wgimgdoc.ApplicationBean1;
import wgimgdoc.RequestBean1;
import wgimgdoc.SessionBean1;
import wgimgdoc.globe.CurrentUser;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class ChangeAccountPassword extends AbstractPageBean {
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
    
    private PasswordField txtOldPsw = new PasswordField();
    
    public PasswordField getTxtOldPsw() {
        return txtOldPsw;
    }
    
    public void setTxtOldPsw(PasswordField pf) {
        this.txtOldPsw = pf;
    }
    
    private PasswordField txtNewPsw = new PasswordField();
    
    public PasswordField getTxtNewPsw() {
        return txtNewPsw;
    }
    
    public void setTxtNewPsw(PasswordField pf) {
        this.txtNewPsw = pf;
    }
    
    private PasswordField txtConfirmNewPsw = new PasswordField();
    
    public PasswordField getTxtConfirmNewPsw() {
        return txtConfirmNewPsw;
    }
    
    public void setTxtConfirmNewPsw(PasswordField pf) {
        this.txtConfirmNewPsw = pf;
    }
    
    private Button button_Submit = new Button();
    
    public Button getButton_Submit() {
        return button_Submit;
    }
    
    public void setButton_Submit(Button b) {
        this.button_Submit = b;
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
    
    private Button button1 = new Button();
    
    public Button getButton1() {
        return button1;
    }
    
    public void setButton1(Button b) {
        this.button1 = b;
    }
    
    // </editor-fold>
    
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public ChangeAccountPassword() {
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
            log("ChangeAccountPassword Initialization Failure", e);
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
    
    public String button_Submit_action() {
        try {
            // 待做事项：处理按钮单击操作。返回的值是一个导航
            // 条件名称，如果它为 Null，则返回到同一页。
            CurrentUser cu=getSessionBean1().getCurrentUser();
            TUser tuser=new TUser();
            tuser.setAccountName(cu.getAccountName());
            tuser.setPassword((String)txtNewPsw.getText());
            tuser.setMemo(cu.getMemo());
            tuser.setUserName(cu.getUserName());
            tuser.setTitle(cu.getTitle());
            tuser.setTRole(TRoleUtil.findByRoleName(cu.getRoleName()));
            TUserUtil.saveOrUpdate(tuser);
            return "toSuccess";
        } catch (HibernateException ex) {
//            ex.printStackTrace();
//            error(ex.getMessage());
            return "toDBConnectionError";
        }
    }
    
    public void txtOldPsw_validate(FacesContext context, UIComponent component, Object value) {
        // 待做事项：在此处检查值参数，如果无效，则执行如下操作：
        // 抛出新的 ValidatorException(new FacesMessage("Not a valid value!"))；
        CurrentUser cu=getSessionBean1().getCurrentUser();
        String psw=(String)value;
        TUser tu=TUserUtil.findByUserName(cu.getAccountName());
        if(tu.getPassword()!=null &&!tu.getPassword().equals(psw)){
            throw new ValidatorException(new FacesMessage("原始密码不正确,请重新输入!"));
        }else if (tu.getPassword()!=psw){
            throw new ValidatorException(new FacesMessage("原始密码不正确,请重新输入!"));
        }
    }
    
    public void txtConfirmNewPsw_validate(FacesContext context, UIComponent component, Object value) {
        // 待做事项：在此处检查值参数，如果无效，则执行如下操作：
        // 抛出新的 ValidatorException(new FacesMessage("Not a valid value!"))；
        String newpsw=(String)txtNewPsw.getText();
        String cnewpsw=(String)value;
        if(newpsw==null){
            if(cnewpsw!=null)
                throw new ValidatorException(new FacesMessage("新密码确认失败,请重新输入!"));
        }else{
            if(cnewpsw==null){
                throw new ValidatorException(new FacesMessage("新密码确认失败,请重新输入!"));
            }else if(!newpsw.equals(cnewpsw)){
                throw new ValidatorException(new FacesMessage("新密码确认失败,请重新输入!"));
            }
        }
    }
    
    public String button1_action() {
        // 待做事项：处理按钮单击操作。返回的值是一个导航
        // 条件名称，如果它为 Null，则返回到同一页。
        
        return "toWelcome";
    }
}

