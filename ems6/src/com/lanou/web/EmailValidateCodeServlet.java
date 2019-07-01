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
 * 接收用户填写的邮箱，向邮箱发送验证码
 */
@WebServlet("/emailValidateCode.do")
public class EmailValidateCodeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		//接收邮箱
		String userEmail = request.getParameter("email");
		System.out.println(userEmail);
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
			email.setSubject("邮箱验证码");
			
			//邮件内容
			String emailCode = StringUtil.createValidateCode();

			email.setMsg("邮箱验证码为:"+emailCode);
			
			//获取session对象，将验证码存入
			HttpSession session = request.getSession();
			session.setAttribute("emailCode", emailCode);
			
			//发送
			email.send();
			out.println("ok");
			out.close();
			//一分钟后，从session中移除邮箱验证码
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
