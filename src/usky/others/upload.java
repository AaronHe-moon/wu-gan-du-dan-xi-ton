/*
 * upload.java
 *
 * Created on 2007年7月21日, 上午11:21
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package usky.others;

/**
 *
 * @author Administrator
 */
import java.io.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletException;   


public class upload{
    private static String newline = "";
    private String uploadDirectory = ".";
    private String ContentType = "";
    private String CharacterEncoding = "";
    
    
    private String getFileName(String s){
        int i = s.lastIndexOf("");
        if(i < 0 || i >= s.length() - 1){
            i = s.lastIndexOf("/");
            if(i < 0 || i >= s.length() - 1)
                return s;
        }
        return s.substring(i + 1);
    }
    
    
    public void setUploadDirectory(String s){
        uploadDirectory = s;
    }
    
    
    public void setContentType(String s){
        ContentType = s;
        int j;
        if((j = ContentType.indexOf("boundary=")) != -1){
            ContentType = ContentType.substring(j + 9);
            ContentType = "--" + ContentType;
        }
    }
    
    
    public void setCharacterEncoding(String s){
        CharacterEncoding = s;
    }
    
    
    public void uploadFile( HttpServletRequest req) throws ServletException, IOException{
        setCharacterEncoding(req.getCharacterEncoding());
        setContentType(req.getContentType());
        uploadFile(req.getInputStream());
    }
    
    
    public void uploadFile( ServletInputStream servletinputstream) throws ServletException, IOException{
        
        
        String s5 = null;
        String filename = null;
        byte Linebyte[] = new byte[4096];
        byte outLinebyte[] = new byte[4096];
        int ai[] = new int[1];
        int ai1[] = new int[1];
        
        
        String line;
//得到文件名
        while((line = readLine(Linebyte, ai, servletinputstream, CharacterEncoding)) != null){
            int i = line.indexOf("filename=");
            if(i >= 0){
                line = line.substring(i + 10);
                if((i = line.indexOf("\"")) > 0)
                    line = line.substring(0, i);
                break;
            }
        }
        
        
        filename = line;
        
        
        if(filename != null && !filename.equals("\"")){
            filename = getFileName(filename);
            
            
            String sContentType = readLine(Linebyte, ai, servletinputstream, CharacterEncoding);
            if(sContentType.indexOf("Content-Type") >= 0)
                readLine(Linebyte, ai, servletinputstream, CharacterEncoding);
            
            
//File(String parent, String child)
//Creates a new File instance from a parent pathname string
//and a child pathname string.
            File file = new File(uploadDirectory, filename);
            
            
//FileOutputStream(File file)
//Creates a file output stream to write to the file represented
//by the specified File object.
            FileOutputStream fileoutputstream = new FileOutputStream(file);
            
            
            while((sContentType = readLine(Linebyte, ai, servletinputstream, CharacterEncoding)) != null){
                if(sContentType.indexOf(ContentType) == 0 && Linebyte[0] == 45)
                    break;
                
                
                if(s5 != null){
//write(byte[] b, int off, int len)
//Writes len bytes from the specified byte array starting
//at offset off to this file output stream.
                    fileoutputstream.write(outLinebyte, 0, ai1[0]);
                    fileoutputstream.flush();
                }
                s5 = readLine(outLinebyte, ai1, servletinputstream, CharacterEncoding);
                if(s5 == null || s5.indexOf(ContentType) == 0 && outLinebyte[0] == 45)
                    break;
                fileoutputstream.write(Linebyte, 0, ai[0]);
                fileoutputstream.flush();
            }
            
            
            byte byte0;
            if(newline.length() == 1)
                byte0 = 2;
            else
                byte0 = 1;
            if(s5 != null && outLinebyte[0] != 45 && ai1[0] > newline.length() * byte0)
                fileoutputstream.write(outLinebyte, 0, ai1[0] - newline.length() * byte0);
            if(sContentType != null && Linebyte[0] != 45 && ai[0] > newline.length() * byte0)
                fileoutputstream.write(Linebyte, 0, ai[0] - newline.length() * byte0);
            
            
            fileoutputstream.close();
        }
    }
    /*
public int readLine(byte[] buffer,
int offset,
int length) throws java.io.IOException
从POST来的数据中读一行
参数:
buffer - buffer to hold the line data
offset - offset into the buffer to start
length - maximum number of bytes to read.
Returns:
number of bytes read or -1 on the end of line.
     */
    
    private String readLine(byte Linebyte[], int ai[],
            ServletInputStream servletinputstream,
            String CharacterEncoding){
        try{
//readLine(byte[] buffer, int offset, int length)
//Reads a line from the POST data.
            ai[0] = servletinputstream.readLine(Linebyte, 0, Linebyte.length);
            if(ai[0] == -1)
                return null;
        }catch(IOException _ex){
            return null;
        }
        try{
            if(CharacterEncoding == null){
//用缺省的编码方式把给定的byte数组转换为字符串
//String(byte[] bytes, int offset, int length)
                return new String(Linebyte, 0, ai[0]);
            }else{
//用给定的编码方式把给定的byte数组转换为字符串
//String(byte[] bytes, int offset, int length, String enc)
                return new String(Linebyte, 0, ai[0], CharacterEncoding);
            }
        }catch(Exception _ex){
            return null;
        }
    }
}





