package com.lanou.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ��ȡ���������������cookie
 */
@WebServlet("/findCookie")
public class FindCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ���ñ���
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//��ȡcookie
		Cookie[] cookies = request.getCookies();
		if (cookies!=null) {
			for (Cookie cookie : cookies) {
				System.out.println(cookie.getName());
				String value = cookie.getValue();
				value = URLDecoder.decode(value,"UTF-8");
				System.out.println(value);
				out.println(cookie.getName()+":"+value);
			}
		}else {
			out.println("û��cookie");
		}
	}

}
