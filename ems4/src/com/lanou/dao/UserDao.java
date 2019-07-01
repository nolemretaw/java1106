package com.lanou.dao;

import com.lanou.bean.User;

public interface UserDao {
	public int addUser(User user);
	public User findUserByUsernameAndPassword(String username,String password);
}
