package com.lanou.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
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
	/**����Ա����dao*/
	EmpDao empDao = null;
	/**����user��dao*/
	UserDao userDao = null;
	PrintWriter out = null;
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		out = response.getWriter();
		//��ȡ����·��   
		String uri = request.getRequestURI();
		uri = uri.substring(uri.lastIndexOf("/")+1);
		try {
			empDao = (EmpDao) DaoFactory.getDao("empDao").newInstance();
			userDao = (UserDao) DaoFactory.getDao("userDao").newInstance();
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
			registeUser(request,response);
		}else if ("loginUser.do".equals(uri)) {
			loginUser(request,response);
		}
		out.close();
	}
	
	private void loginUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//��ȡ��½��
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//����daoִ�в�ѯ
		User findUser = userDao.findUserByUsernameAndPassword(username, password);
		if (findUser==null) {//��½ʧ��
			//�ض��򵽵�½ҳ�棬��֪�û��˺Ż��������
			response.sendRedirect("login.jsp");
			ServletContext context = getServletContext();
			context.setAttribute("msg", "�˺Ż��������");			
		}else {//��½�ɹ����ض�����ʾԱ���б����
			response.sendRedirect("listEmp.do");
		}
	}

	/**
	 * �����û�ע������
	 * @param request
	 * @param response
	 * @throws IOException 
	 * */
	private void registeUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//��ȡע����ύ���˺ź�����
		out.println("<h1>�����½</h1>");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		//����dao���������ݲ��뵽���ݿ�
		int rows = userDao.addUser(user);
		if (rows!=0) {//����ɹ�
			response.sendRedirect("login.jsp");
		}else {//����ʧ��
			response.sendRedirect("regist.jsp");
		}
	}
	private void updateEmp(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		Double salary = Double.parseDouble(request.getParameter("salary"));
		int age = Integer.parseInt(request.getParameter("age"));
		Emp emp = new Emp();
		emp.setId(id);emp.setName(name);emp.setAge(age);emp.setSalary(salary);
			boolean result = empDao.updateEmp(emp);
			if (result) {
				response.sendRedirect("listEmp.do");
			}else {
				response.sendRedirect("system_error.jsp");
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
			if (emp!=null) {
				request.setAttribute("emp", emp);
				RequestDispatcher rd = request.getRequestDispatcher("updateEmp.jsp");
				rd.forward(request, response);
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
			response.sendRedirect("system_error.jsp");
	}
	/**
	 * ���
	 * @throws IOException 
	 * */
	private void addEmp(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//2����ȡhtmlҳ���ύ������
				String name = request.getParameter("name");
				Double salary = Double.parseDouble(request.getParameter("salary"));
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
					response.sendRedirect("system_error.jsp");
	}
	/**
	 * ��ѯ���е�emp����
	 * @throws IOException 
	 * @throws ServletException 
	 * 
	 * */
	private void listAllEmps(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		//2������dao����ȡ���ݿ�����������
			List<Emp> emps = empDao.findAll();
			System.out.println("�ɹ�����");
		//�����ݰ󶨵�request�У���ת����empList.jsp
			request.setAttribute("emps", emps);
		//��ȡת������ָ��ת��Ŀ�����
			RequestDispatcher rd = request.getRequestDispatcher("empList.jsp");
			rd.forward(request, response);
	}
}
