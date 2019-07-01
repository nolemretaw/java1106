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
 * ����dao����ѯ���ݿ����������ݲ���ǰ�˽��з���
 */
public class ListEmpServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		//1����������������Ӧ����
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = null;
		//2������dao����ȡ���ݿ�����������
		try {
			out = response.getWriter();
			EmpDao dao = (EmpDao) DaoFactory.getDao("empDao").newInstance();
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
						+"<td><a onclick='return confirm(\"ȷ��ɾ����\")'"
						+ "href='deleteEmp?id="+emp.getId()+"'>ɾ��</a>"
						+"<a onclick='return confirm(\"ȷ���޸���\")'"
						+ "href='updateEmp?id="+emp.getId()+"'>�޸�</a></td>"
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
