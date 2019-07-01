package com.lanou.service;

import com.lanou.bean.User;

/**
 * MVC业务层
 * 主要用于写用户要执行的业务逻辑
 * */
public interface UserService {
	/**
	 * 用户登陆业务
	 * @param user 封装登陆的账号和密码
	 * @return true:登陆成功
	 *			false:登陆失败 
	 **/
	public boolean login(User user);
	
	/**
	 * 用户注册业务
	 * @param user 封装用户注册信息
	 * @return true:注册成功
	 *			false:注册失败 
	 **/
	public boolean regist(User user);
	
	public boolean isUsernameExists(String username);
	
}
