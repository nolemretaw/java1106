package com.lanou.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.lanou.bean.User;
import com.lanou.dao.UserDao;
@Repository("userDao")
public class userDao implements UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public User findUserByNameAndPwd(String username,String password) {
		String sql = "select * from user where username=? and password=?";
		List<User> list = jdbcTemplate.query(
				sql, 
				new UserMapper(), 
				username,password);
		if (list!=null && !list.isEmpty()) {
			return list.get(0);
		}
		return null;
	}
	
	class UserMapper implements RowMapper<User>{

		@Override
		public User mapRow(ResultSet rs, int arg1) throws SQLException {
			User user = new User();
			user.setId(rs.getInt("id"));
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			return user;
		}
		
	}

}
