package com.ci.data;
 
 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CiFame  
 */
@Entity
@Table(name = "CI_FAME", catalog = "CI_DB")
public class Fame implements java.io.Serializable {

	private int fameId;
	private String quotient;
	private Integer points;

	public Fame() {
	}

	public Fame(int fameId) {
		this.fameId = fameId;
	}

	public Fame(int fameId, String quotient, Integer points) {
		this.fameId = fameId;
		this.quotient = quotient;
		this.points = points;
	}

	@Id
	@Column(name = "FAME_ID", unique = true, nullable = false)
	public int getFameId() {
		return this.fameId;
	}

	public void setFameId(int fameId) {
		this.fameId = fameId;
	}

	@Column(name = "QUOTIENT", length = 100)
	public String getQuotient() {
		return this.quotient;
	}

	public void setQuotient(String quotient) {
		this.quotient = quotient;
	}

	@Column(name = "POINTS")
	public Integer getPoints() {
		return this.points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

}
