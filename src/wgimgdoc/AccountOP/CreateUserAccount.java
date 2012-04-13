/*
 * CreateUserAccount.java
 *
 * Created on 2007年7月19日, 下午2:45
 * Copyright Administrator
 */
package wgimgdoc.AccountOP;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.DropDown;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Label;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Message;
import com.sun.rave.web.ui.component.MessageGroup;
import com.sun.rave.web.ui.component.Page;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.TextArea;
import com.sun.rave.web.ui.component.TextField;
import com.sun.rave.web.ui.model.Option;
import entity.TRole;
import entity.TUser;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import wgimgdoc.ApplicationBean1;
import wgimgdoc.RequestBean1;
import wgimgdoc.SessionBean1;
import javax.faces.FacesException;
import javax.faces.application.FacesMessage;
import javax.faces.validator.ValidatorException;
import org.hibernate.HibernateException;
import util.DBUtil;
import util.TRoleUtil;
import util.TUserUtil;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class CreateUserAccount extends AbstractPageBean {
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
    
    private Button button_Ok = new Button();
    
    public Button getButton_Ok() {
        return button_Ok;
    }
    
    public void setButton_Ok(Button b) {
        this.button_Ok = b;
    }
    
    private Message message1 = new Message();
    
    public Message getMessage1() {
        return message1;
    }
    
    public void setMessage1(Message m) {
        this.message1 = m;
    }
    
    private TextArea textArea_userMemo = new TextArea();
    
    public TextArea getTextArea_userMemo() {
        return textArea_userMemo;
    }
    
    public void setTextArea_userMemo(TextArea ta) {
        this.textArea_userMemo = ta;
    }
    
    private TextField textField_password = new TextField();
    
    public TextField getTextField_password() {
        return textField_password;
    }
    
    public void setTextField_password(TextField tf) {
        this.textField_password = tf;
    }
    
    private MessageGroup messageGroup1 = new MessageGroup();
    
    public MessageGroup getMessageGroup1() {
        return messageGroup1;
    }
    
    public void setMessageGroup1(MessageGroup mg) {
        this.messageGroup1 = mg;
    }
    
    private Message message2 = new Message();
    
    public Message getMessage2() {
        return message2;
    }
    
    public void setMessage2(Message m) {
        this.message2 = m;
    }
    
    private Label label1 = new Label();
    
    public Label getLabel1() {
        return label1;
    }
    
    public void setLabel1(Label l) {
        this.label1 = l;
    }
    
    private Button button_cancel = new Button();
    
    public Button getButton_cancel() {
        return button_cancel;
    }
    
    public void setButton_cancel(Button b) {
        this.button_cancel = b;
    }
    
    private TextField textField_userTitle = new TextField();
    
    public TextField getTextField_userTitle() {
        return textField_userTitle;
    }
    
    public void setTextField_userTitle(TextField tf) {
        this.textField_userTitle = tf;
    }
    
    private TextField textField_userName = new TextField();
    
    public TextField getTextField_userName() {
        return textField_userName;
    }
    
    public void setTextField_userName(TextField tf) {
        this.textField_userName = tf;
    }
    
    private TextField textField_acountName = new TextField();
    
    public TextField getTextField_acountName() {
        return textField_acountName;
    }
    
    public void setTextField_acountName(TextField tf) {
        this.textField_acountName = tf;
    }
    
    private DropDown dropDown_userRole = new DropDown();
    
    public DropDown getDropDown_userRole() {
        return dropDown_userRole;
    }
    
    public void setDropDown_userRole(DropDown dd) {
        this.dropDown_userRole = dd;
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
    
    // </editor-fold>
    
    /**
     * <p>age navigation.
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
            log("CreateUserAcount Initialization Failure", e);
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
        initializeDropDown();
    }
    public void initializeDropDown(){
        try {
            TRole trole=new TRole();
            List list=TRoleUtil.findByExample(trole);
            List items=new ArrayList();
            Option newoption;
            TRole temp;
            for(int i=0;(list!=null)&&(i<list.size());i++){
                temp=(TRole)list.get(i);
                newoption=new Option();
                newoption.setValue(temp.getRoleName());
                items.add(newoption);
            }
            if(dropDown_userRole.getItems()==null)
                dropDown_userRole.setItems(items);
            
            
            if(items.size()>0&&dropDown_userRole.getSelected()==null)
                dropDown_userRole.setSelected(((TRole)list.get(0)).getRoleName());
        } catch (HibernateException ex) {
            error(ex.getMessage());
        }
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
    
    public String button_Ok_action() {
        // 待做事项：处理按钮单击操作。返回的值是一个导航
        // 条件名称，如果它为 Null，则返回到同一页。
        try {
            // 待做事项：处理按钮单击操作。返回的值是一个导航
            // 条件名称，如果它为 Null，则返回到同一页。
            
            TUser tuser=new TUser();
            tuser.setAccountName(textField_acountName.getText().toString().trim());
            tuser.setMemo((String)textArea_userMemo.getText());
            tuser.setPassword((String)textField_password.getText());
            tuser.setTitle((String)textField_userTitle.getText());
            tuser.setUserName((String)textField_userName.getText());
            
            TRole trole=new TRole();
            trole.setRoleName((String)dropDown_userRole.getSelected());
            
            TUserUtil.saveUser(tuser,trole);
            info("操作成功！");
        } catch (HibernateException ex) {
            return "toDBConnectionError";
//            error(ex.getMessage());
//            ex.printStackTrace();
        }
        return "toSuccess";
    }
    
    public void textField_password_validate(FacesContext context, UIComponent component, Object value) {
        // 待做事项：在此处检查值参数，如果无效，则执行如下操作：
        // 抛出新的 ValidatorException(new FacesMessage("Not a valid value!"))；
        String password=(String)value;
//        if(password.length()<8){
//            textField_password.setText("");
//            throw new ValidatorException(new FacesMessage("请输入8位或8位以上32位以下的密码！"));
//        }
        if(!Pattern.matches("\\w+",password)){
            textField_password.setText("");
            throw new ValidatorException(new FacesMessage("密码必须是字母和数字的组合！"));
        }
    }
    
    public void textField_acountName_validate(FacesContext context, UIComponent component, Object value) {
        // 待做事项：在此处检查值参数，如果无效，则执行如下操作：
        // 抛出新的 ValidatorException(new FacesMessage("Not a valid value!"))；
        String accountName=((String)value).trim();
//        if(!Pattern.matches("[a-zA-Z]\\w+",accountName)){
//            throw new ValidatorException(new FacesMessage("帐号必须以大写字母开头！后面是字母和数字的组合！"));
//        }
        
        TUser tuser=TUserUtil.findByUserName(accountName);
        
        if(tuser!=null){
            throw new ValidatorException(new FacesMessage("该帐号已经存在，请输入一个新的帐号名称！"));
        }
        
    }
    
    /**
     * <p>构造新的页面 Bean 实例。</p>
     */
    public CreateUserAccount() {
    }
    
    public String button_cancel_action() {
        // 待做事项：处理按钮单击操作。返回的值是一个导航
        // 条件名称，如果它为 Null，则返回到同一页。
        
        return "toWelcome";
    }
}

