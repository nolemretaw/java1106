package com.lanou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanou.bean.User;
import com.lanou.dao.impl.userDao;
import com.lanou.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private userDao userDao;
	@Override
	public boolean loginUser(User user) {
		User findUser = userDao.findUserByNameAndPwd(user.getUsername(), user.getPassword());
		if (findUser==null) {
			return false;
		}
		return true;
	}

}
