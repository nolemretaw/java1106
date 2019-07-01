package com.lanou.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 注意：这个类不是代理者类
 *  该类作用：去执行被代理者中的方法
 * */
public class MyInvocationHandler implements InvocationHandler{
	/**将被代理者传过来*/
	private Object target;
	
	/**动态生成代理者*/
	public Object getProxy(){
		return Proxy.newProxyInstance(
				this.getClass().getClassLoader(),//代理者的类加载器
				target.getClass().getInterfaces(),//获取被代理者实现的那些接口
				this);
	}
	
	/**
	 * 代理者帮助被代理者执行目标方法，
	 * 生成代理者之后自动执行此方法
	 * @param proxy:代理者
	 * @param method:被代理者的方法对象
	 * @param args:method方法的参数列表
	 * @return 返回method方法执行的结果
	 * */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("开启事物");
		//执行被代理对象中的目标方法
		//反射执行
		method.invoke(target, args);
		System.out.println("提交事物");
		return null;
	}
	public Object getTarget() {
		return target;
	}


	public void setTarget(Object target) {
		this.target = target;
	}
}
