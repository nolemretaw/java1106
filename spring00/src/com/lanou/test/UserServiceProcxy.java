package com.lanou.test;
//��̬���������
public class UserServiceProcxy implements UserService {
	private UserService userService;
	public UserServiceProcxy(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void insert() {
		System.out.println("ǰ���淽��");
		userService.insert();//����Ŀ�귽��
		System.out.println("�����淽��");
	}

}
