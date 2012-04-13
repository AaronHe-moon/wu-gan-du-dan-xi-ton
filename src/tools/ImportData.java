package tools;

import java.io.*;
import java.sql.Blob;
import java.util.Stack;
import java.util.regex.PatternSyntaxException;

import entity.BlueprintJJUtility;
import entity.BlueprintSBUtility;
import entity.HibernateSessionFactory;
import entity.TBlueprint;
import entity.TBlueprintDevice;
import entity.TBlueprintJjbase;

import org.hibernate.*;

public class ImportData {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String strPath;
        System.out.println("请输入图档路径：\n");
        
        try {
            while ((strPath = Console.readLine()).length() == 0) {
                System.out.println(strPath);
            }
            
            System.out.println("请按1选择基建图档，2选择设备图档！！");
            int jjorsb;
            do {
                jjorsb = Console.readChar();
            } while (jjorsb != '1' && jjorsb != '2');
            // 开始检查目录
            File file = new File(strPath.toString());
            Stack stack = new Stack();
            stack.push(file);
            do {
                File[] sub;
                file = (File) stack.pop();
                if (!file.exists()) {
                    System.out.println("File " + file.getAbsolutePath()
                    + "not exist");
                } else if (file.isDirectory()) {
                    sub = file.listFiles();
                    for (int i = 0; i < sub.length; i++)
                        stack.push(sub[i]);
                } else if (file.isFile() && !file.getName().endsWith("db")) {
                    strPath = file.getPath();
                    String[] array;
                    array = strPath.split("\\\\");
                    if (array.length > 4) {
                        if (array[array.length - 3].startsWith("507")) {
                            if (jjorsb == '1') {
                                TBlueprint tblp = new TBlueprint();
                                TBlueprintJjbase tblpjj = new TBlueprintJjbase();
                                tblp.setDocType(array[array.length - 1]);
                                tblpjj.setProjectName(array[array.length - 4]);
                                tblpjj.setBlueprintName(array[array.length - 2]);
                                String categoryString = array[array.length - 3];
                                String[] catPart = categoryString.split("\\.");
                                tblpjj.setCategoryString(catPart[0] + "."
                                        + catPart[1] + "." + catPart[3]);
                                tblpjj.setBlueprintProject(array[array.length - 5]);
                                tblpjj.setSnBlueprint(array[array.length - 1]);
                                byte[] byteArray=new byte[(int)file.length()];
                                FileInputStream ois = new FileInputStream(file);
                                ois.read(byteArray);
                                ois.close();
                                if (!strPath.endsWith("db")) {
                                    Blob blob=Hibernate.createBlob(byteArray);
                                    tblp.setBigImage(blob);
                                }
                                BlueprintJJUtility util = new BlueprintJJUtility();
                                util.save(tblp, tblpjj);
                                HibernateSessionFactory.closeSession();
                            } else if (jjorsb == '2') {
                                TBlueprint tblp = new TBlueprint();
                                TBlueprintDevice tblpsb = new TBlueprintDevice();
                                tblp.setDocType(array[array.length - 1]);
                                tblpsb.setDeviceCode(array[array.length - 5]);// 设备代号
                                tblpsb.setPartName(array[array.length - 4]);// 部件名称
                                String categoryString = array[array.length - 3];// 类目编号
                                tblpsb.setBlueprintName(array[array.length - 2]);// 图纸名称
                                String[] catPart = categoryString.split("\\.");
                                tblpsb.setCategoryString(catPart[0] + "."
                                        + catPart[1] + "." + catPart[3]);
                                tblpsb.setSnBlueprint(array[array.length - 1]);// 图档编号
                                byte[] byteArray = new byte[(int) file.length()];
                                FileInputStream ois = new FileInputStream(file);
                                ois.read(byteArray);
                                ois.close();
                                if (!strPath.endsWith("db")) {
                                    Blob blob=Hibernate.createBlob(byteArray);
                                    tblp.setBigImage(blob);
                                }
                                BlueprintSBUtility util = new BlueprintSBUtility();
                                util.save(tblp, tblpsb);
                                HibernateSessionFactory.closeSession();
                            }
                        }
                        file=null;
                    }
                }
            } while (stack.size() > 0);
            System.out.println("操作结束！！");
        } catch (PatternSyntaxException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getPattern());
            // e.printStackTrace();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
