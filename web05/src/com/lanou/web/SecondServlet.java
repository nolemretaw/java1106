package com.lanou.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//1、编码
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		//2、获取ServletContext对象
		ServletContext context = getServletContext();
		System.out.println("second-->context:"+context);
		//3、向ServletContext中取出数据
//		String name = (String) context.getAttribute("name");
//		resp.getWriter().println("second-->name:"+name);
		Integer count = (Integer) context.getAttribute("count");
		if (count==null) {//第一次访问
			count = 1;
		}else {
			count++;
		}
		//将修改后的count值赋给键值对
		context.setAttribute("count", count);
		PrintWriter out = resp.getWriter();
		out.println("当前访问量:"+count);
		out.close();
	}
}
