package com.lanou.web;

import java.io.IOException;
import java.io.PrintWriter;

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
 * ������
 * �Է������ݽ��й���
 */
public class ContentFilter implements Filter{
	/**
	 * ��������ʼ������:����������ʱ��ʼ��
	 *  config:��װ��������ʼ������
	 */
	String[] keyWords;
	@Override
	public void init(FilterConfig config) throws ServletException {
		System.out.println("contentFilter==>init()");
		//��ȡweb.xml�����õĳ�ʼ������
		String value = config.getInitParameter("keyWords");
		keyWords = value.split(",");
	}
	/**
	 * ������ִ�й��˵ķ���
	 *  ÿ���������������ִ��һ�θ÷���
	 *  request:��װ�������������
	 *  response:��װ���������ص���Ӧ����
	 *  chain:������ִ����
	 */
	@Override
	public void doFilter(ServletRequest request, 
			ServletResponse response,
			FilterChain chain)
			throws IOException, ServletException {
		System.out.println("contentFilter==>doFilter()");
		
		//�����������,��Ӧ����
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		//��ȡ�������
		String content = 
				request.getParameter("content");

		System.out.println("contentFilter==>before");
		
		HttpServletRequest req = 
			(HttpServletRequest)request;
		HttpServletResponse resp = 
			(HttpServletResponse)response;
		HttpSession session = req.getSession();
		
		//�鿴�����������Ƿ����������
		for(int i=0;i<keyWords.length;i++){
			if(content.contains(keyWords[i])){
				//�ض��򵽷���jspҳ��
				resp.sendRedirect("fatie.jsp");
				session.setAttribute("errorMsg","���ݰ���������");
				return;
			}
		}
		long t1 = System.currentTimeMillis();
		//������ͨ��������,����������servlet����filter
		chain.doFilter(request, response);
		long t2 = System.currentTimeMillis();
		System.out.println("servlet��������ʱ��:"+(t2-t1));
		System.out.println("contentFilter==>after");
	}
	/**
	 * ����������ʱִ��
	 */
	@Override
	public void destroy() {
		System.out.println("contentFilter==>destroy()");
	}
}
