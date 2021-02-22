package com.my.vo;

import java.util.List;

public class Category {
	private int categoryId;
	private String categoryName;
	private int parentCategoryId;
	private List<Lesson> lesson;
	public Category(int categoryId, String categoryName, int parentCategoryId) {
		this(categoryId, categoryName, parentCategoryId, null);
	}
	public Category(int categoryId, String categoryName, int parentCategoryId, List<Lesson> lesson) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.parentCategoryId = parentCategoryId;
		this.lesson = lesson;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public int getParentCategoryId() {
		return parentCategoryId;
	}
	public void setParentCategoryId(int parentCategoryId) {
		this.parentCategoryId = parentCategoryId;
	}
	public List<Lesson> getLesson() {
		return lesson;
	}
	public void setLesson(List<Lesson> lesson) {
		this.lesson = lesson;
	}
	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", parentCategoryId="
				+ parentCategoryId + "]";
	}
}
