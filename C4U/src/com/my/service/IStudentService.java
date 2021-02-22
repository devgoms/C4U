package com.my.service;

import com.my.exception.AddException;
import com.my.exception.FindException;
import com.my.exception.ModifyException;
import com.my.vo.Student;

public interface IStudentService {
	
	Student findById(int id) throws FindException ;

	void add(Student s) throws AddException;
	
	Student modify(Student s) throws ModifyException;
	
	Student login(String studentEmail, String studentPwd) throws FindException;
}
