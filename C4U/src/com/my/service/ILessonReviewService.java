package com.my.service;

import java.util.List;

import com.my.exception.AddException;
import com.my.exception.FindException;
import com.my.vo.LessonReview;

public interface ILessonReviewService {
	List<LessonReview> findAll() throws FindException;
	
	void add(LessonReview review) throws AddException;
	
}
