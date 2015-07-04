package com.ci.data;
 
 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CiUserInfo  
 */
@Entity
@Table(name = "CI_USER_INFO", catalog = "CI_DB")
public class UserInfo implements java.io.Serializable {

	private int userInfoId;
	private String userName;
	private Integer userRegId;
	private Integer userAddress;
	private Integer phNumPrimary;
	private Integer phNumSecondary;
	private Integer feedbackId;
	private Integer fameId;
	private Integer kitchenId;
	private String isSeller;
	private String isMobileAppUser;
	private String preferredShipping;

	public UserInfo() {
	}

	public UserInfo(int userInfoId) {
		this.userInfoId = userInfoId;
	}

	public UserInfo(int userInfoId, String userName, Integer userRegId,
			Integer userAddress, Integer phNumPrimary, Integer phNumSecondary,
			Integer feedbackId, Integer fameId, Integer kitchenId,
			String isSeller, String isMobileAppUser, String preferredShipping) {
		this.userInfoId = userInfoId;
		this.userName = userName;
		this.userRegId = userRegId;
		this.userAddress = userAddress;
		this.phNumPrimary = phNumPrimary;
		this.phNumSecondary = phNumSecondary;
		this.feedbackId = feedbackId;
		this.fameId = fameId;
		this.kitchenId = kitchenId;
		this.isSeller = isSeller;
		this.isMobileAppUser = isMobileAppUser;
		this.preferredShipping = preferredShipping;
	}

	@Id
	@Column(name = "USER_INFO_ID", unique = true, nullable = false)
	public int getUserInfoId() {
		return this.userInfoId;
	}

	public void setUserInfoId(int userInfoId) {
		this.userInfoId = userInfoId;
	}

	@Column(name = "USER_NAME", length = 100)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "USER_REG_ID")
	public Integer getUserRegId() {
		return this.userRegId;
	}

	public void setUserRegId(Integer userRegId) {
		this.userRegId = userRegId;
	}

	@Column(name = "USER_ADDRESS")
	public Integer getUserAddress() {
		return this.userAddress;
	}

	public void setUserAddress(Integer userAddress) {
		this.userAddress = userAddress;
	}

	@Column(name = "PH_NUM_PRIMARY")
	public Integer getPhNumPrimary() {
		return this.phNumPrimary;
	}

	public void setPhNumPrimary(Integer phNumPrimary) {
		this.phNumPrimary = phNumPrimary;
	}

	@Column(name = "PH_NUM_SECONDARY")
	public Integer getPhNumSecondary() {
		return this.phNumSecondary;
	}

	public void setPhNumSecondary(Integer phNumSecondary) {
		this.phNumSecondary = phNumSecondary;
	}

	@Column(name = "FEEDBACK_ID")
	public Integer getFeedbackId() {
		return this.feedbackId;
	}

	public void setFeedbackId(Integer feedbackId) {
		this.feedbackId = feedbackId;
	}

	@Column(name = "FAME_ID")
	public Integer getFameId() {
		return this.fameId;
	}

	public void setFameId(Integer fameId) {
		this.fameId = fameId;
	}

	@Column(name = "KITCHEN_ID")
	public Integer getKitchenId() {
		return this.kitchenId;
	}

	public void setKitchenId(Integer kitchenId) {
		this.kitchenId = kitchenId;
	}

	@Column(name = "IS_SELLER", length = 10)
	public String getIsSeller() {
		return this.isSeller;
	}

	public void setIsSeller(String isSeller) {
		this.isSeller = isSeller;
	}

	@Column(name = "IS_MOBILE_APP_USER", length = 10)
	public String getIsMobileAppUser() {
		return this.isMobileAppUser;
	}

	public void setIsMobileAppUser(String isMobileAppUser) {
		this.isMobileAppUser = isMobileAppUser;
	}

	@Column(name = "PREFERRED_SHIPPING", length = 220)
	public String getPreferredShipping() {
		return this.preferredShipping;
	}

	public void setPreferredShipping(String preferredShipping) {
		this.preferredShipping = preferredShipping;
	}

}
