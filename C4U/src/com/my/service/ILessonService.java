package com.my.service;

import java.util.List;

import com.my.exception.FindException;
import com.my.vo.Lesson;

public interface ILessonService {
	List<Lesson> findAll() throws FindException;
	
	Lesson findById(int id) throws FindException;
	
	Lesson findUnion(String union) throws FindException;
}
