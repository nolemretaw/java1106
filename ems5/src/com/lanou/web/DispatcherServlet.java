package com.lanou.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lanou.bean.Emp;
import com.lanou.bean.User;
import com.lanou.dao.EmpDao;
import com.lanou.dao.UserDao;
import com.lanou.service.EmpService;
import com.lanou.service.UserService;
import com.lanou.service.impl.EmpServiceImpl;
import com.lanou.service.impl.UserServiceImpl;

import jdbc.DaoFactory;
/**
 * 所有以.do结尾的请求都会被此servlet处理，并根据请求路径来做请求分发
 * */
public class DispatcherServlet extends HttpServlet{
	HttpSession session = null;
	
	EmpService empService = new EmpServiceImpl();

	UserService userService = new UserServiceImpl();
	
	PrintWriter out = null;
	ServletContext context = null;
	int pageSize = 4;//每页4条
	int pageNum = 1;//初始页设置为1
	int countPage =0;
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		out=response.getWriter();
		session = request.getSession();
		//获取请求路径
		String uri = request.getRequestURI();
		uri = uri.substring(uri.lastIndexOf("/")+1);
		//用session记录当前页
		session.setAttribute("pageNum", pageNum);
		countPage = empService.countPage(pageSize);
		
		//根据uri请求分发处理
		if ("listEmp.do".equals(uri)) {
			/*listAllEmps(request,response);*/
			listPageEmps(request,response);
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
		}else if ("logoutUser.do".equals(uri)) {
			logoutUser(request,response);
		}else if ("checkName.do".equals(uri)) {
			checkName(request,response);
		}
		out.close();
	}
	
	private void checkName(HttpServletRequest request, HttpServletResponse response) {
		//1、接收用户名
		String username = request.getParameter("username");
		//2、调用service判断
		boolean exists = userService.isUsernameExists(username);
		out.println(exists);
	}

	private void logoutUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
		session.invalidate();
		response.sendRedirect("login.jsp");		
	}
	
	private void loginUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String userCode = request.getParameter("validateCode");
		String validateCode = (String)session.getAttribute("code");
		//验证码忽略大小写
		if (!validateCode.equalsIgnoreCase(userCode)) {
			response.sendRedirect("regist.jsp");
			session.setAttribute("validateCodeErrorMsg", "验证码错误");
			return;
		}
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String reserve = request.getParameter("reserve");
		User user = new User();
		user.setUsername(username);user.setPassword(password);
		boolean loginSuccess = userService.login(user);
	
		if (!loginSuccess) {//登陆失败
			response.sendRedirect("login.jsp");
			session.setAttribute("msg", "账号密码错误");
		}else {
			if (reserve!=null) {
				username = URLEncoder.encode(username);
				Cookie cookie1 = new Cookie("username", username);
				Cookie cookie2 = new Cookie("password", password);
				cookie1.setMaxAge(60);//3600*24*7
				cookie2.setMaxAge(60);
			}
			//设置session生存时间
			session.setAttribute("username", username);
//			session.setMaxInactiveInterval(60);
			response.sendRedirect("listEmp.do");
		}
		
	}
	private void registUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 增加user
		//获取用户填写的邮箱验证码
		String userEmailValidateCode = request.getParameter("emailValidateCode");
		//获取之前存到session的邮箱验证码
		HttpSession session = request.getSession();
		String sessionEmailValidateCode = (String)session.getAttribute("emailCode");
		if (sessionEmailValidateCode==null) {
			session.setAttribute("emailCodeError", "验证码已过期");
			response.sendRedirect("regist.jsp");
			return;
		}
		if (!userEmailValidateCode.equals(
				sessionEmailValidateCode)) {
			session.setAttribute("emailCodeError", "验证码错误");
			response.sendRedirect("regist.jsp");
			return;
		}
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		boolean registSuccess = userService.regist(user);
		if (registSuccess) {
			response.sendRedirect("login.jsp");
		}else {
			response.sendRedirect("regist.jsp");
			session.setAttribute("dupNameMsg", "用户名重复");
		}
	}
	/**
	 * 修改表单
	 * @throws IOException 
	 * @throws ServletException 
	 * */
	private void toUpdateEmp(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
 
		int id = Integer.parseInt(request.getParameter("id"));
		pageNum = Integer.parseInt(request.getParameter("pageNum"));
		Emp emp = empService.findEmpById(id);
		request.setAttribute("emp", emp);
		request.setAttribute("pageNum", pageNum);
		request.getRequestDispatcher("updateEmp.jsp").forward(request, response);	
	}
	/**
	 * 去修改，分页查询显示当前页
	 * @throws IOException 
	 * */
	private void updateEmp(HttpServletRequest request, HttpServletResponse response) throws IOException {
 
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		Double salary = Double.parseDouble(request.getParameter("salary"));
		int age = Integer.parseInt(request.getParameter("age"));
		Emp emp = new Emp(id,name,salary,age);
		boolean result = empService.updateEmp(emp);
		if (result) {
			response.sendRedirect("listEmp.do?pageNum="+pageNum);
		}else {
			response.sendRedirect("system_error.jsp");
		}
	}
	/**
	 * 删除，显示当前页，判断删除后是否影响显示页面
	 * @throws IOException 
	 * */
	private void deleteEmp(HttpServletRequest request, HttpServletResponse response) throws IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		boolean result = empService.deleteById(id);
		int newcountpage =empService.countPage(pageSize); 
		if (pageNum==countPage&&newcountpage<countPage) {
			pageNum--;
			request.setAttribute("pageNum",pageNum);
		}
		countPage=newcountpage;
		if (result) {
			response.sendRedirect("listEmp.do?pageNum="+pageNum);
		}else {
			response.sendRedirect("system_error.jsp");
		}	
	}
	/**
	 * 添加
	 * @throws IOException 
	 * 分页查询显示最后一页
	 * */
	private void addEmp(HttpServletRequest request, HttpServletResponse response) throws IOException {

		//2、获取jsp页面提交的数据
		String name = request.getParameter("name");
		double salary = Double.parseDouble(request.getParameter("salary"));
		int age = Integer.parseInt(request.getParameter("age"));
		Emp emp = new Emp();
		emp.setName(name);
		emp.setAge(age);
		emp.setSalary(salary);
		//3、调用dao向数据插入一行数据
		//插入成功
		boolean result = empService.addEmp(emp);
		//最后一页
		pageNum = empService.countPage(pageSize);
		request.setAttribute("pageNum",pageNum);
		//重定向到ListEmpServlet地址ListEmp
		if (result) {
			response.sendRedirect("listEmp.do?pageNum="+pageNum);
			}else {
				response.sendRedirect("system_error.jsp");
			}
	}
	/**
	 * 分页查询所有的emp对象
	 * @throws IOException 
	 * @throws ServletException 
	 * 
	 * */

	private void listPageEmps(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		
		String value = request.getParameter("pageNum");
		if (value!=null) {
			//通过下拉列表换页
			pageNum = Integer.parseInt(value);
		}else {
			pageNum = 1;
		}
		countPage = empService.countPage(pageSize);
		List<Emp> emps = empService.findPage(pageNum, pageSize);
		request.setAttribute("countPage",countPage);
		request.setAttribute("emps", emps);
		request.setAttribute("pageNum", pageNum);
		RequestDispatcher rd = request.getRequestDispatcher("empList.jsp");
		rd.forward(request,response);
	}
}
