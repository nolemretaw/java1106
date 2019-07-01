package com.lanou.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lanou.bean.Emp;
import com.lanou.service.EmpServiceImpl;

public class ListServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		EmpServiceImpl service = new EmpServiceImpl();
		List<Emp> emps = service.listAll();
		PrintWriter writer = response.getWriter();
		writer.println(emps);
		writer.close();
	}
}
