package com.my.service;

import java.util.List;

import com.my.dao.LessonDAO;
import com.my.dao.LessonDAOOracle;
import com.my.exception.FindException;
import com.my.vo.Lesson;

public class LessonService implements ILessonService {
	LessonDAO dao = new LessonDAOOracle();

	@Override
	public List<Lesson> findAll() throws FindException {
		List<Lesson> lAll = dao.selectAll();
		return lAll;
	}

	@Override
	public Lesson findById(int id) throws FindException {
		return null;
	}

	@Override
	public Lesson findUnion(String union) throws FindException {
		return null;
	}

}
