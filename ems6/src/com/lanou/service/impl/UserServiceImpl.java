package com.lanou.service.impl;

import com.lanou.bean.User;
import com.lanou.dao.UserDao;
import com.lanou.service.UserService;

import jdbc.DaoFactory;

public class UserServiceImpl implements UserService{
	UserDao dao = null;
	
	public UserServiceImpl() {
		try {
			dao = (UserDao)DaoFactory.getDao("userDao").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean login(User user) {
		User u = dao.findUserByUsernameAndPassword(user.getUsername(), user.getPassword());
		if (u==null) {
			return false;
		}
		return true;
	}

	@Override
	public boolean regist(User user) {
		int rows = dao.addUser(user);
		if (rows==0) {
			return false;
		}
		return true;
	}

	@Override
	public boolean isUsernameExists(String username) {
		User userByName = dao.findUserByName(username);
		if (userByName!=null) {
			return true;
		}
		return false;
	}

}
