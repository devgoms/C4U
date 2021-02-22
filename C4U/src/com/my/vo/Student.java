package com.my.vo;

import java.util.List;

public class Student {
	private int studentId;
	private String studentEmail;
	private String studentPwd;
	private String studentName;
	private String studentPhone;
	private int studentStatus;
	public List<LPS> lps;
	
	public Student() {
		super();
	}
	
	public Student(int studentId, String studentEmail) {
		this(studentId, studentEmail, null);	
	}
	
	public Student(int studentId, String studentEmail, String studentPwd) {
		this(studentId, studentEmail, studentPwd, null, null, 0);	
	}
	
	public Student(int studentId, String studentEmail, String studentPwd, String studentName) {
		this(studentId, studentEmail, studentPwd, studentName,null,0);	
	}
	
	public Student(int studentId, String studentEmail, String studentPwd, String studentName, String studentPhone,
			int studentStatus) {
		this(studentId, studentEmail, studentPwd, studentName, studentPhone,studentStatus, null);	
	}
	
	public Student(int studentId, String studentEmail, String studentPwd, String studentName, String studentPhone,
			int studentStatus, List<LPS> lps) {
		super();
		this.studentId = studentId;
		this.studentEmail = studentEmail;
		this.studentPwd = studentPwd;
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentStatus = studentStatus;
		this.lps = lps;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentPwd() {
		return studentPwd;
	}

	public void setStudentPwd(String studentPwd) {
		this.studentPwd = studentPwd;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	public int getStudentStatus() {
		return studentStatus;
	}

	public void setStudentStatus(int studentStatus) {
		this.studentStatus = studentStatus;
	}

	public List<LPS> getLps() {
		return lps;
	}

	public void setLps(List<LPS> lps) {
		this.lps = lps;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentEmail=" + studentEmail + ", studentPwd=" + studentPwd
				+ ", studentName=" + studentName + ", studentPhone=" + studentPhone + ", studentStatus=" + studentStatus
				+ ", lps=" + lps + "]";
	}		
}
