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
 * ������.do��β�����󶼻ᱻ��servlet��������������·����������ַ�
 * */
public class DispatcherServlet extends HttpServlet{
	HttpSession session = null;
	EmpDao empDao = null;
	UserDao userDao = null;
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
		if (findUser==null) {//��½ʧ��
			response.sendRedirect("login.jsp");
			//ServletContextΪ�������
			//ServletContext context =getServletContext();
			//context.setAttribute("msg", "�˺��������");
			//�ض������ʹ��session��������
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
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		int row = userDao.addUser(user);
		if (row!=0) {
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
	 * ȥ�޸ģ���ҳ��ѯ��ʾ��ǰҳ
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
		//���Ե�ǰ�޸�ҳ
		System.out.println(pageNum);
		if (result) {
			response.sendRedirect("listEmp.do");
		}else {
			response.sendRedirect("system_error.jsp");
		}
	}
	/**
	 * ɾ������ʾ��ǰҳ���ж�ɾ�����Ƿ�Ӱ����ʾҳ��
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
	 * ���
	 * @throws IOException 
	 * ��ҳ��ѯ��ʾ���һҳ
	 * */
	private void addEmp(HttpServletRequest request, HttpServletResponse response) throws IOException {
//		String username =(String)session.getAttribute("username");
//		if (username==null) {
//			response.sendRedirect("login.jsp");
//			return;
//		}
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
		//���һҳ
		pageNum = empDao.countPage(pageSize);
		session.setAttribute("pageNum",pageNum);
		//�ض���ListEmpServlet��ַListEmp
		if (result) {
			response.sendRedirect("listEmp.do");
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
//		String username =(String)session.getAttribute("username");
//		if (username==null) {
//			response.sendRedirect("login.jsp");
//			return;
//		}
		
		System.out.println("��ɾ�ĺ��ҳ��"+pageNum);
		
		
		pageNum = (int)session.getAttribute("pageNum");
		String str = request.getParameter("pageNum");
		if (str!=null) {
			//ͨ�������б�ҳ
			pageNum = Integer.parseInt(str);
			session.setAttribute("pageNum", pageNum);
		}
		//ͨ����һҳ��ť��ҳ
		if (pageNum==0) {//��һ����ʾsession��δ��ҳ��
			pageNum = 1;
			session.setAttribute("pageNum", pageNum);
		}
		
		//���Ե�ǰҳ
		countPage = empDao.countPage(pageSize);
		List<Emp> emps = empDao.findPage(pageNum, pageSize);
		request.setAttribute("countPage",countPage);
		request.setAttribute("emps", emps);
		RequestDispatcher rd = request.getRequestDispatcher("empList.jsp");
		rd.forward(request,response);
	}
}
