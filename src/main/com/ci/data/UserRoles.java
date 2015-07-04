package com.ci.data;
 
 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CiUserRoles  
 */
@Entity
@Table(name = "CI_USER_ROLES", catalog = "CI_DB")
public class UserRoles implements java.io.Serializable {

	private int roleId;
	private String description;

	public UserRoles() {
	}

	public UserRoles(int roleId) {
		this.roleId = roleId;
	}

	public UserRoles(int roleId, String description) {
		this.roleId = roleId;
		this.description = description;
	}

	@Id
	@Column(name = "ROLE_ID", unique = true, nullable = false)
	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	@Column(name = "DESCRIPTION", length = 100)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
