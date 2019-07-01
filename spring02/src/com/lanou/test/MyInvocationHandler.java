package com.lanou.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ע�⣺����಻�Ǵ�������
 *  �������ã�ȥִ�б��������еķ���
 * */
public class MyInvocationHandler implements InvocationHandler{
	/**���������ߴ�����*/
	private Object target;
	
	/**��̬���ɴ�����*/
	public Object getProxy(){
		return Proxy.newProxyInstance(
				this.getClass().getClassLoader(),//�����ߵ��������
				target.getClass().getInterfaces(),//��ȡ��������ʵ�ֵ���Щ�ӿ�
				this);
	}
	
	/**
	 * �����߰�����������ִ��Ŀ�귽����
	 * ���ɴ�����֮���Զ�ִ�д˷���
	 * @param proxy:������
	 * @param method:�������ߵķ�������
	 * @param args:method�����Ĳ����б�
	 * @return ����method����ִ�еĽ��
	 * */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("��������");
		//ִ�б���������е�Ŀ�귽��
		//����ִ��
		method.invoke(target, args);
		System.out.println("�ύ����");
		return null;
	}
	public Object getTarget() {
		return target;
	}


	public void setTarget(Object target) {
		this.target = target;
	}
}
