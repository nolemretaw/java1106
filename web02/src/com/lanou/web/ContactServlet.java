package com.lanou.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**���ڽ����û��ύ����Ϣ*/
public class ContactServlet extends HttpServlet{
	/**
	 * ��Ҫ���ڽ��տͻ����ύ��get����
	 * */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("===doGet===");
		//�����������ݰ������ݽ��뷽ʽ
		request.setCharacterEncoding("UTF-8");
		//�������֮ǰ������UTF-8��ʽ���б���
		//������������ص�������Ͷ����ݵı��뷽ʽ
		response.setContentType("text/html;charset=UTF-8");
		// ����request��������ȡ�û��ύ��Ϣ
		//����û�ʹ��form���ύ��Ϣ������Ҫ����form����name����ֵ��ȡ����
		
		//��ȡname
		String name = request.getParameter("name");
		//��ȡage
		String age = request.getParameter("age");	
		//��ȡ��ϵ��ʽ����ͬ��key�ж��valueֵ
		String[] contacts = request.getParameterValues("contact");
		
		System.out.println(name+"/"+age);
		System.out.println(Arrays.toString(contacts));
		
		//ͨ����Ӧ�����ȡ�����
		PrintWriter out = response.getWriter();
		out.println("name:"+name);
		out.println("age:"+age);
		out.println("contacts:"+Arrays.toString(contacts));
		out.close();
	}
	/**
	 * ��Ҫ���ڽ��տͻ����ύ��post����
	 * */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//�����������ݰ������ݽ��뷽ʽ
		System.out.println("===doPost===");
		request.setCharacterEncoding("UTF-8");
		//�������֮ǰ������UTF-8��ʽ���б���
		//������������ص�������Ͷ����ݵı��뷽ʽ
		response.setContentType("text/html;charset=UTF-8");
		// ����request��������ȡ�û��ύ��Ϣ
		//����û�ʹ��form���ύ��Ϣ������Ҫ����form����name����ֵ��ȡ����
		
		//��ȡname
		String name = request.getParameter("name");
		//��ȡage
		String age = request.getParameter("age");	
		//��ȡ��ϵ��ʽ����ͬ��key�ж��valueֵ
		String[] contacts = request.getParameterValues("contact");
		
		System.out.println(name+"/"+age);
		System.out.println(Arrays.toString(contacts));
		
		//ͨ����Ӧ�����ȡ�����
		PrintWriter out = response.getWriter();
		out.println("name:"+name);
		out.println("age:"+age);
		out.println("contacts:"+Arrays.toString(contacts));
		out.close();
	}
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��ȡ������ͻ��˵�����ʽ
		String method = request.getMethod();
		System.out.println("method:"+method);
		if (method.equals("GET")) {
			doGet(request, response);
		}else if (method.equals("POST")) {
			doPost(request, response);
		}
	}
}
