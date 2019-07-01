package com.lanou.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**�Լ�������servlet���
 * �̳�HttpServlet����ʵ��Servlet�ӿ�
 * */
public class HelloServlet extends HttpServlet{
	/**
	 * ����ͻ��˷�������ķ���
	 * request:��װ�û�����
	 * response:���û����ص���Ӧ
	 * */
	@Override
	protected void service(HttpServletRequest request, 
			HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("==service()==");
		//����response��Ӧ������������������
		//1����ȡһ�������
		PrintWriter out = response.getWriter();
		//2���������
		String name = "TomCat";
		out.println("<h1 style='color:red'>"+name+"</h1>");
		out.println("<h2 style='color:red;font-size:80px;'>"+name+"</h2>");
		out.println("<h3>"+name+"</h3>");
		//3���ر���
		out.close();
	}
}
