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
import com.sun.rave.web.ui.component.MessageGroup;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.TextArea;
import com.sun.rave.web.ui.component.TextField;
import com.sun.rave.web.ui.model.SingleSelectOptionsList;
import util.InspectJJUtility;
import entity.TBlueprintInspect;
import entity.TBlueprintJjbaseInspect;
import javax.faces.FacesException;
import org.hibernate.HibernateException;
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
public class JJEdit extends AbstractFragmentBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private int __placeholder;
    
    /**
     * <p>Automatically managed component initialization. <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        dropDown_catDefaultOptions.setOptions(new com.sun.rave.web.ui.model.Option[] {new com.sun.rave.web.ui.model.Option("507.7.06", "\u57fa\u5efa\u91c7\u6696\u3001\u901a\u98ce\u56fe\u6863"), new com.sun.rave.web.ui.model.Option("507.7.05", "\u57fa\u5efa\u7ed9\u6392\u6c34\u56fe\u6863"), new com.sun.rave.web.ui.model.Option("507.7.03", "\u57fa\u5efa\u5de5\u827a\u56fe\u6863"), new com.sun.rave.web.ui.model.Option("507.7.09", "\u57fa\u5efa\u4f9b\u7535\u56fe\u6863"), new com.sun.rave.web.ui.model.Option("507.7.08", "\u57fa\u5efa\u8ba1\u63a7\u3001\u7535\u8baf\u56fe\u6863"), new com.sun.rave.web.ui.model.Option("507.7.07", "\u57fa\u5efa\u70ed\u529b\u71c3\u6c14\u56fe\u6863"), new com.sun.rave.web.ui.model.Option("507.7.10", "\u57fa\u5efa\u8bbe\u5907\uff08\u8bbe\u5907\u5b89\u88c5\u3001\u5de5\u4e1a\u7089\uff09\u56fe\u6863"), new com.sun.rave.web.ui.model.Option("507.7.04", "\u57fa\u5efa\u571f\u5efa\u56fe\u6863"), new com.sun.rave.web.ui.model.Option("507.7.01", "\u57fa\u5efa\u7efc\u5408\u7c7b\u56fe\u6863"), new com.sun.rave.web.ui.model.Option("507.7.02", "\u57fa\u5efa\u603b\u56fe\u8fd0\u8f93\u56fe\u6863"), new com.sun.rave.web.ui.model.Option("507.7.11", "\u57fa\u5efa\u5176\u5b83\u7c7b\u56fe\u6863")});
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
    
    private TextArea txtBZ = new TextArea();
    
    public TextArea getTxtBZ() {
        return txtBZ;
    }
    
    public void setTxtBZ(TextArea ta) {
        this.txtBZ = ta;
    }
    
    private TextField txtBG = new TextField();
    
    public TextField getTxtBG() {
        return txtBG;
    }
    
    public void setTxtBG(TextField tf) {
        this.txtBG = tf;
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
    
    private TextField txtXM = new TextField();
    
    public TextField getTxtXM() {
        return txtXM;
    }
    
    public void setTxtXM(TextField tf) {
        this.txtXM = tf;
    }
    
    private TextField txtTZMC = new TextField();
    
    public TextField getTxtTZMC() {
        return txtTZMC;
    }
    
    public void setTxtTZMC(TextField tf) {
        this.txtTZMC = tf;
    }
    
    private TextField txtNMBH = new TextField();
    
    public TextField getTxtNMBH() {
        return txtNMBH;
    }
    
    public void setTxtNMBH(TextField tf) {
        this.txtNMBH = tf;
    }
    
    private TextField txtGCMC = new TextField();
    
    public TextField getTxtGCMC() {
        return txtGCMC;
    }
    
    public void setTxtGCMC(TextField tf) {
        this.txtGCMC = tf;
    }

    private MessageGroup messageGroup1 = new MessageGroup();

    public MessageGroup getMessageGroup1() {
        return messageGroup1;
    }

    public void setMessageGroup1(MessageGroup mg) {
        this.messageGroup1 = mg;
    }

    private DropDown dropDown_cat = new DropDown();

    public DropDown getDropDown_cat() {
        return dropDown_cat;
    }

    public void setDropDown_cat(DropDown dd) {
        this.dropDown_cat = dd;
    }

    private SingleSelectOptionsList dropDown_catDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDropDown_catDefaultOptions() {
        return dropDown_catDefaultOptions;
    }

    public void setDropDown_catDefaultOptions(SingleSelectOptionsList ssol) {
        this.dropDown_catDefaultOptions = ssol;
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

    private Button button1 = new Button();

    public Button getButton1() {
        return button1;
    }

    public void setButton1(Button b) {
        this.button1 = b;
    }
    // </editor-fold>
    
    public JJEdit() {
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
        
        TBlueprintJjbaseInspect temp=(TBlueprintJjbaseInspect)getSessionBean1().getSessionMap().get("BlueprintJjbaseInspectObject");
        if(temp != null) {
            tblueprintjjbaseinspect=temp;
            if(temp.getTBlueprintJjbaseInspect()==null)
                txtBG.setText("无");
            else
                txtBG.setText(temp.getTBlueprintJjbaseInspect().getIdBlueprint());
                
                
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
        try {
            // 待做事项：处理按钮单击操作。返回的值是一个导航
            // 条件名称，如果它为 Null，则返回到同一页。
            InspectJJUtility util=new InspectJJUtility();
            TBlueprintInspect mainDoc=tblueprintjjbaseinspect.getTBlueprintInspect();
            mainDoc.setSnBlueprint((String)txtTH.getText());
            util.save(mainDoc,tblueprintjjbaseinspect);
            return "toSuccess";
        } catch (HibernateException ex) {
           return "toDBConnectionError";
        }
    }
    private TBlueprintJjbaseInspect tblueprintjjbaseinspect=new TBlueprintJjbaseInspect();
    
    public TBlueprintJjbaseInspect getTblueprintjjbaseinspect() {
        return tblueprintjjbaseinspect;
    }
    
    public void setTblueprintjjbaseinspect(TBlueprintJjbaseInspect tblueprintjjbaseinspect) {
        this.tblueprintjjbaseinspect = tblueprintjjbaseinspect;
    }

    public String button1_action() {
        // 待做事项：处理按钮单击操作。返回的值是一个导航
        // 条件名称，如果它为 Null，则返回到同一页。
        
        return "toWelcome";
    }
}
