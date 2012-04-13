package util;
import util.DBUtil;
import entity.TPopedomPage;
import java.util.List;
import org.hibernate.HibernateException;
/*
 * TPopedomPageUtil.java
 *
 * Created on 2007年10月11日, 下午2:47
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class TPopedomPageUtil {
    
    /** Creates a new instance of TPopedomPageUtil */
    public TPopedomPageUtil() {
    }
    
    public static void save(TPopedomPage tpopedomPage) throws HibernateException{
        DBUtil.save(tpopedomPage);
    }
    
    public static void delete(TPopedomPage tpopedomPage)throws HibernateException{
        DBUtil.delete(tpopedomPage);
    }
    
    public static TPopedomPage findByPopedomName(String popedomName){
        List list= DBUtil.findByProperty("TPopedomPage","popedomName",popedomName);
        if((list!=null)&&(list.size()>0)) return (TPopedomPage)list.get(0);
        else return null;
    }
}
