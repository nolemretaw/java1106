package com.lanou.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 创建cookie并给浏览器返回
 */
@WebServlet("/addCookie")
public class AddCookieServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 设置编码
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//创建cookie
		Cookie c1 = new Cookie("name", "Tom");
		Cookie c2 = new Cookie("count", "10");
		//cookie的值不允许直接存储中文需要对中文进行编码
		String city = URLEncoder.encode("西安","UTF-8");
		
		Cookie c3 = new Cookie("city", city);
		//设置cookie的生存时间
		c1.setMaxAge(100);
		c2.setMaxAge(200);
		c3.setMaxAge(300);
		
		//将cookie添加到响应对象，带回给浏览器
		response.addCookie(c1);
		response.addCookie(c2);
		response.addCookie(c3);
		out.println("cookie添加成功");
		out.close();
		
	}

}
