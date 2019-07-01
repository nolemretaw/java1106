package com.lanou.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * �޸�cookie��Ϣ
 */
@WebServlet("/UpdateCookie")
public class UpdateCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//��ȡ�������������cookie
		Cookie[] cookies = request.getCookies();
		if (cookies!=null) {
			//��ȡcookie��nameֵ
			for (Cookie cookie : cookies) {
				String name = cookie.getName();
				if ("count".equals(name)) {
					Integer count = Integer.parseInt(cookie.getValue());
					if (count>0) {						
						count--;
					}
					//������֮��Ĵ������¸���cookie
					cookie.setValue(String.valueOf(count));
					
					//���޸�֮���cookie���´��ظ������
					response.addCookie(cookie);
					out.println("ʣ��:"+count);
				}
			}
		}else{
			out.println("û��cookie");
		}
	}

}
