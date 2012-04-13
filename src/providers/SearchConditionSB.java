/*
 * SearchConditionSB.java
 *
 * Created on 2007年7月20日, 上午9:37
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package providers;

/**
 *
 * @author Administrator
 */
public class SearchConditionSB {
    
    /** Creates a new instance of SearchConditionSB */
    public SearchConditionSB() {
    }
    
    private String SbAliasName;
    private String SbName;
    private String PartName;
    private String SN;
    private String Cat;
    private String blueprintName;
    private boolean AllMatch;

    public String getSbName() {
        return SbName;
    }

    public void setSbName(String SbName) {
        this.SbName = SbName;
    }

    public String getPartName() {
        return PartName;
    }

    public void setPartName(String PartName) {
        this.PartName = PartName;
    }

    public String getSN() {
        return SN;
    }

    public void setSN(String SN) {
        this.SN = SN;
    }

    public String getCat() {
        return Cat;
    }

    public void setCat(String Cat) {
        this.Cat = Cat;
    }

    public String getBlueprintName() {
        return blueprintName;
    }

    public void setBlueprintName(String blueprintName) {
        this.blueprintName = blueprintName;
    }

    public String getSbAliasName() {
        return SbAliasName;
    }

    public void setSbAliasName(String SbAliasName) {
        this.SbAliasName = SbAliasName;
    }

    public boolean isAllMatch() {
        return AllMatch;
    }

    public void setAllMatch(boolean AllMatch) {
        this.AllMatch = AllMatch;
    }

    
}
