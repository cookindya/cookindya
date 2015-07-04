package com.ci.data;
 
 

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CiUserRegistration  
 */
@Entity
@Table(name = "CI_USER_REGISTRATION", catalog = "CI_DB")
public class UserRegistration implements java.io.Serializable {

	private int userRegistrationId;
	private String userName;
	private String password;
	private Date startDate;
	private Date expiry;
	private String blocked;
	private String isAdmin;

	public UserRegistration() {
	}

	public UserRegistration(int userRegistrationId) {
		this.userRegistrationId = userRegistrationId;
	}

	public UserRegistration(int userRegistrationId, String userName,
			String password, Date startDate, Date expiry, String blocked,
			String isAdmin) {
		this.userRegistrationId = userRegistrationId;
		this.userName = userName;
		this.password = password;
		this.startDate = startDate;
		this.expiry = expiry;
		this.blocked = blocked;
		this.isAdmin = isAdmin;
	}

	@Id
	@Column(name = "USER_REGISTRATION_ID", unique = true, nullable = false)
	public int getUserRegistrationId() {
		return this.userRegistrationId;
	}

	public void setUserRegistrationId(int userRegistrationId) {
		this.userRegistrationId = userRegistrationId;
	}

	@Column(name = "USER_NAME", length = 60)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "PASSWORD", length = 60)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "START_DATE", length = 10)
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "EXPIRY", length = 10)
	public Date getExpiry() {
		return this.expiry;
	}

	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}

	@Column(name = "BLOCKED", length = 10)
	public String getBlocked() {
		return this.blocked;
	}

	public void setBlocked(String blocked) {
		this.blocked = blocked;
	}

	@Column(name = "IS_ADMIN", length = 10)
	public String getIsAdmin() {
		return this.isAdmin;
	}

	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}

}
