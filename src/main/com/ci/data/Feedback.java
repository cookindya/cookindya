package com.ci.data;
 
 

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CiFeedback  
 */
@Entity
@Table(name = "CI_FEEDBACK", catalog = "CI_DB")
public class Feedback implements java.io.Serializable {

	private int feedbackId;
	private Integer ratingId;
	private String comment;
	private Integer feedBackBy;
	private Date feedBackOn;
	private Integer recipeId;

	public Feedback() {
	}

	public Feedback(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	public Feedback(int feedbackId, Integer ratingId, String comment,
			Integer feedBackBy, Date feedBackOn, Integer recipeId) {
		this.feedbackId = feedbackId;
		this.ratingId = ratingId;
		this.comment = comment;
		this.feedBackBy = feedBackBy;
		this.feedBackOn = feedBackOn;
		this.recipeId = recipeId;
	}

	@Id
	@Column(name = "FEEDBACK_ID", unique = true, nullable = false)
	public int getFeedbackId() {
		return this.feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	@Column(name = "RATING_ID")
	public Integer getRatingId() {
		return this.ratingId;
	}

	public void setRatingId(Integer ratingId) {
		this.ratingId = ratingId;
	}

	@Column(name = "COMMENT", length = 200)
	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Column(name = "FEED_BACK_BY")
	public Integer getFeedBackBy() {
		return this.feedBackBy;
	}

	public void setFeedBackBy(Integer feedBackBy) {
		this.feedBackBy = feedBackBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "FEED_BACK_ON", length = 10)
	public Date getFeedBackOn() {
		return this.feedBackOn;
	}

	public void setFeedBackOn(Date feedBackOn) {
		this.feedBackOn = feedBackOn;
	}

	@Column(name = "RECIPE_ID")
	public Integer getRecipeId() {
		return this.recipeId;
	}

	public void setRecipeId(Integer recipeId) {
		this.recipeId = recipeId;
	}

}
