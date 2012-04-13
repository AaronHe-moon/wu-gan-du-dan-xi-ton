/*
 * preview.java
 *
 * Created on 2007年9月27日, 下午12:03
 * Copyright Administrator
 */
package wgimgdoc.search;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.HiddenField;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.ImageComponent;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import com.sun.rave.web.ui.component.PanelLayout;
import java.io.IOException;
import javax.faces.FacesException;
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
public class preview extends AbstractPageBean {
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
    
    private PanelLayout layoutPanel1 = new PanelLayout();
    
    public PanelLayout getLayoutPanel1() {
        return layoutPanel1;
    }
    
    public void setLayoutPanel1(PanelLayout pl) {
        this.layoutPanel1 = pl;
    }
    
    private PanelLayout layoutPanel2 = new PanelLayout();
    
    public PanelLayout getLayoutPanel2() {
        return layoutPanel2;
    }
    
    public void setLayoutPanel2(PanelLayout pl) {
        this.layoutPanel2 = pl;
    }
    
    private ImageComponent imgPreview = new ImageComponent();
    
    public ImageComponent getImgPreview() {
        return imgPreview;
    }
    
    public void setImgPreview(ImageComponent ic) {
        this.imgPreview = ic;
    }
    
    private Button btnLeft = new Button();
    
    public Button getBtnLeft() {
        return btnLeft;
    }
    
    public void setBtnLeft(Button b) {
        this.btnLeft = b;
    }
    
    private Button btnRight = new Button();
    
    public Button getBtnRight() {
        return btnRight;
    }
    
    public void setBtnRight(Button b) {
        this.btnRight = b;
    }
    
    private Button btnUpsideDown = new Button();
    
    public Button getBtnUpsideDown() {
        return btnUpsideDown;
    }
    
    public void setBtnUpsideDown(Button b) {
        this.btnUpsideDown = b;
    }
    
    private Button btnRestorPostition = new Button();
    
    public Button getBtnRestorPostition() {
        return btnRestorPostition;
    }
    
    public void setBtnRestorPostition(Button b) {
        this.btnRestorPostition = b;
    }
    
    private Button btnDownload = new Button();
    
    public Button getBtnDownload() {
        return btnDownload;
    }
    
    public void setBtnDownload(Button b) {
        this.btnDownload = b;
    }
    
    private HiddenField idRot = new HiddenField();
    
    public HiddenField getIdRot() {
        return idRot;
    }
    
    public void setIdRot(HiddenField hf) {
        this.idRot = hf;
    }
    
    private Button btnReturn = new Button();
    
    public Button getBtnReturn() {
        return btnReturn;
    }
    
    public void setBtnReturn(Button b) {
        this.btnReturn = b;
    }
    
    // </editor-fold>
    
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public preview() {
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
            log("preview Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
        InitialImage();
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
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1)getBean("ApplicationBean1");
    }
    
    /**
     * <p>返回对已限定范围的数据 Bean 的引用。</p>
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1)getBean("SessionBean1");
    }
    
    public String btnLeft_action() {
        rotAction(-1);
        return null;
    }
    
    private void rotAction(int nStep) throws NumberFormatException {
        // 待做事项：处理按钮单击操作。返回的值是一个导航
        // 条件名称，如果它为 Null，则返回到同一页。
        String nDirection = idRot.getText().toString();
        int nDict = Integer.parseInt(nDirection);
        nDict = nDict + nStep;
        idRot.setText(String.valueOf(nDict));
        
        String table = getSessionBean1().getSessionMap()
        .get("preview_table").toString();
        String id = getSessionBean1().getSessionMap()
        .get("preview_id").toString();
        generateImageUrl(table, id, String.valueOf(nDict));
    }
    
    private void generateImageUrl(final String table, final String id, final String nDirection) {
        String url = "/renderImage?table=%s&id=%s&direction=%s";
        Object[] pars = {table, id, nDirection};
        imgPreview.setUrl(String.format(url, pars));
    }
    
    public String btnRight_action() {
        // 待做事项：处理按钮单击操作。返回的值是一个导航
        // 条件名称，如果它为 Null，则返回到同一页。
        rotAction(1);
        return null;
    }
    
    public String btnUpsideDown_action() {
        // 待做事项：处理按钮单击操作。返回的值是一个导航
        // 条件名称，如果它为 Null，则返回到同一页。
        rotAction(2);
        return null;
    }
    
    public String btnRestorPostition_action() {
        // 待做事项：处理按钮单击操作。返回的值是一个导航
        // 条件名称，如果它为 Null，则返回到同一页。
        idRot.setText(String.valueOf(0));
        String table = getSessionBean1().getSessionMap()
        .get("preview_table").toString();
        String id = getSessionBean1().getSessionMap()
        .get("preview_id").toString();
        generateImageUrl(table, id, String.valueOf(0));
        return null;
    }
    
    private void InitialImage(){
        idRot.setText(String.valueOf(0));
        String table = getSessionBean1().getSessionMap()
        .get("preview_table").toString();
        String id = getSessionBean1().getSessionMap()
        .get("preview_id").toString();
        generateImageUrl(table, id, String.valueOf(0));
    }
    
    public String btnDownload_action() {
        // 待做事项：处理按钮单击操作。返回的值是一个导航
        // 条件名称，如果它为 Null，则返回到同一页。
        String id = getSessionBean1().getSessionMap()
        .get("preview_id").toString();
        try {
            //调用下载的servlet
            getExternalContext().redirect("ServletDownload?id=" + id);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public String btnReturn_action() {
        // 待做事项：处理按钮单击操作。返回的值是一个导航
        // 条件名称，如果它为 Null，则返回到同一页。
        //设置isReturnFromPreview为真
        getSessionBean1().getSessionMap().put("isReturnFromPreview", Boolean.TRUE);
        String table = getSessionBean1().getSessionMap()
            .get("preview_table").toString();
        if(table.equals("JJ"))
            return "returnSearchJJ";
        else
            return "returnSearchSB";
    }
}

