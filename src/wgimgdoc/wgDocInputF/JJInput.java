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
import com.sun.rave.web.ui.component.TextArea;
import com.sun.rave.web.ui.component.TextField;
import com.sun.rave.web.ui.component.Upload;
import com.sun.rave.web.ui.model.Option;
import com.sun.rave.web.ui.model.SingleSelectOptionsList;
import com.sun.rave.web.ui.model.UploadedFile;
import org.hibernate.HibernateException;
import usky.others.PathParser;
import util.InspectJJUtility;
import entity.TBlueprintInspect;
import entity.TBlueprintJjbaseInspect;
import java.sql.Blob;
import javax.faces.FacesException;
import org.hibernate.Hibernate;
//import wgLogic.Inspect.TBlueprintJJ;
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
public class JJInput extends AbstractFragmentBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private int __placeholder;
    
    /**
     * <p>Automatically managed component initialization. <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        dropDown_catDefaultOptions.setOptions(
            new com.sun.rave.web.ui.model.Option[] {new com.sun.rave.web.ui.model.Option("507.7.06", "\u57fa\u5efa\u91c7\u6696\u3001\u901a\u98ce\u56fe\u6863"), new com.sun.rave.web.ui.model.Option("507.7.05", "\u57fa\u5efa\u7ed9\u6392\u6c34\u56fe\u6863"), new com.sun.rave.web.ui.model.Option("507.7.03", "\u57fa\u5efa\u5de5\u827a\u56fe\u6863"), new com.sun.rave.web.ui.model.Option("507.7.09", "\u57fa\u5efa\u4f9b\u7535\u56fe\u6863"), new com.sun.rave.web.ui.model.Option("507.7.08", "\u57fa\u5efa\u8ba1\u63a7\u3001\u7535\u8baf\u56fe\u6863"), new com.sun.rave.web.ui.model.Option("507.7.07", "\u57fa\u5efa\u70ed\u529b\u71c3\u6c14\u56fe\u6863"), new com.sun.rave.web.ui.model.Option("507.7.10", "\u57fa\u5efa\u8bbe\u5907\uff08\u8bbe\u5907\u5b89\u88c5\u3001\u5de5\u4e1a\u7089\uff09\u56fe\u6863"), new com.sun.rave.web.ui.model.Option("507.7.04", "\u57fa\u5efa\u571f\u5efa\u56fe\u6863"), new com.sun.rave.web.ui.model.Option("507.7.01", "\u57fa\u5efa\u7efc\u5408\u7c7b\u56fe\u6863"), new com.sun.rave.web.ui.model.Option("507.7.02", "\u57fa\u5efa\u603b\u56fe\u8fd0\u8f93\u56fe\u6863"), new com.sun.rave.web.ui.model.Option("507.7.11", "\u57fa\u5efa\u5176\u5b83\u7c7b\u56fe\u6863")});
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
    
    private TextField txtLink = new TextField();
    
    public TextField getTxtLink() {
        return txtLink;
    }
    
    public void setTxtLink(TextField tf) {
        this.txtLink = tf;
    }
    
    private TextField txtBH = new TextField();
    
    public TextField getTxtBH() {
        return txtBH;
    }
    
    public void setTxtBH(TextField tf) {
        this.txtBH = tf;
    }
    
    private TextField txtGC = new TextField();
    
    public TextField getTxtGC() {
        return txtGC;
    }
    
    public void setTxtGC(TextField tf) {
        this.txtGC = tf;
    }
    
    private Button button_submit = new Button();
    
    public Button getButton_submit() {
        return button_submit;
    }
    
    public void setButton_submit(Button b) {
        this.button_submit = b;
    }
    
    private TextField txtTZMC = new TextField();
    
    public TextField getTxtTZMC() {
        return txtTZMC;
    }
    
    public void setTxtTZMC(TextField tf) {
        this.txtTZMC = tf;
    }
    
    private Label label1 = new Label();
    
    public Label getLabel1() {
        return label1;
    }
    
    public void setLabel1(Label l) {
        this.label1 = l;
    }
    
    private TextArea txtMemo = new TextArea();
    
    public TextArea getTxtMemo() {
        return txtMemo;
    }
    
    public void setTxtMemo(TextArea ta) {
        this.txtMemo = ta;
    }
    
    private Label label3 = new Label();
    
    public Label getLabel3() {
        return label3;
    }
    
    public void setLabel3(Label l) {
        this.label3 = l;
    }
    
    private Upload fileUp = new Upload();
    
    public Upload getFileUp() {
        return fileUp;
    }
    
    public void setFileUp(Upload u) {
        this.fileUp = u;
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
    
    private Label label10 = new Label();
    
    public Label getLabel10() {
        return label10;
    }
    
    public void setLabel10(Label l) {
        this.label10 = l;
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

    private Button button1 = new Button();

    public Button getButton1() {
        return button1;
    }

    public void setButton1(Button b) {
        this.button1 = b;
    }
    // </editor-fold>
    
    public JJInput() {
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
//         条件名称，如果它为 Null，则返回到同一页。
            
            TBlueprintInspect tblueprintinspect=new TBlueprintInspect();
            TBlueprintJjbaseInspect tblueprintjjbaseinspect=new TBlueprintJjbaseInspect();
            
            tblueprintinspect.setSnBlueprint((String)txtBH.getText());//设置图纸编号
            UploadedFile uploadedFile=fileUp.getUploadedFile();
            String docType=null;
            if(uploadedFile!=null){
                docType=uploadedFile.getContentType();
                PathParser pp=new PathParser(uploadedFile.getOriginalName());
                tblueprintinspect.setDocType(pp.getFileName());
                Blob bigImage=null;
                Blob smallImage=null;
                if(docType!=null){
                    if ( docType.equals("image/pjpeg")
                    || docType.equals("image/jpg")
                    || docType.equals("image/jpeg")
                    || docType.equals("image/gif")
                    || docType.equals("image/png")
                    || docType.equals("image/x-png")) {
                        //generate big image and small image
                        bigImage=Hibernate.createBlob(uploadedFile.getBytes());//
                        smallImage=Hibernate.createBlob(ImageScaler.ScaleFromBytesToBytes(uploadedFile.getBytes(),800));
                        tblueprintinspect.setBigImage(bigImage);//设置大图档
                        tblueprintjjbaseinspect.setSmallImage(smallImage);//设置小图档
                    }else {
                        tblueprintinspect.setBigImage(Hibernate.createBlob(uploadedFile.getBytes()));
                    }
                }
            }
            
            
            tblueprintjjbaseinspect.setSnBlueprint((String)txtBH.getText());//设置图档编号
            tblueprintjjbaseinspect.setBlueprintName((String)txtTZMC.getText());//设置图档名称
            tblueprintjjbaseinspect.setBlueprintProject((String)txtGC.getText());//设置工程名称
            tblueprintjjbaseinspect.setCategoryString((String)dropDown_cat.getSelected());//设置类目编号
            tblueprintjjbaseinspect.setIsChecked(Boolean.FALSE);//设置是否审核
            tblueprintjjbaseinspect.setMemo((String)txtMemo.getText());//设置备注信息
            tblueprintjjbaseinspect.setProjectName((String)txtXM.getText());//设置项目名称
            
            TBlueprintJjbaseInspect temp=null;
            String link=(String)txtLink.getText();
            if(link!=null && link!=""){
                temp=new TBlueprintJjbaseInspect();
                temp.setIdBlueprint(Integer.valueOf(txtLink.getText().toString()));
            }
            tblueprintjjbaseinspect.setTBlueprintJjbaseInspect(temp);
            
            InspectJJUtility util=new InspectJJUtility();
            util.save(tblueprintinspect,tblueprintjjbaseinspect);
            return "toSuccess";
        }catch(Exception ex){
            error(ex.getMessage());
//            return null;
            return "toDBConnectionError";
        }
//        } catch (NumberFormatException ex) {
//            error(ex.getMessage());
//        } catch (HibernateException ex) {
////            error(ex.getMessage());
//        } catch (Exception ex){
//            error(ex.getMessage());
//        }
        
        
//        return null;
    }

    public String button1_action() {
        // 待做事项：处理按钮单击操作。返回的值是一个导航
        // 条件名称，如果它为 Null，则返回到同一页。
        
        return "toWelcome";
    }
}
