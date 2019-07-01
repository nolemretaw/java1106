package com.lanou.web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**生命周期*/
public class LifeServlet extends HttpServlet {
	/**
	 * 实例化阶段
	 * servlet对象刚被创建出来
	 * e.g.
	 * /life-->web.xml-->com.lanou.web.LifeServlet
	 *	-->Class c = Class.forname("com.lanou.web.LifeServlet")
	 *	--> LifeServlet servlet = c.newInstance();调无参构造器
	 *
	 * */
	public LifeServlet(){
		System.out.println("1.LifeServlet()");
	}
	/**
	 * 	初始化阶段
	 * 	servlet对象被实例化之后，对其进行的一些初始化参数设置
	 * */
	@Override
	public void init() throws ServletException {
		System.out.println("2.init()");
	}
	/**
	 * 就绪状态
	 * 	等待处理客户端连接，处理客户端请求
	 * 	每个1请求过来都会执行一次
	 * */
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("3.service()");
		//获取到初始化参数
		ServletConfig config = getServletConfig();
		//根据key来获取value
		String name = config.getInitParameter("name");
		String address = config.getInitParameter("address");
		System.out.println(name+"/"+address);
	}
	/**
	 * 销毁阶段
	 * */
	@Override
	public void destroy() {
		System.out.println("4.destroy()");
	}
	
}
