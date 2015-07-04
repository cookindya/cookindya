package com.ci.data;
 
 

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CiCoupon  
 */
@Entity
@Table(name = "CI_COUPON", catalog = "CI_DB")
public class Coupon implements java.io.Serializable {

	private int couponId;
	private String couponCode;
	private Date startDate;
	private Date endDate;
	private Integer offerId;

	public Coupon() {
	}

	public Coupon(int couponId) {
		this.couponId = couponId;
	}

	public Coupon(int couponId, String couponCode, Date startDate,
			Date endDate, Integer offerId) {
		this.couponId = couponId;
		this.couponCode = couponCode;
		this.startDate = startDate;
		this.endDate = endDate;
		this.offerId = offerId;
	}

	@Id
	@Column(name = "COUPON_ID", unique = true, nullable = false)
	public int getCouponId() {
		return this.couponId;
	}

	public void setCouponId(int couponId) {
		this.couponId = couponId;
	}

	@Column(name = "COUPON_CODE", length = 20)
	public String getCouponCode() {
		return this.couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
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
	@Column(name = "END_DATE", length = 10)
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Column(name = "OFFER_ID")
	public Integer getOfferId() {
		return this.offerId;
	}

	public void setOfferId(Integer offerId) {
		this.offerId = offerId;
	}

}
