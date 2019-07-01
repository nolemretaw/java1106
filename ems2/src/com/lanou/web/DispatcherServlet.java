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
 * ������.do��β�����󶼻ᱻ��servlet��������������·����������ַ�
 * */
public class DispatcherServlet extends HttpServlet{
	EmpDao dao = null;
	PrintWriter out = null;
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		//��ȡ����·��
		String uri = request.getRequestURI();
		uri = uri.substring(uri.lastIndexOf("/")+1);
		try {
			dao = (EmpDao) DaoFactory.getDao("empDao").newInstance();
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
		}
		out.close();
	}
	/**
	 * �޸ı�
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
						+"<legend>Ա����Ϣ�޸�</legend>"
						+"<form action='updateEmp.do' method='post'>"
						+"<input type='hidden' readonly name='id' value='"+emp.getId()+"'/>"
						+"</br>"
						+"����<input type='text' name='name' value='"+emp.getName()+"'/>"
						+"</br>"
						+"нˮ<input type='text' name='salary' value='"+emp.getSalary()+"'>"
						+"</br>"
						+"����<input type='text' name='age' value='"+emp.getAge()+"'>"
						+"</br>"	
						+"<input type='submit' value='�޸�'>"
						+"</fieldset>"
						+"</form>"
						+"</body>"
						+"</html>");
			}
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
	 * ɾ��
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
					boolean result = dao.addEmp(emp);
					//�ض���ListEmpServlet��ַListEmp
					if (result) {
						response.sendRedirect("listEmp.do");
						}
	}
	/**
	 * ��ѯ���е�emp����
	 * @throws IOException 
	 * 
	 * */
	private void listAllEmps(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//2������dao����ȡ���ݿ�����������
			out = response.getWriter();
			List<Emp> emps = dao.findAll();
			out.println("<html>"
					+"<head><meta charset='UTF-8'/><head>"
					+"<body>"
					+"<table border='1' bordercolor='white' align='center cellspacing='0' cellpadding='5' style='border-collapse:collapse'>"
					+"<caption>Ա���б�<a href='addEmp.html'>�������</a></caption>"
					+"<tr align='center' bgcolor='skyblue'>"
					+"<td width='100'>���</td>"
					+"<td width='100'>����</td>"
					+"<td width='100'>нˮ</td>"
					+"<td width='100'>����</td>"
					+"<td width='100'>����</td></tr>");
			int i = 1;//��ɫ
			for (Emp emp : emps) {	
				out.println("<tr align='center' bgcolor='"
						+(i++%2==0?"red":"green")+"'>"
						+"<td>"+emp.getId()+"</td>"
						+"<td>"+emp.getName()+"</td>"
						+"<td>"+emp.getSalary()+"</td>"
						+"<td>"+emp.getAge()+"</td>"
						+"<td><a onclick='' confirm(\"ȷ��ɾ����\")'"
						+ "href='deleteEmp.do?id="+emp.getId()+"'>ɾ��</a>"
						+"<a onclick='return confirm(\"ȷ���޸���\")'"
						+ "href='toUpdateEmp.do?id="+emp.getId()+"'>�޸�</a></td>"
						+"</tr>");
			}
			out.println("</table>"
					+"</body></html>");
		
	}
}
