package entity;

import java.util.HashSet;
import java.util.Set;

/**
 * TUser generated by MyEclipse Persistence Tools
 */

public class TUser implements java.io.Serializable {

	// Fields

	private String accountName;

	private TRole TRole;

	private String password;

	private String userName;

	private String title;

	private String userProf;

	private String memo;

	private Set TUserCategories = new HashSet(0);

	// Constructors

	/** default constructor */
	public TUser() {
	}

	/** minimal constructor */
	public TUser(String accountName) {
		this.accountName = accountName;
	}

	/** full constructor */
	public TUser(String accountName, TRole TRole, String password,
			String userName, String title, String userProf, String memo,
			Set TUserCategories) {
		this.accountName = accountName;
		this.TRole = TRole;
		this.password = password;
		this.userName = userName;
		this.title = title;
		this.userProf = userProf;
		this.memo = memo;
		this.TUserCategories = TUserCategories;
	}

	// Property accessors

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public TRole getTRole() {
		return this.TRole;
	}

	public void setTRole(TRole TRole) {
		this.TRole = TRole;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUserProf() {
		return this.userProf;
	}

	public void setUserProf(String userProf) {
		this.userProf = userProf;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Set getTUserCategories() {
		return this.TUserCategories;
	}

	public void setTUserCategories(Set TUserCategories) {
		this.TUserCategories = TUserCategories;
	}

}