package com.lanou.test;

public class Test1 {
	public static void main(String[] args) {
		/*//������������
		UserService userService = new UserServiceImpl();
		//��̬��ȡ������
		MyInvocationHandler handler = new MyInvocationHandler();
		handler.setTarget(userService);
		UserService proxy = (UserService)handler.getProxy();
		//ͨ��������ִ��Ŀ�귽��
		proxy.insert();*/
		
		//���Ծ�̬����
		//�������������
		UserServiceImpl userService = new UserServiceImpl();
		//�����������
		UserServiceProxy proxy = new UserServiceProxy(userService);
		//ͨ���������ִ�з���
		proxy.insert();
	}
}
