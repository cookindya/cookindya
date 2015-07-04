package com.ci.data;
 
 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CiOffers  
 */
@Entity
@Table(name = "CI_OFFERS", catalog = "CI_DB")
public class Offers implements java.io.Serializable {

	private int offerId;
	private String offerCode;
	private String category;
	private Integer percentage;
	private Integer cash;
	private Integer recipeId;

	public Offers() {
	}

	public Offers(int offerId) {
		this.offerId = offerId;
	}

	public Offers(int offerId, String offerCode, String category,
			Integer percentage, Integer cash, Integer recipeId) {
		this.offerId = offerId;
		this.offerCode = offerCode;
		this.category = category;
		this.percentage = percentage;
		this.cash = cash;
		this.recipeId = recipeId;
	}

	@Id
	@Column(name = "OFFER_ID", unique = true, nullable = false)
	public int getOfferId() {
		return this.offerId;
	}

	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}

	@Column(name = "OFFER_CODE", length = 30)
	public String getOfferCode() {
		return this.offerCode;
	}

	public void setOfferCode(String offerCode) {
		this.offerCode = offerCode;
	}

	@Column(name = "CATEGORY", length = 30)
	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Column(name = "PERCENTAGE")
	public Integer getPercentage() {
		return this.percentage;
	}

	public void setPercentage(Integer percentage) {
		this.percentage = percentage;
	}

	@Column(name = "CASH")
	public Integer getCash() {
		return this.cash;
	}

	public void setCash(Integer cash) {
		this.cash = cash;
	}

	@Column(name = "RECIPE_ID")
	public Integer getRecipeId() {
		return this.recipeId;
	}

	public void setRecipeId(Integer recipeId) {
		this.recipeId = recipeId;
	}

}
