package com.lanou.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.lanou.bean.Emp;
import com.lanou.dao.EmpDao;

import jdbc.DaoFactory;

public class AddEmpServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1���������
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		//2����ȡhtmlҳ���ύ������
		String name = request.getParameter("name");
		Double salary = Double.parseDouble(request.getParameter("salary"));
		int age = Integer.parseInt(request.getParameter("age"));
		Emp emp = new Emp();
		emp.setName(name);
		emp.setAge(age);
		emp.setSalary(salary);
		PrintWriter out = null;
		//3������dao�����ݲ���һ������
		try {
			out = response.getWriter();
			EmpDao dao = (EmpDao) DaoFactory.getDao("empDao").newInstance();
			//����ɹ�
			boolean result = dao.addEmp(emp);
			//�ض���ListEmpServlet��ַempInf
			if (result) {
				response.sendRedirect("empInf");
				}
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
