package com.ci.data;
 
 

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CiRecipe  
 */
@Entity
@Table(name = "CI_RECIPE", catalog = "CI_DB")
public class Recipe implements java.io.Serializable {

	private int recipeId;
	private String recipeName;
	private Integer recipePrice;
	private Integer recipeDiet;
	private String recipeIngredients;
	private byte[] recipeImage;
	private Integer recipeAddedBy;
	private Date recipeAddedOn;

	public Recipe() {
	}

	public Recipe(int recipeId) {
		this.recipeId = recipeId;
	}

	public Recipe(int recipeId, String recipeName, Integer recipePrice,
			Integer recipeDiet, String recipeIngredients, byte[] recipeImage,
			Integer recipeAddedBy, Date recipeAddedOn) {
		this.recipeId = recipeId;
		this.recipeName = recipeName;
		this.recipePrice = recipePrice;
		this.recipeDiet = recipeDiet;
		this.recipeIngredients = recipeIngredients;
		this.recipeImage = recipeImage;
		this.recipeAddedBy = recipeAddedBy;
		this.recipeAddedOn = recipeAddedOn;
	}

	@Id
	@Column(name = "RECIPE_ID", unique = true, nullable = false)
	public int getRecipeId() {
		return this.recipeId;
	}

	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
	}

	@Column(name = "RECIPE_NAME", length = 50)
	public String getRecipeName() {
		return this.recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	@Column(name = "RECIPE_PRICE")
	public Integer getRecipePrice() {
		return this.recipePrice;
	}

	public void setRecipePrice(Integer recipePrice) {
		this.recipePrice = recipePrice;
	}

	@Column(name = "RECIPE_DIET")
	public Integer getRecipeDiet() {
		return this.recipeDiet;
	}

	public void setRecipeDiet(Integer recipeDiet) {
		this.recipeDiet = recipeDiet;
	}

	@Column(name = "RECIPE_INGREDIENTS", length = 200)
	public String getRecipeIngredients() {
		return this.recipeIngredients;
	}

	public void setRecipeIngredients(String recipeIngredients) {
		this.recipeIngredients = recipeIngredients;
	}

	@Column(name = "RECIPE_IMAGE")
	public byte[] getRecipeImage() {
		return this.recipeImage;
	}

	public void setRecipeImage(byte[] recipeImage) {
		this.recipeImage = recipeImage;
	}

	@Column(name = "RECIPE_ADDED_BY")
	public Integer getRecipeAddedBy() {
		return this.recipeAddedBy;
	}

	public void setRecipeAddedBy(Integer recipeAddedBy) {
		this.recipeAddedBy = recipeAddedBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "RECIPE_ADDED_ON", length = 10)
	public Date getRecipeAddedOn() {
		return this.recipeAddedOn;
	}

	public void setRecipeAddedOn(Date recipeAddedOn) {
		this.recipeAddedOn = recipeAddedOn;
	}

}
