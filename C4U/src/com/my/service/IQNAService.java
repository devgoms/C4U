package com.my.service;

import java.util.List;

import com.my.exception.AddException;
import com.my.exception.FindException;
import com.my.vo.QNA;

public interface IQNAService {
	
	List<QNA> findAll() throws FindException;
	
	List<QNA> findByName(String qnaName) throws FindException;
	
	QNA findById(int qnaId) throws FindException;
	
	void add(QNA qna) throws AddException;
}
