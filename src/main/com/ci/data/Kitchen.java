package com.ci.data;
 
 

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CiKitchen  
 */
@Entity
@Table(name = "CI_KITCHEN", catalog = "CI_DB")
public class Kitchen implements java.io.Serializable {

	private int kitchenId;
	private String certified;
	private Date startDate;
	private Date endDate;
	private String certifiedBy;

	public Kitchen() {
	}

	public Kitchen(int kitchenId) {
		this.kitchenId = kitchenId;
	}

	public Kitchen(int kitchenId, String certified, Date startDate,
			Date endDate, String certifiedBy) {
		this.kitchenId = kitchenId;
		this.certified = certified;
		this.startDate = startDate;
		this.endDate = endDate;
		this.certifiedBy = certifiedBy;
	}

	@Id
	@Column(name = "KITCHEN_ID", unique = true, nullable = false)
	public int getKitchenId() {
		return this.kitchenId;
	}

	public void setKitchenId(int kitchenId) {
		this.kitchenId = kitchenId;
	}

	@Column(name = "CERTIFIED", length = 10)
	public String getCertified() {
		return this.certified;
	}

	public void setCertified(String certified) {
		this.certified = certified;
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

	@Column(name = "CERTIFIED_BY", length = 50)
	public String getCertifiedBy() {
		return this.certifiedBy;
	}

	public void setCertifiedBy(String certifiedBy) {
		this.certifiedBy = certifiedBy;
	}

}
