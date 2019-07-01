package com.lanou.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler{
	//��������
	private Object target;
	
	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}

	//��̬���ɴ�����
	public Object getProxy(){
		return Proxy.newProxyInstance(
				this.getClass().getClassLoader(),
				target.getClass().getInterfaces(),
				this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("ǰ���淽��");
		method.invoke(target, args);
		System.out.println("�����淽��");
		return null;
	}

}
