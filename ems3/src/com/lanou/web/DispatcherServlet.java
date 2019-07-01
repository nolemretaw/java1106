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
 * 所有以.do结尾的请求都会被此servlet处理，并根据请求路径来做请求分发
 * */
public class DispatcherServlet extends HttpServlet{
	/**处理员工的dao*/
	EmpDao empDao = null;
	/**处理user的dao*/
	UserDao userDao = null;
	PrintWriter out = null;
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		out = response.getWriter();
		//获取请求路径   
		String uri = request.getRequestURI();
		uri = uri.substring(uri.lastIndexOf("/")+1);
		try {
			empDao = (EmpDao) DaoFactory.getDao("empDao").newInstance();
			userDao = (UserDao) DaoFactory.getDao("userDao").newInstance();
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
		}else if ("registUser.do".equals(uri)) {
			registeUser(request,response);
		}else if ("loginUser.do".equals(uri)) {
			loginUser(request,response);
		}
		out.close();
	}
	
	private void loginUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//获取登陆表单
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//调用dao执行查询
		User findUser = userDao.findUserByUsernameAndPassword(username, password);
		if (findUser==null) {//登陆失败
			//重定向到登陆页面，告知用户账号或密码错误
			response.sendRedirect("login.jsp");
			ServletContext context = getServletContext();
			context.setAttribute("msg", "账号或密码错误");			
		}else {//登陆成功，重定向到显示员工列表界面
			response.sendRedirect("listEmp.do");
		}
	}

	/**
	 * 处理用户注册请求
	 * @param request
	 * @param response
	 * @throws IOException 
	 * */
	private void registeUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//获取注册表单提交的账号和密码
		out.println("<h1>进入登陆</h1>");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		//调用dao方法将数据插入到数据库
		int rows = userDao.addUser(user);
		if (rows!=0) {//插入成功
			response.sendRedirect("login.jsp");
		}else {//插入失败
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
	 * 修改表单
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
	 * 删除
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
					boolean result = empDao.addEmp(emp);
					//重定向到ListEmpServlet地址ListEmp
					if (result) {					
						response.sendRedirect("listEmp.do");
						}
					response.sendRedirect("system_error.jsp");
	}
	/**
	 * 查询所有的emp对象
	 * @throws IOException 
	 * @throws ServletException 
	 * 
	 * */
	private void listAllEmps(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		//2、构建dao，获取数据库中所有数据
			List<Emp> emps = empDao.findAll();
			System.out.println("成功分配");
		//将数据绑定到request中，再转发到empList.jsp
			request.setAttribute("emps", emps);
		//获取转发器，指定转发目标组件
			RequestDispatcher rd = request.getRequestDispatcher("empList.jsp");
			rd.forward(request, response);
	}
}
