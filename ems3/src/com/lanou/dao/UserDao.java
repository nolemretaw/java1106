package com.lanou.dao;

import com.lanou.bean.User;

public interface UserDao {
	/**����û�*/
	public int addUser(User user); 
	/**���ݲ����û�*/
	public User findUserByUsernameAndPassword(String username,String password);
	/**�޸�����s*/
}
