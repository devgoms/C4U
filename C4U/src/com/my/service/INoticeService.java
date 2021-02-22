package com.my.service;

import java.util.List;

import com.my.exception.FindException;
import com.my.vo.Notice;

public interface INoticeService {
	
	List<Notice> findAll() throws FindException;
	
	Notice findById(int NoticeId)throws FindException;
	
	Notice findtByName(String NoticeName)throws FindException;
}

