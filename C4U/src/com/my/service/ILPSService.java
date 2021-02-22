package com.my.service;

import java.util.List;

import com.my.exception.AddException;
import com.my.exception.FindException;
import com.my.vo.LPS;
import com.my.vo.Lesson;


public interface ILPSService {
	
	void add(LPS lps) throws AddException;
	
	List<Lesson> findByStudentId(int studentId) throws FindException;

}
