/*
 * PathParser.java
 *
 * Created on 2007��7��27��, ����9:40
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
 *����:PathParser
 *˵��:�����ļ�·������
 *ʹ�÷���:
 *      PathParser pp;
 *      pp.setFilePathName("C:/programs files/adsfads.txt");
 *      System.out.println(pp.getFileName);
 *      System.out.println(pp.getFileExt);
 *      System.out.println(pp.getFilePath);
 *
 *  ������:
 *      adsfads.txt
 *      txt
 *      C:/programs files
 */
public class PathParser {
    
    /** Creates a new instance of PathParser */
    public PathParser(String filePathName) {
        setFilePathName(filePathName);
    }
    private String fileName="";//�ļ�����,���û�о�Ϊ"
    private String fileExt="";//�ļ���չ��,���û����չ����Ϊ"""
    private String filePath="";//�ļ�·��,���û�о�Ϊ"".���ص�·������û��'/'��'\'

    /**
     *����:setFilePath
     *����:String filePathName    --�ļ�·����
     *˵��:�÷��������ļ���·��,�õ��ļ�������,��չ��,�ļ�·��.�������Ĳ���Ϊ������ַ���
     *  ��ô�����²���Ԥ�ϵĽ��.
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
 *����:getFilePath
 *����:void
 *˵��:�����ļ�·��.���ص��ļ�·������û��'\'��'/'����.���·��û�оͷ���""(���ַ���)
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
