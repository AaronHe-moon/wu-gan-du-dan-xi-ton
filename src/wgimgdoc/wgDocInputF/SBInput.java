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
import com.sun.rave.web.ui.component.Upload;
import com.sun.rave.web.ui.model.Option;
import com.sun.rave.web.ui.model.SingleSelectOptionsList;
import com.sun.rave.web.ui.model.UploadedFile;
import util.DBUtil;
import util.InspectSBUtility;
import entity.TBlueprintDeviceInspect;
import entity.TBlueprintInspect;
import java.sql.Blob;
import javax.faces.FacesException;
import org.hibernate.Hibernate;
import usky.others.PathParser;
import wgimgdoc.ApplicationBean1;
import wgimgdoc.RequestBean1;
import wgimgdoc.SessionBean1;
import wgimgdoc.globe.ImageScaler;

/**
 * <p>Fragment bean that corresponds to a similarly named JSP page
 * fragment.  This class contains component definitions (and initialization
 * code) for all components that you have defined on this fragment, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class SBInput extends AbstractFragmentBean {
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
    
    private Upload fileUpload = new Upload();
    
    public Upload getFileUpload() {
        return fileUpload;
    }
    
    public void setFileUpload(Upload u) {
        this.fileUpload = u;
    }
    
    private TextField textField_deviceCode = new TextField();
    
    public TextField getTextField_deviceCode() {
        return textField_deviceCode;
    }
    
    public void setTextField_deviceCode(TextField tf) {
        this.textField_deviceCode = tf;
    }
    
    private Label label1 = new Label();
    
    public Label getLabel1() {
        return label1;
    }
    
    public void setLabel1(Label l) {
        this.label1 = l;
    }
    
    private TextField textField_snBlueprint = new TextField();
    
    public TextField getTextField_snBlueprint() {
        return textField_snBlueprint;
    }
    
    public void setTextField_snBlueprint(TextField tf) {
        this.textField_snBlueprint = tf;
    }
    
    private TextField textField_categoryString = new TextField();
    
    public TextField getTextField_categoryString() {
        return textField_categoryString;
    }
    
    public void setTextField_categoryString(TextField tf) {
        this.textField_categoryString = tf;
    }
    
    private TextField textField_partName = new TextField();
    
    public TextField getTextField_partName() {
        return textField_partName;
    }
    
    public void setTextField_partName(TextField tf) {
        this.textField_partName = tf;
    }
    
    private TextArea textArea_memo = new TextArea();
    
    public TextArea getTextArea_memo() {
        return textArea_memo;
    }
    
    public void setTextArea_memo(TextArea ta) {
        this.textArea_memo = ta;
    }
    
    private TextField textField_link = new TextField();
    
    public TextField getTextField_link() {
        return textField_link;
    }
    
    public void setTextField_link(TextField tf) {
        this.textField_link = tf;
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
    
    private Label label3 = new Label();
    
    public Label getLabel3() {
        return label3;
    }
    
    public void setLabel3(Label l) {
        this.label3 = l;
    }
    
    private Label label4 = new Label();
    
    public Label getLabel4() {
        return label4;
    }
    
    public void setLabel4(Label l) {
        this.label4 = l;
    }
    
    private Label label5 = new Label();
    
    public Label getLabel5() {
        return label5;
    }
    
    public void setLabel5(Label l) {
        this.label5 = l;
    }
    
    private Label label6 = new Label();
    
    public Label getLabel6() {
        return label6;
    }
    
    public void setLabel6(Label l) {
        this.label6 = l;
    }
    
    private Label label7 = new Label();
    
    public Label getLabel7() {
        return label7;
    }
    
    public void setLabel7(Label l) {
        this.label7 = l;
    }
    
    private Label label8 = new Label();
    
    public Label getLabel8() {
        return label8;
    }
    
    public void setLabel8(Label l) {
        this.label8 = l;
    }
    
    private Label label9 = new Label();
    
    public Label getLabel9() {
        return label9;
    }
    
    public void setLabel9(Label l) {
        this.label9 = l;
    }
    
    private DropDown dropDown_nm = new DropDown();
    
    public DropDown getDropDown_nm() {
        return dropDown_nm;
    }
    
    public void setDropDown_nm(DropDown dd) {
        this.dropDown_nm = dd;
    }
    
    private SingleSelectOptionsList dropDown_nmDefaultOptions = new SingleSelectOptionsList();
    
    public SingleSelectOptionsList getDropDown_nmDefaultOptions() {
        return dropDown_nmDefaultOptions;
    }
    
    public void setDropDown_nmDefaultOptions(SingleSelectOptionsList ssol) {
        this.dropDown_nmDefaultOptions = ssol;
    }

    private Label label10 = new Label();

    public Label getLabel10() {
        return label10;
    }

    public void setLabel10(Label l) {
        this.label10 = l;
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

    private MessageGroup messageGroup1 = new MessageGroup();

    public MessageGroup getMessageGroup1() {
        return messageGroup1;
    }

    public void setMessageGroup1(MessageGroup mg) {
        this.messageGroup1 = mg;
    }

    private Label label11 = new Label();

    public Label getLabel11() {
        return label11;
    }

    public void setLabel11(Label l) {
        this.label11 = l;
    }

    private TextField textField_sbAliasName = new TextField();

    public TextField getTextField_sbAliasName() {
        return textField_sbAliasName;
    }

    public void setTextField_sbAliasName(TextField tf) {
        this.textField_sbAliasName = tf;
    }
    // </editor-fold>
    
    public SBInput() {
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
            TBlueprintInspect tblueprintinspect=new TBlueprintInspect();
            TBlueprintDeviceInspect tblueprintdeviceinspect=new TBlueprintDeviceInspect();
            
            tblueprintinspect.setSnBlueprint((String)textField_snBlueprint.getText());//设置图纸编号
            UploadedFile uploadedFile=fileUpload.getUploadedFile();
            String docType=null;
            if(uploadedFile!=null){
                docType=uploadedFile.getContentType();
                PathParser pp=new PathParser(uploadedFile.getOriginalName());
                tblueprintinspect.setDocType(pp.getFileName());
                
                Blob bigImage=null;
                Blob smallImage=null;
                if(docType!=null){
                    if ( docType.equals("image/jpeg")
                    || docType.equals("image/jpg")
                    || docType.equals("image/pjpeg")
                    || docType.equals("image/gif")
                    || docType.equals("image/png")
                    || docType.equals("image/x-png")) {
                        //generate big image and small image
                        bigImage=Hibernate.createBlob(uploadedFile.getBytes());//
                        smallImage=Hibernate.createBlob(ImageScaler.ScaleFromBytesToBytes(uploadedFile.getBytes(),800));
                        tblueprintinspect.setBigImage(bigImage);//设置大图档
                        tblueprintdeviceinspect.setSmallImage(smallImage);//设置小图档
                    }else {
                        tblueprintinspect.setBigImage(Hibernate.createBlob(uploadedFile.getBytes()));
                    }
                }
            }
            
            tblueprintdeviceinspect.setDeviceAliasName((String)textField_sbAliasName.getText());
            tblueprintdeviceinspect.setSnBlueprint((String)textField_snBlueprint.getText());
            tblueprintdeviceinspect.setCategoryString((String)dropDown_nm.getSelected());
            tblueprintdeviceinspect.setDeviceCode((String)textField_deviceCode.getText());
            tblueprintdeviceinspect.setMemo((String)textArea_memo.getText());
            tblueprintdeviceinspect.setPartName((String)textField_partName.getText());
            tblueprintdeviceinspect.setIsChecked(Boolean.FALSE);
            tblueprintdeviceinspect.setBlueprintName((String)textField_tzmc.getText());
            
            TBlueprintDeviceInspect temp=null;
            String link=(String)textField_link.getText();
            if(link!=null && link!=""){
                temp=new TBlueprintDeviceInspect();
                temp.setIdBlueprint(Integer.valueOf(textField_link.getText().toString()));
                tblueprintdeviceinspect.setTBlueprintDeviceInspect(temp);
            }
            
            InspectSBUtility util=new InspectSBUtility();
            util.save(tblueprintinspect,tblueprintdeviceinspect);
            return "toSuccess";
        } catch (Exception ex) {
 //           error(ex.getMessage());
            return "toDBConnectionError";
        }
    }

    public String button1_action() {
        // 待做事项：处理按钮单击操作。返回的值是一个导航
        // 条件名称，如果它为 Null，则返回到同一页。
        
        return "toWelcome";
    }
    
    
    
}
