package com.lanou.web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**��������*/
public class LifeServlet extends HttpServlet {
	/**
	 * ʵ�����׶�
	 * servlet����ձ���������
	 * e.g.
	 * /life-->web.xml-->com.lanou.web.LifeServlet
	 *	-->Class c = Class.forname("com.lanou.web.LifeServlet")
	 *	--> LifeServlet servlet = c.newInstance();���޲ι�����
	 *
	 * */
	public LifeServlet(){
		System.out.println("1.LifeServlet()");
	}
	/**
	 * 	��ʼ���׶�
	 * 	servlet����ʵ����֮�󣬶�����е�һЩ��ʼ����������
	 * */
	@Override
	public void init() throws ServletException {
		System.out.println("2.init()");
	}
	/**
	 * ����״̬
	 * 	�ȴ�����ͻ������ӣ�����ͻ�������
	 * 	ÿ��1�����������ִ��һ��
	 * */
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("3.service()");
		//��ȡ����ʼ������
		ServletConfig config = getServletConfig();
		//����key����ȡvalue
		String name = config.getInitParameter("name");
		String address = config.getInitParameter("address");
		System.out.println(name+"/"+address);
	}
	/**
	 * ���ٽ׶�
	 * */
	@Override
	public void destroy() {
		System.out.println("4.destroy()");
	}
	
}
