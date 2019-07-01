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
 * �����û��˳�����
 */
@WebServlet("/logout.do")
public class logoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ���ñ���
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		//��Ӧʵ�����
		PrintWriter out = response.getWriter();
		
		// ��ȡ��ǰsession����
		HttpSession session = request.getSession();
		//����session����
		session.invalidate();
		
		//�Ӽ������Ƴ�
		ServletContext context = request.getServletContext();
		HashSet<HttpSession> sessions = (HashSet<HttpSession>)context.getAttribute("sessions");
		boolean remove = sessions.remove(session);
		if (remove) {
			out.println("<h1>�˳��ɹ�</h1>");			
		}
		
	}


}
