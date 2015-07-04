package com.ci.data;
 
 

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CiDelivery  
 */
@Entity
@Table(name = "CI_DELIVERY", catalog = "CI_DB")
public class Delivery implements java.io.Serializable {

	private int deliveryId;
	private String deliveredBy;
	private Date deliveredOn;
	private Integer orderId;

	public Delivery() {
	}

	public Delivery(int deliveryId) {
		this.deliveryId = deliveryId;
	}

	public Delivery(int deliveryId, String deliveredBy, Date deliveredOn,
			Integer orderId) {
		this.deliveryId = deliveryId;
		this.deliveredBy = deliveredBy;
		this.deliveredOn = deliveredOn;
		this.orderId = orderId;
	}

	@Id
	@Column(name = "DELIVERY_ID", unique = true, nullable = false)
	public int getDeliveryId() {
		return this.deliveryId;
	}

	public void setDeliveryId(int deliveryId) {
		this.deliveryId = deliveryId;
	}

	@Column(name = "DELIVERED_BY", length = 200)
	public String getDeliveredBy() {
		return this.deliveredBy;
	}

	public void setDeliveredBy(String deliveredBy) {
		this.deliveredBy = deliveredBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DELIVERED_ON", length = 10)
	public Date getDeliveredOn() {
		return this.deliveredOn;
	}

	public void setDeliveredOn(Date deliveredOn) {
		this.deliveredOn = deliveredOn;
	}

	@Column(name = "ORDER_ID")
	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

}
