package com.lanou.web;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 监听session对象的创建和销毁过程
 * 统计当前在线用户的数量
 * */
public class MySessionListener implements HttpSessionListener{
	int count = 0;
	/**
	 * 监听session对象的创建
	 * */
	@Override
	public void sessionCreated(HttpSessionEvent event) {
		// TODO Auto-generated method stub
		count++;
		ServletContext context = event.getSession().getServletContext();
		context.setAttribute("count", count);
		System.out.println("session创建");
	}
	
	/**
	 * 监听session对象的销毁
	 * */
	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		// TODO Auto-generated method stub
		count--;
		ServletContext context = event.getSession().getServletContext();
		context.setAttribute("count", count);
		System.out.println("session销毁");
	}

}
