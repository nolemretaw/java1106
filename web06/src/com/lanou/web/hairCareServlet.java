package com.lanou.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * session����Ĵ���
 */
@WebServlet("/hairCare")
public class hairCareServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ���ñ���
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		//�������ȡsession����
		/**
		 * getSession()����
		 * ����Ϊtrue:Ĭ��ֵ
		 * �ж��������ݰ�����û��Я��JESSIONID
		 * --|û��Я��JESSIONID����һ�Σ�
		 * ----|����һ��sessoin���󲢷���
		 * 
		 * --|������JESSIONID���ǵ�һ�Σ�
		 * ----|����JESSIONID�ҵ���session���󣬷���
		 * ----|����JESSIONIDû���ҵ�session����
		 * 		����һ��session���󲢷���
		 * 		1>��Ϊ�޸����������JESSIONID
		 * 		2>�������˵�session����ɾ����
		 * 	�������ַ�ʽ������´�����session,������session�������һ��Ψһid��
		 * 	������ӵ���Ӧ���ݰ��У���cookie��ʽ���ظ������
		 * 
		 * 	����Ϊfalse
		 * 	--|û��Я��JESSIONID����һ�Σ�
		 * 	----|����null
		 * 
		 * 	--|������JESSIONID���ǵ�һ�Σ�
		 * 	----|����JESSIONID�ҵ���session���󣬷��ض���
		 * 	----|����JESSIONIDû���ҵ�session���󣬷���null
		 **/
		HttpSession session = request.getSession();
		System.out.println(session);
		//��ȡsession�����Ψһid
		System.out.println(session.getId());
		
		//count=10,��session�����л�ȡʣ��������
		Integer count = (Integer)session.getAttribute("count");
		if (count==null) {//��һ��
			count=10;
		}else{
			if (count>0) {	
				count--;
			}
		}
		//���޸����Ĵ������´洢��session��
		session.setAttribute("count", count);
		out.println("ʣ���������:"+count);
		out.close();
	}
}
