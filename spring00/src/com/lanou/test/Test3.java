package com.lanou.test;

public class Test3 {
	public static void main(String[] args) {
		//���Ծ�̬����
		/*UserServiceImpl userService = new UserServiceImpl();
		UserServiceProcxy procxy = new UserServiceProcxy(userService);
		procxy.insert();*/
		
		//���Զ�̬����
		UserServiceImpl userService = new UserServiceImpl();
		MyInvocationHandler handler = new MyInvocationHandler();
		handler.setTarget(userService);
		UserService proxy = (UserService)handler.getProxy();
		proxy.insert();
		
	}
}
