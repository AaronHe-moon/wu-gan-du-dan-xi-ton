/*
 * RequestBean1.java
 *
 * Created on 2007年9月6日, 下午5:06
 * Copyright Administrator
 */
package wgimgdoc;

import com.sun.rave.web.ui.appbase.AbstractRequestBean;
import javax.faces.FacesException;
import providers.SearchConditionJJ;
import providers.SearchConditionSB;

/**
 * <p>Request scope data bean for your application.  Create properties
 *  here to represent data that should be made available across different
 *  pages in the same HTTP request, so that the page bean classes do not
 *  have to be directly linked to each other.</p>
 *
 * <p>An instance of this class will be created for you automatically,
 * the first time your application evaluates a value binding expression
 * or method binding expression that references a managed bean using
 * this class.</p>
 */
public class RequestBean1 extends AbstractRequestBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private int __placeholder;
    
    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    // </editor-fold>
    
    /**
     * <p>Construct a new request data bean instance.</p>
     */
    public RequestBean1() {
    }
    
    /**
     * <p>This method is called when this bean is initially added to
     * request scope.  Typically, this occurs as a result of evaluating
     * a value binding or method binding expression, which utilizes the
     * managed bean facility to instantiate this bean and store it into
     * request scope.</p>
     *
     * <p>You may customize this method to allocate resources that are required
     * for the lifetime of the current request.</p>
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
            log("RequestBean1 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
    }
    
    /**
     * <p>This method is called when this bean is removed from
     * request scope.  This occurs automatically when the corresponding
     * HTTP response has been completed and sent to the client.</p>
     *
     * <p>You may customize this method to clean up resources allocated
     * during the execution of the <code>init()</code> method, or
     * at any later time during the lifetime of the request.</p>
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
    
//    // <he liang's code part>
//    /**
//     * 保存属性 conJJ 的值。
//     */
//    private SearchConditionJJ conJJ = new SearchConditionJJ();
//
//    /**
//     * 属性 conJJ 的获取方法。
//     * @return 属性 conJJ 的值。
//     */
//    public SearchConditionJJ getConJJ() {
//        return this.conJJ;
//    }
//
//    /**
//     * 属性 conJJ 的设置方法。
//     * @param conJJ 属性 conJJ 的新值。
//     */
//    public void setConJJ(SearchConditionJJ conJJ) {
//        this.conJJ = conJJ;
//    }
//
//    /**
//     * 保存属性 conSB 的值。
//     */
//    private SearchConditionSB conSB = new SearchConditionSB();
//
//    /**
//     * 属性 conSB 的获取方法。
//     * @return 属性 conSB 的值。
//     */
//    public SearchConditionSB getConSB() {
//        return this.conSB;
//    }
//
//    /**
//     * 属性 conSB 的设置方法。
//     * @param conSB 属性 conSB 的新值。
//     */
//    public void setConSB(SearchConditionSB conSB) {
//        this.conSB = conSB;
//    }
//    // </he liang's code part>
}
