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
 * 过滤器
 * 对发帖内容进行过滤
 */
public class ContentFilter implements Filter{
	/**
	 * 过滤器初始化方法:在容器启动时初始化
	 *  config:封装过滤器初始化参数
	 */
	String[] keyWords;
	@Override
	public void init(FilterConfig config) throws ServletException {
		System.out.println("contentFilter==>init()");
		//获取web.xml中配置的初始化参数
		String value = config.getInitParameter("keyWords");
		keyWords = value.split(",");
	}
	/**
	 * 过滤器执行过滤的方法
	 *  每次有请求过来都会执行一次该方法
	 *  request:封装浏览器请求数据
	 *  response:封装服务器返回的响应数据
	 *  chain:过滤器执行链
	 */
	@Override
	public void doFilter(ServletRequest request, 
			ServletResponse response,
			FilterChain chain)
			throws IOException, ServletException {
		System.out.println("contentFilter==>doFilter()");
		
		//设置请求编码,响应编码
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		//获取请求参数
		String content = 
				request.getParameter("content");

		System.out.println("contentFilter==>before");
		
		HttpServletRequest req = 
			(HttpServletRequest)request;
		HttpServletResponse resp = 
			(HttpServletResponse)response;
		HttpSession session = req.getSession();
		
		//查看请求数据中是否包含敏感字
		for(int i=0;i<keyWords.length;i++){
			if(content.contains(keyWords[i])){
				//重定向到发帖jsp页面
				resp.sendRedirect("fatie.jsp");
				session.setAttribute("errorMsg","内容包含敏感字");
				return;
			}
		}
		long t1 = System.currentTimeMillis();
		//让请求通过过滤器,交给后续的servlet或者filter
		chain.doFilter(request, response);
		long t2 = System.currentTimeMillis();
		System.out.println("servlet处理请求时间:"+(t2-t1));
		System.out.println("contentFilter==>after");
	}
	/**
	 * 过滤器销毁时执行
	 */
	@Override
	public void destroy() {
		System.out.println("contentFilter==>destroy()");
	}
}
