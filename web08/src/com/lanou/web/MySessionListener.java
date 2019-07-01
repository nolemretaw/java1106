package com.lanou.web;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * ����session����Ĵ��������ٹ���
 * ͳ�Ƶ�ǰ�����û�������
 * */
public class MySessionListener implements HttpSessionListener{
	int count = 0;
	/**
	 * ����session����Ĵ���
	 * */
	@Override
	public void sessionCreated(HttpSessionEvent event) {
		// TODO Auto-generated method stub
		count++;
		ServletContext context = event.getSession().getServletContext();
		context.setAttribute("count", count);
		System.out.println("session����");
	}
	
	/**
	 * ����session���������
	 * */
	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		// TODO Auto-generated method stub
		count--;
		ServletContext context = event.getSession().getServletContext();
		context.setAttribute("count", count);
		System.out.println("session����");
	}

}
