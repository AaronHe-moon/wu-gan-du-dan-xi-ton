/*
 * AddLevelTwo.java
 *
 * Created on 2007年9月23日, 下午1:29
 * Copyright Administrator
 */
package wgimgdoc.category;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.DropDown;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Label;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.MessageGroup;
import com.sun.rave.web.ui.component.Page;
import com.sun.rave.web.ui.component.TextField;
import entity.HibernateSessionFactory;
import entity.TFixedCategory;
import entity.TFixedCategoryDAO;
import javax.faces.FacesException;
import javax.faces.convert.IntegerConverter;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import providers.catSelectProvider;
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
public class AddLevelTwo extends AbstractPageBean {
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
    
    private Button btnAdd = new Button();
    
    public Button getBtnAdd() {
        return btnAdd;
    }
    
    public void setBtnAdd(Button b) {
        this.btnAdd = b;
    }
    
    private TextField txtNo = new TextField();
    
    public TextField getTxtNo() {
        return txtNo;
    }
    
    public void setTxtNo(TextField tf) {
        this.txtNo = tf;
    }
    
    private TextField txtName = new TextField();
    
    public TextField getTxtName() {
        return txtName;
    }
    
    public void setTxtName(TextField tf) {
        this.txtName = tf;
    }
    
    private DropDown dropDown1 = new DropDown();
    
    public DropDown getDropDown1() {
        return dropDown1;
    }
    
    public void setDropDown1(DropDown dd) {
        this.dropDown1 = dd;
    }
    
    private IntegerConverter dropDown1Converter = new IntegerConverter();
    
    public IntegerConverter getDropDown1Converter() {
        return dropDown1Converter;
    }
    
    public void setDropDown1Converter(IntegerConverter ic) {
        this.dropDown1Converter = ic;
    }
    
    private MessageGroup messageGroup1 = new MessageGroup();
    
    public MessageGroup getMessageGroup1() {
        return messageGroup1;
    }
    
    public void setMessageGroup1(MessageGroup mg) {
        this.messageGroup1 = mg;
    }
    
    private Button btnReset = new Button();
    
    public Button getBtnReset() {
        return btnReset;
    }
    
    public void setBtnReset(Button b) {
        this.btnReset = b;
    }
    
    // </editor-fold>
    
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public AddLevelTwo() {
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
            log("AddLevelTwo Initialization Failure", e);
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
    
    private catSelectProvider catSprovider = new catSelectProvider();
    
    public catSelectProvider getCatSprovider() {
        return catSprovider;
    }
    
    public void setCatSprovider(catSelectProvider catSprovider) {
        this.catSprovider = catSprovider;
    }
    
    public String btnAdd_action() {
        try {
            // 待做事项：处理按钮单击操作。返回的值是一个导航
            // 条件名称，如果它为 Null，则返回到同一页。
            TFixedCategoryDAO dao = new TFixedCategoryDAO();
            Integer fcatUp = (Integer) dropDown1.getSelected();
            TFixedCategory fcat = new TFixedCategory();
            fcat.setCategoryLevel("2");
            fcat.setCategoryName(txtName.getText().toString());
            fcat.setCategoryNo(txtNo.getText().toString());
            fcat.setIdUp(fcatUp);
            
            Session session = HibernateSessionFactory.getSession();
            Transaction tx = session.beginTransaction();
            session.save(fcat);
            tx.commit();
            
            info("增加二级类目成功！");
        } catch (HibernateException ex) {
//            ex.printStackTrace();
            error("有错误发生，请检查数据后再试！");
        }
        
        return null;
    }
    
    public String btnReset_action() {
        // 待做事项：处理按钮单击操作。返回的值是一个导航
        // 条件名称，如果它为 Null，则返回到同一页。
        form1.discardSubmittedValues("submit");
        txtName.setText("");
        txtNo.setText("");
        return null;
    }
    
}

