package com.lanou.dao.impl;

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
		String sql = "insert into user(username,password) values(?,?)";
		Object[] parameters = new Object[]{user.getName(),user.getPassword()};
		return JdbcUtil.update(sql, parameters);
	}

	@Override
	public User findUserByUsernameAndPassword(String username,String password) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; 
		Object[] parameters = new Object[]{username,password};
		User user = null;
		String sql = "select * from user where username=? and password=? ";
		try {
			conn = JdbcUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			for (int i = 0; i < parameters.length; i++) {
				pstmt.setObject(i+1, parameters[i]);
			}
			rs = pstmt.executeQuery();
			if (rs.next()) {
				user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("username"));
				user.setPassword(rs.getString("password"));
			}
			return user;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			JdbcUtil.release(conn, pstmt, rs);
		}
		return user;
	}
}
