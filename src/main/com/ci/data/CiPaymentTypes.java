package com.ci.data;
 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CiPaymentTypes  
 */
@Entity
@Table(name = "CI_PAYMENT_TYPES", catalog = "CI_DB")
public class CiPaymentTypes implements java.io.Serializable {

	private int paymentTypeId;
	private String thirdParty;
	private String cashOnDelivery;
	private String mealCoupn;

	public CiPaymentTypes() {
	}

	public CiPaymentTypes(int paymentTypeId) {
		this.paymentTypeId = paymentTypeId;
	}

	public CiPaymentTypes(int paymentTypeId, String thirdParty,
			String cashOnDelivery, String mealCoupn) {
		this.paymentTypeId = paymentTypeId;
		this.thirdParty = thirdParty;
		this.cashOnDelivery = cashOnDelivery;
		this.mealCoupn = mealCoupn;
	}

	@Id
	@Column(name = "PAYMENT_TYPE_ID", unique = true, nullable = false)
	public int getPaymentTypeId() {
		return this.paymentTypeId;
	}

	public void setPaymentTypeId(int paymentTypeId) {
		this.paymentTypeId = paymentTypeId;
	}

	@Column(name = "THIRD_PARTY", length = 60)
	public String getThirdParty() {
		return this.thirdParty;
	}

	public void setThirdParty(String thirdParty) {
		this.thirdParty = thirdParty;
	}

	@Column(name = "CASH_ON_DELIVERY", length = 60)
	public String getCashOnDelivery() {
		return this.cashOnDelivery;
	}

	public void setCashOnDelivery(String cashOnDelivery) {
		this.cashOnDelivery = cashOnDelivery;
	}

	@Column(name = "MEAL_COUPN", length = 60)
	public String getMealCoupn() {
		return this.mealCoupn;
	}

	public void setMealCoupn(String mealCoupn) {
		this.mealCoupn = mealCoupn;
	}

}
