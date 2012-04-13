package entity;

import util.DBUtil;
import util.InspectInterceptor;
import util.InspectJJUtility;
import util.InspectSBUtility;

public class InspectLogicUtility {
    public void PassInspect(TBlueprintInspect bi, TBlueprintJjbaseInspect bji) {
        TBlueprint bp = new TBlueprint();
        TBlueprintJjbase bj = new TBlueprintJjbase();
        
        // ����TBlueprint��
        bp.setBigDoc(bi.getBigDoc());
        bp.setBigImage(bi.getBigImage());
        bp.setDocType(bi.getDocType());
        bp.setSnBlueprint(bi.getSnBlueprint());
        bp.setSpNotes(bji.getSpNotes());
        bp.setTBlueprintJjbase(bj);
        
        // ����TBlueprintJjbase��
        bj.setBlueprintName(bji.getBlueprintName());
        bj.setBlueprintProject(bji.getBlueprintProject());
        bj.setCategoryString(bji.getCategoryString());
        bj.setMemo(bji.getMemo());
        bj.setProjectName(bji.getProjectName());
        bj.setSmallImage(bji.getSmallImage());
        bj.setSnBlueprint(bji.getSnBlueprint());
        bj.setTBlueprint(bp);
        
        // �Ӽ�¼��������
        BlueprintJJUtility bju = new BlueprintJJUtility();
        bju.save(bp, bj);
        
        // ɾ��������еļ�¼
        InspectJJUtility iju = new InspectJJUtility();
        iju.delete(bi);
        
    }
    
    public void PassInspect(TBlueprintInspect bi, TBlueprintJjbaseInspect bji,String accountName) {
        TBlueprint bp = new TBlueprint();
        TBlueprintJjbase bj = new TBlueprintJjbase();
        
        // ����TBlueprint��
        bp.setBigDoc(bi.getBigDoc());
        bp.setBigImage(bi.getBigImage());
        bp.setDocType(bi.getDocType());
        bp.setSnBlueprint(bi.getSnBlueprint());
        bp.setSpNotes(bji.getSpNotes());
        bp.setTBlueprintJjbase(bj);
        
        // ����TBlueprintJjbase��
        bj.setBlueprintName(bji.getBlueprintName());
        bj.setBlueprintProject(bji.getBlueprintProject());
        bj.setCategoryString(bji.getCategoryString());
        bj.setMemo(bji.getMemo());
        bj.setProjectName(bji.getProjectName());
        bj.setSmallImage(bji.getSmallImage());
        bj.setSnBlueprint(bji.getSnBlueprint());
        bj.setTBlueprint(bp);
        
        // �Ӽ�¼��������
        bp.setTBlueprintJjbase(bj);
        InspectInterceptor interceptor=new InspectInterceptor(accountName);
        DBUtil.save(bp,interceptor);
        // ɾ��������еļ�¼
        InspectJJUtility iju = new InspectJJUtility();
        iju.delete(bi);
        
    }
    public void PassInspect(TBlueprintInspect bi, TBlueprintDeviceInspect bdi) {
        TBlueprint bp = new TBlueprint();
        TBlueprintDevice bd = new TBlueprintDevice();
        
        // ����TBlueprint��
        bp.setBigDoc(bi.getBigDoc());
        bp.setBigImage(bi.getBigImage());
        bp.setDocType(bi.getDocType());
        bp.setSnBlueprint(bi.getSnBlueprint());
        bp.setSpNotes(bdi.getSpNotes());
        bp.setTBlueprintDevice(bd);
        
        // ����TBlueprintDevice��
        bd.setDeviceCode(bdi.getDeviceCode());
        bd.setCategoryString(bdi.getCategoryString());
        bd.setMemo(bdi.getMemo());
        bd.setPartName(bdi.getPartName());
        bd.setSmallImage(bdi.getSmallImage());
        bd.setSnBlueprint(bdi.getSnBlueprint());
        bd.setTBlueprint(bp);
        
        // �Ӽ�¼��������
        BlueprintSBUtility bsu = new BlueprintSBUtility();
        bsu.save(bp, bd);
        
        // ɾ��������еļ�¼
        InspectSBUtility isu = new InspectSBUtility();
        isu.delete(bi);
        
    }
    
    //this method generate the method with the required ��� ��¼
    public void PassInspect(TBlueprintInspect bi, TBlueprintDeviceInspect bdi,String accountName) {
        TBlueprint bp = new TBlueprint();
        TBlueprintDevice bd = new TBlueprintDevice();
        
        // ����TBlueprint��
        bp.setBigDoc(bi.getBigDoc());
        bp.setBigImage(bi.getBigImage());
        bp.setDocType(bi.getDocType());
        bp.setSnBlueprint(bi.getSnBlueprint());
        bp.setSpNotes(bdi.getSpNotes());
        bp.setTBlueprintDevice(bd);
        
        // ����TBlueprintDevice��
        bd.setDeviceCode(bdi.getDeviceCode());
        bd.setCategoryString(bdi.getCategoryString());
        bd.setMemo(bdi.getMemo());
        bd.setPartName(bdi.getPartName());
        bd.setSmallImage(bdi.getSmallImage());
        bd.setSnBlueprint(bdi.getSnBlueprint());
        bd.setTBlueprint(bp);
        
        // �Ӽ�¼��������
        bp.setTBlueprintDevice(bd);
        InspectInterceptor interceptor=new InspectInterceptor(accountName);
        DBUtil.save(bp,interceptor);
        
        // ɾ��������еļ�¼
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
