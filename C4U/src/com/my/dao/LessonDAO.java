package com.my.dao;

import java.util.List;

import com.my.exception.FindException;
import com.my.vo.Lesson;

public interface LessonDAO {
	
	/**<pre>-강좌 전체 조회-
	 * 저장소의 모든 강좌를 반환한다</pre>
	 * @return List<Lesson> 저장소의 모든 강좌
	 * @throws FindException 강좌가 하나도 없으면 예외가 발생한다
	 */
	public List<Lesson> selectAll() throws FindException;
	
	/**<pre>-특정 강좌 조회-
	 * 저장소의 강좌아이디에 해당하는 강좌를 반환한다</pre>
	 * @param lessonId 강좌 아이디
	 * @return Lesson 강좌객체
	 * @throws FindException 강좌아이디에 해당하는 강좌가 없으면 예외가 발생한다
	 */
	public Lesson selectById(int lessonId) throws FindException;
	
	/**<pre>-다양한 이름으로 조회-
	 * 카테고리, 쌤, 강좌이름에  맞는 강좌를 반환한다</pre>
	 * @param Name 카테고리, 쌤, 강좌 이름
	 * @return Lesson 강좌객체
	 * @throws FindException 카테고리, 쌤, 강좌 이름에 해당하는 강좌가 없으면 예외가 발생한다
	 */
	public Lesson selectByUnion(String Name) throws FindException;
}