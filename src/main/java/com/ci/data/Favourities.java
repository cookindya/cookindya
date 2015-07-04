package com.ci.data;
 
 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CiFavourities  
 */
@Entity
@Table(name = "CI_FAVOURITIES", catalog = "CI_DB")
public class Favourities implements java.io.Serializable {

	private int favouriteId;
	private Integer recipeId;
	private Integer userId;

	public Favourities() {
	}

	public Favourities(int favouriteId) {
		this.favouriteId = favouriteId;
	}

	public Favourities(int favouriteId, Integer recipeId, Integer userId) {
		this.favouriteId = favouriteId;
		this.recipeId = recipeId;
		this.userId = userId;
	}

	@Id
	@Column(name = "FAVOURITE_ID", unique = true, nullable = false)
	public int getFavouriteId() {
		return this.favouriteId;
	}

	public void setFavouriteId(int favouriteId) {
		this.favouriteId = favouriteId;
	}

	@Column(name = "RECIPE_ID")
	public Integer getRecipeId() {
		return this.recipeId;
	}

	public void setRecipeId(Integer recipeId) {
		this.recipeId = recipeId;
	}

	@Column(name = "USER_ID")
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}
