package com.lanou.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lanou.bean.Emp;
import com.lanou.bean.User;
import com.lanou.dao.EmpDao;
import com.lanou.dao.UserDao;

import jdbc.DaoFactory;
/**
 * ������.do��β�����󶼻ᱻ��servlet��������������·����������ַ�
 * */
public class DispatcherServlet extends HttpServlet{
	EmpDao empDao = null;
	UserDao userDao = null;
	PrintWriter out = null;
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		out=response.getWriter();
		//��ȡ����·��
		String uri = request.getRequestURI();
		uri = uri.substring(uri.lastIndexOf("/")+1);
		try {
			userDao = (UserDao) DaoFactory.getDao("userDao").newInstance();
			empDao = (EmpDao) DaoFactory.getDao("empDao").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//����uri����ַ�����
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
		}else if ("registUser.do".equals(uri)) {
			registUser(request,response);
		}else if ("loginUser.do".equals(uri)) {
			loginUser(request,response);
		}
		out.close();
	}
	private void loginUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User findUser = userDao.findUserByUsernameAndPassword(username, password);
		if (findUser==null) {//��½ʧ��
			response.sendRedirect("login.jsp");
			//ServletContextΪ�������
			ServletContext context =getServletContext();
			context.setAttribute("msg", "�˺��������");
		}else {
			response.sendRedirect("listEmp.do");
		}
		
	}
	private void registUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// ����user
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		int row = userDao.addUser(user);
		if (row!=0) {
			response.sendRedirect("login.jsp");
		}else {
			response.sendRedirect("regist.jsp");
		}
	}
	/**
	 * �޸ı�
	 * @throws IOException 
	 * @throws ServletException 
	 * */
	private void toUpdateEmp(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		int id = Integer.parseInt(request.getParameter("id"));
		Emp emp = empDao.findEmpById(id);
		request.setAttribute("emp", emp);
		request.getRequestDispatcher("updateEmp.jsp").forward(request, response);	
	}
	/**
	 * ȥ�޸�
	 * @throws IOException 
	 * */
	private void updateEmp(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		Double salary = Double.parseDouble(request.getParameter("salary"));
		int age = Integer.parseInt(request.getParameter("age"));
		Emp emp = new Emp(id,name,salary,age);
		boolean result = empDao.updateEmp(emp);
		if (result) {
			response.sendRedirect("listEmp.do");
		}else {
			response.sendRedirect("400");
		}
	}
	/**
	 * ɾ��
	 * @throws IOException 
	 * */
	private void deleteEmp(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int id = Integer.parseInt(request.getParameter("id"));
			boolean result = empDao.deleteById(id);
			if (result) {
				response.sendRedirect("listEmp.do");
			}	
	}
	/**
	 * ���
	 * @throws IOException 
	 * */
	private void addEmp(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//2����ȡjspҳ���ύ������
		String name = request.getParameter("name");
		double salary = Double.parseDouble(request.getParameter("salary"));
		int age = Integer.parseInt(request.getParameter("age"));
		Emp emp = new Emp();
		emp.setName(name);
		emp.setAge(age);
		emp.setSalary(salary);
		//3������dao�����ݲ���һ������
			//����ɹ�
			boolean result = empDao.addEmp(emp);
			//�ض���ListEmpServlet��ַListEmp
			if (result) {
				response.sendRedirect("listEmp.do");
				}
	}
	/**
	 * ��ѯ���е�emp����
	 * @throws IOException 
	 * @throws ServletException 
	 * 
	 * */
	private void listAllEmps(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		//��ȡ���ݿ�����������
		List<Emp> emps = empDao.findAll();
		request.setAttribute("emps", emps);
		request.getRequestDispatcher("empList.jsp").forward(request, response);;
			
	}
}
