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
import entity.InspectLogicUtility;
import org.hibernate.HibernateException;
import util.InspectSBUtility;
import entity.TBlueprintDeviceInspect;
import javax.faces.FacesException;
import usky.search.InspectDeviceProvider;
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
public class SBInspect extends AbstractFragmentBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private int __placeholder;
    
    /**
     * <p>Automatically managed component initialization. <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    
    private PanelLayout layoutPanel1 = new PanelLayout();
    
    public PanelLayout getLayoutPanel1() {
        return layoutPanel1;
    }
    
    public void setLayoutPanel1(PanelLayout pl) {
        this.layoutPanel1 = pl;
    }
    
    private ImageComponent image_toBeShown = new ImageComponent();
    
    public ImageComponent getImage_toBeShown() {
        return image_toBeShown;
    }
    
    public void setImage_toBeShown(ImageComponent ic) {
        this.image_toBeShown = ic;
    }
    
    private Button button_nopass1 = new Button();
    
    public Button getButton_nopass1() {
        return button_nopass1;
    }
    
    public void setButton_nopass1(Button b) {
        this.button_nopass1 = b;
    }
    
    private Label label1 = new Label();
    
    public Label getLabel1() {
        return label1;
    }
    
    public void setLabel1(Label l) {
        this.label1 = l;
    }
    
    private Button button_pass1 = new Button();
    
    public Button getButton_pass1() {
        return button_pass1;
    }
    
    public void setButton_pass1(Button b) {
        this.button_pass1 = b;
    }
    
    private TextArea textArea_spNotes = new TextArea();
    
    public TextArea getTextArea_spNotes() {
        return textArea_spNotes;
    }
    
    public void setTextArea_spNotes(TextArea ta) {
        this.textArea_spNotes = ta;
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
    
    private StaticText txtSBMC = new StaticText();
    
    public StaticText getTxtSBMC() {
        return txtSBMC;
    }
    
    public void setTxtSBMC(StaticText st) {
        this.txtSBMC = st;
    }
    
    private StaticText txtBJMC = new StaticText();
    
    public StaticText getTxtBJMC() {
        return txtBJMC;
    }
    
    public void setTxtBJMC(StaticText st) {
        this.txtBJMC = st;
    }
    
    private StaticText txtNMBH = new StaticText();
    
    public StaticText getTxtNMBH() {
        return txtNMBH;
    }
    
    public void setTxtNMBH(StaticText st) {
        this.txtNMBH = st;
    }
    
    private StaticText txtTDBH = new StaticText();
    
    public StaticText getTxtTDBH() {
        return txtTDBH;
    }
    
    public void setTxtTDBH(StaticText st) {
        this.txtTDBH = st;
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
    
    private StaticText staticText7 = new StaticText();
    
    public StaticText getStaticText7() {
        return staticText7;
    }
    
    public void setStaticText7(StaticText st) {
        this.staticText7 = st;
    }
    
    private StaticText txtTZMC = new StaticText();
    
    public StaticText getTxtTZMC() {
        return txtTZMC;
    }
    
    public void setTxtTZMC(StaticText st) {
        this.txtTZMC = st;
    }
    
    private StaticText staticText8 = new StaticText();
    
    public StaticText getStaticText8() {
        return staticText8;
    }
    
    public void setStaticText8(StaticText st) {
        this.staticText8 = st;
    }
    
    private StaticText txtSBAliasName = new StaticText();
    
    public StaticText getTxtSBAliasName() {
        return txtSBAliasName;
    }
    
    public void setTxtSBAliasName(StaticText st) {
        this.txtSBAliasName = st;
    }
    // </editor-fold>
    
    public SBInspect() {
    }
    public void initializeComponent() {
        TBlueprintDeviceInspect temp=((TBlueprintDeviceInspect)getSessionBean1().getSessionMap().get("BlueprintDeviceInspectObject"));
        
        tblueprintdeviceinspect=temp;
        
        if(temp!=null){
            txtSBAliasName.setText(temp.getDeviceAliasName());
            txtBJMC.setText(temp.getPartName()==null?"无":temp.getPartName());
            txtBZ.setText(temp.getMemo()==null?"无":temp.getMemo());
            txtNMBH.setText(temp.getCategoryString()==null?"无":temp.getCategoryString());
            txtSBMC.setText(temp.getDeviceCode()==null?"无":temp.getDeviceCode());
            txtTDBH.setText(temp.getSnBlueprint()==null?"无":temp.getSnBlueprint());
            txtTZMC.setText(temp.getBlueprintName()==null?"无":temp.getBlueprintName());
            if(temp.getTBlueprintDeviceInspect()==null)
                txtBG.setText("无");
            else
                txtBG.setText(temp.getTBlueprintDeviceInspect().getIdBlueprint());
            image_toBeShown.setUrl("/renderImage?table=InspectSB&id="+temp.getIdBlueprint()+"&direction=0");
        }
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
    
    public String button_pass_action() {
        // 待做事项：处理按钮单击操作。返回的值是一个导航
        // 条件名称，如果它为 Null，则返回到同一页。
        tblueprintdeviceinspect=((TBlueprintDeviceInspect)getSessionBean1().getSessionMap().get("BlueprintDeviceInspectObject"));
        tblueprintdeviceinspect.setSpNotes((String)textArea_spNotes.getText());
        tblueprintdeviceinspect.setIsChecked(Boolean.TRUE);
        InspectLogicUtility util=new InspectLogicUtility();
        InspectSBUtility sbUtil=new InspectSBUtility();
        
        try {
            util.PassInspect(sbUtil.getBlueInspectByID(tblueprintdeviceinspect.getIdBlueprint().intValue()),tblueprintdeviceinspect,getSessionBean1().getCurrentUser().getAccountName());
            return "toSuccess";
        } catch (HibernateException ex) {
//            ex.printStackTrace();
            return "toDBConnectionError";
        }
    }
    private TBlueprintDeviceInspect tblueprintdeviceinspect;
    
    public TBlueprintDeviceInspect getTblueprintdeviceinspect() {
        return tblueprintdeviceinspect;
    }
    
    public void setTblueprintdeviceinspect(TBlueprintDeviceInspect tblueprintdeviceinspect) {
        this.tblueprintdeviceinspect = tblueprintdeviceinspect;
    }
    
    public String button_nopass1_action() {
        // 待做事项：处理按钮单击操作。返回的值是一个导航
        // 条件名称，如果它为 Null，则返回到同一页。
        tblueprintdeviceinspect=((TBlueprintDeviceInspect)getSessionBean1().getSessionMap().get("BlueprintDeviceInspectObject"));
        tblueprintdeviceinspect.setSpNotes((String)textArea_spNotes.getText());
        tblueprintdeviceinspect.setIsChecked(Boolean.TRUE);
        InspectLogicUtility util=new InspectLogicUtility();
        InspectSBUtility sbUtil=new InspectSBUtility();
        
        try {
            util.RefuseInspect(sbUtil.getBlueInspectByID(tblueprintdeviceinspect.getIdBlueprint().intValue()),tblueprintdeviceinspect);
            return "toSuccess";
        } catch (HibernateException ex) {
//            ex.printStackTrace();
            return "toDBConnectionError";
        }
    }
}
