package com.my.vo;

import java.util.Date;
import java.util.List;

public class Lesson {
	private int lessonId;
	private Student teacher;
	private String lessonName;
	private int lessonTargetFee;
	private int lessonTotalFee;
	private int lessonParticipant;
	private int lessonStatus;
	private int lessonFee;
	private String lessonDescription;
	private int lessonCategory;
	private Date lessonCreate;
	private Date lessonEnd;
	private Date lessonStart;
	private int lessonRecommend;
	private List<LPS> lps;
	int targetPercent;
	int endSys;
	

	public Lesson(int lessonId, Student teacher, String lessonName, int lessonTargetFee, int lessonTotalFee,
			int lessonParticipant, int lessonStatus, int lessonFee, String lessonDescription, int lessonCategory,
			Date lessonCreate, Date lessonEnd, Date lessonStart,int lessonRecommend) {
		
		this(lessonId, teacher, lessonName, lessonTargetFee, lessonTotalFee,
			lessonParticipant, lessonStatus, lessonFee,lessonDescription, 
			lessonCategory, lessonCreate, lessonEnd, lessonStart, lessonRecommend,null);
	}

	public Lesson(int lessonId, Student teacher, String lessonName, int lessonTargetFee, int lessonTotalFee,
			int lessonParticipant, int lessonStatus, int lessonFee, String lessonDescription, int lessonCategory,
			Date lessonCreate, Date lessonEnd, Date lessonStart, int lessonRecommend,List<LPS> lps) {
		super();
		this.lessonId = lessonId;
		this.teacher = teacher;
		this.lessonName = lessonName;
		this.lessonTargetFee = lessonTargetFee;
		this.lessonTotalFee = lessonTotalFee;
		this.lessonParticipant = lessonParticipant;
		this.lessonStatus = lessonStatus;
		this.lessonFee = lessonFee;
		this.lessonDescription = lessonDescription;
		this.lessonCategory = lessonCategory;
		this.lessonCreate = lessonCreate;
		this.lessonEnd = lessonEnd;
		this.lessonStart = lessonStart;
		this.lps = lps;
		this.lessonRecommend = lessonRecommend;
	}

	public Lesson() {
		super();
	}

	public Lesson(String lessonName, String lessonDescription, int lessonTotalFee, int targetPercent, int endSys) {
		this.lessonName = lessonName;
		this.lessonDescription = lessonDescription;
		this.lessonTotalFee = lessonTotalFee;
		this.targetPercent = targetPercent;
		this.endSys = endSys;
	}

	public int getTargetPercent() {
		return targetPercent;
	}

	public void setTargetPercent(int targetPercent) {
		this.targetPercent = targetPercent;
	}

	public int getEndSys() {
		return endSys;
	}

	public void setEndSys(int endSys) {
		this.endSys = endSys;
	}

	@Override
	public String toString() {
		return "Lesson [lessonId=" + lessonId + ", teacher=" + teacher + ", lessonName=" + lessonName
				+ ", lessonTargetFee=" + lessonTargetFee + ", lessonTotalFee=" + lessonTotalFee + ", lessonParticipant="
				+ lessonParticipant + ", lessonStatus=" + lessonStatus + ", lessonFee=" + lessonFee
				+ ", lessonDescription=" + lessonDescription + ", lessonCategory=" + lessonCategory + ", lessonCreate="
				+ lessonCreate + ", lessonEnd=" + lessonEnd + ", lessonStart=" + lessonStart + ", lessonRecommend="
				+ lessonRecommend + ", lps=" + lps + "]";
	}

	public int getLessonId() {
		return lessonId;
	}

	public void setLessonId(int lessonId) {
		this.lessonId = lessonId;
	}

	public Student getTeacher() {
		return teacher;
	}

	public void setTeacher(Student teacher) {
		this.teacher = teacher;
	}

	public String getLessonName() {
		return lessonName;
	}

	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}

	public int getLessonTargetFee() {
		return lessonTargetFee;
	}

	public void setLessonTargetFee(int lessonTargetFee) {
		this.lessonTargetFee = lessonTargetFee;
	}

	public int getLessonTotalFee() {
		return lessonTotalFee;
	}

	public void setLessonTotalFee(int lessonTotalFee) {
		this.lessonTotalFee = lessonTotalFee;
	}

	public int getLessonParticipant() {
		return lessonParticipant;
	}

	public void setLessonParticipant(int lessonParticipant) {
		this.lessonParticipant = lessonParticipant;
	}

	public int getLessonStatus() {
		return lessonStatus;
	}

	public void setLessonStatus(int lessonStatus) {
		this.lessonStatus = lessonStatus;
	}

	public int getLessonFee() {
		return lessonFee;
	}

	public void setLessonFee(int lessonFee) {
		this.lessonFee = lessonFee;
	}

	public String getLessonDescription() {
		return lessonDescription;
	}

	public void setLessonDescription(String lessonDescription) {
		this.lessonDescription = lessonDescription;
	}

	public int getLessonCategory() {
		return lessonCategory;
	}

	public void setLessonCategory(int lessonCategory) {
		this.lessonCategory = lessonCategory;
	}

	public Date getLessonCreate() {
		return lessonCreate;
	}

	public void setLessonCreate(Date lessonCreate) {
		this.lessonCreate = lessonCreate;
	}

	public Date getLessonEnd() {
		return lessonEnd;
	}

	public void setLessonEnd(Date lessonEnd) {
		this.lessonEnd = lessonEnd;
	}

	public Date getLessonStart() {
		return lessonStart;
	}

	public void setLessonStart(Date lessonStart) {
		this.lessonStart = lessonStart;
	}

	public int getLessonRecommend() {
		return lessonRecommend;
	}

	public void setLessonRecommend(int lessonRecommend) {
		this.lessonRecommend = lessonRecommend;
	}

	public List<LPS> getLps() {
		return lps;
	}

	public void setLps(List<LPS> lps) {
		this.lps = lps;
	}
}