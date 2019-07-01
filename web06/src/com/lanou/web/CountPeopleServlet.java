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
 * 统计在线用户数量
 * 统计服务器端session的创建个数
 * servletContext:存储所有的session对象
 * key:		session
 * value:	HashSet<HttpSession>
 */
@WebServlet("/count")
public class CountPeopleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 设置编码
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		//响应实体编码
		PrintWriter out = response.getWriter();
		
		//获取servletContext
		ServletContext context = request.getServletContext();
		ServletContext context1 = getServletContext();
								
		
		//通过key获取hashSet
		HashSet<HttpSession> sessions = (HashSet<HttpSession>)context.getAttribute("sessions");
		if (sessions==null) {//还没有在线用户
			sessions = new HashSet<>();
			context.setAttribute("sessions", sessions);
		}
		
		//构建或获取session对象
		HttpSession session = request.getSession();
		ServletContext context2 = session.getServletContext();
		
		//如果是新创建的session对象会加入到集合，不是新创建的，说明之前已加入过，再加，HashSet有去重功能
		sessions.add(session);
		
		out.println("context:"+context);
		out.println("context1:"+context1);
		out.println("context2:"+context2);
		out.println("</br>");
		
		out.println("在线用户:"+sessions.size());
		
		out.println("【<a href='logout.do'>退出</a>】");
		out.close();
	}

}
