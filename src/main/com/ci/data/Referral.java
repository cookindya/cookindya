package com.ci.data;
 
 

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CiReferral  
 */
@Entity
@Table(name = "CI_REFERRAL", catalog = "CI_DB")
public class Referral implements java.io.Serializable {

	private int referralId;
	private Integer referredBy;
	private Date referredOn;

	public Referral() {
	}

	public Referral(int referralId) {
		this.referralId = referralId;
	}

	public Referral(int referralId, Integer referredBy, Date referredOn) {
		this.referralId = referralId;
		this.referredBy = referredBy;
		this.referredOn = referredOn;
	}

	@Id
	@Column(name = "REFERRAL_ID", unique = true, nullable = false)
	public int getReferralId() {
		return this.referralId;
	}

	public void setReferralId(int referralId) {
		this.referralId = referralId;
	}

	@Column(name = "REFERRED_BY")
	public Integer getReferredBy() {
		return this.referredBy;
	}

	public void setReferredBy(Integer referredBy) {
		this.referredBy = referredBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "REFERRED_ON", length = 10)
	public Date getReferredOn() {
		return this.referredOn;
	}

	public void setReferredOn(Date referredOn) {
		this.referredOn = referredOn;
	}

}
