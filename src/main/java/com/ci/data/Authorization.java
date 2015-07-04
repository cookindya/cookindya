package com.ci.data;
 
 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CiAuthorization  
 */
@Entity
@Table(name = "CI_AUTHORIZATION", catalog = "CI_DB")
public class Authorization implements java.io.Serializable {

	private int authorizationId;
	private Integer userRegId;
	private Integer roleId;

	public Authorization() {
	}

	public Authorization(int authorizationId) {
		this.authorizationId = authorizationId;
	}

	public Authorization(int authorizationId, Integer userRegId,
			Integer roleId) {
		this.authorizationId = authorizationId;
		this.userRegId = userRegId;
		this.roleId = roleId;
	}

	@Id
	@Column(name = "AUTHORIZATION_ID", unique = true, nullable = false)
	public int getAuthorizationId() {
		return this.authorizationId;
	}

	public void setAuthorizationId(int authorizationId) {
		this.authorizationId = authorizationId;
	}

	@Column(name = "USER_REG_ID")
	public Integer getUserRegId() {
		return this.userRegId;
	}

	public void setUserRegId(Integer userRegId) {
		this.userRegId = userRegId;
	}

	@Column(name = "ROLE_ID")
	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

}
