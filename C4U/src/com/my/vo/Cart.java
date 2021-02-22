package com.my.vo;

public class Cart {
	private int cartId;
	private Lesson lesson;
	private Student student;
	
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(int cartId, Lesson lesson, Student student) {
		super();
		this.cartId = cartId;
		this.lesson = lesson;
		this.student = student;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public Lesson getLesson() {
		return lesson;
	}

	public void setLesson(Lesson lesson) {
		this.lesson = lesson;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", lesson=" + lesson + ", student=" + student + "]";
	}
	
	
	
}
