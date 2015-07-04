package com.ci.data;
 
 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CiDiet  
 */
@Entity
@Table(name = "CI_DIET", catalog = "CI_DB")
public class Diet implements java.io.Serializable {

	private int dietId;
	private String description;

	public Diet() {
	}

	public Diet(int dietId) {
		this.dietId = dietId;
	}

	public Diet(int dietId, String description) {
		this.dietId = dietId;
		this.description = description;
	}

	@Id
	@Column(name = "DIET_ID", unique = true, nullable = false)
	public int getDietId() {
		return this.dietId;
	}

	public void setDietId(int dietId) {
		this.dietId = dietId;
	}

	@Column(name = "DESCRIPTION", length = 200)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
