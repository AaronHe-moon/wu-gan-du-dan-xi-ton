package entity;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Set;



/** @author Hibernate CodeGenerator */
public class TBlueprintDevice implements Serializable {

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
    private String memo;

    /** nullable persistent field */
    private entity.TBlueprint TBlueprint;

    /** persistent field */
    private entity.TBlueprintDevice TBlueprintDevice;

    /** persistent field */
    private Set TBlueprintDevices;
    
    private String blueprintName;
    

    /** full constructor */


    public TBlueprintDevice(String deviceAliasName, String partName,
			String deviceCode, String snBlueprint, String categoryString,
			Blob smallImage, String memo, TBlueprint blueprint,
			TBlueprintDevice blueprintDevice, Set blueprintDevices,
			String blueprintName) {
		super();
		this.deviceAliasName = deviceAliasName;
		this.partName = partName;
		this.deviceCode = deviceCode;
		this.snBlueprint = snBlueprint;
		this.categoryString = categoryString;
		this.smallImage = smallImage;
		this.memo = memo;
		TBlueprint = blueprint;
		TBlueprintDevice = blueprintDevice;
		TBlueprintDevices = blueprintDevices;
		this.blueprintName = blueprintName;
	}

	/** default constructor */
    public TBlueprintDevice() {
    }

    /** minimal constructor */
    public TBlueprintDevice(entity.TBlueprintDevice TBlueprintDevice, Set TBlueprintDevices) {
        this.TBlueprintDevice = TBlueprintDevice;
        this.TBlueprintDevices = TBlueprintDevices;
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

    public entity.TBlueprintDevice getTBlueprintDevice() {
        return this.TBlueprintDevice;
    }

    public void setTBlueprintDevice(entity.TBlueprintDevice TBlueprintDevice) {
        this.TBlueprintDevice = TBlueprintDevice;
    }

    public Set getTBlueprintDevices() {
        return this.TBlueprintDevices;
    }

    public void setTBlueprintDevices(Set TBlueprintDevices) {
        this.TBlueprintDevices = TBlueprintDevices;
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
