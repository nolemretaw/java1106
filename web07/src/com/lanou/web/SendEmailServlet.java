package com.lanou.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

/**
 * �����û��ύ�������ַ
 * ����163���������������䷢һ���ʼ�
 */
@WebServlet("/sendEmail.do")
public class SendEmailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		//�����û���д������
		String userEmail = request.getParameter("email");
		
		//�����ʼ��ͻ��˶���
		HtmlEmail email = new HtmlEmail();
		
		//���������������ַ
		email.setHostName("smtp.163.com");
		
		//���÷����������Լ���Ȩ��
		email.setAuthentication("foxhutingrong@163.com", "123lalala");
		
		//ͳһ����
		email.setCharset("UTF-8");
		
		try {
			//������
			email.setFrom("foxhutingrong@163.com","��Ÿ�Ƽ�");
			
			//�ռ���/Ⱥ��
			email.addTo(userEmail);
			
			//�ʼ�����
			email.setSubject("��������δ�����ʼ�������");
			
			//�ʼ�����
			email.setMsg("�������ȱ�Ĳ����������ˣ����Ǵ��ĵ׸��������ģ����壬��η��ͬ��");
			
//			for (int i = 0; i < 5; i++) {
				
				//����
				email.send();
//			}
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println("�ʼ����ͳɹ�");
		out.close();
	}

}
