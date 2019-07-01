package com.lanou.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**用于接收用户提交的信息*/
public class ContactServlet extends HttpServlet{
	/**
	 * 主要用于接收客户端提交的get请求
	 * */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("===doGet===");
		//设置请求数据包中数据解码方式
		request.setCharacterEncoding("UTF-8");
		//输出数据之前，按照UTF-8方式进行编码
		//告诉浏览器返回的数据类和对数据的编码方式
		response.setContentType("text/html;charset=UTF-8");
		// 借助request请求对象获取用户提交信息
		//如果用户使用form表单提交信息，就需要根据form表单的name属性值获取数据
		
		//获取name
		String name = request.getParameter("name");
		//获取age
		String age = request.getParameter("age");	
		//获取联系方式，相同的key有多个value值
		String[] contacts = request.getParameterValues("contact");
		
		System.out.println(name+"/"+age);
		System.out.println(Arrays.toString(contacts));
		
		//通过响应对象获取输出流
		PrintWriter out = response.getWriter();
		out.println("name:"+name);
		out.println("age:"+age);
		out.println("contacts:"+Arrays.toString(contacts));
		out.close();
	}
	/**
	 * 主要用于接收客户端提交的post请求
	 * */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置请求数据包中数据解码方式
		System.out.println("===doPost===");
		request.setCharacterEncoding("UTF-8");
		//输出数据之前，按照UTF-8方式进行编码
		//告诉浏览器返回的数据类和对数据的编码方式
		response.setContentType("text/html;charset=UTF-8");
		// 借助request请求对象获取用户提交信息
		//如果用户使用form表单提交信息，就需要根据form表单的name属性值获取数据
		
		//获取name
		String name = request.getParameter("name");
		//获取age
		String age = request.getParameter("age");	
		//获取联系方式，相同的key有多个value值
		String[] contacts = request.getParameterValues("contact");
		
		System.out.println(name+"/"+age);
		System.out.println(Arrays.toString(contacts));
		
		//通过响应对象获取输出流
		PrintWriter out = response.getWriter();
		out.println("name:"+name);
		out.println("age:"+age);
		out.println("contacts:"+Arrays.toString(contacts));
		out.close();
	}
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取浏览器客户端的请求方式
		String method = request.getMethod();
		System.out.println("method:"+method);
		if (method.equals("GET")) {
			doGet(request, response);
		}else if (method.equals("POST")) {
			doPost(request, response);
		}
	}
}
