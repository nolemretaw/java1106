package com.lanou.jdbcutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil extends GlobalConst {
	static ThreadLocal<Connection> td = new ThreadLocal<>();
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		Connection conn = td.get();
		if (conn==null) {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			td.set(conn);
		}
		return conn;
	}
	
	public static void release(Connection conn,Statement stmt,ResultSet rs) {
			try {
				if (rs!=null) rs.close();
				if (stmt!=null) stmt.close();
				if (conn!=null) {
					td.remove();
					conn.close();
					}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public static int update(String sql,Object[] parameters) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			for (int i = 0; i < parameters.length; i++) {
				pstmt.setObject(i+1, parameters[i]);
			}
			return pstmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			release(conn, pstmt, null);
		}
		return 0;
	}
}
