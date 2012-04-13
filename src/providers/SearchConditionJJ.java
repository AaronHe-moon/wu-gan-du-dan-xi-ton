/*
 * SearchConditionJJ.java
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
public class SearchConditionJJ {
    
    /** Creates a new instance of SearchConditionJJ */
    public SearchConditionJJ() {
    }
    
    private String GcName;
    private String XmName;
    private String TzName;
    private String SN;
    private String Cat;
    private boolean AllMatch;

    public String getGcName() {
        return GcName;
    }

    public void setGcName(String GcName) {
        this.GcName = GcName;
    }

    public String getXmName() {
        return XmName;
    }

    public void setXmName(String XmName) {
        this.XmName = XmName;
    }

    public String getTzName() {
        return TzName;
    }

    public void setTzName(String TzName) {
        this.TzName = TzName;
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

    public boolean isAllMatch() {
        return AllMatch;
    }

    public void setAllMatch(boolean AllMatch) {
        this.AllMatch = AllMatch;
    }


    
}
