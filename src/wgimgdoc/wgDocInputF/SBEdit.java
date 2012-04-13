/*
 * SBInput.java
 *
 * Created on 2007年9月11日, 下午2:20
 * Copyright Administrator
 */
package wgimgdoc.wgDocInputF;

import com.sun.rave.web.ui.appbase.AbstractFragmentBean;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.DropDown;
import com.sun.rave.web.ui.component.Label;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.TextArea;
import com.sun.rave.web.ui.component.TextField;
import com.sun.rave.web.ui.model.SingleSelectOptionsList;
import org.hibernate.HibernateException;
import util.InspectSBUtility;
import entity.TBlueprintDeviceInspect;
import entity.TBlueprintInspect;
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
public class SBEdit extends AbstractFragmentBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private int __placeholder;
    
    /**
     * <p>Automatically managed component initialization. <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        dropDown_nmDefaultOptions.setOptions(new com.sun.rave.web.ui.model.Option[] {new com.sun.rave.web.ui.model.Option("507.8.07", "\u8bbe\u5907\u4eea\u5668\u5730\u8d28\u4eea\u5668\u56fe\u6863"), new com.sun.rave.web.ui.model.Option("507.8.09", "\u8bbe\u5907\u4eea\u5668\u7535\u8baf\u53ca\u81ea\u52a8\u5316\u4eea\u8868\u56fe\u6863"), new com.sun.rave.web.ui.model.Option("507.8.02", "\u8bbe\u5907\u4eea\u5668\u52a8\u529b\u6da6\u6ed1\u8bbe\u5907\u56fe\u6863"), new com.sun.rave.web.ui.model.Option("507.8.03", "\u8bbe\u5907\u4eea\u5668\u5de5\u4e1a\u7089\u7a91\u56fe\u6863"), new com.sun.rave.web.ui.model.Option("507.8.05", "\u8bbe\u5907\u4eea\u5668\u8ba1\u91cf\u63a7\u5236\u4eea\u5668\u8bbe\u5907\u56fe\u6863"), new com.sun.rave.web.ui.model.Option("507.8.06", "\u8bbe\u5907\u4eea\u5668\u68c0\u5316\u9a8c\u4eea\u5668\u8bbe\u5907\u56fe\u6863"), new com.sun.rave.web.ui.model.Option("507.8.10", "\u8bbe\u5907\u4eea\u5668\u5efa\u7b51\u65bd\u5de5\u673a\u6784\u56fe\u6863"), new com.sun.rave.web.ui.model.Option("507.8.08", "\u8bbe\u5907\u4eea\u5668\u91d1\u5c5e\u52a0\u5de5\u8bbe\u5907\u56fe\u6863"), new com.sun.rave.web.ui.model.Option("507.8.01", "\u8bbe\u5907\u4eea\u5668\u51b6\u91d1\u673a\u68b0\u56fe\u6863"), new com.sun.rave.web.ui.model.Option("507.8.04", "\u8bbe\u5907\u4eea\u5668\u8fd0\u8f93\u8d77\u91cd\u8bbe\u5907\u56fe\u6863"), new com.sun.rave.web.ui.model.Option("507.8.11", "\u8bbe\u5907\u4eea\u5668\u5176\u5b83\u56fe\u6863")});
    }
    
    private TextField txtSBMC = new TextField();
    
    public TextField getTxtSBMC() {
        return txtSBMC;
    }
    
    public void setTxtSBMC(TextField tf) {
        this.txtSBMC = tf;
    }
    
    private Label label1 = new Label();
    
    public Label getLabel1() {
        return label1;
    }
    
    public void setLabel1(Label l) {
        this.label1 = l;
    }
    
    private TextField txtTH = new TextField();
    
    public TextField getTxtTH() {
        return txtTH;
    }
    
    public void setTxtTH(TextField tf) {
        this.txtTH = tf;
    }
    
    private TextField txtNMBH = new TextField();
    
    public TextField getTxtNMBH() {
        return txtNMBH;
    }
    
    public void setTxtNMBH(TextField tf) {
        this.txtNMBH = tf;
    }
    
    private TextField txtBJMC = new TextField();
    
    public TextField getTxtBJMC() {
        return txtBJMC;
    }
    
    public void setTxtBJMC(TextField tf) {
        this.txtBJMC = tf;
    }
    
    private TextArea txtBZ = new TextArea();
    
    public TextArea getTxtBZ() {
        return txtBZ;
    }
    
    public void setTxtBZ(TextArea ta) {
        this.txtBZ = ta;
    }
    
    private TextField txtLink = new TextField();
    
    public TextField getTxtLink() {
        return txtLink;
    }
    
    public void setTxtLink(TextField tf) {
        this.txtLink = tf;
    }
    
    private Button button_submit = new Button();
    
    public Button getButton_submit() {
        return button_submit;
    }
    
    public void setButton_submit(Button b) {
        this.button_submit = b;
    }
    
    private Label label2 = new Label();
    
    public Label getLabel2() {
        return label2;
    }
    
    public void setLabel2(Label l) {
        this.label2 = l;
    }

    private DropDown dropDown_nm = new DropDown();

    public DropDown getDropDown_nm() {
        return dropDown_nm;
    }

    public void setDropDown_nm(DropDown dd) {
        this.dropDown_nm = dd;
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

    private SingleSelectOptionsList dropDown_nmDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDropDown_nmDefaultOptions() {
        return dropDown_nmDefaultOptions;
    }

    public void setDropDown_nmDefaultOptions(SingleSelectOptionsList ssol) {
        this.dropDown_nmDefaultOptions = ssol;
    }

    private TextField textField_tzmc = new TextField();

    public TextField getTextField_tzmc() {
        return textField_tzmc;
    }

    public void setTextField_tzmc(TextField tf) {
        this.textField_tzmc = tf;
    }

    private Button button1 = new Button();

    public Button getButton1() {
        return button1;
    }

    public void setButton1(Button b) {
        this.button1 = b;
    }

    private StaticText staticText7 = new StaticText();

    public StaticText getStaticText7() {
        return staticText7;
    }

    public void setStaticText7(StaticText st) {
        this.staticText7 = st;
    }

    private TextField textField_sbAliasName = new TextField();

    public TextField getTextField_sbAliasName() {
        return textField_sbAliasName;
    }

    public void setTextField_sbAliasName(TextField tf) {
        this.textField_sbAliasName = tf;
    }

    private StaticText staticText8 = new StaticText();

    public StaticText getStaticText8() {
        return staticText8;
    }

    public void setStaticText8(StaticText st) {
        this.staticText8 = st;
    }
    // </editor-fold>
    
    public SBEdit() {
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
        TBlueprintDeviceInspect temp=(TBlueprintDeviceInspect)getSessionBean1().getSessionMap().get("BlueprintDeviceInspectObject");
        
        tblueprintdeviceinspect=temp;
        
        if(temp!=null){
            textField_sbAliasName.setText(temp.getDeviceAliasName());
            txtBJMC.setText(temp.getPartName());
            txtBZ.setText(temp.getMemo());
//            txtNMBH.setText(temp.getCategoryString());
            dropDown_nm.setSelected(temp.getCategoryString());
            txtSBMC.setText(temp.getDeviceCode());
            txtTH.setText(temp.getSnBlueprint());
            textField_tzmc.setText(temp.getBlueprintName());
            if(temp.getTBlueprintDeviceInspect()!=null)
                txtLink.setText(temp.getTBlueprintDeviceInspect().getIdBlueprint());
            else 
                txtLink.setText("无");
        }else{
            button_submit.setDisabled(true);
        }
        
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
    
    public String button_submit_action() {
        // 待做事项：处理按钮单击操作。返回的值是一个导航
        // 条件名称，如果它为 Null，则返回到同一页。
        InspectSBUtility util=new InspectSBUtility();
        tblueprintdeviceinspect.setCategoryString((String)dropDown_nm.getSelected());
        tblueprintdeviceinspect.setDeviceCode((String)txtSBMC.getText());
        tblueprintdeviceinspect.setPartName((String)txtBJMC.getText());
        tblueprintdeviceinspect.setSnBlueprint((String)txtTH.getText());
        tblueprintdeviceinspect.setMemo((String)txtBZ.getText());
        tblueprintdeviceinspect.setBlueprintName((String)textField_tzmc.getText());
        tblueprintdeviceinspect.setDeviceAliasName((String)textField_sbAliasName.getText());
        
        String link=(String)txtLink.getText();
        if(link==null||link.equals("无")){
            tblueprintdeviceinspect.setTBlueprintDeviceInspect(null);
        }
        else{
            try {
                TBlueprintDeviceInspect sub=new TBlueprintDeviceInspect();
                sub.setIdBlueprint(Integer.valueOf(link));
                tblueprintdeviceinspect.setTBlueprintDeviceInspect(sub);
            } catch (NumberFormatException ex) {
               tblueprintdeviceinspect.setTBlueprintDeviceInspect(null);
            }
        }
        
        tblueprintdeviceinspect.getTBlueprintInspect().setSnBlueprint((String)txtTH.getText());
        try {
            util.save(tblueprintdeviceinspect.getTBlueprintInspect(),tblueprintdeviceinspect);
            return "toSuccess";
        } catch (HibernateException ex) {
            error(ex.getMessage());
            return "toDBConnectionError";
        }
    }
    
    private TBlueprintInspect tblueprintinspect=new TBlueprintInspect();
    private TBlueprintDeviceInspect tblueprintdeviceinspect=new TBlueprintDeviceInspect();
    
    public TBlueprintInspect getTblueprintinspect() {
        return tblueprintinspect;
    }
    
    public void setTblueprintinspect(TBlueprintInspect tblueprintinspect) {
        this.tblueprintinspect = tblueprintinspect;
    }
    
    public TBlueprintDeviceInspect getTblueprintdeviceinspect() {
        return tblueprintdeviceinspect;
    }
    
    public void setTblueprintdeviceinspect(TBlueprintDeviceInspect tblueprintdeviceinspect) {
        this.tblueprintdeviceinspect = tblueprintdeviceinspect;
    }

    public String button1_action() {
        // 待做事项：处理按钮单击操作。返回的值是一个导航
        // 条件名称，如果它为 Null，则返回到同一页。
        
        return "toWelcome";
    }
    
}
