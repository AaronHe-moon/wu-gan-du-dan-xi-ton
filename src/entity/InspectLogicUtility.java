package entity;

import util.DBUtil;
import util.InspectInterceptor;
import util.InspectJJUtility;
import util.InspectSBUtility;

public class InspectLogicUtility {
    public void PassInspect(TBlueprintInspect bi, TBlueprintJjbaseInspect bji) {
        TBlueprint bp = new TBlueprint();
        TBlueprintJjbase bj = new TBlueprintJjbase();
        
        // 设置TBlueprint表
        bp.setBigDoc(bi.getBigDoc());
        bp.setBigImage(bi.getBigImage());
        bp.setDocType(bi.getDocType());
        bp.setSnBlueprint(bi.getSnBlueprint());
        bp.setSpNotes(bji.getSpNotes());
        bp.setTBlueprintJjbase(bj);
        
        // 设置TBlueprintJjbase表
        bj.setBlueprintName(bji.getBlueprintName());
        bj.setBlueprintProject(bji.getBlueprintProject());
        bj.setCategoryString(bji.getCategoryString());
        bj.setMemo(bji.getMemo());
        bj.setProjectName(bji.getProjectName());
        bj.setSmallImage(bji.getSmallImage());
        bj.setSnBlueprint(bji.getSnBlueprint());
        bj.setTBlueprint(bp);
        
        // 加记录到主表中
        BlueprintJJUtility bju = new BlueprintJJUtility();
        bju.save(bp, bj);
        
        // 删除审查表的中的记录
        InspectJJUtility iju = new InspectJJUtility();
        iju.delete(bi);
        
    }
    
    public void PassInspect(TBlueprintInspect bi, TBlueprintJjbaseInspect bji,String accountName) {
        TBlueprint bp = new TBlueprint();
        TBlueprintJjbase bj = new TBlueprintJjbase();
        
        // 设置TBlueprint表
        bp.setBigDoc(bi.getBigDoc());
        bp.setBigImage(bi.getBigImage());
        bp.setDocType(bi.getDocType());
        bp.setSnBlueprint(bi.getSnBlueprint());
        bp.setSpNotes(bji.getSpNotes());
        bp.setTBlueprintJjbase(bj);
        
        // 设置TBlueprintJjbase表
        bj.setBlueprintName(bji.getBlueprintName());
        bj.setBlueprintProject(bji.getBlueprintProject());
        bj.setCategoryString(bji.getCategoryString());
        bj.setMemo(bji.getMemo());
        bj.setProjectName(bji.getProjectName());
        bj.setSmallImage(bji.getSmallImage());
        bj.setSnBlueprint(bji.getSnBlueprint());
        bj.setTBlueprint(bp);
        
        // 加记录到主表中
        bp.setTBlueprintJjbase(bj);
        InspectInterceptor interceptor=new InspectInterceptor(accountName);
        DBUtil.save(bp,interceptor);
        // 删除审查表的中的记录
        InspectJJUtility iju = new InspectJJUtility();
        iju.delete(bi);
        
    }
    public void PassInspect(TBlueprintInspect bi, TBlueprintDeviceInspect bdi) {
        TBlueprint bp = new TBlueprint();
        TBlueprintDevice bd = new TBlueprintDevice();
        
        // 设置TBlueprint表
        bp.setBigDoc(bi.getBigDoc());
        bp.setBigImage(bi.getBigImage());
        bp.setDocType(bi.getDocType());
        bp.setSnBlueprint(bi.getSnBlueprint());
        bp.setSpNotes(bdi.getSpNotes());
        bp.setTBlueprintDevice(bd);
        
        // 设置TBlueprintDevice表
        bd.setDeviceCode(bdi.getDeviceCode());
        bd.setCategoryString(bdi.getCategoryString());
        bd.setMemo(bdi.getMemo());
        bd.setPartName(bdi.getPartName());
        bd.setSmallImage(bdi.getSmallImage());
        bd.setSnBlueprint(bdi.getSnBlueprint());
        bd.setTBlueprint(bp);
        
        // 加记录到主表中
        BlueprintSBUtility bsu = new BlueprintSBUtility();
        bsu.save(bp, bd);
        
        // 删除审查表的中的记录
        InspectSBUtility isu = new InspectSBUtility();
        isu.delete(bi);
        
    }
    
    //this method generate the method with the required 审核 记录
    public void PassInspect(TBlueprintInspect bi, TBlueprintDeviceInspect bdi,String accountName) {
        TBlueprint bp = new TBlueprint();
        TBlueprintDevice bd = new TBlueprintDevice();
        
        // 设置TBlueprint表
        bp.setBigDoc(bi.getBigDoc());
        bp.setBigImage(bi.getBigImage());
        bp.setDocType(bi.getDocType());
        bp.setSnBlueprint(bi.getSnBlueprint());
        bp.setSpNotes(bdi.getSpNotes());
        bp.setTBlueprintDevice(bd);
        
        // 设置TBlueprintDevice表
        bd.setDeviceCode(bdi.getDeviceCode());
        bd.setCategoryString(bdi.getCategoryString());
        bd.setMemo(bdi.getMemo());
        bd.setPartName(bdi.getPartName());
        bd.setSmallImage(bdi.getSmallImage());
        bd.setSnBlueprint(bdi.getSnBlueprint());
        bd.setTBlueprint(bp);
        
        // 加记录到主表中
        bp.setTBlueprintDevice(bd);
        InspectInterceptor interceptor=new InspectInterceptor(accountName);
        DBUtil.save(bp,interceptor);
        
        // 删除审查表的中的记录
        InspectSBUtility isu = new InspectSBUtility();
        isu.delete(bi);
        
    }
    
    public void RefuseInspect(TBlueprintInspect bi, TBlueprintJjbaseInspect bji) {
        bji.setIsChecked(new Boolean(true));
        
        InspectJJUtility iju = new  InspectJJUtility();
        iju.save(bi, bji);
    }
    
    public void RefuseInspect(TBlueprintInspect bi, TBlueprintDeviceInspect bdi) {
        bdi.setIsChecked(new Boolean(true));
        
        InspectSBUtility isu = new  InspectSBUtility();
        isu.save(bi, bdi);
    }
}
