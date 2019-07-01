package com.lanou.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lanou.bean.User;
import com.lanou.dao.UserDao;

import jdbc.JdbcUtil;

public class UserDaoImpl implements UserDao{
	@Override
	public int addUser(User user) {
		// ×¢²á
		String  sql = "INSERT INTO user(username,password) VALUES(?,?)";
		Object[] parameters = {user.getUsername(),user.getPassword()};
		return JdbcUtil.update(sql, parameters);
	}

	@Override
	public User findUserByUsernameAndPassword(String username, String password) {
		// µÇÂ½
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		User user= null;
		try {
			conn = JdbcUtil.getConnection();
			String sql = "SELECT * FROM user WHERE username=? AND password=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				user = new User();
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcUtil.release(conn, pstmt, rs);
		}
		System.out.println(user);
		return user;
	}
}
