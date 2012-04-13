package entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class TPopedom implements Serializable {

    /** identifier field */
    private String popedomName;

    /** nullable persistent field */
    private String memo;

    /** nullable persistent field */
    private String action;

    /** nullable persistent field */
    private entity.TPopedomPage TPopedomPage;

    /** persistent field */
    private Set TRolePopedoms=new HashSet(0);

    /** full constructor */
    public TPopedom(String popedomName, String memo, String action, entity.TPopedomPage TPopedomPage, Set TRolePopedoms) {
        this.popedomName = popedomName;
        this.memo = memo;
        this.action = action;
        this.TPopedomPage = TPopedomPage;
        this.TRolePopedoms = TRolePopedoms;
    }

    /** default constructor */
    public TPopedom() {
    }

    /** minimal constructor */
    public TPopedom(String popedomName, Set TRolePopedoms) {
        this.popedomName = popedomName;
        this.TRolePopedoms = TRolePopedoms;
    }

    public String getPopedomName() {
        return this.popedomName;
    }

    public void setPopedomName(String popedomName) {
        this.popedomName = popedomName;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getAction() {
        return this.action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public entity.TPopedomPage getTPopedomPage() {
        return this.TPopedomPage;
    }

    public void setTPopedomPage(entity.TPopedomPage TPopedomPage) {
        this.TPopedomPage = TPopedomPage;
    }

    public Set getTRolePopedoms() {
        return this.TRolePopedoms;
    }

    public void setTRolePopedoms(Set TRolePopedoms) {
        this.TRolePopedoms = TRolePopedoms;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("popedomName", getPopedomName())
            .toString();
    }

}
