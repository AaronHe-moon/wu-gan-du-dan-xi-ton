/*
 * ImageFileEntity.java
 *
 * Created on 2007��7��28��, ����8:26
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package usky.others;

import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Administrator
 */
/**<p>
 *������<strong>ImageFileEntity</strong>
 *˵���������װ��ͼƬ�ļ��Ĳ���
 *</p>
 */

public class ImageFileEntity extends FileEntity{
    
    /** Creates a new instance of ImageFileEntity */
    public ImageFileEntity(String filePathName) {
        super(filePathName);
    }
    /**��p>
     *���ƣ�rotate
     *������float arcDegree   --��ת�Ļ���
     *      boolean bClockWise   --true����˳ʱ�룬false������ʱ��
     *˵��:���bClockWiseΪtrue���ͽ�ͼƬ˳ʱ����תarcDegree����
     *      ���bClockWiseΪfalse,�ͽ�ͼƬ��ʱ����תarcDegree����
     *</p>
     */
//    public static void rotate(String inputFilePathName,String outputFilePathName,double arcDegree,boolean bClockWise){
//        File fileIn=new File(inputFilePathName);
//        File fileOut=new File(outputFilePathName);
//        String fileExt;
//        PathParser pp=new PathParser(inputFilePathName);
//        fileExt=pp.getFileExt();
//
//        if(fileIn.isFile()){
//            try {
//                BufferedImage bi=ImageIO.read(fileIn);
////                fileIn.delete();
//                ImageIO.write(executeRotate(bi,arcDegree,bClockWise),fileExt,fileOut);
//
//            } catch (IOException ex) {
//                System.out.println(ex.getMessage());
//                ex.printStackTrace();
//            }
////            ImageIO.write()
//        }
//
//    }
    
    public static void rotate90(String inputFilePath, String outputFilePath, boolean bClockWise) {
        File fileIn = new File(inputFilePath);
        File fileOut = new File(outputFilePath);
        if (fileIn.isFile()){
            try {
                BufferedImage bi = ImageIO.read(fileIn);
                ImageIO.write(RotateHalf(bi, bClockWise), "jpg", fileOut);//�ڲ�����RotateHalf�����������
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    /**<p>
     *���ƣ�<strong>tranformImageFormat</strong>
     *������String inputFilePath   --�����ļ�·����
     *      String outputFilePath  --����ļ�·����
     *      boolean bDeleteInput   --true����ת��/����ͼƬ�ļ����Զ�ɾ�������ļ���false����ɾ�������ļ�
     *˵�����÷���������ͼƬ�ļ�ת��Ϊ��ΪoutputFilePathName��ͼƬ��������ߵ���չ����ͬ����
     *  ʵ����ֻ�Ǽ򵥵Ŀ���ͼƬ�ļ��������һ������ת��ͼƬ��ʽ������ת�����������ͣ����������ļ�����չ��
     *  ������Ҳ����˵����ļ�����չ�����Զ�ʶ��ġ�
     *��strong>ע��</strong>��1,��������ͼƬ·���Ƿ��Ͳ���ִ���κβ���.
     *                      2,�������ͼƬɾ��ʧ�ܣ����׳�FileNotDeletedException��
     *                      3,��������ļ����Ʋ���������ļ�������ͬ,���׳�IllegalArgumentException
     *                      4,���IO���󣬾��׳�IO�쳣��
     *
     *</p>
     */
    public static void transformImageFormat(String inputFilePath,String outputFilePath,boolean bDeleteInput)throws IOException,FileNotDeletedException,IllegalArgumentException{
        File fileIn = new File(inputFilePath);
        File fileOut=new File(outputFilePath);
        
        if(inputFilePath.trim().equals(outputFilePath.trim())){
            throw new IllegalArgumentException("transformImageFormat(String inputFilePath,String outputFilePath,boolean bDeleteInput) --inputFilePath is identical to outputFilePath!!");
        }
        PathParser pp=new PathParser(outputFilePath);
        String fileExt=pp.getFileExt();
        
        if(fileIn.isFile()){
            BufferedImage bi=ImageIO.read(fileIn);
            if(fileExt.equals(""))
                fileExt="jpg";
            ImageIO.write(bi,fileExt,fileOut);
            if(bDeleteInput) {
                boolean bOk=fileIn.delete();
                if(!bOk) throw new FileNotDeletedException();
            }
        }
        
    }
    
    /**<p>
     *������<strong>executeRotate</strong>
     *������BufferedImage imageIn     ---�ȴ���ת��ͼ��
     *      float arcDegree           ---��ת�Ļ���
     *      boolean bClockWise        ---true����˳ʱ�룬false������ʱ��
     *˵�����÷���������ͼƬ��ָ����˳ʱ�����ʱ�뷽����תarcDegree����
     *</p>
     */
//    public static BufferedImage executeRotate(BufferedImage imageIn,
//            double arcDegree,boolean bClockWise){
//        AffineTransform at=new AffineTransform();
//        System.out.append("ͼƬ��ȣ�"+imageIn.getWidth()+"--ͼƬ�߶ȣ�"+imageIn.getHeight());
//        if(bClockWise){
//            at.rotate(-arcDegree,0,imageIn.getHeight());
//            at.translate(-imageIn.getHeight()/2,0);
//        }else{
//            at.rotate(arcDegree,imageIn.getWidth(),0);
//            at.translate(0,-imageIn.getWidth()/2);
//        }
//
//        AffineTransformOp ato=new AffineTransformOp(at,null);
//        BufferedImageOp op=ato;
//        BufferedImage aaa=op.filter(imageIn,null);
//        System.out.println("ת�����ͼƬ�߶ȣ�"+aaa.getHeight()+"--ͼƬ��ȣ�"+aaa.getWidth());
//        return op.filter(imageIn,null);
//    }
    
    private static BufferedImage RotateHalf(BufferedImage imageIn, boolean bClockWise){
        AffineTransform at = new AffineTransform();//��ת������
        if(bClockWise){//������ת�����в�ͬ���㷨
            //˳ʱ����תʱ�������½�Ϊ��ת��
            at.rotate(Math.PI / 2, 0, imageIn.getHeight());
            at.translate(-imageIn.getHeight(), 0);
        } else {//��ʱ����ת�����Ͻ�Ϊ��ת��
            at.rotate(-Math.PI / 2, imageIn.getWidth(), 0);
            at.translate(0, -imageIn.getWidth());
        }
        AffineTransformOp ato = new AffineTransformOp(at, null);
        BufferedImageOp op = ato;
        return op.filter(imageIn, null);
    }
    
    
    public static void main(String[] args){
        ImageFileEntity ife=new ImageFileEntity("C:/image010.gif");
        ImageFileEntity.rotate90(ife.getFilePathName(),"C:/image015.jpg",true);
//        ImageFileEntity.rotate(ife.getFilePathName(),"C:/image014.jpg",AngleTransformer.toArcDegree(90),true);
        //     ife.rotate(ife.getFilePathName(),"C:/image011.jpg",AngleTranformer.toArcDegree(90),true);
    }
}
