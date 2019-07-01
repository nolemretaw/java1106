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
 * ����û��Ƿ��½�Ĺ�����
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
		// ���ñ���
		request.setCharacterEncoding("UTF-8");
		response.setContentType("test/html;charset=UTF-8");
		
		//��ȡsession
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		HttpSession session = req.getSession();
		
		//��ȡ����·��uri
		//ems4/login.do
		String uri = req.getRequestURI();
		uri = uri.substring(uri.lastIndexOf("/")+1);
		
		//��session�л�ȡusername,�ж��Ƿ��½
		String username = (String) session.getAttribute("username");
		System.out.println(username);
		if (username==null) {//δ��¼
			for (int i = 0; i < unCheckUris.length; i++) {
				if (uri.equals(unCheckUris[i])) {
					//�Ź�����
					chain.doFilter(request, response);
					return;
				}
			}
			//�ض��򵽵�½
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
