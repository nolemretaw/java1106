package com.lanou.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 对发帖内容的长度进行过滤
 */
//@WebFilter
public class LengthFilter implements Filter{
	int length;
	@Override
	public void init(FilterConfig config) throws ServletException {
		System.out.println("lengthFilter==>init()");
		length = Integer.parseInt(
				config.getInitParameter("length"));
	}
	@Override
	public void doFilter(ServletRequest request,
			ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("lengthFilter==>doFilter()");
		System.out.println("lengthFilter==>before");

		//设置请求编码,响应编码
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		//获取请求参数
		String content = 
				request.getParameter("content");
		content = content.trim();

		HttpServletRequest req = 
				(HttpServletRequest)request;
		HttpServletResponse resp = 
				(HttpServletResponse)response;
		HttpSession session = req.getSession();
		
		System.out.println(content);
		System.out.println(content.length());
		if(content.length()>length){
			//重定向fatie.jsp
			resp.sendRedirect("fatie.jsp");
			session.setAttribute("errorMsg","内容过长");
		}else{
			chain.doFilter(request, response);
			System.out.println("lengthFilter==>after");
		}
	}
	@Override
	public void destroy() {
		System.out.println("lengthFilter==>destroy()");
	}
}
