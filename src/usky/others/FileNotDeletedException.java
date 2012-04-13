/*
 * FileNotDeletedException.java
 *
 * Created on 2007年7月28日, 上午10:02
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package usky.others;

/**
 *
 * @author Administrator
 */
public class FileNotDeletedException extends Throwable{
    
    /** Creates a new instance of FileNotDeletedException */
    public FileNotDeletedException() {
    super("文件没有被删除掉！");
    }
    
}
