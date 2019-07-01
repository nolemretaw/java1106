package com.lanou.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lanou.bean.Emp;
import com.lanou.dao.EmpDao;

import jdbc.DaoFactory;
//获取修改信息
public class UpdateEmpServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		int id = Integer.parseInt(request.getParameter("id"));
		PrintWriter writer = null;
		try {
			EmpDao dao = (EmpDao) DaoFactory.getDao("empDao").newInstance();
			Emp emp = dao.findEmpById(id);
			writer = response.getWriter();
			if (emp!=null) {
				writer.println("<html>"
						+"<head><meta charset='UTF-8'/><head>"
						+"<body>"
						+"<fieldset>"
						+"<legend>员工信息修改</legend>"
						+"<form action='gotoUpdate' method='post'>"
						+"<input type='hidden' readonly name='id' value='"+emp.getId()+"'/>"
						+"</br>"
						+"姓名<input type='text' name='name' value='"+emp.getName()+"'/>"
						+"</br>"
						+"薪水<input type='text' name='salary' value='"+emp.getSalary()+"'>"
						+"</br>"
						+"年龄<input type='text' name='age' value='"+emp.getAge()+"'>"
						+"</br>"	
						+"<input type='submit' value='修改'>"
						+"</fieldset>"
						+"</form>"
						+"</body>"
						+"</html>");
			}
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		writer.close();
	}
}
