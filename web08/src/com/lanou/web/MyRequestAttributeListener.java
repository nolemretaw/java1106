package com.lanou.web;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * ����request�������ݰ󶨺��Ƴ��¼�
 * */
@WebListener
public class MyRequestAttributeListener implements ServletRequestAttributeListener{
	
	/**
	 * ����request��һ��ִ��SetAttribute()�¼�
	 * */
	@Override
	public void attributeAdded(ServletRequestAttributeEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * ����request�������removeAttribute()�¼�
	 * */
	@Override
	public void attributeRemoved(ServletRequestAttributeEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * ����request�����ٴε�����ͬkeyֵsetAttribute()�¼�
	 * */
	@Override
	public void attributeReplaced(ServletRequestAttributeEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
