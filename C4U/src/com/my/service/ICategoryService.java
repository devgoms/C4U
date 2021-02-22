package com.my.service;

import java.util.List;

import com.my.exception.FindException;
import com.my.vo.Category;
import com.my.vo.Lesson;

public interface ICategoryService {
	
	List<Lesson> findById(int categoryId) throws FindException;
	
	List<Category> findAll() throws FindException;
}
