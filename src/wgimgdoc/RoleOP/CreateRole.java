/*
 * CreateRole.java
 *
 * Created on 2007年8月2日, 下午9:10
 * Copyright Administrator
 */
package wgimgdoc.RoleOP;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.AddRemove;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Label;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Message;
import com.sun.rave.web.ui.component.MessageGroup;
import com.sun.rave.web.ui.component.Page;
import com.sun.rave.web.ui.component.TextArea;
import com.sun.rave.web.ui.component.TextField;
import com.sun.rave.web.ui.model.Option;
import util.DBUtil;
import entity.TPopedom;
import entity.TRole;
import util.TRolePopedomUtil;
import util.TRoleUtil;
import java.util.ArrayList;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import wgimgdoc.ApplicationBean1;
import wgimgdoc.RequestBean1;
import wgimgdoc.SessionBean1;
import javax.faces.FacesException;
import javax.faces.application.FacesMessage;
import javax.faces.validator.ValidatorException;
import org.hibernate.HibernateException;
import util.TPopedomUtil;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class CreateRole extends AbstractPageBean {
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
    
    private Message message1 = new Message();
    
    public Message getMessage1() {
        return message1;
    }
    
    public void setMessage1(Message m) {
        this.message1 = m;
    }
    
    private TextArea textArea_memo = new TextArea();
    
    public TextArea getTextArea_memo() {
        return textArea_memo;
    }
    
    public void setTextArea_memo(TextArea ta) {
        this.textArea_memo = ta;
    }
    
    private Label label1 = new Label();
    
    public Label getLabel1() {
        return label1;
    }
    
    public void setLabel1(Label l) {
        this.label1 = l;
    }
    
    private Button button1 = new Button();
    
    public Button getButton1() {
        return button1;
    }
    
    public void setButton1(Button b) {
        this.button1 = b;
    }
    
    private AddRemove addRemoveList_configPopedom = new AddRemove();
    
    public AddRemove getAddRemoveList_configPopedom() {
        return addRemoveList_configPopedom;
    }
    
    public void setAddRemoveList_configPopedom(AddRemove ar) {
        this.addRemoveList_configPopedom = ar;
    }
    
    private Label label2 = new Label();
    
    public Label getLabel2() {
        return label2;
    }
    
    public void setLabel2(Label l) {
        this.label2 = l;
    }
    
    private Label label3 = new Label();
    
    public Label getLabel3() {
        return label3;
    }
    
    public void setLabel3(Label l) {
        this.label3 = l;
    }
    
    private TextField textField_roleName = new TextField();
    
    public TextField getTextField_roleName() {
        return textField_roleName;
    }
    
    public void setTextField_roleName(TextField tf) {
        this.textField_roleName = tf;
    }
    
    private MessageGroup messageGroup1 = new MessageGroup();
    
    public MessageGroup getMessageGroup1() {
        return messageGroup1;
    }
    
    public void setMessageGroup1(MessageGroup mg) {
        this.messageGroup1 = mg;
    }
    
    private Button button2 = new Button();
    
    public Button getButton2() {
        return button2;
    }
    
    public void setButton2(Button b) {
        this.button2 = b;
    }
    
    // </editor-fold>
    
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public CreateRole() {
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
            log("CreateRole2 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
        initializePopedomList();
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
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1)getBean("ApplicationBean1");
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
    
    public String button1_action() {
        try {
            // 待做事项：处理按钮单击操作。返回的值是一个导航
            // 条件名称，如果它为 Null，则返回到同一页。
            String roleName=textField_roleName.getValue().toString().trim();
            String memo=(String)textArea_memo.getText();
            String[] selectedPopedomList=(String[])addRemoveList_configPopedom.getSelected();
            
            TRole trole=new TRole();
            TRoleUtil.save(roleName,memo);
            
            for(int i=0;(selectedPopedomList!=null)&&(i<selectedPopedomList.length);i++){
                
                TRolePopedomUtil.saveRolePopedom(roleName,selectedPopedomList[i]);
                
            }
            
            getSessionBean1().getSessionMap().put("roleName_insertSuccessful",roleName);
            return "toSuccess";
        } catch (HibernateException ex) {
            return "toDBConnectionError";
        }
    }
    
    public void textField_roleName_validate(FacesContext context, UIComponent component, Object value) {
        // 待做事项：在此处检查值参数，如果无效，则执行如下操作：
        // 抛出新的 ValidatorException(new FacesMessage("Not a valid value!"))；
        String roleName=((String)value).trim();
//        info(roleName);
//        if(!Pattern.matches("[a-zA-z]\\w+",roleName)){
//            textField_roleName.setValue("");
//            throw new ValidatorException(new FacesMessage("角色名必须是字母和数字的组合并且以字母开头！"));
//        }
        TRole trole;
        try {
            trole = TRoleUtil.findByRoleName(roleName);
            if(trole!=null){
                throw new ValidatorException(new FacesMessage("该角色已经存在，请重新输入角色名称！"));
            }
        } catch (HibernateException ex) {
//            error(ex.getMessage());
////            ex.printStackTrace();
            throw new ValidatorException(new FacesMessage("数据库出错，请重试！"));
        }
    }
    
    public void initializePopedomList() {
        List list=TPopedomUtil.getAllPopedom();
        List option=new ArrayList();
        for(int i=0;(list!=null)&&(i<list.size());i++){
            Option newoption=new Option();
            TPopedom temp=(TPopedom)list.get(i);
            newoption.setValue(temp.getPopedomName());
            option.add(newoption);
        }
        addRemoveList_configPopedom.setItems(option);
    }
}

