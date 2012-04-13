package entity;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class TPopedomPage implements Serializable {

    /** identifier field */
    private String popedomName;

    /** nullable persistent field */
    private String page;

    /** nullable persistent field */
    private entity.TPopedom TPopedom;

    /** full constructor */
    public TPopedomPage(String popedomName, String page, entity.TPopedom TPopedom) {
        this.popedomName = popedomName;
        this.page = page;
        this.TPopedom = TPopedom;
    }

    /** default constructor */
    public TPopedomPage() {
    }

    /** minimal constructor */
    public TPopedomPage(String popedomName) {
        this.popedomName = popedomName;
    }

    public String getPopedomName() {
        return this.popedomName;
    }

    public void setPopedomName(String popedomName) {
        this.popedomName = popedomName;
    }

    public String getPage() {
        return this.page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public entity.TPopedom getTPopedom() {
        return this.TPopedom;
    }

    public void setTPopedom(entity.TPopedom TPopedom) {
        this.TPopedom = TPopedom;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("popedomName", getPopedomName())
            .toString();
    }

}
