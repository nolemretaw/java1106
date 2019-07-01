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
 * ͳ�������û�����
 * ͳ�Ʒ�������session�Ĵ�������
 * servletContext:�洢���е�session����
 * key:		session
 * value:	HashSet<HttpSession>
 */
@WebServlet("/count")
public class CountPeopleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ���ñ���
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		//��Ӧʵ�����
		PrintWriter out = response.getWriter();
		
		//��ȡservletContext
		ServletContext context = request.getServletContext();
		ServletContext context1 = getServletContext();
								
		
		//ͨ��key��ȡhashSet
		HashSet<HttpSession> sessions = (HashSet<HttpSession>)context.getAttribute("sessions");
		if (sessions==null) {//��û�������û�
			sessions = new HashSet<>();
			context.setAttribute("sessions", sessions);
		}
		
		//�������ȡsession����
		HttpSession session = request.getSession();
		ServletContext context2 = session.getServletContext();
		
		//������´�����session�������뵽���ϣ������´����ģ�˵��֮ǰ�Ѽ�������ټӣ�HashSet��ȥ�ع���
		sessions.add(session);
		
		out.println("context:"+context);
		out.println("context1:"+context1);
		out.println("context2:"+context2);
		out.println("</br>");
		
		out.println("�����û�:"+sessions.size());
		
		out.println("��<a href='logout.do'>�˳�</a>��");
		out.close();
	}

}
