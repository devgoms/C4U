package com.my.dao;

import java.util.List;

import com.my.exception.AddException;
import com.my.exception.FindException;
import com.my.exception.ModifyException;
import com.my.vo.Student;

public interface StudentDAO {

	   /**아이디로 학생 조회
	    * 저장소의 아이디에 해당학생을 반환한다
	    * @param id 아이디
	    * @return 학생객체
	    * @throws FindException 아이디에 해당학생이 없으면 발생한다
	    */
	   public abstract Student selectById(String id) 
	         throws FindException;

	   /**회원가입시 학생 추가
	    * 저장소에 학생정보를 저장한다
	    * @param s 학생 객체
	    * @throws AddException 아이디가 이미 존재하는 경우,
	    *                      저장소가 꽉찬경우 발생한다                 
	    */
	   public abstract void insert(Student s) throws AddException;
	   
	   /**회원 정보 수정
	    * 학생정보를 수정한다. 단, 아이디는 수정할 수 없다
	    * @param s  변경될 내용이 담겨있는 학생객체
	    * @return   변경된 학생객체
	    * @throws  ModifyException 수정실패시 예외발생한다
	    */
	   public abstract Student update(Student s) throws ModifyException;
}