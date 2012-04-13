package entity;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Set;


/** @author Hibernate CodeGenerator */
public class TBlueprintDeviceInspect implements Serializable {

    /** identifier field */
    private Integer idBlueprint;

    
    private String deviceAliasName;
    
    /** nullable persistent field */
    private String partName;

    /** nullable persistent field */
    private String deviceCode;

    /** nullable persistent field */
    private String snBlueprint;

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
    private entity.TBlueprintDeviceInspect TBlueprintDeviceInspect;

    /** persistent field */
    private Set TBlueprintDeviceInspects;
    
private String blueprintName;

    /** full constructor */
    

	public TBlueprintDeviceInspect(String deviceAliasName, String partName,
		String deviceCode, String snBlueprint, String categoryString,
		Blob smallImage, Boolean isChecked, String spNotes, String memo,
		TBlueprintInspect blueprintInspect,
		TBlueprintDeviceInspect blueprintDeviceInspect,
		Set blueprintDeviceInspects, String blueprintName) {
	super();
	this.deviceAliasName = deviceAliasName;
	this.partName = partName;
	this.deviceCode = deviceCode;
	this.snBlueprint = snBlueprint;
	this.categoryString = categoryString;
	this.smallImage = smallImage;
	this.isChecked = isChecked;
	this.spNotes = spNotes;
	this.memo = memo;
	TBlueprintInspect = blueprintInspect;
	TBlueprintDeviceInspect = blueprintDeviceInspect;
	TBlueprintDeviceInspects = blueprintDeviceInspects;
	this.blueprintName = blueprintName;
}

	/** default constructor */
    public TBlueprintDeviceInspect() {
    }

    /** minimal constructor */
    public TBlueprintDeviceInspect(entity.TBlueprintDeviceInspect TBlueprintDeviceInspect, Set TBlueprintDeviceInspects) {
        this.TBlueprintDeviceInspect = TBlueprintDeviceInspect;
        this.TBlueprintDeviceInspects = TBlueprintDeviceInspects;
    }

    public Integer getIdBlueprint() {
        return this.idBlueprint;
    }

    public void setIdBlueprint(Integer idBlueprint) {
        this.idBlueprint = idBlueprint;
    }

    public String getPartName() {
        return this.partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public String getDeviceCode() {
        return this.deviceCode;
    }

    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }

    public String getSnBlueprint() {
        return this.snBlueprint;
    }

    public void setSnBlueprint(String snBlueprint) {
        this.snBlueprint = snBlueprint;
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

    public entity.TBlueprintDeviceInspect getTBlueprintDeviceInspect() {
        return this.TBlueprintDeviceInspect;
    }

    public void setTBlueprintDeviceInspect(entity.TBlueprintDeviceInspect TBlueprintDeviceInspect) {
        this.TBlueprintDeviceInspect = TBlueprintDeviceInspect;
    }

    public Set getTBlueprintDeviceInspects() {
        return this.TBlueprintDeviceInspects;
    }

    public void setTBlueprintDeviceInspects(Set TBlueprintDeviceInspects) {
        this.TBlueprintDeviceInspects = TBlueprintDeviceInspects;
    }


    public String getBlueprintName() {
        return this.blueprintName;
    }

    public void setBlueprintName(String blueprintName) {
        this.blueprintName = blueprintName;
    }

	public String getDeviceAliasName() {
		return deviceAliasName;
	}

	public void setDeviceAliasName(String deviceAliasName) {
		this.deviceAliasName = deviceAliasName;
	}




}
