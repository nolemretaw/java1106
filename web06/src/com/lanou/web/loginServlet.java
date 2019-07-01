package com.lanou.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 处理用户登陆请求
 */
@WebServlet("/login.do")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 设置编码
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		//响应实体编码
		PrintWriter out = response.getWriter();
		
		//接收账号密码
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//创建或获取一个session对象
		HttpSession session =request.getSession();
		
		//设置该生存对象的生存时间（单位 秒）
		session.setMaxInactiveInterval(10);
		
		//将用户存储到session对象中
		session.setAttribute("username",username);
		response.sendRedirect("pay.do");

		out.println(username+"登陆成功");
		out.close();
	}

}
