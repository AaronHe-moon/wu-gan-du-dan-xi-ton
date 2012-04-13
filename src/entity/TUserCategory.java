package entity;

/**
 * TUserCategory generated by MyEclipse Persistence Tools
 */

public class TUserCategory implements java.io.Serializable {

	// Fields

	private TUserCategoryId id;

	private String partName;

	private String deviceCode;

	private String snBlueprint;

	private String blueprintName;

	private String blueprintProject;

	private String projectName;

	// Constructors

	/** default constructor */
	public TUserCategory() {
	}

	/** minimal constructor */
	public TUserCategory(TUserCategoryId id) {
		this.id = id;
	}

	/** full constructor */
	public TUserCategory(TUserCategoryId id, String partName,
			String deviceCode, String snBlueprint, String blueprintName,
			String blueprintProject, String projectName) {
		this.id = id;
		this.partName = partName;
		this.deviceCode = deviceCode;
		this.snBlueprint = snBlueprint;
		this.blueprintName = blueprintName;
		this.blueprintProject = blueprintProject;
		this.projectName = projectName;
	}

	// Property accessors

	public TUserCategoryId getId() {
		return this.id;
	}

	public void setId(TUserCategoryId id) {
		this.id = id;
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

}