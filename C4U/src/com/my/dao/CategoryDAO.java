package com.my.dao;

import java.util.List;

import com.my.exception.FindException;
import com.my.vo.Category;
import com.my.vo.Lesson;

public interface CategoryDAO {
	/**<pre>-카테고리 전체 조회-
	 * 저장소의 모든 카테고리를 반환한다</pre>
	 * @return List<Category> 카테고리의 모든객체
	 * @throws FindException 카테고리가 없으면 예외가 발생한다
	 */
	public abstract List<Category> selectAll() throws FindException;
	
	/**<pre>-카테고리 아이디로 검색-
	 * 저장소의 모든 강좌를 반환한다</pre>
	 * @param categoryId 카테고리 아이디
	 * @return List<Lesson> 강좌의 모든객체
	 * @throws FindException 카테고리 아이디에 해당하는 강좌가 없으면 예외가 발생한다
	 */
	public abstract List<Lesson> selectById(int categoryId) throws FindException;
}