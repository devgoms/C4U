package com.my.dao;

import java.util.List;

import com.my.exception.AddException;
import com.my.exception.FindException;
import com.my.vo.QNA;

public interface QNADAO {
	
	/**
	 **수강생이  qna 등록**
	 * 
	 * 저장소에 1:1문의하기를 추가한다
	 * @param qna 1:1문의하기객체
	 * @throws AddException 1:1문의하기가 이미 존재하는 경우,
	 *                      저장소가 꽉찬경우 발생한다
	 *                      
	 */
	public abstract void insert(QNA qna) throws AddException; 
		
	/**
	 **1:1문의 전체 조회 계시판**
	 * 
	 * 저장소의 모든 1:1문의를 불러온다
	 * @return List<QNA> 저장소의 모든 1:1문의하기
	 * @throws FindException 1:1문의가 하나도 없으면 발생한다
	 */
	public abstract List<QNA> selectAll() throws FindException;
		
	/**
	 **1:1문의조회**
	 * 
	 * 1:1글번호에 해당하는 1:1문의를  아이디로 불러온다
	 * @param  qnaId 1:1글번호
	 * @return QNA 1:1문의하기객체
	 * @throws FindException 1:1문의가 없으면 없으면 발생한다
	 */
	public abstract QNA selectById(int qnaId) throws FindException;
	
	/**
	 * 1:1 문의 닉네임으로 조회 (검색 기능)
	 * @param name
	 * @return List<QNA> 해당하는 닉네임을 가진 사람이 작성한 QNA 전부 
	 * @throws FindException 1:1 문의가 없으면 예외 발생
	 */
	public abstract List<QNA> selectByName(String name) throws FindException;
}