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

import jdbc.DaoFactory;
/**
 * 所有以.do结尾的请求都会被此servlet处理，并根据请求路径来做请求分发
 * */
public class DispatcherServlet extends HttpServlet{
	HttpSession session = null;
	EmpDao empDao = null;
	UserDao userDao = null;
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
//		context = getServletContext();
//		context.setAttribute("pageNum", pageNum);
		try {
			userDao = (UserDao) DaoFactory.getDao("userDao").newInstance();
			empDao = (EmpDao) DaoFactory.getDao("empDao").newInstance();
			countPage = empDao.countPage(pageSize);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		}
		out.close();
	}
	
	private void logoutUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
		session.invalidate();
		response.sendRedirect("login.jsp");		
	}
	
	private void loginUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String reserve = request.getParameter("reserve");
		
		User findUser = userDao.findUserByUsernameAndPassword(username, password);
		if (findUser==null) {//登陆失败
			response.sendRedirect("login.jsp");
			//ServletContext为共有组件
			//ServletContext context =getServletContext();
			//context.setAttribute("msg", "账号密码错误");
			//重定向可以使用session传递数据
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
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		int row = userDao.addUser(user);
		if (row!=0) {
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
//		String username =(String)session.getAttribute("username");
//		if (username==null) {
//			response.sendRedirect("login.jsp");
//			return;
//		}
		int id = Integer.parseInt(request.getParameter("id"));
		pageNum = (int)session.getAttribute("pageNum");
		Emp emp = empDao.findEmpById(id);
		request.setAttribute("emp", emp);
		request.getRequestDispatcher("updateEmp.jsp").forward(request, response);	
	}
	/**
	 * 去修改，分页查询显示当前页
	 * @throws IOException 
	 * */
	private void updateEmp(HttpServletRequest request, HttpServletResponse response) throws IOException {
//		String username =(String)session.getAttribute("username");
//		if (username==null) {
//			response.sendRedirect("login.jsp");
//			return;
//		}
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		Double salary = Double.parseDouble(request.getParameter("salary"));
		int age = Integer.parseInt(request.getParameter("age"));
		pageNum = (int)session.getAttribute("pageNum");
		Emp emp = new Emp(id,name,salary,age);
		boolean result = empDao.updateEmp(emp);
		//测试当前修改页
		System.out.println(pageNum);
		if (result) {
			response.sendRedirect("listEmp.do");
		}else {
			response.sendRedirect("system_error.jsp");
		}
	}
	/**
	 * 删除，显示当前页，判断删除后是否影响显示页面
	 * @throws IOException 
	 * */
	private void deleteEmp(HttpServletRequest request, HttpServletResponse response) throws IOException {
//		String username =(String)session.getAttribute("username");
//		if (username==null) {
//			response.sendRedirect("login.jsp");
//			return;
//		}
		int id = Integer.parseInt(request.getParameter("id"));
		boolean result = empDao.deleteById(id);
		int newcountpage = empDao.countPage(pageSize);
		if (pageNum==countPage&&newcountpage<countPage) {
			pageNum--;
			session.setAttribute("pageNum",pageNum);
		}
		countPage=newcountpage;
		if (result) {
			response.sendRedirect("listEmp.do");
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
//		String username =(String)session.getAttribute("username");
//		if (username==null) {
//			response.sendRedirect("login.jsp");
//			return;
//		}
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
		boolean result = empDao.addEmp(emp);
		//最后一页
		pageNum = empDao.countPage(pageSize);
		session.setAttribute("pageNum",pageNum);
		//重定向到ListEmpServlet地址ListEmp
		if (result) {
			response.sendRedirect("listEmp.do");
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
//		String username =(String)session.getAttribute("username");
//		if (username==null) {
//			response.sendRedirect("login.jsp");
//			return;
//		}
		
		System.out.println("增删改后的页码"+pageNum);
		
		
		pageNum = (int)session.getAttribute("pageNum");
		String str = request.getParameter("pageNum");
		if (str!=null) {
			//通过下拉列表换页
			pageNum = Integer.parseInt(str);
			session.setAttribute("pageNum", pageNum);
		}
		//通过下一页按钮换页
		if (pageNum==0) {//第一次显示session中未存页码
			pageNum = 1;
			session.setAttribute("pageNum", pageNum);
		}
		
		//测试当前页
		countPage = empDao.countPage(pageSize);
		List<Emp> emps = empDao.findPage(pageNum, pageSize);
		request.setAttribute("countPage",countPage);
		request.setAttribute("emps", emps);
		RequestDispatcher rd = request.getRequestDispatcher("empList.jsp");
		rd.forward(request,response);
	}
}
