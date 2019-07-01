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
 * ������.do��β�����󶼻ᱻ��servlet��������������·����������ַ�
 * */
public class DispatcherServlet extends HttpServlet{
	HttpSession session = null;
	
	EmpService empService = new EmpServiceImpl();

	UserService userService = new UserServiceImpl();
	
	PrintWriter out = null;
	ServletContext context = null;
	int pageSize = 4;//ÿҳ4��
	int pageNum = 1;//��ʼҳ����Ϊ1
	int countPage =0;
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		out=response.getWriter();
		session = request.getSession();
		//��ȡ����·��
		String uri = request.getRequestURI();
		uri = uri.substring(uri.lastIndexOf("/")+1);
		//��session��¼��ǰҳ
		session.setAttribute("pageNum", pageNum);
		countPage = empService.countPage(pageSize);
		
		//����uri����ַ�����
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
		//1�������û���
		String username = request.getParameter("username");
		//2������service�ж�
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
		//��֤����Դ�Сд
		if (!validateCode.equalsIgnoreCase(userCode)) {
			response.sendRedirect("regist.jsp");
			session.setAttribute("validateCodeErrorMsg", "��֤�����");
			return;
		}
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String reserve = request.getParameter("reserve");
		User user = new User();
		user.setUsername(username);user.setPassword(password);
		boolean loginSuccess = userService.login(user);
	
		if (!loginSuccess) {//��½ʧ��
			response.sendRedirect("login.jsp");
			session.setAttribute("msg", "�˺��������");
		}else {
			if (reserve!=null) {
				username = URLEncoder.encode(username);
				Cookie cookie1 = new Cookie("username", username);
				Cookie cookie2 = new Cookie("password", password);
				cookie1.setMaxAge(60);//3600*24*7
				cookie2.setMaxAge(60);
			}
			//����session����ʱ��
			session.setAttribute("username", username);
//			session.setMaxInactiveInterval(60);
			response.sendRedirect("listEmp.do");
		}
		
	}
	private void registUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// ����user
		//��ȡ�û���д��������֤��
		String userEmailValidateCode = request.getParameter("emailValidateCode");
		//��ȡ֮ǰ�浽session��������֤��
		HttpSession session = request.getSession();
		String sessionEmailValidateCode = (String)session.getAttribute("emailCode");
		if (sessionEmailValidateCode==null) {
			session.setAttribute("emailCodeError", "��֤���ѹ���");
			response.sendRedirect("regist.jsp");
			return;
		}
		if (!userEmailValidateCode.equals(
				sessionEmailValidateCode)) {
			session.setAttribute("emailCodeError", "��֤�����");
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
			session.setAttribute("dupNameMsg", "�û����ظ�");
		}
	}
	/**
	 * �޸ı�
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
	 * ȥ�޸ģ���ҳ��ѯ��ʾ��ǰҳ
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
	 * ɾ������ʾ��ǰҳ���ж�ɾ�����Ƿ�Ӱ����ʾҳ��
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
	 * ���
	 * @throws IOException 
	 * ��ҳ��ѯ��ʾ���һҳ
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
		boolean result = empService.addEmp(emp);
		//���һҳ
		pageNum = empService.countPage(pageSize);
		request.setAttribute("pageNum",pageNum);
		//�ض���ListEmpServlet��ַListEmp
		if (result) {
			response.sendRedirect("listEmp.do?pageNum="+pageNum);
			}else {
				response.sendRedirect("system_error.jsp");
			}
	}
	/**
	 * ��ҳ��ѯ���е�emp����
	 * @throws IOException 
	 * @throws ServletException 
	 * 
	 * */

	private void listPageEmps(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		
		String value = request.getParameter("pageNum");
		if (value!=null) {
			//ͨ�������б�ҳ
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
