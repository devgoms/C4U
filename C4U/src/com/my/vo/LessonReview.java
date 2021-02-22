package com.my.vo;

import java.util.Date;

public class LessonReview {
	private int reviewId;
	private String reviewContent;
	private Date reviewDate;
	private int recommend;
	private LPS lps;

	public LessonReview(int reviewId, String reviewContent, Date reviewDate, int recommend) {
		this(reviewId, reviewContent, reviewDate, recommend, null);
	}

	public LessonReview(int reviewId, String reviewContent, Date reviewDate, int recommend, LPS lps) {
		super();
		this.reviewId = reviewId;
		this.reviewContent = reviewContent;
		this.reviewDate = reviewDate;
		this.recommend = recommend;
		this.lps = lps;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public String getReviewContent() {
		return reviewContent;
	}

	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}

	public Date getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(Date reviewDtate) {
		this.reviewDate = reviewDtate;
	}

	public int getRecommend() {
		return recommend;
	}

	public void setRecommend(int recommend) {
		this.recommend = recommend;
	}

	public LPS getLps() {
		return lps;
	}

	public void setLps(LPS lps) {
		this.lps = lps;
	}

	@Override
	public String toString() {
		return "LessonReview [reviewId=" + reviewId + ", reviewContent=" + reviewContent + ", reviewDate="
				+ reviewDate + ", recommend=" + recommend + "]";
	}		
}
