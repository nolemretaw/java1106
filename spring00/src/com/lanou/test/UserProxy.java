package com.lanou.test;
//������̬����
public class UserProxy {
	private User user;
	public void eat123() {
		System.out.println("������");
		user.eat();
		System.out.println("������");
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
