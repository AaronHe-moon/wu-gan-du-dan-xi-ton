/*
 * SBInspect.java
 *
 * Created on 2007年9月11日, 下午2:29
 * Copyright Administrator
 */
package wgimgdoc.wgDocInputF;

import com.sun.rave.web.ui.appbase.AbstractFragmentBean;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.ImageComponent;
import com.sun.rave.web.ui.component.Label;
import com.sun.rave.web.ui.component.PanelLayout;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.TextArea;
import org.hibernate.HibernateException;
import util.InspectJJUtility;
import entity.InspectLogicUtility;
import entity.TBlueprintJjbaseInspect;
import javax.faces.FacesException;
import wgimgdoc.ApplicationBean1;
import wgimgdoc.RequestBean1;
import wgimgdoc.SessionBean1;

/**
 * <p>Fragment bean that corresponds to a similarly named JSP page
 * fragment.  This class contains component definitions (and initialization
 * code) for all components that you have defined on this fragment, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class JJInspect extends AbstractFragmentBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private int __placeholder;
    
    /**
     * <p>Automatically managed component initialization. <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    
    private TextArea textArea_spNotes = new TextArea();
    
    public TextArea getTextArea_spNotes() {
        return textArea_spNotes;
    }
    
    public void setTextArea_spNotes(TextArea ta) {
        this.textArea_spNotes = ta;
    }
    
    private Label label3 = new Label();
    
    public Label getLabel3() {
        return label3;
    }
    
    public void setLabel3(Label l) {
        this.label3 = l;
    }
    
    private PanelLayout layoutPanel1 = new PanelLayout();
    
    public PanelLayout getLayoutPanel1() {
        return layoutPanel1;
    }
    
    public void setLayoutPanel1(PanelLayout pl) {
        this.layoutPanel1 = pl;
    }
    
    private Button button_pass = new Button();
    
    public Button getButton_pass() {
        return button_pass;
    }
    
    public void setButton_pass(Button b) {
        this.button_pass = b;
    }
    
    private Button button_nopass = new Button();
    
    public Button getButton_nopass() {
        return button_nopass;
    }
    
    public void setButton_nopass(Button b) {
        this.button_nopass = b;
    }
    
    private ImageComponent image_toBeShown = new ImageComponent();
    
    public ImageComponent getImage_toBeShown() {
        return image_toBeShown;
    }
    
    public void setImage_toBeShown(ImageComponent ic) {
        this.image_toBeShown = ic;
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
    
    private StaticText staticText7 = new StaticText();
    
    public StaticText getStaticText7() {
        return staticText7;
    }
    
    public void setStaticText7(StaticText st) {
        this.staticText7 = st;
    }
    
    private StaticText txtNM = new StaticText();
    
    public StaticText getTxtNM() {
        return txtNM;
    }
    
    public void setTxtNM(StaticText st) {
        this.txtNM = st;
    }
    
    private StaticText txtGC = new StaticText();
    
    public StaticText getTxtGC() {
        return txtGC;
    }
    
    public void setTxtGC(StaticText st) {
        this.txtGC = st;
    }
    
    private StaticText txtXM = new StaticText();
    
    public StaticText getTxtXM() {
        return txtXM;
    }
    
    public void setTxtXM(StaticText st) {
        this.txtXM = st;
    }
    
    private StaticText txtTZMC = new StaticText();
    
    public StaticText getTxtTZMC() {
        return txtTZMC;
    }
    
    public void setTxtTZMC(StaticText st) {
        this.txtTZMC = st;
    }
    
    private StaticText txtTH = new StaticText();
    
    public StaticText getTxtTH() {
        return txtTH;
    }
    
    public void setTxtTH(StaticText st) {
        this.txtTH = st;
    }
    
    private StaticText txtBG = new StaticText();
    
    public StaticText getTxtBG() {
        return txtBG;
    }
    
    public void setTxtBG(StaticText st) {
        this.txtBG = st;
    }
    
    private StaticText txtBZ = new StaticText();
    
    public StaticText getTxtBZ() {
        return txtBZ;
    }
    
    public void setTxtBZ(StaticText st) {
        this.txtBZ = st;
    }
    // </editor-fold>
    
    public JJInspect() {
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
        initializeComponent();
    }
    
    public void initializeComponent() {
        tblueprintjjbaseinspect=(TBlueprintJjbaseInspect)getSessionBean1().getSessionMap().get("BlueprintJjbaseInspectObject");
        image_toBeShown.setUrl("/renderImage?table=inspectJJ&id="+tblueprintjjbaseinspect.getIdBlueprint()+"&direction=0");
        if(tblueprintjjbaseinspect.getTBlueprintJjbaseInspect()!=null)
            txtBG.setText(tblueprintjjbaseinspect.getTBlueprintJjbaseInspect().getIdBlueprint());
        else
            txtBG.setText("无");
        txtBZ.setText(tblueprintjjbaseinspect.getMemo()==null?"无":tblueprintjjbaseinspect.getMemo());
        txtGC.setText(tblueprintjjbaseinspect.getBlueprintProject()==null?"无":tblueprintjjbaseinspect.getBlueprintProject());
        txtNM.setText(tblueprintjjbaseinspect.getCategoryString()==null?"无":tblueprintjjbaseinspect.getCategoryString());
        txtTH.setText(tblueprintjjbaseinspect.getSnBlueprint()==null?"无":tblueprintjjbaseinspect.getSnBlueprint());
        txtTZMC.setText(tblueprintjjbaseinspect.getBlueprintName()==null?"无":tblueprintjjbaseinspect.getBlueprintName());
        txtXM.setText(tblueprintjjbaseinspect.getProjectName()==null?"无":tblueprintjjbaseinspect.getProjectName());
        
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
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1)getBean("RequestBean1");
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
    
    public String button1_action() {
        // 待做事项：处理按钮单击操作。返回的值是一个导航
        // 条件名称，如果它为 Null，则返回到同一页。
        
        return null;
    }
    
    private TBlueprintJjbaseInspect tblueprintjjbaseinspect;
    
    public TBlueprintJjbaseInspect getTblueprintjjbaseinspect() {
        return tblueprintjjbaseinspect;
    }
    
    public void setTblueprintjjbaseinspect(TBlueprintJjbaseInspect tblueprintjjbaseinspect) {
        this.tblueprintjjbaseinspect = tblueprintjjbaseinspect;
    }
    
    public String button_pass_action() {
        // 待做事项：处理按钮单击操作。返回的值是一个导航
        // 条件名称，如果它为 Null，则返回到同一页。
        tblueprintjjbaseinspect=(TBlueprintJjbaseInspect)getSessionBean1().getSessionMap().get("BlueprintJjbaseInspectObject");
        tblueprintjjbaseinspect.setSpNotes((String)textArea_spNotes.getText());
        tblueprintjjbaseinspect.setIsChecked(Boolean.TRUE);
        InspectLogicUtility util=new InspectLogicUtility();
        InspectJJUtility ijutil=new InspectJJUtility();
        
        try {
            util.PassInspect(ijutil.getBlueInspectByID(tblueprintjjbaseinspect.getIdBlueprint().intValue())
            ,tblueprintjjbaseinspect,getSessionBean1().getCurrentUser().getAccountName());
            return "toSuccess";
        } catch (HibernateException ex) {
//            ex.printStackTrace();
            return "toDBConnectionError";
        }
    }
    
    public String button_nopass_action() {
        // 待做事项：处理按钮单击操作。返回的值是一个导航
        // 条件名称，如果它为 Null，则返回到同一页。
        tblueprintjjbaseinspect=(TBlueprintJjbaseInspect)getSessionBean1().getSessionMap().get("BlueprintJjbaseInspectObject");
        tblueprintjjbaseinspect.setSpNotes((String)textArea_spNotes.getText());
        tblueprintjjbaseinspect.setIsChecked(Boolean.TRUE);
        InspectLogicUtility util=new InspectLogicUtility();
        InspectJJUtility ijutil=new InspectJJUtility();
        try {
            util.RefuseInspect(ijutil.getBlueInspectByID(tblueprintjjbaseinspect.getIdBlueprint().intValue())
            ,tblueprintjjbaseinspect);
            return "toSuccess";
        } catch (HibernateException ex) {
//            ex.printStackTrace();
            return "toDBConnectionError";
        }
    }
//
//    public void generateHtmlCode(String url){
//        String code ="<img src='%s' align=center />"/*"<iframe frameborder=0 width=800 height=500><img src='%s' align=center /></iframe>"*/;
//        Object[] obj = {url};
//        txtImageArea.setValue(String.format(code,obj));
//        if(!txtImageArea.isVisible())
//            txtImageArea.setVisible(true);
//    }
}
