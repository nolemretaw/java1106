package com.lanou.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;

import javax.print.attribute.standard.MediaSize.NA;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 处理用户结算的
 */
@WebServlet("/pay.do")
public class PayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 设置编码
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		//响应实体编码
		PrintWriter out = response.getWriter();
		
		/**
		 * 先判断用户是否登陆
		 * 未登陆跳转登陆页面，登陆直接结算
		*/
		
		//创建或获取session对象
		HttpSession session =request.getSession();
		String username = (String)session.getAttribute("username");
		if (username==null) {
			response.sendRedirect("login.jsp");
			return;
		}
		//正在结算
		out.println("用户正在结算");
		out.close();
	}

	
}
