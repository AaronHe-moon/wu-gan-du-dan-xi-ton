/*
 * searchUtil.java
 *
 * Created on 2007年10月1日, 下午10:43
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package entity;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.ProjectionList;

/**
 * 此类只提供静态方法来完成搜索功能。基建和设备都单独有2个方法。一个是得到查询总的数目，一个是得到指定条件的查询结果。
 * @author 何亮
 */
public class searchUtil {
    
    /** Creates a new instance of searchUtil */
    public searchUtil() {
    }
    
    /**
     * 查询基建图纸
     * @param snBlueprint 基建图号
     * @param blueprintName 图纸名称
     * @param blueprintProject 工程
     * @param projectName 项目
     * @param categoryString 类目名，查询中目前未使用
     * @param cats 用户权限
     * @param maxResult 设置每页记录数，即每次查询返回的记录数。
     * @param nStart 从哪个记录位置开始
     * @return 返回查询结果
     */
    public static List searchJJBlueprint(String snBlueprint,
            String blueprintName,
            String blueprintProject,
            String projectName,
            boolean isAllMatch,
            //String categoryString,
            //以上为用户输入参数
            //以下为用户权限
            List cats,
            int maxResult,
            int nStart){
        
        Criteria cr = HibernateSessionFactory.getSession()
        .createCriteria(TJjbaseSearch.class);
        
        if(blueprintName != null && blueprintName.trim().length()>0)
            if(isAllMatch)
                cr.add(Restrictions.eq("blueprintName", blueprintName));
            else
                cr.add(Restrictions.ilike("blueprintName", blueprintName, MatchMode.ANYWHERE));
        if(snBlueprint != null && snBlueprint.trim().length()>0)
            if(isAllMatch)
                cr.add(Restrictions.eq("snBlueprint", snBlueprint));
            else
                cr.add(Restrictions.ilike("snBlueprint", snBlueprint, MatchMode.ANYWHERE));
        if(blueprintProject != null && blueprintProject.trim().length()>0)
            if(isAllMatch)
                cr.add(Restrictions.eq("blueprintProject", blueprintProject));
            else
                cr.add(Restrictions.ilike("blueprintProject", blueprintProject, MatchMode.ANYWHERE));
        if(projectName != null && projectName.trim().length()>0)
            if(isAllMatch)
                cr.add(Restrictions.eq("projectName", projectName));
            else
                cr.add(Restrictions.ilike("projectName", projectName, MatchMode.ANYWHERE));
        
        cr.add(Restrictions.in("categoryString", cats));
        cr.setMaxResults(maxResult);
        cr.setFirstResult(nStart);
        
        return cr.list();
        
        
    }
    
    
    /**
     * 查询基建图纸后，返回满足条件的总数
     * @param snBlueprint
     * @param blueprintName
     * @param blueprintProject
     * @param projectName
     * @param categoryString
     * @param cats
     * @return
     */
    public static int TotalNumOfSearchJJBlueprint(String snBlueprint,
            String blueprintName,
            String blueprintProject,
            String projectName,
            boolean isAllMatch,
            //String categoryString,
            //以上为用户输入参数
            //以下为用户权限
            List cats){
        
        Criteria cr = HibernateSessionFactory.getSession()
        .createCriteria(TJjbaseSearch.class);
        
        if(blueprintName != null && blueprintName.trim().length()>0)
            if(isAllMatch)
                cr.add(Restrictions.eq("blueprintName", blueprintName));
            else
                cr.add(Restrictions.ilike("blueprintName", blueprintName, MatchMode.ANYWHERE));
        if(snBlueprint != null && snBlueprint.trim().length()>0)
            if(isAllMatch)
                cr.add(Restrictions.eq("snBlueprint", snBlueprint));
            else
                cr.add(Restrictions.ilike("snBlueprint", snBlueprint, MatchMode.ANYWHERE));
        if(blueprintProject != null && blueprintProject.trim().length()>0)
            if(isAllMatch)
                cr.add(Restrictions.eq("blueprintProject", blueprintProject));
            else
                cr.add(Restrictions.ilike("blueprintProject", blueprintProject, MatchMode.ANYWHERE));
        if(projectName != null && projectName.trim().length()>0)
            if(isAllMatch)
                cr.add(Restrictions.eq("projectName", projectName));
            else
                cr.add(Restrictions.ilike("projectName", projectName, MatchMode.ANYWHERE));
        
        cr.add(Restrictions.in("categoryString", cats));
        cr.setProjection(Projections.count("idBlueprint"));
        
        Integer  total = (Integer)cr.list().get(0);
        return total.intValue();
        
        
    }
    
    
    /**
     *
     * @param deviceCode
     * @param partName
     * @param snBlueprint
     * @param categoryString
     * @param cats
     * @param maxResult
     * @param nStart
     * @return
     */
    public static List searchSBBlueprint(String deviceAliasName,
            String deviceCode,
            String partName,
            String blueprintName,
            String snBlueprint,
            boolean isAllMatch,
            //String categoryString,
            //以上为用户输入参数
            //以下为用户权限
            List cats,
            int maxResult,
            int nStart){
        
        Criteria cr = HibernateSessionFactory.getSession()
        .createCriteria(TDeviceSearch.class);
        
        if(deviceAliasName != null && deviceAliasName.trim().length()>0)
            if(isAllMatch)
                cr.add(Restrictions.eq("deviceAliasName", deviceAliasName));
            else
                cr.add(Restrictions.ilike("deviceAliasName", deviceAliasName, MatchMode.ANYWHERE));
        if(deviceCode != null && deviceCode.trim().length()>0)
            if(isAllMatch)
                cr.add(Restrictions.eq("deviceCode", deviceCode));
            else
                cr.add(Restrictions.ilike("deviceCode", deviceCode, MatchMode.ANYWHERE));
        if(partName != null && partName.trim().length()>0)
            if(isAllMatch)
                cr.add(Restrictions.eq("partName", partName));
            else
                cr.add(Restrictions.ilike("partName", partName, MatchMode.ANYWHERE));
        if(blueprintName != null && blueprintName.trim().length()>0)
            if(isAllMatch)
                cr.add(Restrictions.eq("blueprintName", blueprintName));
            else
                cr.add(Restrictions.ilike("blueprintName", blueprintName, MatchMode.ANYWHERE));
        if(snBlueprint != null && snBlueprint.trim().length()>0)
            if(isAllMatch)
                cr.add(Restrictions.eq("snBlueprint", snBlueprint));
            else
                cr.add(Restrictions.ilike("snBlueprint", snBlueprint, MatchMode.ANYWHERE));
        
        cr.add(Restrictions.in("categoryString", cats));
        cr.setMaxResults(maxResult);
        cr.setFirstResult(nStart);
        
        return cr.list();
        
    }
    
    
    /**
     *
     * @param deviceCode
     * @param partName
     * @param snBlueprint
     * @param categoryString
     * @param cats
     * @return
     */
    public static int TotalNumOfSearchSBBlueprint(String deviceAliasName,
            String deviceCode,
            String partName,
            String blueprintName,
            String snBlueprint,
            boolean isAllMatch,
            //String categoryString,
            //以上为用户输入参数
            //以下为用户权限
            List cats){
        
        Criteria cr = HibernateSessionFactory.getSession()
        .createCriteria(TDeviceSearch.class);
        
        if(deviceAliasName != null && deviceAliasName.trim().length()>0)
            if(isAllMatch)
                cr.add(Restrictions.eq("deviceAliasName", deviceAliasName));
            else
                cr.add(Restrictions.ilike("deviceAliasName", deviceAliasName, MatchMode.ANYWHERE));
        if(deviceCode != null && deviceCode.trim().length()>0)
            if(isAllMatch)
                cr.add(Restrictions.eq("deviceCode", deviceCode));
            else
                cr.add(Restrictions.ilike("deviceCode", deviceCode, MatchMode.ANYWHERE));
        if(partName != null && partName.trim().length()>0)
            if(isAllMatch)
                cr.add(Restrictions.eq("partName", partName));
            else
                cr.add(Restrictions.ilike("partName", partName, MatchMode.ANYWHERE));
        if(blueprintName != null && blueprintName.trim().length()>0)
            if(isAllMatch)
                cr.add(Restrictions.eq("blueprintName", blueprintName));
            else
                cr.add(Restrictions.ilike("blueprintName", blueprintName, MatchMode.ANYWHERE));
        if(snBlueprint != null && snBlueprint.trim().length()>0)
            if(isAllMatch)
                cr.add(Restrictions.eq("snBlueprint", snBlueprint));
            else
                cr.add(Restrictions.ilike("snBlueprint", snBlueprint, MatchMode.ANYWHERE));
  
        cr.add(Restrictions.in("categoryString", cats));
        cr.setProjection(Projections.count("idBlueprint"));
        
        Integer  total = (Integer)cr.list().get(0);
        return total.intValue();
        
        
    }
    
    
}
