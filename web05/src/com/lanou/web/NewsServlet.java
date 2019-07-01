package com.lanou.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 统计网站上新闻访问量
 * */
public class NewsServlet extends HttpServlet {
	//所有线程所共享的，不安全
	int count = 0;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//1、设置编码
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.println("<h1 align='center'>新闻</h1>");
		synchronized (this) {
			out.println("新闻阅读量,访问前:"+count);
			//访问量加1
			count++;
			out.println("新闻阅读量,访问后:"+count);			
		}
	}
}
