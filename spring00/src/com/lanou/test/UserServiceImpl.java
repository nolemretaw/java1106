package com.lanou.test;

public class UserServiceImpl implements UserService {
/**
 * 被代理者
 * 目标：找到代理者来执行开启事物 和 提交 事物操作
 * */
	@Override
	public void insert() {
		//前切面方法
		System.out.println("目标方法");
		//后切面方法
	}

}
