package com.lanou.test;

public class Test1 {
	public static void main(String[] args) {
		/*//构建被代理者
		UserService userService = new UserServiceImpl();
		//动态获取代理者
		MyInvocationHandler handler = new MyInvocationHandler();
		handler.setTarget(userService);
		UserService proxy = (UserService)handler.getProxy();
		//通过代理者执行目标方法
		proxy.insert();*/
		
		//测试静态代理
		//构建被代理对象
		UserServiceImpl userService = new UserServiceImpl();
		//构建代理对象
		UserServiceProxy proxy = new UserServiceProxy(userService);
		//通过代理对象执行方法
		proxy.insert();
	}
}
