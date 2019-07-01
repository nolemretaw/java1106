package com.lanou.test;
/**被代理者
 * 目标：找到代理者来执行开启事物 和 提交事物操作
 * */
public class UserServiceImpl implements UserService{
	public void insert(){
		//开启事物
		System.out.println("插入数据");
		//提交事务
		
	}
}
