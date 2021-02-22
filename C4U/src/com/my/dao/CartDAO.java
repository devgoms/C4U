package com.my.dao;

import java.util.List;

import com.my.exception.AddException;
import com.my.exception.DeleteException;
import com.my.exception.FindException;
import com.my.vo.Cart;
import com.my.vo.Lesson;

public interface CartDAO {
	/**
	 * 마이페이지 - 내가 좋아한 강좌의 전체 강좌 리스트를 불러온다.
	 * @param studentId 마이페이지에 진입한 유저
	 * @return List<Lesson> 좋아한 강좌 리스트
	 * @throws FindException 좋아한 강좌가 없을 경우에 예외 발생
	 */
	public List<Lesson> selectById(int studentId) throws FindException;
	/**
	 * 유저가 프로젝트에 좋아요를 누르면, 마이페이지 - 내가 좋아한 강좌에 프로젝트가 추가된다.
	 * @param cart 좋아요
	 * @throws AddException 이미 좋아요를 누른 강좌를 다시 누를 경우 예외 발생 
	 */
	public void insert(Cart cart) throws AddException;
	/**
	 * 좋아요를 누른 프로젝트를 취소한다. 
	 * @param lessonId 좋아요를 누른 프로젝트의 id 
	 * @return Cart 좋아요를 누른 객체 - 학생, 프로젝트 정보 반환
	 * @throws DeleteException 좋아요를 누르지 않은 강좌를 좋아요 취소할 경우 예외 발생
	 */
	public Cart delete(Cart cart) throws DeleteException;
}
