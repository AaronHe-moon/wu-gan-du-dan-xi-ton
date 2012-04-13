/*
 * FileEntity.java
 *
 * Created on 2007年7月27日, 上午9:35
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package usky.others;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Administrator
 */
/**
 *类名:FileEntity
 *说明:该类封装了文件的读写操作以避免文件读写的重复
 *用法:
 *写文件
 *  String filePathName="C:/111.txt"; *
 *  FileEntity fe=new FileEntity(filePathName);
 *  try{
 *      fe.beWrittenTo(someinputstream);
 *  }catch(FileNotFoundException ex){
 *      ex.printStackTrace();
 *  }catch(IOException ioe){
 *      ioe.printStackTrace();
 *  }
 */
public class FileEntity {
    private String filePathName;//文件路径名
//    private String fileExt;//文件类型
//    private String filePath;//文件的路径
//    private String fileName;//文件名称(包括类型)
    
    
    /** Creates a new instance of FileEntity */
    
    
    public FileEntity(String filePathName) {
        this.setFilePathName(filePathName);
    }
    
    public String getFilePathName() {
        return filePathName;
    }
    
    public void setFilePathName(String filePathName) {
        this.filePathName = filePathName;
    }
    /**
     *名称:beWrittenTo
     *参数:InputStream is    --输入数据源
     *说明:该方法将数据从输入数据源写入指定的filePathName的文件之中.如果发生异常,
     *  就抛出FileNotFoundException和IOException
     */
    public void beWrittenTo(InputStream is) throws FileNotFoundException,IOException{
        FileOutputStream fos=new FileOutputStream(filePathName);
        DataOutputStream out=new DataOutputStream(fos);
        int length=1024;
        byte[] buffer=new byte[1024];
        int nRead=0;
        int nBytesRead=0;
        while((nBytesRead=is.read(buffer))!=-1){
            out.write(buffer,0,nBytesRead);
            nRead+=nBytesRead;
        }
        fos.close();
    }
}
