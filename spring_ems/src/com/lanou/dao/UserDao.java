package com.lanou.dao;

import com.lanou.bean.User;

public interface UserDao {
	public User findUserByNameAndPwd(String username,String password);
}
