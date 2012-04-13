package util;
import util.DBUtil;
import entity.TPopedom;
import java.util.List;
import org.hibernate.HibernateException;
/*
 * TPopedomUtil.java
 *
 * Created on 2007年10月11日, 下午2:51
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class TPopedomUtil {
    
    /** Creates a new instance of TPopedomUtil */
    public TPopedomUtil() {
    }
    
    public static TPopedom findByPopedomName(String popedomName)throws HibernateException{
        List list=DBUtil.findByProperty("TPopedom","popedomName",popedomName);
        if((list!=null)&&(list.size()>0)) return (TPopedom)list.get(0);
        else return null;
    }
    public static List getAllPopedom(){
        TPopedom tpopedom=new TPopedom();
        return DBUtil.findByExample(tpopedom);
    }
    
}
