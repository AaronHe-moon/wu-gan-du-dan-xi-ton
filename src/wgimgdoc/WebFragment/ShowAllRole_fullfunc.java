/*
 * ShowAllRole.java
 *
 * Created on 2007年7月13日, 下午4:00
 * Copyright Administrator
 */
package wgimgdoc.WebFragment;

import com.sun.data.provider.DataProviderException;
import com.sun.data.provider.impl.TableRowDataProvider;
import com.sun.rave.web.ui.appbase.AbstractFragmentBean;
import com.sun.rave.web.ui.component.Hyperlink;
import com.sun.rave.web.ui.component.Label;
import com.sun.rave.web.ui.component.MessageGroup;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.Table;
import com.sun.rave.web.ui.component.TableColumn;
import com.sun.rave.web.ui.component.TableRowGroup;
import entity.TRole;
import entity.TRolePopedom;
import java.util.Iterator;
import java.util.Set;
import org.hibernate.HibernateException;
import usky.search.TRoleProvider;
import wgimgdoc.*;
import javax.faces.FacesException;
import util.DBUtil;
import util.TRoleUtil;

/**
 * <p>Fragment bean that corresponds to a similarly named JSP page
 * fragment.  This class contains component definitions (and initialization
 * code) for all components that you have defined on this fragment, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class ShowAllRole_fullfunc extends AbstractFragmentBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private int __placeholder;
    
    /**
     * <p>Automatically managed component initialization. <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    
    private Label label1 = new Label();
    
    public Label getLabel1() {
        return label1;
    }
    
    public void setLabel1(Label l) {
        this.label1 = l;
    }
    
    private Table table_AllRole = new Table();
    
    public Table getTable_AllRole() {
        return table_AllRole;
    }
    
    public void setTable_AllRole(Table t) {
        this.table_AllRole = t;
    }
    
    private TableRowGroup tableRowGroup1 = new TableRowGroup();
    
    public TableRowGroup getTableRowGroup1() {
        return tableRowGroup1;
    }
    
    public void setTableRowGroup1(TableRowGroup trg) {
        this.tableRowGroup1 = trg;
    }
    
    private MessageGroup messageGroup1 = new MessageGroup();
    
    public MessageGroup getMessageGroup1() {
        return messageGroup1;
    }
    
    public void setMessageGroup1(MessageGroup mg) {
        this.messageGroup1 = mg;
    }
    
    private TableColumn tableColumn1 = new TableColumn();
    
    public TableColumn getTableColumn1() {
        return tableColumn1;
    }
    
    public void setTableColumn1(TableColumn tc) {
        this.tableColumn1 = tc;
    }
    
    private StaticText staticText1 = new StaticText();
    
    public StaticText getStaticText1() {
        return staticText1;
    }
    
    public void setStaticText1(StaticText st) {
        this.staticText1 = st;
    }
    
    private TableColumn tableColumn2 = new TableColumn();
    
    public TableColumn getTableColumn2() {
        return tableColumn2;
    }
    
    public void setTableColumn2(TableColumn tc) {
        this.tableColumn2 = tc;
    }
    
    private StaticText staticText2 = new StaticText();
    
    public StaticText getStaticText2() {
        return staticText2;
    }
    
    public void setStaticText2(StaticText st) {
        this.staticText2 = st;
    }
    
    private TableColumn tableColumn3 = new TableColumn();
    
    public TableColumn getTableColumn3() {
        return tableColumn3;
    }
    
    public void setTableColumn3(TableColumn tc) {
        this.tableColumn3 = tc;
    }
    
    private Hyperlink hyperlink_modifyRole = new Hyperlink();
    
    public Hyperlink getHyperlink_modifyRole() {
        return hyperlink_modifyRole;
    }
    
    public void setHyperlink_modifyRole(Hyperlink h) {
        this.hyperlink_modifyRole = h;
    }
    
    private TableColumn tableColumn5 = new TableColumn();
    
    public TableColumn getTableColumn5() {
        return tableColumn5;
    }
    
    public void setTableColumn5(TableColumn tc) {
        this.tableColumn5 = tc;
    }
    
    private Hyperlink hyperlink_deleteRole = new Hyperlink();
    
    public Hyperlink getHyperlink_deleteRole() {
        return hyperlink_deleteRole;
    }
    
    public void setHyperlink_deleteRole(Hyperlink h) {
        this.hyperlink_deleteRole = h;
    }
    // </editor-fold>
    
    public ShowAllRole_fullfunc() {
    }
    
    /**
     * <p>Callback method that is called whenever a page containing
     * this page fragment is navigated to, either directly via a URL,
     * or indirectly via page navigation.  Override this method to acquire
     * resources that will be needed for event handlers and lifecycle methods.</p>
     *
     * <p>The default implementation does nothing.</p>
     */
    public void init() {
        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here
        
        
        // <editor-fold defaultstate="collapsed" desc="Visual-Web-managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("Page1 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
        
        troleDataProvider.refresh();
    }
    
    /**
     * <p>Callback method that is called after rendering is completed for
     * this request, if <code>init()</code> was called.  Override this
     * method to release resources acquired in the <code>init()</code>
     * resources that will be needed for event handlers and lifecycle methods.</p>
     *
     * <p>The default implementation does nothing.</p>
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
    
    public String hyperlink_ConfigurePopedom_action() {
//        try {
//            // 待做事项：替换为您的代码
//            TableRowDataProvider trdp=(TableRowDataProvider)getBean("currentRow");
//            String RoleName=(String)trdp.getValue("RoleName");
//            getSessionBean1().setZb_TobeModifiedRoleName(RoleName);
//            getSessionBean1().setZb_roleName(RoleName);
//        } catch (DataProviderException ex) {
//            error(ex.getMessage());
//            return null;
////            ex.printStackTrace();
//        }
//        return "ChangeRole";
        return null;
    }
    
//    public String hyperlink_deleteRole_action() {
//        // 待做事项：替换为您的代码
//        TableRowDataProvider trdp=(TableRowDataProvider)getBean("currentRow");
//        getSessionBean1().setZb_roleName((String)trdp.getValue("RoleName"));
//        return "GotoDeleteRole";
//    }
    
    private TRoleProvider troleDataProvider=new TRoleProvider();
    
    public TRoleProvider getTroleDataProvider() {
        return troleDataProvider;
    }
    
    public void setTroleDataProvider(TRoleProvider troleDataProvider) {
        this.troleDataProvider = troleDataProvider;
    }
    
    public String hyperlink_modifyRole_action() {
        // 待做事项：替换为您的代码
        
        TableRowDataProvider trdp=(TableRowDataProvider)getBean("currentRow");
        String roleName=(String)trdp.getValue("roleName");
        if(roleName.equals(getSessionBean1().getCurrentUser().getRoleName())) {
            return "toModifyNotAllowed";
        }
        getSessionBean1().getSessionMap().put("roleName_toBeModified",roleName);
        return "ChangeRole";
    }
    
    public String hyperlink_deleteRole_action() {
        try {
            // 待做事项：替换为您的代码
            TableRowDataProvider trdp=(TableRowDataProvider)getBean("currentRow");
            String roleName=(String)trdp.getValue("roleName");
            TRole trole=TRoleUtil.findByRoleName(roleName);
            if(trole!=null){
                if(trole.getTUsers().size()>0){
                    return "Failure";
                }else{
                    Set set=trole.getTRolePopedoms();
                    for (Iterator it = set.iterator(); it.hasNext();) {
                        TRolePopedom elem = (TRolePopedom) it.next();
                        DBUtil.delete(elem);
                    }
                    DBUtil.delete(trole);
                    return "Success";
                }
            }
        } catch (Exception ex) {
            return "Failure";
        }
        return "Failure";
    }
}
