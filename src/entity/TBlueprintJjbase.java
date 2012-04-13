package entity;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Set;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class TBlueprintJjbase implements Serializable {

    /** identifier field */
    private Integer idBlueprint;

    /** nullable persistent field */
    private String snBlueprint;

    /** nullable persistent field */
    private String blueprintName;

    /** nullable persistent field */
    private String blueprintProject;

    /** nullable persistent field */
    private String projectName;

    /** nullable persistent field */
    private String categoryString;

    /** nullable persistent field */
    private Blob smallImage;

    /** nullable persistent field */
    private String memo;

    /** nullable persistent field */
    private entity.TBlueprint TBlueprint;

    /** persistent field */
    private entity.TBlueprintJjbase TBlueprintJjbase;

    /** persistent field */
    private Set TBlueprintJjbases;

    /** full constructor */
    public TBlueprintJjbase(String snBlueprint, String blueprintName, String blueprintProject, String projectName, String categoryString, Blob smallImage, String memo, entity.TBlueprint TBlueprint, entity.TBlueprintJjbase TBlueprintJjbase, Set TBlueprintJjbases) {
        this.snBlueprint = snBlueprint;
        this.blueprintName = blueprintName;
        this.blueprintProject = blueprintProject;
        this.projectName = projectName;
        this.categoryString = categoryString;
        this.smallImage = smallImage;
        this.memo = memo;
        this.TBlueprint = TBlueprint;
        this.TBlueprintJjbase = TBlueprintJjbase;
        this.TBlueprintJjbases = TBlueprintJjbases;
    }

    /** default constructor */
    public TBlueprintJjbase() {
    }

    /** minimal constructor */
    public TBlueprintJjbase(entity.TBlueprintJjbase TBlueprintJjbase, Set TBlueprintJjbases) {
        this.TBlueprintJjbase = TBlueprintJjbase;
        this.TBlueprintJjbases = TBlueprintJjbases;
    }

    public Integer getIdBlueprint() {
        return this.idBlueprint;
    }

    public void setIdBlueprint(Integer idBlueprint) {
        this.idBlueprint = idBlueprint;
    }

    public String getSnBlueprint() {
        return this.snBlueprint;
    }

    public void setSnBlueprint(String snBlueprint) {
        this.snBlueprint = snBlueprint;
    }

    public String getBlueprintName() {
        return this.blueprintName;
    }

    public void setBlueprintName(String blueprintName) {
        this.blueprintName = blueprintName;
    }

    public String getBlueprintProject() {
        return this.blueprintProject;
    }

    public void setBlueprintProject(String blueprintProject) {
        this.blueprintProject = blueprintProject;
    }

    public String getProjectName() {
        return this.projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getCategoryString() {
        return this.categoryString;
    }

    public void setCategoryString(String categoryString) {
        this.categoryString = categoryString;
    }

    public Blob getSmallImage() {
        return this.smallImage;
    }

    public void setSmallImage(Blob smallImage) {
        this.smallImage = smallImage;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public entity.TBlueprint getTBlueprint() {
        return this.TBlueprint;
    }

    public void setTBlueprint(entity.TBlueprint TBlueprint) {
        this.TBlueprint = TBlueprint;
    }

    public entity.TBlueprintJjbase getTBlueprintJjbase() {
        return this.TBlueprintJjbase;
    }

    public void setTBlueprintJjbase(entity.TBlueprintJjbase TBlueprintJjbase) {
        this.TBlueprintJjbase = TBlueprintJjbase;
    }

    public Set getTBlueprintJjbases() {
        return this.TBlueprintJjbases;
    }

    public void setTBlueprintJjbases(Set TBlueprintJjbases) {
        this.TBlueprintJjbases = TBlueprintJjbases;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("idBlueprint", getIdBlueprint())
            .toString();
    }

}
