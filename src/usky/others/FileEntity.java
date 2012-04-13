/*
 * FileEntity.java
 *
 * Created on 2007��7��27��, ����9:35
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
 *����:FileEntity
 *˵��:�����װ���ļ��Ķ�д�����Ա����ļ���д���ظ�
 *�÷�:
 *д�ļ�
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
    private String filePathName;//�ļ�·����
//    private String fileExt;//�ļ�����
//    private String filePath;//�ļ���·��
//    private String fileName;//�ļ�����(��������)
    
    
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
     *����:beWrittenTo
     *����:InputStream is    --��������Դ
     *˵��:�÷��������ݴ���������Դд��ָ����filePathName���ļ�֮��.��������쳣,
     *  ���׳�FileNotFoundException��IOException
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
