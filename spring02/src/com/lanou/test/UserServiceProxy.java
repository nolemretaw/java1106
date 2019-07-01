package com.lanou.test;
/**
 * 该类是静态代理对象类
 * */
public class UserServiceProxy implements UserService{
	private UserService userService;
	public UserServiceProxy(UserService userService){
		this.userService = userService;
	}
	@Override
	public void insert() {
		System.out.println("开启事物");
		userService.insert();
		System.out.println("提交事物");
		
	}

}
