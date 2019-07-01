package com.lanou.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * 检查用户是否登陆的过滤器
 * */
public class CheckUserLoginFilter implements Filter {
	String[] unCheckUris;
	@Override
	public void init(FilterConfig config) throws ServletException {
		String value = config.getInitParameter("unCheckUris");
		unCheckUris = value.split(",");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// 设置编码
		request.setCharacterEncoding("UTF-8");
		response.setContentType("test/html;charset=UTF-8");
		
		//获取session
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		HttpSession session = req.getSession();
		
		//获取请求路径uri
		//ems4/login.do
		String uri = req.getRequestURI();
		uri = uri.substring(uri.lastIndexOf("/")+1);
		
		//从session中获取username,判断是否登陆
		String username = (String) session.getAttribute("username");
		System.out.println(username);
		if (username==null) {//未登录
			for (int i = 0; i < unCheckUris.length; i++) {
				if (uri.equals(unCheckUris[i])) {
					//放过请求
					chain.doFilter(request, response);
					return;
				}
			}
			//重定向到登陆
			resp.sendRedirect("login.jsp");
		}else {
			chain.doFilter(request, response);
		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	
}
