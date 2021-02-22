package com.my.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.my.exception.FindException;
import com.my.sql.MyConnection;
import com.my.vo.LPS;
import com.my.vo.Lesson;
import com.my.vo.Student;

public class LessonDAOOracle implements LessonDAO {

	@Override
	public List<Lesson> selectAll() throws FindException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = MyConnection.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
			throw new FindException(e.getMessage());
		}
		String selectAllSQL = "select *\r\n" + 
				"from lesson\r\n" + 
				"order by lesson_end_date";
		List<Lesson> all = new ArrayList<>();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		try {
			pstmt = con.prepareStatement(selectAllSQL);
			rs = pstmt.executeQuery();
			Calendar enddate = Calendar.getInstance();
			Calendar sysdate = Calendar.getInstance();
			sysdate.setTime(new Date());
			while(rs.next()) {
				String lessonName = rs.getString("lesson_name");
				int lessonTargetFee = rs.getInt("lesson_target_amount");
				int lessonTotalFee = rs.getInt("lesson_total_amount");;
				String lessonDescription = rs.getString("lesson_description");
				Date lessonEnd = rs.getDate("lesson_end_date");
				enddate.setTime(lessonEnd);
				long diffDays = (enddate.getTimeInMillis() - sysdate.getTimeInMillis()) / 1000 / (24*60*60);
				if(diffDays < 0) {
					diffDays = 0;
				}
				Lesson l = new Lesson(lessonName, lessonDescription, lessonTotalFee, lessonTotalFee/lessonTargetFee*100, (int)diffDays);
				all.add(l);
			}
			if(all.size() == 0) {
				throw new FindException("강좌가 하나도 없습니다");
			}
			return all;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new FindException(e.getMessage());
		} finally {
			MyConnection.close(con, pstmt, rs);
		}
	}

	@Override
	public Lesson selectById(int lessonId) throws FindException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lesson selectByUnion(String Name) throws FindException {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[]args) {
		LessonDAOOracle dao = new LessonDAOOracle();
		try {
			List<Lesson> list = dao.selectAll();
			for(Lesson l: list) {
				System.out.println(l.getLessonName() +":"+ l.getLessonDescription() +":"+ l.getLessonTotalFee() +":"+ l.getTargetPercent() +":"+ l.getEndSys());
			}
		} catch (FindException e) {
			e.printStackTrace();
		}
		
		
	}
}
