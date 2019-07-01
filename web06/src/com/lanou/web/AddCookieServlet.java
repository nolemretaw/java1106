package com.lanou.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ����cookie�������������
 */
@WebServlet("/addCookie")
public class AddCookieServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ���ñ���
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//����cookie
		Cookie c1 = new Cookie("name", "Tom");
		Cookie c2 = new Cookie("count", "10");
		//cookie��ֵ������ֱ�Ӵ洢������Ҫ�����Ľ��б���
		String city = URLEncoder.encode("����","UTF-8");
		
		Cookie c3 = new Cookie("city", city);
		//����cookie������ʱ��
		c1.setMaxAge(100);
		c2.setMaxAge(200);
		c3.setMaxAge(300);
		
		//��cookie��ӵ���Ӧ���󣬴��ظ������
		response.addCookie(c1);
		response.addCookie(c2);
		response.addCookie(c3);
		out.println("cookie��ӳɹ�");
		out.close();
		
	}

}
