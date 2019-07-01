package com.lanou.dao;

import com.lanou.bean.User;

public interface UserDao {
	/**添加用户*/
	public int addUser(User user); 
	/**根据查找用户*/
	public User findUserByUsernameAndPassword(String username,String password);
	/**修改密码s*/
}
