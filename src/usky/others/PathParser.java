/*
 * PathParser.java
 *
 * Created on 2007年7月27日, 上午9:40
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package usky.others;

/**
 *
 * @author Administrator
 */
/**
 *类名:PathParser
 *说明:解析文件路径的类
 *使用方法:
 *      PathParser pp;
 *      pp.setFilePathName("C:/programs files/adsfads.txt");
 *      System.out.println(pp.getFileName);
 *      System.out.println(pp.getFileExt);
 *      System.out.println(pp.getFilePath);
 *
 *  输出结果:
 *      adsfads.txt
 *      txt
 *      C:/programs files
 */
public class PathParser {
    
    /** Creates a new instance of PathParser */
    public PathParser(String filePathName) {
        setFilePathName(filePathName);
    }
    private String fileName="";//文件名称,如果没有就为"
    private String fileExt="";//文件扩展名,如果没有扩展名就为"""
    private String filePath="";//文件路径,如果没有就为"".返回的路径后面没有'/'或'\'

    /**
     *名称:setFilePath
     *参数:String filePathName    --文件路径名
     *说明:该方法解析文件的路径,得到文件的名称,扩展名,文件路径.如果传入的参数为随意的字符串
     *  那么将导致不可预料的结果.
     */
    public void setFilePathName(String filePathName){
        int i=0;
        if(filePathName==null){
            fileName="";
            fileExt="";
            filePath="";
            return;
        }
        
        int index=filePathName.lastIndexOf('\\');
        if(index==-1){
            index=filePathName.lastIndexOf('/');
        }
        if(index==-1||index+1>=filePathName.length()){
            fileName="";
            fileExt="";
            filePath=filePathName;
        }else {
            fileName=filePathName.substring(index+1);
            filePath=filePathName.substring(0,index);
            index=getFileName().lastIndexOf('.');
            if(index==-1 || index+1>=getFileName().length()){
                fileExt="";
            } else{
                fileExt=getFileName().substring(index+1);
            }
        }
        
    }
    public String getFileName() {
        return fileName;
    }

    public String getFileExt() {
        return fileExt;
    }
/**
 *名称:getFilePath
 *参数:void
 *说明:返回文件路径.返回的文件路径后面没有'\'或'/'符号.如果路径没有就返回""(空字符串)
 */
    public String getFilePath() {
        return filePath;
    }
    
    public static void main(String[] args){
        PathParser pp=new PathParser("C:\\adfsdafsdf\111.txt");
        System.out.println(pp.getFileName());
        System.out.println(pp.getFileExt());
        System.out.println(pp.getFilePath());
        
    }
}
