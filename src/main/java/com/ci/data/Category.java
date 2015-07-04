package com.ci.data;
 
 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CiCategory  
 */
@Entity
@Table(name = "CI_CATEGORY", catalog = "CI_DB")
public class Category implements java.io.Serializable {

	private int categoryId;
	private String category;

	public Category() {
	}

	public Category(int categoryId) {
		this.categoryId = categoryId;
	}

	public Category(int categoryId, String category) {
		this.categoryId = categoryId;
		this.category = category;
	}

	@Id
	@Column(name = "CATEGORY_ID", unique = true, nullable = false)
	public int getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	@Column(name = "CATEGORY", length = 100)
	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
