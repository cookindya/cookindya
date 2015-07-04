package com.ci.data;
 
 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CiBill  
 */
@Entity
@Table(name = "CI_BILL", catalog = "CI_DB")
public class Bill implements java.io.Serializable {

	private int billId;
	private Integer quantity;
	private Integer discount;
	private Integer tax;
	private Integer addressId;
	private Integer totalPayable;
	private Integer paymentId;

	public Bill() {
	}

	public Bill(int billId) {
		this.billId = billId;
	}

	public Bill(int billId, Integer quantity, Integer discount, Integer tax,
			Integer addressId, Integer totalPayable, Integer paymentId) {
		this.billId = billId;
		this.quantity = quantity;
		this.discount = discount;
		this.tax = tax;
		this.addressId = addressId;
		this.totalPayable = totalPayable;
		this.paymentId = paymentId;
	}

	@Id
	@Column(name = "BILL_ID", unique = true, nullable = false)
	public int getBillId() {
		return this.billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	@Column(name = "QUANTITY")
	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Column(name = "DISCOUNT")
	public Integer getDiscount() {
		return this.discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	@Column(name = "TAX")
	public Integer getTax() {
		return this.tax;
	}

	public void setTax(Integer tax) {
		this.tax = tax;
	}

	@Column(name = "ADDRESS_ID")
	public Integer getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	@Column(name = "TOTAL_PAYABLE")
	public Integer getTotalPayable() {
		return this.totalPayable;
	}

	public void setTotalPayable(Integer totalPayable) {
		this.totalPayable = totalPayable;
	}

	@Column(name = "PAYMENT_ID")
	public Integer getPaymentId() {
		return this.paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

}
