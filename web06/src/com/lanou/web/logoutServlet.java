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
 * 处理用户退出操作
 */
@WebServlet("/logout.do")
public class logoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 设置编码
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		//响应实体编码
		PrintWriter out = response.getWriter();
		
		// 获取当前session对象
		HttpSession session = request.getSession();
		//销毁session对象
		session.invalidate();
		
		//从集合中移除
		ServletContext context = request.getServletContext();
		HashSet<HttpSession> sessions = (HashSet<HttpSession>)context.getAttribute("sessions");
		boolean remove = sessions.remove(session);
		if (remove) {
			out.println("<h1>退出成功</h1>");			
		}
		
	}


}
