package com.lanou.test;
//代理，静态代理
public class UserProxy {
	private User user;
	public void eat123() {
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
