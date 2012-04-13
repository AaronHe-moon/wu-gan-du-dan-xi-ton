package util;

import entity.*;
import java.util.List;
import org.hibernate.HibernateException;

public class TUserUtil {
    public static void saveUser(TUser tuser,TRole trole) throws HibernateException{
        tuser.setTRole(trole);
        DBUtil.save(tuser);
    }
    public static void saveUser(TUser tuser)throws HibernateException{
        DBUtil.save(tuser);
    }
    public static void saveOrUpdate(TUser tuser)throws HibernateException{
        DBUtil.saveOrUpdate(tuser);
    }
    
    public static void deleteUser(TUser tuser) throws HibernateException{
        DBUtil.delete(tuser);
    }
    
    public static TUser findByUserName(String userName) throws HibernateException{
        List list=DBUtil.findByProperty("TUser","accountName",userName);
        TUser tuser=(TUser)((list!=null)&&(list.size()>0)?list.get(0):null);
        return tuser;
    }
    
    public static List findAllUsers() throws HibernateException{
        TUser tuser=new TUser();
        return DBUtil.findByExample(tuser);
    }
    
    public static List findByExample(TUser tuser) throws HibernateException{
        return DBUtil.findByExample(tuser);
    }
    
    public static void updateUser(TUser tuser,TRole trole) throws HibernateException{
        tuser.setTRole(trole);
        DBUtil.update(tuser);
    }
    
    public static void updateUser(TUser tuser)throws HibernateException{
        DBUtil.update(tuser);
    }
    public static void main(String[] args){
        TUser tuser=TUserUtil.findByUserName("usky");
        TRole trole=tuser.getTRole();
        if(trole!=null)
            System.out.println("RoleName is:"+trole.getRoleName());
    }
}
