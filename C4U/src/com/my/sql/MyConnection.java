package com.my.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyConnection {
	static { //static 초기화 블럭, 이것이 자바다 static 참고
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("JDBC드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws Exception {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "popcorn";
		String password = "kosta";
		Connection con = DriverManager.getConnection(url, user, password);
		return con;
	}
	
	public static void close (Connection con, Statement stmt, ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		close(con, stmt);
		System.out.println("DB와의 연결해제");
	}
	
	public static void close (Connection con, Statement stmt) {
		if(stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		close(con); //this(con) 또다른 생성자 호출이 아니기 때문에 this 불가
	}
	
	public static void close (Connection con) {
		if(con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}