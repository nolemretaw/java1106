package com.lanou.test;
//静态代理对象类
public class UserServiceProcxy implements UserService {
	private UserService userService;
	public UserServiceProcxy(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void insert() {
		System.out.println("前切面方法");
		userService.insert();//代理目标方法
		System.out.println("后切面方法");
	}

}
