/*
 * searchUtil.java
 *
 * Created on 2007��10��1��, ����10:43
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
 * ����ֻ�ṩ��̬����������������ܡ��������豸��������2��������һ���ǵõ���ѯ�ܵ���Ŀ��һ���ǵõ�ָ�������Ĳ�ѯ�����
 * @author ����
 */
public class searchUtil {
    
    /** Creates a new instance of searchUtil */
    public searchUtil() {
    }
    
    /**
     * ��ѯ����ͼֽ
     * @param snBlueprint ����ͼ��
     * @param blueprintName ͼֽ����
     * @param blueprintProject ����
     * @param projectName ��Ŀ
     * @param categoryString ��Ŀ������ѯ��Ŀǰδʹ��
     * @param cats �û�Ȩ��
     * @param maxResult ����ÿҳ��¼������ÿ�β�ѯ���صļ�¼����
     * @param nStart ���ĸ���¼λ�ÿ�ʼ
     * @return ���ز�ѯ���
     */
    public static List searchJJBlueprint(String snBlueprint,
            String blueprintName,
            String blueprintProject,
            String projectName,
            boolean isAllMatch,
            //String categoryString,
            //����Ϊ�û��������
            //����Ϊ�û�Ȩ��
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
     * ��ѯ����ͼֽ�󣬷�����������������
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
            //����Ϊ�û��������
            //����Ϊ�û�Ȩ��
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
            //����Ϊ�û��������
            //����Ϊ�û�Ȩ��
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
            //����Ϊ�û��������
            //����Ϊ�û�Ȩ��
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
