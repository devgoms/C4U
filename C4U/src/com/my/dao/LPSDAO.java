package com.my.dao;

import java.util.List;

import com.my.exception.AddException;
import com.my.exception.FindException;
import com.my.vo.LPS;
import com.my.vo.Lesson;

public interface LPSDAO {
	/**
	 * 마이페이지 내가 수강한 강좌 리스트 조회
	 * @param studentId 로그인한 학생 계정
	 * @return List<Lesson> 수강한 강좌 리스트
	 * @throws FindException 수강한 강좌가 없으면 예외 발생
	 */
	public List<Lesson> selectByStudentId(int studentId) throws FindException;
	/**
	 * 마이페이지 - 내가 수강한 강좌 추가
	 * @param lps 강좌를 수강한 학생 1 명 객체 추가
	 * @throws AddException 학생 1명이 동일 강좌 2개를 수강할 경우 예외 발생
	 */
	public void insert(LPS lps) throws AddException;
}