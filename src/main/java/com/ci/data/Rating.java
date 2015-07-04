package com.ci.data;
 
 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CiRating  
 */
@Entity
@Table(name = "CI_RATING", catalog = "CI_DB")
public class Rating implements java.io.Serializable {

	private int ratingId;
	private Integer hygiene;
	private Integer taste;
	private Integer freshness;
	private Integer delivery;

	public Rating() {
	}

	public Rating(int ratingId) {
		this.ratingId = ratingId;
	}

	public Rating(int ratingId, Integer hygiene, Integer taste,
			Integer freshness, Integer delivery) {
		this.ratingId = ratingId;
		this.hygiene = hygiene;
		this.taste = taste;
		this.freshness = freshness;
		this.delivery = delivery;
	}

	@Id
	@Column(name = "RATING_ID", unique = true, nullable = false)
	public int getRatingId() {
		return this.ratingId;
	}

	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}

	@Column(name = "HYGIENE")
	public Integer getHygiene() {
		return this.hygiene;
	}

	public void setHygiene(Integer hygiene) {
		this.hygiene = hygiene;
	}

	@Column(name = "TASTE")
	public Integer getTaste() {
		return this.taste;
	}

	public void setTaste(Integer taste) {
		this.taste = taste;
	}

	@Column(name = "FRESHNESS")
	public Integer getFreshness() {
		return this.freshness;
	}

	public void setFreshness(Integer freshness) {
		this.freshness = freshness;
	}

	@Column(name = "DELIVERY")
	public Integer getDelivery() {
		return this.delivery;
	}

	public void setDelivery(Integer delivery) {
		this.delivery = delivery;
	}

}
