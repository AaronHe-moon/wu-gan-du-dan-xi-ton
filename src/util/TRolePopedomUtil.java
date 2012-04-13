package util;

import entity.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.hibernate.HibernateException;

public class TRolePopedomUtil {
    /**
     *Method:   saveRolePopedom
     *Parameter:String roleName     --intended RoleName
     *          String popedomName  --intended popedomName
     *instruction:this function insert the intended role with the intended popedomName
     */
    public static void saveRolePopedom(String roleName,String popedomName) throws HibernateException{
        TRolePopedom trolepopedom=new TRolePopedom();
        TRole trole=new TRole();
        trole.setRoleName(roleName);
        TPopedom tpopedom=new TPopedom();
        tpopedom.setPopedomName(popedomName);
        
        TRolePopedomId trolepopedomid=new TRolePopedomId();
        trolepopedomid.setTRole(trole);
        trolepopedomid.setTPopedom(tpopedom);
        
        trolepopedom.setId(trolepopedomid);
        
        DBUtil.save(trolepopedom);
    }
    /**
     *this method remove the intended role's popedom whose name is "popedomName"
     */
    public static void deleteRolePopedom(String roleName,String popedomName){
        TRolePopedom trolepopedom=new TRolePopedom();
        TRole trole=new TRole();
        trole.setRoleName(roleName);
        TPopedom tpopedom=new TPopedom();
        tpopedom.setPopedomName(popedomName);
        
        TRolePopedomId trolepopedomid=new TRolePopedomId();
        trolepopedomid.setTRole(trole);
        trolepopedomid.setTPopedom(tpopedom);
        
        trolepopedom.setId(trolepopedomid);
        DBUtil.delete(trolepopedom);
    }
    /**
     *instruction:find the intended role's popedom and returns a list containing
     *the "TRolePopedom" instance
     */
    public static Set findRolePopedomByRoleName(String roleName){
        TRole trole;
        trole=TRoleUtil.findByRoleName(roleName);
        Set temp=trole.getTRolePopedoms();
        
        return temp;
    }
    
    public static void deleteRolePopedom(TRolePopedom trolepopedom){
        DBUtil.delete(trolepopedom);
    }
    
    
//	public String roleName;
//	public String popedomName;
//	public String getPopedomName() {
//		return popedomName;
//	}
//	public void setPopedomName(String popedomName) {
//		this.popedomName = popedomName;
//	}
//	public String getRoleName() {
//		return roleName;
//	}
//	public void setRoleName(String roleName) {
//		this.roleName = roleName;
//	}
//
//	public boolean save(){
//		TRolePopedom trolepopedom=new TRolePopedom();
//		TRole trole=new TRole();
//		trole.setRoleName(roleName);
//		TPopedom tpopedom=new TPopedom();
//		tpopedom.setPopedomName(popedomName);
//
//		TRolePopedomId trolepopedomid=new TRolePopedomId();
//		trolepopedomid.setTRole(trole);
//		trolepopedomid.setTPopedom(tpopedom);
//
//		trolepopedom.setId(trolepopedomid);
//
//		DBUtil.save(trolepopedomid);
//		return true;
//	}
//
//	public void delete(){
//		TRolePopedom trolepopedom=new TRolePopedom();
//		TRole trole=new TRole();
//		trole.setRoleName(roleName);
//		TPopedom tpopedom=new TPopedom();
//		tpopedom.setPopedomName(popedomName);
//
//		TRolePopedomId trolepopedomid=new TRolePopedomId();
//		trolepopedomid.setTRole(trole);
//		trolepopedomid.setTPopedom(tpopedom);
//
//		trolepopedom.setId(trolepopedomid);
//		DBUtil.delete(trolepopedom);
//	}
//
//	public List findRoleByRoleName(){
//		TRole trole=new TRole();
//		if(getRoleName()==null)
//			trole.setRoleName("");
//		else
//			trole.setRoleName(roleName);
//		return DBUtil.findByExample(trole);
//	}
//
//	public TPopedom findPopedomInfoByPopedomName(){
//		TPopedom tpopedom=new TPopedom();
//		tpopedom.setPopedomName(getPopedomName());
//
//		List list=DBUtil.findByExample(tpopedom);
//
//		return (TPopedom)(list==null?null:list.get(0));
//	}
    
    public static void main(String[] args){
        TRole trole;
        String roleName="asdasd";
        trole=TRoleUtil.findByRoleName(roleName);
        Set temp=trole.getTRolePopedoms();
        Iterator iterator=temp.iterator();
        TRolePopedom trolepopedom;
        while(iterator.hasNext()){
            trolepopedom=(TRolePopedom)iterator.next();
            System.out.println("RoleName:"+trolepopedom.getId().getTRole().getRoleName()+"PopedomName:"+trolepopedom.getId().getTPopedom().getPopedomName());
            
        }
    }
    
    
}
