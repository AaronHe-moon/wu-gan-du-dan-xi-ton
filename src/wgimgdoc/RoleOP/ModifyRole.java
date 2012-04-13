/*
 * ChangeRole.java
 *
 * Created on 2007年8月3日, 上午9:47
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
import com.sun.rave.web.ui.component.MessageGroup;
import com.sun.rave.web.ui.component.Page;
import com.sun.rave.web.ui.component.PanelLayout;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.TextArea;
import com.sun.rave.web.ui.model.Option;
import util.DBOP;
import util.DBUtil;
import entity.TPopedom;
import entity.TRole;
import entity.TRolePopedom;
import util.TRolePopedomUtil;
import util.TRoleUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import wgimgdoc.ApplicationBean1;
import wgimgdoc.RequestBean1;
import wgimgdoc.SessionBean1;
import javax.faces.FacesException;
import org.hibernate.HibernateException;
import util.TPopedomUtil;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class ModifyRole extends AbstractPageBean {
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
    
    private AddRemove addRemoveList_configPopedom = new AddRemove();
    
    public AddRemove getAddRemoveList_configPopedom() {
        return addRemoveList_configPopedom;
    }
    
    public void setAddRemoveList_configPopedom(AddRemove ar) {
        this.addRemoveList_configPopedom = ar;
    }
    
    private Button button_refresh = new Button();
    
    public Button getButton_refresh() {
        return button_refresh;
    }
    
    public void setButton_refresh(Button b) {
        this.button_refresh = b;
    }
    
    private TextArea textArea_memo = new TextArea();
    
    public TextArea getTextArea_memo() {
        return textArea_memo;
    }
    
    public void setTextArea_memo(TextArea ta) {
        this.textArea_memo = ta;
    }
    
    private Button button_submitChanges = new Button();
    
    public Button getButton_submitChanges() {
        return button_submitChanges;
    }
    
    public void setButton_submitChanges(Button b) {
        this.button_submitChanges = b;
    }
    
    private StaticText staticText2 = new StaticText();
    
    public StaticText getStaticText2() {
        return staticText2;
    }
    
    public void setStaticText2(StaticText st) {
        this.staticText2 = st;
    }
    
    private StaticText staticText_roleName = new StaticText();
    
    public StaticText getStaticText_roleName() {
        return staticText_roleName;
    }
    
    public void setStaticText_roleName(StaticText st) {
        this.staticText_roleName = st;
    }

    private PanelLayout layoutPanel1 = new PanelLayout();

    public PanelLayout getLayoutPanel1() {
        return layoutPanel1;
    }

    public void setLayoutPanel1(PanelLayout pl) {
        this.layoutPanel1 = pl;
    }

    private StaticText staticText1 = new StaticText();

    public StaticText getStaticText1() {
        return staticText1;
    }

    public void setStaticText1(StaticText st) {
        this.staticText1 = st;
    }

    private MessageGroup messageGroup1 = new MessageGroup();

    public MessageGroup getMessageGroup1() {
        return messageGroup1;
    }

    public void setMessageGroup1(MessageGroup mg) {
        this.messageGroup1 = mg;
    }
    
    // </editor-fold>
    
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public ModifyRole() {
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
            log("ConfigRole Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
    }
    
    protected void initializeComponentByRoleName(String roleName){
        if(roleName==null) return;
        
        List list=TPopedomUtil.getAllPopedom();
        List option=new ArrayList();
        TPopedom temp;
        Option newoption;
        for(int i=0;(list!=null)&&(i<list.size());i++){
            newoption=new Option();
            temp=(TPopedom)list.get(i);
            newoption.setValue(temp.getPopedomName());
            option.add(newoption);
        }
         
        addRemoveList_configPopedom.setItems(option);//set all the popedoms
        
        textArea_memo.setText(TRoleUtil.findByRoleName(roleName).getMemo());
         
        
        List selectedPopedoms=TRoleUtil.findRolePopedoms(roleName);
        String[] selectedItems=new String[(selectedPopedoms!=null)?selectedPopedoms.size():0];
        String popedomName;
        TPopedom temp1;
        for(int i=0;(selectedPopedoms!=null)&&(i<selectedPopedoms.size());i++){
            temp1=(TPopedom)selectedPopedoms.get(i);
            popedomName=temp1.getPopedomName();
            selectedItems[i]=popedomName;
        }
         
        
        addRemoveList_configPopedom.setSelected(selectedItems);
        
        
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
        String roleName=(String)getSessionBean1().getSessionMap().get("roleName_toBeModified");
        staticText_roleName.setText(roleName);
        if(roleName!=null)
            initializeComponentByRoleName(roleName);
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
    
    public String button_refresh_action() {
        // 待做事项：处理按钮单击操作。返回的值是一个导航
        // 条件名称，如果它为 Null，则返回到同一页。
        
        return "toWelcome";
    }
    
    
    public String button_submitChanges_action() {
        // 待做事项：处理按钮单击操作。返回的值是一个导航
        // 条件名称，如果它为 Null，则返回到同一页。
        try{
            String roleName=(String)staticText_roleName.getText();
            if(roleName==null)//there is no role exist
            {
                return null;
            }
            Set set=TRolePopedomUtil.findRolePopedomByRoleName(roleName);//find the TRolePopedomList
            List list =new ArrayList();
            DBOP op;
            TRolePopedom temp;
            TRolePopedom trolepopedom;
            
            //remove all the popedom
            Iterator it=set.iterator();
            while (it.hasNext()) {
                temp = (TRolePopedom) it.next();
                op= new DBOP();
                op.setOpType(DBOP.DELETE);
                op.setEntity(temp);
                list.add(op);
            }
            //add all the popedom
            String[] selectedPopedomNames=(String[])addRemoveList_configPopedom.getSelected();
            for(int i=0;(selectedPopedomNames!=null)&&(i<selectedPopedomNames.length);i++){
                trolepopedom=new TRolePopedom(roleName,(String)selectedPopedomNames[i]);
                op=new DBOP();
                op.setOpType(DBOP.INSERT);
                op.setEntity(trolepopedom);
                list.add(op);
            }
            DBUtil.batchProcess(list);
            
             
            TRole trole=new TRole();
            trole.setRoleName(roleName);trole.setMemo((String)textArea_memo.getText());
            TRoleUtil.saveOrUpdate(trole);
//            info("操作成功");
            return "toSuccess";
        } catch (HibernateException ex) {
            return "toDBConnectionError";
        }
    }
}

