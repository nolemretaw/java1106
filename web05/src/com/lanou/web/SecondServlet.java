package com.lanou.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//1������
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		//2����ȡServletContext����
		ServletContext context = getServletContext();
		System.out.println("second-->context:"+context);
		//3����ServletContext��ȡ������
//		String name = (String) context.getAttribute("name");
//		resp.getWriter().println("second-->name:"+name);
		Integer count = (Integer) context.getAttribute("count");
		if (count==null) {//��һ�η���
			count = 1;
		}else {
			count++;
		}
		//���޸ĺ��countֵ������ֵ��
		context.setAttribute("count", count);
		PrintWriter out = resp.getWriter();
		out.println("��ǰ������:"+count);
		out.close();
	}
}
