package com.lanou.bean;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class TestElServlet
 */
@WebServlet("/testel.do")
public class TestElServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ���ñ���
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		User user1 = new User();
		user1.setId(1);
		user1.setName("����");
		user1.setAge(10);
		user1.setSex("��");
		user1.setHobbies(new String[]{"��","��","��"});
		
		User user2 = new User();
		user2.setId(2);
		user2.setName("����");
		user2.setAge(20);
		user2.setSex("Ů");
		user2.setHobbies(new String[]{"����","�Ⱦ�","��ͷ"});
		
		User user3 = new User();
		user3.setId(3);
		user3.setName("����");
		user3.setAge(30);
		user3.setSex("Ů");
		user3.setHobbies(new String[]{"��","��","��"});
		
		User user4 = new User();
		user4.setId(4);
		user4.setName("����");
		user4.setAge(60);
		user4.setSex("Ů");
		user4.setHobbies(new String[]{"���齫","ϴ��","����"});
		
		List<User> users = new ArrayList<>();
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		request.setAttribute("users", users);
		
		HttpSession session = request.getSession();
		session.setAttribute("user", user1);
		
		ServletContext context = request.getServletContext();
		context.setAttribute("user", user2);
		
		request.setAttribute("user", user3);
		
		//ת����e1.jsp
		request.getRequestDispatcher("jstl.jsp").forward(request, response);
	}

	

}
