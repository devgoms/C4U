package com.my.vo;

public class LPS {
	private int LPSId;
	private	Lesson lesson;
	private Student student;
	
	
	public LPS() {
		super();
		// TODO Auto-generated constructor stub
	}


	public LPS(int lPSId, Lesson lesson, Student student) {
		super();
		LPSId = lPSId;
		this.lesson = lesson;
		this.student = student;
	}


	public int getLPSId() {
		return LPSId;
	}


	public void setLPSId(int lPSId) {
		LPSId = lPSId;
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
		return "LPS [LPSId=" + LPSId + ", lesson=" + lesson + ", student=" + student + "]";
	}
	
	
}
