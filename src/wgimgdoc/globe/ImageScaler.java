/*
 * ImageScaler.java
 *
 * Created on 2007年9月14日, 下午1:47
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package wgimgdoc.globe;


import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.imageio.ImageIO;
/**
 *
 * @author Administrator
 */
public class ImageScaler {
    
    
//
//    static public void ScaleIt(File src, File dst) throws java.io.IOException{
//        BufferedImage biSrc;
//        if(src.exists() && src.isFile()){
//            biSrc = ImageIO.read(src);
//        } else{
//            return;
//        }
//        AffineTransform at = new AffineTransform();
//        at.scale(0.5, 0.5);
//        BufferedImageOp bi = new AffineTransformOp(at, null);
//        BufferedImage biDst =  bi.filter(biSrc, null);
//        ImageIO.write(biDst, "jpeg", dst);
//    }
    /** Creates a new instance of ImageScaler */
    public ImageScaler() {
    }
    
    static public BufferedImage ScaleFromInputStreamToBufferedImage(InputStream ios, double width){
        try {
            BufferedImage bi = ImageIO.read(ios);
            double l = width / bi.getWidth();
            AffineTransform at = new AffineTransform();
            at.scale(l, l);
            BufferedImageOp bio = new AffineTransformOp(at, null);
            return bio.filter(bi, null);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    static public byte[] ScaleFromInputStreamToBytes(InputStream ios, double width){
        BufferedImage bi = ScaleFromInputStreamToBufferedImage(ios, width);
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try {
            if(ImageIO.write(bi, "jpg", os)){
                return os.toByteArray();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    static public BufferedImage ScaleFromBytsToBufferedImage(byte[] b, double width){
        return ScaleFromInputStreamToBufferedImage(new ByteArrayInputStream(b), width);
    }
    
    static public byte[] ScaleFromBytesToBytes(byte[] b, double width){
        return ScaleFromInputStreamToBytes(new ByteArrayInputStream(b), width);
    }
    
    
}
