/*
 * ModifyUserAccount.java
 *
 * Created on 2007年7月19日, 下午2:06
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
import util.DBUtil;
import entity.TRole;
import util.TRoleUtil;
import entity.TUser;
import util.TUserUtil;
import java.util.ArrayList;
import java.util.List;
import javax.faces.event.ValueChangeEvent;
import wgimgdoc.ApplicationBean1;
import wgimgdoc.RequestBean1;
import wgimgdoc.SessionBean1;
import javax.faces.FacesException;
import javax.faces.application.FacesMessage;
import javax.faces.validator.ValidatorException;
import org.hibernate.HibernateException;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class ModifyUserAccount extends AbstractPageBean {
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
    
    private TextArea textArea_UserMemo = new TextArea();
    
    public TextArea getTextArea_UserMemo() {
        return textArea_UserMemo;
    }
    
    public void setTextArea_UserMemo(TextArea ta) {
        this.textArea_UserMemo = ta;
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
    
    private TextField textField_UserName = new TextField();
    
    public TextField getTextField_UserName() {
        return textField_UserName;
    }
    
    public void setTextField_UserName(TextField tf) {
        this.textField_UserName = tf;
    }
    
    private Button button_Ok = new Button();
    
    public Button getButton_Ok() {
        return button_Ok;
    }
    
    public void setButton_Ok(Button b) {
        this.button_Ok = b;
    }
    
    private StaticText staticText3 = new StaticText();
    
    public StaticText getStaticText3() {
        return staticText3;
    }
    
    public void setStaticText3(StaticText st) {
        this.staticText3 = st;
    }
    
    private Label label1 = new Label();
    
    public Label getLabel1() {
        return label1;
    }
    
    public void setLabel1(Label l) {
        this.label1 = l;
    }
    
    private DropDown dropDown_UserRole = new DropDown();
    
    public DropDown getDropDown_UserRole() {
        return dropDown_UserRole;
    }
    
    public void setDropDown_UserRole(DropDown dd) {
        this.dropDown_UserRole = dd;
    }
    
    private StaticText staticText4 = new StaticText();
    
    public StaticText getStaticText4() {
        return staticText4;
    }
    
    public void setStaticText4(StaticText st) {
        this.staticText4 = st;
    }
    
    private TextField textField_Password = new TextField();
    
    public TextField getTextField_Password() {
        return textField_Password;
    }
    
    public void setTextField_Password(TextField tf) {
        this.textField_Password = tf;
    }
    
    private TextField textField_UserTitle = new TextField();
    
    public TextField getTextField_UserTitle() {
        return textField_UserTitle;
    }
    
    public void setTextField_UserTitle(TextField tf) {
        this.textField_UserTitle = tf;
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
    
    private TextField textField_AccountName = new TextField();
    
    public TextField getTextField_AccountName() {
        return textField_AccountName;
    }
    
    public void setTextField_AccountName(TextField tf) {
        this.textField_AccountName = tf;
    }

    private MessageGroup messageGroup1 = new MessageGroup();

    public MessageGroup getMessageGroup1() {
        return messageGroup1;
    }

    public void setMessageGroup1(MessageGroup mg) {
        this.messageGroup1 = mg;
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
    public ModifyUserAccount() {
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
            log("ModifyUserAcount2 Initialization Failure", e);
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
        initializeDropDown_roleName();
        
        initializeComponent();
    }
    
    public void initializeDropDown_roleName(){
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
        
        dropDown_UserRole.setItems(items);
        if(items.size()>0)
            dropDown_UserRole.setSelected(items.get(0));
    }
    
//    public void initializeDropDown_accountName(){
//        String accountName=getSessionBean1().getSessionMap().get("account_toBeModified").toString();
//        if(accountName==null) return;
//        TUser tuser=new TUser();
//        List list=TUserUtil.findByExample(tuser);
//        TUser temp;
//
//        List items=new ArrayList();
//        Option newoption;
//        for(int i=0;(list!=null)&&(i<list.size());i++){
//            temp=(TUser)list.get(i);
//            newoption=new Option();
//            newoption.setValue(temp.getAccountName());
//            items.add(newoption);
//        }
//
//        dropDown_accountName.setItems(items);
//        dropDown_accountName.setSelected(accountName);
//    }
//
    public void initializeComponent(){
        String accountName=(String)getSessionBean1().getSessionMap().get("account_toBeModified");
        if(accountName==null){
            return;
        }
        
        configComponent(accountName);
    }
    
    public void configComponent(String accountName){
        TUser tuser=TUserUtil.findByUserName(accountName);
        
        dropDown_UserRole.setSelected(tuser.getTRole().getRoleName());
        textField_AccountName.setText(accountName);
//            dropDown_accountName.setSelected(tuser.getAccountName());
        textArea_UserMemo.setText(tuser.getMemo());
        textField_Password.setText(tuser.getPassword());
        textField_UserName.setText(tuser.getUserName());
        textField_UserTitle.setText(tuser.getTitle());
        
         
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
     * <p>返回对已限定范围的数据 Bean 的引用。</p>
     */
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1)getBean("RequestBean1");
    }
    
    public String button_Ok_action() {
        // 待做事项：处理按钮单击操作。返回的值是一个导航
        // 条件名称，如果它为 Null，则返回到同一页。
        try {
            // 待做事项：处理按钮单击操作。返回的值是一个导航
            // 条件名称，如果它为 Null，则返回到同一页。
            
            TUser tuser=new TUser();
            tuser.setAccountName((String)textField_AccountName.getText());
            tuser.setMemo((String)textArea_UserMemo.getText());
            tuser.setPassword(((String)textField_Password.getText()));
            tuser.setTitle((String)textField_UserTitle.getText());
            tuser.setUserName((String)textField_UserName.getText());
            
            TRole trole=new TRole();
            trole.setRoleName((String)dropDown_UserRole.getSelected());
            
            TUserUtil.updateUser(tuser,trole);
            info("操作成功！");
            return "toSuccess";
        } catch (HibernateException ex) {
            error(ex.getMessage());
            return "toDBConnectionError";
        }
    }
//
//    public void dropDown_accountName_processValueChange(ValueChangeEvent vce) {
//        // 待做事项：替换为您的代码
//        String accountName = (String)dropDown_accountName.getSelected();
//
//        configComponent(accountName);
//    }

    public String button1_action() {
        // 待做事项：处理按钮单击操作。返回的值是一个导航
        // 条件名称，如果它为 Null，则返回到同一页。
        
        return "toWelcome";
    }
}

