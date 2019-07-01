package com.lanou.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

import com.lanou.util.StringUtil;

/**
 * �����û���д�����䣬�����䷢����֤��
 */
@WebServlet("/emailValidateCode.do")
public class EmailValidateCodeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		//��������
		String userEmail = request.getParameter("email");
		System.out.println(userEmail);
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
			email.setSubject("������֤��");
			
			//�ʼ�����
			String emailCode = StringUtil.createValidateCode();

			email.setMsg("������֤��Ϊ:"+emailCode);
			
			//��ȡsession���󣬽���֤�����
			HttpSession session = request.getSession();
			session.setAttribute("emailCode", emailCode);
			
			//����
			email.send();
			out.println("ok");
			out.close();
			//һ���Ӻ󣬴�session���Ƴ�������֤��
			Timer timer = new Timer();
			timer.schedule(new TimerTask() {				
				@Override
				public void run() {
					session.removeAttribute("emailCode");	
				}
			}, 1000*60);
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
