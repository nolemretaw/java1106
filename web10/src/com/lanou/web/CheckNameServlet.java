package com.lanou.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckNameServlet
 */
@WebServlet("/checkName.do")
public class CheckNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("UTF-8");
    	response.setContentType("text/html;charset=utf-8");
    	PrintWriter out = response.getWriter();
    	
    	//�����û���
    	String username = request.getParameter("username");
    	System.out.println("username:"+username);
    	
    	//�ж��û����Ƿ��Ѵ���
    	//�������ݿ����
    	if ("����".equals(username)) {
			out.println(1);
		}else {
			out.println(2);
		}
    }
}
