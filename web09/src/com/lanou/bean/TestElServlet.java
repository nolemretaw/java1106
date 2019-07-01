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
		// 设置编码
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		User user1 = new User();
		user1.setId(1);
		user1.setName("张三");
		user1.setAge(10);
		user1.setSex("男");
		user1.setHobbies(new String[]{"吃","喝","玩"});
		
		User user2 = new User();
		user2.setId(2);
		user2.setName("李四");
		user2.setAge(20);
		user2.setSex("女");
		user2.setHobbies(new String[]{"抽烟","喝酒","烫头"});
		
		User user3 = new User();
		user3.setId(3);
		user3.setName("王五");
		user3.setAge(30);
		user3.setSex("女");
		user3.setHobbies(new String[]{"黄","赌","毒"});
		
		User user4 = new User();
		user4.setId(4);
		user4.setName("赵六");
		user4.setAge(60);
		user4.setSex("女");
		user4.setHobbies(new String[]{"打麻将","洗澡","跳舞"});
		
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
		
		//转发到e1.jsp
		request.getRequestDispatcher("jstl.jsp").forward(request, response);
	}

	

}
