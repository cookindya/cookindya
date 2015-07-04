package com.ci.data;
 
 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CiOrder  
 */
@Entity
@Table(name = "CI_ORDER", catalog = "CI_DB")
public class Order implements java.io.Serializable {

	private int orderId;
	private Integer orderedRecipe;
	private Integer orderedBy;
	private Integer sellerId;
	private Integer billId;
	private Integer couponId;
	private String requestDesc;

	public Order() {
	}

	public Order(int orderId) {
		this.orderId = orderId;
	}

	public Order(int orderId, Integer orderedRecipe, Integer orderedBy,
			Integer sellerId, Integer billId, Integer couponId,
			String requestDesc) {
		this.orderId = orderId;
		this.orderedRecipe = orderedRecipe;
		this.orderedBy = orderedBy;
		this.sellerId = sellerId;
		this.billId = billId;
		this.couponId = couponId;
		this.requestDesc = requestDesc;
	}

	@Id
	@Column(name = "ORDER_ID", unique = true, nullable = false)
	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	@Column(name = "ORDERED_RECIPE")
	public Integer getOrderedRecipe() {
		return this.orderedRecipe;
	}

	public void setOrderedRecipe(Integer orderedRecipe) {
		this.orderedRecipe = orderedRecipe;
	}

	@Column(name = "ORDERED_BY")
	public Integer getOrderedBy() {
		return this.orderedBy;
	}

	public void setOrderedBy(Integer orderedBy) {
		this.orderedBy = orderedBy;
	}

	@Column(name = "SELLER_ID")
	public Integer getSellerId() {
		return this.sellerId;
	}

	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

	@Column(name = "BILL_ID")
	public Integer getBillId() {
		return this.billId;
	}

	public void setBillId(Integer billId) {
		this.billId = billId;
	}

	@Column(name = "COUPON_ID")
	public Integer getCouponId() {
		return this.couponId;
	}

	public void setCouponId(Integer couponId) {
		this.couponId = couponId;
	}

	@Column(name = "REQUEST_DESC", length = 200)
	public String getRequestDesc() {
		return this.requestDesc;
	}

	public void setRequestDesc(String requestDesc) {
		this.requestDesc = requestDesc;
	}

}
