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
 * �����û���½����
 */
@WebServlet("/login.do")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ���ñ���
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		//��Ӧʵ�����
		PrintWriter out = response.getWriter();
		
		//�����˺�����
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//�������ȡһ��session����
		HttpSession session =request.getSession();
		
		//���ø�������������ʱ�䣨��λ �룩
		session.setMaxInactiveInterval(10);
		
		//���û��洢��session������
		session.setAttribute("username",username);
		response.sendRedirect("pay.do");

		out.println(username+"��½�ɹ�");
		out.close();
	}

}
