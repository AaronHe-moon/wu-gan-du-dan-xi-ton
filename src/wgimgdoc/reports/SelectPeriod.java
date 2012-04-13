/*
 * SelectPeriod.java
 *
 * Created on 2007年10月17日, 下午6:05
 * Copyright Administrator
 */
package wgimgdoc.reports;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.AddRemove;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.Calendar;
import com.sun.rave.web.ui.component.DropDown;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Label;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.MessageGroup;
import com.sun.rave.web.ui.component.Page;
import com.sun.rave.web.ui.model.MultipleSelectOptionsList;
import com.sun.rave.web.ui.model.Option;
import com.sun.rave.web.ui.model.SingleSelectOptionsList;
import entity.TUser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.FacesException;
import javax.servlet.http.HttpSession;
import util.DBUtil;
import util.TUserUtil;
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
public class SelectPeriod extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private int __placeholder;
    
    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        ddTypeDefaultOptions.setOptions(new com.sun.rave.web.ui.model.Option[] {new com.sun.rave.web.ui.model.Option("1", "\u751f\u6210EXCEL\u6587\u6863"), new com.sun.rave.web.ui.model.Option("2", "\u751f\u6210WORD\u6587\u6863"), new com.sun.rave.web.ui.model.Option("3", "\u751f\u6210HTML\u6587\u6863"), new com.sun.rave.web.ui.model.Option("4", "\u751f\u6210PDF\u6587\u6863")});
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
    
    private Calendar calendar_begin = new Calendar();
    
    public Calendar getCalendar_begin() {
        return calendar_begin;
    }
    
    public void setCalendar_begin(Calendar c) {
        this.calendar_begin = c;
    }
    
    private Calendar calendar_end = new Calendar();
    
    public Calendar getCalendar_end() {
        return calendar_end;
    }
    
    public void setCalendar_end(Calendar c) {
        this.calendar_end = c;
    }
    
    private Button btnSubmit = new Button();
    
    public Button getBtnSubmit() {
        return btnSubmit;
    }
    
    public void setBtnSubmit(Button b) {
        this.btnSubmit = b;
    }
    
    private Label label1 = new Label();
    
    public Label getLabel1() {
        return label1;
    }
    
    public void setLabel1(Label l) {
        this.label1 = l;
    }
    
    private MessageGroup messageGroup1 = new MessageGroup();
    
    public MessageGroup getMessageGroup1() {
        return messageGroup1;
    }
    
    public void setMessageGroup1(MessageGroup mg) {
        this.messageGroup1 = mg;
    }

    private AddRemove arList = new AddRemove();

    public AddRemove getArList() {
        return arList;
    }

    public void setArList(AddRemove ar) {
        this.arList = ar;
    }

    private DropDown ddType = new DropDown();

    public DropDown getDdType() {
        return ddType;
    }

    public void setDdType(DropDown dd) {
        this.ddType = dd;
    }

    private SingleSelectOptionsList ddTypeDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDdTypeDefaultOptions() {
        return ddTypeDefaultOptions;
    }

    public void setDdTypeDefaultOptions(SingleSelectOptionsList ssol) {
        this.ddTypeDefaultOptions = ssol;
    }

    private AddRemove addRemove_OP = new AddRemove();

    public AddRemove getAddRemove_OP() {
        return addRemove_OP;
    }

    public void setAddRemove_OP(AddRemove ar) {
        this.addRemove_OP = ar;
    }
    
    // </editor-fold>
    
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public SelectPeriod() {
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
            log("SelectPeriod Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
        List list = TUserUtil.findAllUsers();
        
        List  items=new ArrayList();
        Option newoption;
        TUser tuser;
        for (int i = 0; i < list.size(); i++) {
            tuser=(TUser)list.get(i);
            newoption=new Option();
            newoption.setValue(tuser.getAccountName());
            items.add(newoption);
        }
        arList.setItems(items);
        
        String[] operation={"审核","下载","查看"};
        List items2=new ArrayList();
        for (int i = 0; i < operation.length; i++) {
            newoption=new Option();
            newoption.setValue(operation[i]);
            items2.add(newoption);
        }
        addRemove_OP.setItems(items2);
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
    
    public String btnSubmit_action() {
        // 待做事项：处理按钮单击操作。返回的值是一个导航
        // 条件名称，如果它为 Null，则返回到同一页。
        String[] selected=(String[])arList.getSelected();
//        error(arList.getSelected().toString());
        HttpSession session = (HttpSession) getExternalContext().getSession(true);
        Date startDate = calendar_begin.getSelectedDate();
//        cal.set(2007, Calendar.OCTOBER, 30);
        Date endDate = calendar_end.getSelectedDate();
        List users = new ArrayList();
        for (int i = 0; i < selected.length; i++) {
            users.add(selected[i]);
        }
        
        List actionList=new ArrayList();
        String[] selectedOP=(String[])addRemove_OP.getSelected();
        for (int i = 0; i < selectedOP.length; i++) {
            actionList.add(selectedOP[i]);
            info(selectedOP[i]);
        }
        session.setAttribute("reportStartDate",startDate);
        session.setAttribute("reportEndDate", endDate);
        session.setAttribute("userList", users);
        session.setAttribute("exportType", /*ddType.getSelected()*/"2");
        session.setAttribute("actionList",actionList);
        try {
            getExternalContext().redirect("ServletReport");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}

