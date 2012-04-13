/*
 * GenerateDirectory.java
 *
 * Created on 2008年1月7日, 下午7:35
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package tools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

/**
 *
 * @author Administrator
 */
public class GenerateDirectory {
    
    /** Creates a new instance of GenerateDirectory */
    public GenerateDirectory() {
    }
    
    public static void main(String[] ppp){
        String[] args=new String[2];
        System.out.println("请输入输入图档路径：\n");
        try {
            
            while ((args[0] = Console.readLine()).length() == 0) {
            }
            
            System.out.println("输入图档的路径是："+args[0]);
            
            System.out.println("请输入输出图档的文件夹:\n");
            while ((args[1] = Console.readLine()).length() == 0) {
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            return;
        }
        File file=new File(args[0]);
        Stack stack=new Stack();
        stack.push(file);
        try {
            do{
                file=(File)stack.pop();
                if(file.isDirectory()){
                    TxtFilter filter=new TxtFilter();
                    if(filter.accept(file,"目录.txt")){
                        generate(file.getPath()+"/"+"目录.txt",args[1]);
                    }
                    File[] files=file.listFiles();
                    for (int i = 0; i < files.length; i++) {
                        if(files[i].isDirectory()){
                            stack.push(files[i]);
                        }
                    }
                }else if(file.isFile()){
                    
                }
            }while(stack.size()>0);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void generate(String txtName,String rootDir) throws IOException{
        File file=new File(txtName);
        if(file.exists()&& file.isFile()){
            BufferedReader br=new BufferedReader(new FileReader(file));
            String line;
            while((line=br.readLine())!=null){
                String[] parts=line.split("\\/");
                if(parts.length==4){//
                    File parentFile=file.getParentFile();
                    File[] fileList=parentFile.listFiles();
                    for (int i = 0; i < fileList.length; i++) {
                        if(fileList[i].isFile()&&!fileList[i].getName().equals(file.getName())){
                            FileUtility.copyFile(fileList[i].getPath(),rootDir+"/"+line+"/"+fileList[i].getName());
                        }
                    }
                }else if(parts.length==5){
                    File parentFile=file.getParentFile();
                    File textFile=new File(parentFile.getPath()+"/"+parts[4]);
                    if(textFile.exists()){
                        FileUtility.copyFile(textFile.getPath(),rootDir+"/"+line);
                    }
                }else{
                    
                }
            }
            
            br.close();
            
        }
    }
}
