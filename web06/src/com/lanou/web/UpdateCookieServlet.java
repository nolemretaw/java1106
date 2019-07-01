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
 * 修改cookie信息
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
		//获取浏览器传过来的cookie
		Cookie[] cookies = request.getCookies();
		if (cookies!=null) {
			//获取cookie的name值
			for (Cookie cookie : cookies) {
				String name = cookie.getName();
				if ("count".equals(name)) {
					Integer count = Integer.parseInt(cookie.getValue());
					if (count>0) {						
						count--;
					}
					//将减完之后的次数重新赋给cookie
					cookie.setValue(String.valueOf(count));
					
					//将修改之后的cookie重新带回给浏览器
					response.addCookie(cookie);
					out.println("剩余:"+count);
				}
			}
		}else{
			out.println("没有cookie");
		}
	}

}
