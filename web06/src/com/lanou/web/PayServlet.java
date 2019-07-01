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
 * �����û������
 */
@WebServlet("/pay.do")
public class PayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ���ñ���
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		//��Ӧʵ�����
		PrintWriter out = response.getWriter();
		
		/**
		 * ���ж��û��Ƿ��½
		 * δ��½��ת��½ҳ�棬��½ֱ�ӽ���
		*/
		
		//�������ȡsession����
		HttpSession session =request.getSession();
		String username = (String)session.getAttribute("username");
		if (username==null) {
			response.sendRedirect("login.jsp");
			return;
		}
		//���ڽ���
		out.println("�û����ڽ���");
		out.close();
	}

	
}
