package com.lanou.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lanou.bean.Emp;
import com.lanou.dao.EmpDao;

import jdbc.DaoFactory;

/**
 * 调用dao来查询数据库中所有数据并给前端进行返回
 */
public class ListEmpServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		//1、设置请求编码和响应编码
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = null;
		//2、构建dao，获取数据库中所有数据
		try {
			out = response.getWriter();
			EmpDao dao = (EmpDao) DaoFactory.getDao("empDao").newInstance();
			List<Emp> emps = dao.findAll();
			out.println("<html>"
					+"<head><meta charset='UTF-8'/><head>"
					+"<body>"
					+"<table border='1' bordercolor='white' align='center cellspacing='0' cellpadding='5' style='border-collapse:collapse'>"
					+"<caption>员工列表<a href='addEmp.html'>继续添加</a></caption>"
					+"<tr align='center' bgcolor='skyblue'>"
					+"<td width='100'>编号</td>"
					+"<td width='100'>姓名</td>"
					+"<td width='100'>薪水</td>"
					+"<td width='100'>年龄</td>"
					+"<td width='100'>操作</td></tr>");
			int i = 1;//颜色
			for (Emp emp : emps) {	
				out.println("<tr align='center' bgcolor='"
						+(i++%2==0?"red":"green")+"'>"
						+"<td>"+emp.getId()+"</td>"
						+"<td>"+emp.getName()+"</td>"
						+"<td>"+emp.getSalary()+"</td>"
						+"<td>"+emp.getAge()+"</td>"
						+"<td><a onclick='return confirm(\"确定删除吗？\")'"
						+ "href='deleteEmp?id="+emp.getId()+"'>删除</a>"
						+"<a onclick='return confirm(\"确定修改吗？\")'"
						+ "href='updateEmp?id="+emp.getId()+"'>修改</a></td>"
						+"</tr>");
			}
			out.println("</table>"
					+"</body></html>");
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
