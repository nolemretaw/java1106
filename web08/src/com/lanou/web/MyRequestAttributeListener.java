package com.lanou.web;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * 监听request对象数据绑定和移除事件
 * */
@WebListener
public class MyRequestAttributeListener implements ServletRequestAttributeListener{
	
	/**
	 * 监听request第一次执行SetAttribute()事件
	 * */
	@Override
	public void attributeAdded(ServletRequestAttributeEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 监听request对象调用removeAttribute()事件
	 * */
	@Override
	public void attributeRemoved(ServletRequestAttributeEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 监听request对象再次调用相同key值setAttribute()事件
	 * */
	@Override
	public void attributeReplaced(ServletRequestAttributeEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
