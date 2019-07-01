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
 * 接收用户提交的邮箱地址
 * 借助163邮箱服务器向该邮箱发一封邮件
 */
@WebServlet("/sendEmail.do")
public class SendEmailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		//接收用户填写的邮箱
		String userEmail = request.getParameter("email");
		
		//构建邮件客户端对象
		HtmlEmail email = new HtmlEmail();
		
		//设置邮箱服务器地址
		email.setHostName("smtp.163.com");
		
		//设置服务器邮箱以及授权码
		email.setAuthentication("foxhutingrong@163.com", "123lalala");
		
		//统一编码
		email.setCharset("UTF-8");
		
		try {
			//发件人
			email.setFrom("foxhutingrong@163.com","蓝鸥科技");
			
			//收件人/群发
			email.addTo(userEmail);
			
			//邮件标题
			email.setSubject("这是来自未来的邮件。。。");
			
			//邮件内容
			email.setMsg("这个世界缺的不是完美的人，而是从心底给出的真心，正义，无畏和同情");
			
//			for (int i = 0; i < 5; i++) {
				
				//发送
				email.send();
//			}
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println("邮件发送成功");
		out.close();
	}

}
