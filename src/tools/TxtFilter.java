/*
 * TxtFilter.java
 *
 * Created on 2008年1月7日, 下午7:54
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package tools;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author Administrator
 */
public class TxtFilter implements FilenameFilter{
    
    /** Creates a new instance of TxtFilter */
    
    public TxtFilter() {
    }

    public boolean accept(File dir, String name) {
        String pathName;
        if(dir.isDirectory()){
            File[] filelist=dir.listFiles();
            for (int i = 0; i < filelist.length; i++) {
                pathName=filelist[i].getName();
                if(pathName.equals(name))
                    return true;
            }
        }
        
        return false;
    }
    
    

    
    
    
    
}
