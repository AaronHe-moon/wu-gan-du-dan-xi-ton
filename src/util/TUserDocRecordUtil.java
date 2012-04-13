/*
 * TUserDocRecordUtil.java
 *
 * Created on 2007年10月19日, 上午10:47
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package util;

import entity.TUserDocRecord;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Administrator
 */
public class TUserDocRecordUtil {
    
    /** Creates a new instance of TUserDocRecordUtil */
    public TUserDocRecordUtil() {
    }
    
    public static void save(TUserDocRecord record) throws HibernateException{
        DBUtil.save(record);
    }
    
    public static void update(TUserDocRecord record) throws HibernateException{
        DBUtil.update(record);
    }
    
    public static void saveOrUpdate(TUserDocRecord record) throws HibernateException{
        DBUtil.saveOrUpdate(record);
    }
    
    public static List findByExample(TUserDocRecord example) throws HibernateException{
        return DBUtil.findByExample(example);
    }
    
    public static void delete(TUserDocRecord record) throws HibernateException{
        DBUtil.delete(record);
    }
    
}
