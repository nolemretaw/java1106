package com.lanou.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**自己开发的servlet组件
 * 继承HttpServlet或者实现Servlet接口
 * */
public class HelloServlet extends HttpServlet{
	/**
	 * 处理客户端发送请求的方法
	 * request:封装用户请求
	 * response:给用户返回的相应
	 * */
	@Override
	protected void service(HttpServletRequest request, 
			HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("==service()==");
		//借助response响应对象向浏览器输出内容
		//1、获取一个输出流
		PrintWriter out = response.getWriter();
		//2、输出内容
		String name = "TomCat";
		out.println("<h1 style='color:red'>"+name+"</h1>");
		out.println("<h2 style='color:red;font-size:80px;'>"+name+"</h2>");
		out.println("<h3>"+name+"</h3>");
		//3、关闭流
		out.close();
	}
}
