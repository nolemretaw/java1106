package com.lanou.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ͳ����վ�����ŷ�����
 * */
public class NewsServlet extends HttpServlet {
	//�����߳�������ģ�����ȫ
	int count = 0;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//1�����ñ���
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.println("<h1 align='center'>����</h1>");
		synchronized (this) {
			out.println("�����Ķ���,����ǰ:"+count);
			//��������1
			count++;
			out.println("�����Ķ���,���ʺ�:"+count);			
		}
	}
}
