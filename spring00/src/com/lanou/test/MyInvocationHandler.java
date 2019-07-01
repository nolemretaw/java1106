package com.lanou.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler{
	//被代理者
	private Object target;
	
	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}

	//动态生成代理者
	public Object getProxy(){
		return Proxy.newProxyInstance(
				this.getClass().getClassLoader(),
				target.getClass().getInterfaces(),
				this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("前切面方法");
		method.invoke(target, args);
		System.out.println("后切面方法");
		return null;
	}

}
