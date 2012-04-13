/*
 * ImageFileEntity.java
 *
 * Created on 2007年7月28日, 上午8:26
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
 *类名：<strong>ImageFileEntity</strong>
 *说明：该类封装了图片文件的操作
 *</p>
 */

public class ImageFileEntity extends FileEntity{
    
    /** Creates a new instance of ImageFileEntity */
    public ImageFileEntity(String filePathName) {
        super(filePathName);
    }
    /**〈p>
     *名称：rotate
     *参数：float arcDegree   --旋转的弧度
     *      boolean bClockWise   --true代表顺时针，false代表逆时针
     *说明:如果bClockWise为true，就将图片顺时针旋转arcDegree弧度
     *      如果bClockWise为false,就将图片逆时针旋转arcDegree弧度
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
                ImageIO.write(RotateHalf(bi, bClockWise), "jpg", fileOut);//内部调用RotateHalf完成真正操作
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    /**<p>
     *名称：<strong>tranformImageFormat</strong>
     *参数：String inputFilePath   --输入文件路径名
     *      String outputFilePath  --输出文件路径名
     *      boolean bDeleteInput   --true代表转换/拷贝图片文件后自动删除输入文件。false代表不删除输入文件
     *说明：该方法将输入图片文件转换为名为outputFilePathName的图片！如果二者的扩展名相同，则
     *  实际上只是简单的拷贝图片文件。如果不一样，就转换图片格式。具体转换成哪种类型，则根据输出文件的扩展名
     *  而定！也就是说输出文件的扩展名是自动识别的。
     *〈strong>注意</strong>：1,如果输入的图片路径非法就不会执行任何操作.
     *                      2,如果输入图片删除失败，就抛出FileNotDeletedException。
     *                      3,如果输入文件名称不能与输出文件名称相同,就抛出IllegalArgumentException
     *                      4,如果IO错误，就抛出IO异常。
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
     *类名：<strong>executeRotate</strong>
     *参数：BufferedImage imageIn     ---等待旋转的图象
     *      float arcDegree           ---旋转的弧度
     *      boolean bClockWise        ---true代表顺时针，false代表逆时针
     *说明：该方法将输入图片按指定的顺时针或逆时针方向旋转arcDegree弧度
     *</p>
     */
//    public static BufferedImage executeRotate(BufferedImage imageIn,
//            double arcDegree,boolean bClockWise){
//        AffineTransform at=new AffineTransform();
//        System.out.append("图片宽度："+imageIn.getWidth()+"--图片高度："+imageIn.getHeight());
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
//        System.out.println("转换后的图片高度："+aaa.getHeight()+"--图片宽度："+aaa.getWidth());
//        return op.filter(imageIn,null);
//    }
    
    private static BufferedImage RotateHalf(BufferedImage imageIn, boolean bClockWise){
        AffineTransform at = new AffineTransform();//旋转操作类
        if(bClockWise){//根据旋转方向有不同的算法
            //顺时针旋转时，以左下角为旋转点
            at.rotate(Math.PI / 2, 0, imageIn.getHeight());
            at.translate(-imageIn.getHeight(), 0);
        } else {//逆时针旋转以右上角为旋转点
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
