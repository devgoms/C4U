package com.my.dao;

import java.util.List;

import com.my.exception.FindException;
import com.my.vo.Notice;

public interface NoticeDAO {
	
	/**
	 **공지사항 전체 조회 계시판**
	 * 
	 * 저장소의 모든 공지사항을 반환한다
	 * @return List<Notice> 저장소의 모든 공지사항
	 * @throws FindException 공지사항이 하나도 없으면 발생한다
	 */
	public List<Notice> selectAll() throws FindException;
	
	/**
	 **공지사항조회**
	 * 
	 * 저장소의 공지글번호에 해당하는 공지사항을 반환한다
	 * @param  NoticeId 공지글번호
	 * @return Notice 공지사항객체
	 * @throws FindException 공지글번호에 해당하는 공지사항이 없으면 발생한다
	 */
	public Notice selectById(int NoticeId)  throws FindException;
	/**
	 **공지사항조회**
	 * 
	 * 저장소의 공지글 제목 일부에 해당하는 공지사항을 반환한다
	 * @param  NoticeName 공지글제목 일부
	 * @return Notice 공지사항객체
	 * @throws FindException 공지글 제목 일부에 해당하는 공지사항이 없으면 발생한다
	 */
	public Notice selectByName(String NoticeName)  throws FindException;
}