package com.lanou.test;
/**
 * ������
 * ���б������ߵ���Ϣ
 * */
public class UserProxy {
	//��������
	private User user;

	public void eat(){
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
