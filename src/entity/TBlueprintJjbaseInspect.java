package entity;

import java.io.Serializable;
import java.sql.Blob;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class TBlueprintJjbaseInspect implements Serializable {

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
    private Boolean isChecked;

    /** nullable persistent field */
    private String spNotes;

    /** nullable persistent field */
    private String memo;

    /** nullable persistent field */
    private entity.TBlueprintInspect TBlueprintInspect;

    /** persistent field */
    private entity.TBlueprintJjbaseInspect TBlueprintJjbaseInspect;

    /** persistent field */
    private Set TBlueprintJjbaseInspects;


    
    /** full constructor */
    public TBlueprintJjbaseInspect(String snBlueprint, String blueprintName, String blueprintProject, String projectName, String categoryString, Blob smallImage, Boolean isChecked, String spNotes, String memo, entity.TBlueprintInspect TBlueprintInspect, entity.TBlueprintJjbaseInspect TBlueprintJjbaseInspect, Set TBlueprintJjbaseInspects) {
        this.snBlueprint = snBlueprint;
        this.blueprintName = blueprintName;
        this.blueprintProject = blueprintProject;
        this.projectName = projectName;
        this.categoryString = categoryString;
        this.smallImage = smallImage;
        this.isChecked = isChecked;
        this.spNotes = spNotes;
        this.memo = memo;
        this.TBlueprintInspect = TBlueprintInspect;
        this.TBlueprintJjbaseInspect = TBlueprintJjbaseInspect;
        this.TBlueprintJjbaseInspects = TBlueprintJjbaseInspects;

    }

    /** default constructor */
    public TBlueprintJjbaseInspect() {
    }

    /** minimal constructor */
    public TBlueprintJjbaseInspect(entity.TBlueprintJjbaseInspect TBlueprintJjbaseInspect, Set TBlueprintJjbaseInspects) {
        this.TBlueprintJjbaseInspect = TBlueprintJjbaseInspect;
        this.TBlueprintJjbaseInspects = TBlueprintJjbaseInspects;
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

    public Boolean getIsChecked() {
        return this.isChecked;
    }

    public void setIsChecked(Boolean isChecked) {
        this.isChecked = isChecked;
    }

    public String getSpNotes() {
        return this.spNotes;
    }

    public void setSpNotes(String spNotes) {
        this.spNotes = spNotes;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public entity.TBlueprintInspect getTBlueprintInspect() {
        return this.TBlueprintInspect;
    }

    public void setTBlueprintInspect(entity.TBlueprintInspect TBlueprintInspect) {
        this.TBlueprintInspect = TBlueprintInspect;
    }

    public entity.TBlueprintJjbaseInspect getTBlueprintJjbaseInspect() {
        return this.TBlueprintJjbaseInspect;
    }

    public void setTBlueprintJjbaseInspect(entity.TBlueprintJjbaseInspect TBlueprintJjbaseInspect) {
        this.TBlueprintJjbaseInspect = TBlueprintJjbaseInspect;
    }

    public Set getTBlueprintJjbaseInspects() {
        return this.TBlueprintJjbaseInspects;
    }

    public void setTBlueprintJjbaseInspects(Set TBlueprintJjbaseInspects) {
        this.TBlueprintJjbaseInspects = TBlueprintJjbaseInspects;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("idBlueprint", getIdBlueprint())
            .toString();
    }

}
