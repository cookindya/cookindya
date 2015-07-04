package com.ci.data;
 
 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CiAddress  
 */
@Entity
@Table(name = "CI_ADDRESS", catalog = "CI_DB")
public class Address implements java.io.Serializable {

	private int addressId;
	private String billing;
	private String shippingAddr1;
	private String shippingAddr2;
	private String shippingAddr3;
	private String shippingAddr4;
	private String shippingAddr5;
	private String shippingAddr6;
	private String shippingAddr7;
	private String shippingAddr8;
	private String shippingAddr9;
	private String shippingAddr10;

	public Address() {
	}

	public Address(int addressId) {
		this.addressId = addressId;
	}

	public Address(int addressId, String billing, String shippingAddr1,
			String shippingAddr2, String shippingAddr3, String shippingAddr4,
			String shippingAddr5, String shippingAddr6, String shippingAddr7,
			String shippingAddr8, String shippingAddr9, String shippingAddr10) {
		this.addressId = addressId;
		this.billing = billing;
		this.shippingAddr1 = shippingAddr1;
		this.shippingAddr2 = shippingAddr2;
		this.shippingAddr3 = shippingAddr3;
		this.shippingAddr4 = shippingAddr4;
		this.shippingAddr5 = shippingAddr5;
		this.shippingAddr6 = shippingAddr6;
		this.shippingAddr7 = shippingAddr7;
		this.shippingAddr8 = shippingAddr8;
		this.shippingAddr9 = shippingAddr9;
		this.shippingAddr10 = shippingAddr10;
	}

	@Id
	@Column(name = "ADDRESS_ID", unique = true, nullable = false)
	public int getAddressId() {
		return this.addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	@Column(name = "BILLING", length = 200)
	public String getBilling() {
		return this.billing;
	}

	public void setBilling(String billing) {
		this.billing = billing;
	}

	@Column(name = "SHIPPING_ADDR1", length = 200)
	public String getShippingAddr1() {
		return this.shippingAddr1;
	}

	public void setShippingAddr1(String shippingAddr1) {
		this.shippingAddr1 = shippingAddr1;
	}

	@Column(name = "SHIPPING_ADDR2", length = 200)
	public String getShippingAddr2() {
		return this.shippingAddr2;
	}

	public void setShippingAddr2(String shippingAddr2) {
		this.shippingAddr2 = shippingAddr2;
	}

	@Column(name = "SHIPPING_ADDR3", length = 200)
	public String getShippingAddr3() {
		return this.shippingAddr3;
	}

	public void setShippingAddr3(String shippingAddr3) {
		this.shippingAddr3 = shippingAddr3;
	}

	@Column(name = "SHIPPING_ADDR4", length = 200)
	public String getShippingAddr4() {
		return this.shippingAddr4;
	}

	public void setShippingAddr4(String shippingAddr4) {
		this.shippingAddr4 = shippingAddr4;
	}

	@Column(name = "SHIPPING_ADDR5", length = 200)
	public String getShippingAddr5() {
		return this.shippingAddr5;
	}

	public void setShippingAddr5(String shippingAddr5) {
		this.shippingAddr5 = shippingAddr5;
	}

	@Column(name = "SHIPPING_ADDR6", length = 200)
	public String getShippingAddr6() {
		return this.shippingAddr6;
	}

	public void setShippingAddr6(String shippingAddr6) {
		this.shippingAddr6 = shippingAddr6;
	}

	@Column(name = "SHIPPING_ADDR7", length = 200)
	public String getShippingAddr7() {
		return this.shippingAddr7;
	}

	public void setShippingAddr7(String shippingAddr7) {
		this.shippingAddr7 = shippingAddr7;
	}

	@Column(name = "SHIPPING_ADDR8", length = 200)
	public String getShippingAddr8() {
		return this.shippingAddr8;
	}

	public void setShippingAddr8(String shippingAddr8) {
		this.shippingAddr8 = shippingAddr8;
	}

	@Column(name = "SHIPPING_ADDR9", length = 200)
	public String getShippingAddr9() {
		return this.shippingAddr9;
	}

	public void setShippingAddr9(String shippingAddr9) {
		this.shippingAddr9 = shippingAddr9;
	}

	@Column(name = "SHIPPING_ADDR10", length = 200)
	public String getShippingAddr10() {
		return this.shippingAddr10;
	}

	public void setShippingAddr10(String shippingAddr10) {
		this.shippingAddr10 = shippingAddr10;
	}

}
