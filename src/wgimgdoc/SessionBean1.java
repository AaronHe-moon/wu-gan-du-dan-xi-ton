/*
 * SessionBean1.java
 *
 * Created on 2007年9月6日, 下午5:06
 * Copyright Administrator
 */
package wgimgdoc;

import com.sun.rave.web.ui.appbase.AbstractSessionBean;
import java.util.HashMap;
import java.util.Map;
import javax.faces.FacesException;
import providers.catLevelOneProvider;
import providers.catLevelTwoProvider;
import providers.catSelectProvider;
import wgimgdoc.globe.CurrentUser;
import providers.SearchConditionJJ;
import providers.SearchConditionSB;

/**
 * <p>Session scope data bean for your application.  Create properties
 *  here to represent cached data that should be made available across
 *  multiple HTTP requests for an individual user.</p>
 *
 * <p>An instance of this class will be created for you automatically,
 * the first time your application evaluates a value binding expression
 * or method binding expression that references a managed bean using
 * this class.</p>
 */
public class SessionBean1 extends AbstractSessionBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private int __placeholder;
    
    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        //<he liang's data parts>
        
    }
    
    
    
    // </editor-fold>
    
    /**
     * <p>Construct a new session data bean instance.</p>
     */
    public SessionBean1() {
    }
    
    /**
     * <p>This method is called when this bean is initially added to
     * session scope.  Typically, this occurs as a result of evaluating
     * a value binding or method binding expression, which utilizes the
     * managed bean facility to instantiate this bean and store it into
     * session scope.</p>
     *
     * <p>You may customize this method to initialize and cache data values
     * or resources that are required for the lifetime of a particular
     * user session.</p>
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
            log("SessionBean1 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
    }
    
    /**
     * <p>This method is called when the session containing it is about to be
     * passivated.  Typically, this occurs in a distributed servlet container
     * when the session is about to be transferred to a different
     * container instance, after which the <code>activate()</code> method
     * will be called to indicate that the transfer is complete.</p>
     *
     * <p>You may customize this method to release references to session data
     * or resources that can not be serialized with the session itself.</p>
     */
    public void passivate() {
    }
    
    /**
     * <p>This method is called when the session containing it was
     * reactivated.</p>
     *
     * <p>You may customize this method to reacquire references to session
     * data or resources that could not be serialized with the
     * session itself.</p>
     */
    public void activate() {
    }
    
    /**
     * <p>This method is called when this bean is removed from
     * session scope.  Typically, this occurs as a result of
     * the session timing out or being terminated by the application.</p>
     *
     * <p>You may customize this method to clean up resources allocated
     * during the execution of the <code>init()</code> method, or
     * at any later time during the lifetime of the application.</p>
     */
    public void destroy() {
    }
    
    /**
     * <p>返回对已限定范围的数据 Bean 的引用。</p>
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1)getBean("ApplicationBean1");
    }
    
    private  CurrentUser currentUser;
    
    private Map SessionMap = new HashMap();
    
    public Map getSessionMap() {
        return SessionMap;
    }
    
    public void setSessionMap(Map SessionMap) {
        this.SessionMap = SessionMap;
    }
    
    public CurrentUser getCurrentUser() {
        return currentUser;
    }
    
    public void setCurrentUser(CurrentUser currentUser) {
        this.currentUser = currentUser;
    }
    
    // <he liang's code part>
    /**
     * 保存属性 conJJ 的值。
     */
    private SearchConditionJJ conJJ = new SearchConditionJJ();
    
    /**
     * 属性 conJJ 的获取方法。
     * @return 属性 conJJ 的值。
     */
    public SearchConditionJJ getConJJ() {
        return this.conJJ;
    }
    
    /**
     * 属性 conJJ 的设置方法。
     * @param conJJ 属性 conJJ 的新值。
     */
    public void setConJJ(SearchConditionJJ conJJ) {
        this.conJJ = conJJ;
    }
    
    /**
     * 保存属性 conSB 的值。
     */
    private SearchConditionSB conSB = new SearchConditionSB();
    
    /**
     * 属性 conSB 的获取方法。
     * @return 属性 conSB 的值。
     */
    public SearchConditionSB getConSB() {
        return this.conSB;
    }
    
    /**
     * 属性 conSB 的设置方法。
     * @param conSB 属性 conSB 的新值。
     */
    public void setConSB(SearchConditionSB conSB) {
        this.conSB = conSB;
    }
    
    
    private catLevelTwoProvider catprovider = new catLevelTwoProvider();
    
    public catLevelTwoProvider getCatprovider() {
        return catprovider;
    }
    
    public void setCatprovider(catLevelTwoProvider catprovider) {
        this.catprovider = catprovider;
    }
    
    private catSelectProvider catSprovider = new catSelectProvider();
    
    public catSelectProvider getCatSprovider() {
        return catSprovider;
    }
    
    public void setCatSprovider(catSelectProvider catSprovider) {
        this.catSprovider = catSprovider;
    }
    
    
    private catLevelOneProvider catL1provider = new catLevelOneProvider();
    public catLevelOneProvider getCatL1provider() {
        return catL1provider;
    }

    public void setCatL1provider(catLevelOneProvider catL1provider) {
        this.catL1provider = catL1provider;
    // </he liang's code part>


    }
    
    
}
