package com.lanou.test;
/**
 * �����Ǿ�̬���������
 * */
public class UserServiceProxy implements UserService{
	private UserService userService;
	public UserServiceProxy(UserService userService){
		this.userService = userService;
	}
	@Override
	public void insert() {
		System.out.println("��������");
		userService.insert();
		System.out.println("�ύ����");
		
	}

}
