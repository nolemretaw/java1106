package com.lanou.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 */
@WebServlet("/fatie.do")
public class FatieServlet extends HttpServlet {
	protected void service(HttpServletRequest request, 
					HttpServletResponse response) throws ServletException, IOException {
		System.out.println("servlet==>service");

		//1�����ñ���
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		//���շ�������
		String content = 
				request.getParameter("content");
		
		out.println("�㷢����������Ϊ:"+content);
		out.close();
	}
}
