package com.lanou.test;
/**
 * 代理者
 * 持有被代理者的信息
 * */
public class UserProxy {
	//被代理者
	private User user;

	public void eat(){
		System.out.println("点外卖");
		user.eat();
		System.out.println("扔垃圾");
	}
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
