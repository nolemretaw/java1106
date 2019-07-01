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
 * 所有以.do结尾的请求都会被此servlet处理，并根据请求路径来做请求分发
 * */
public class DispatcherServlet extends HttpServlet{
	EmpDao dao = null;
	PrintWriter out = null;
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		//获取请求路径
		String uri = request.getRequestURI();
		uri = uri.substring(uri.lastIndexOf("/")+1);
		try {
			dao = (EmpDao) DaoFactory.getDao("empDao").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//根据uri请求分发处理
		if ("listEmp.do".equals(uri)) {
			listAllEmps(request,response);
		}else if ("addEmp.do".equals(uri)) {
			addEmp(request,response);
		}else if ("deleteEmp.do".equals(uri)) {
			deleteEmp(request,response);
		}else if ("toUpdateEmp.do".equals(uri)) {
			toUpdateEmp(request,response);
		}else if ("updateEmp.do".equals(uri)) {
			updateEmp(request,response);
		}
		out.close();
	}
	/**
	 * 修改表单
	 * @throws IOException 
	 * */
	private void toUpdateEmp(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int id = Integer.parseInt(request.getParameter("id"));
	
			Emp emp = dao.findEmpById(id);
			out = response.getWriter();
			if (emp!=null) {
				out.println("<html>"
						+"<head><meta charset='UTF-8'/><head>"
						+"<body>"
						+"<fieldset>"
						+"<legend>员工信息修改</legend>"
						+"<form action='updateEmp.do' method='post'>"
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
	}
	/**
	 * 去修改
	 * @throws IOException 
	 * */
	private void updateEmp(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		Double salary = Double.parseDouble(request.getParameter("salary"));
		int age = Integer.parseInt(request.getParameter("age"));
		Emp emp = new Emp();
		emp.setId(id);emp.setName(name);emp.setAge(age);emp.setSalary(salary);
			boolean result = dao.updateEmp(emp);
			if (result) {
				response.sendRedirect("listEmp.do");
			}else {
				response.sendRedirect("400");
			}
	}
	/**
	 * 删除
	 * @throws IOException 
	 * */
	private void deleteEmp(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int id = Integer.parseInt(request.getParameter("id"));
			boolean result = dao.deleteById(id);
			if (result) {
				response.sendRedirect("listEmp.do");
			}	
	}
	/**
	 * 添加
	 * @throws IOException 
	 * */
	private void addEmp(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//2、获取html页面提交的数据
				String name = request.getParameter("name");
				Double salary = Double.parseDouble(request.getParameter("salary"));
				int age = Integer.parseInt(request.getParameter("age"));
				Emp emp = new Emp();
				emp.setName(name);
				emp.setAge(age);
				emp.setSalary(salary);
				//3、调用dao向数据插入一行数据
					//插入成功
					boolean result = dao.addEmp(emp);
					//重定向到ListEmpServlet地址ListEmp
					if (result) {
						response.sendRedirect("listEmp.do");
						}
	}
	/**
	 * 查询所有的emp对象
	 * @throws IOException 
	 * 
	 * */
	private void listAllEmps(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//2、构建dao，获取数据库中所有数据
			out = response.getWriter();
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
						+"<td><a onclick='' confirm(\"确定删除吗？\")'"
						+ "href='deleteEmp.do?id="+emp.getId()+"'>删除</a>"
						+"<a onclick='return confirm(\"确定修改吗？\")'"
						+ "href='toUpdateEmp.do?id="+emp.getId()+"'>修改</a></td>"
						+"</tr>");
			}
			out.println("</table>"
					+"</body></html>");
		
	}
}
