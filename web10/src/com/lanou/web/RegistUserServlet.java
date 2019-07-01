package com.lanou.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistUserServlet
 */
@WebServlet("/registUser.do")
public class RegistUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
    	response.setContentType("text/html;charset=utf-8");
    	PrintWriter out = response.getWriter();
    	
    	//接收前端Ajax提交的用户名密码
    	String username = request.getParameter("username");
    	String password = request.getParameter("password");
    	
    	System.out.println("username:"+username);
    	System.out.println("password:"+password);
    	
    	if ("张三".equals(username)) {
			out.println("error");
		}else {//成功
			out.println("ok");
			//重定向到显示列表页面
			//response.sendRedirect("list.jsp");
		}
    	out.close();
	}

}
