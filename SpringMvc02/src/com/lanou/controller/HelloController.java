package com.lanou.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lanou.bean.User;

//������ǰ����һ��������
@Controller
@RequestMapping("/user")
public class HelloController {
	/**�Լ���д������ķ���
	 * @RequestMapping("/hello.do")��ʾ
	 * ��������������ڴ���/hello.do�������
	 * */
	@RequestMapping("/hello.do")
	public ModelAndView handlerRequest(HttpSession session){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello");
		session.setAttribute("msg", "���������˽�");
		return mav;
	}
	/**
	 * ���ʵ�¼ҳ��ķ���
	 * ���ؽ��login����ִ��ת����jspҳ������ƣ��൱�ڷ�����new ModelAndView("login")
	 * */
	@RequestMapping("/toLogin.do")
	public String toLogin(){
		return "login";
	}
	
	/**
	 * ���ڴ����û���¼����ķ���
	 * ����request����JSPҳ�洫ֵ�Լ���JSP�ش�ֵ
	 * */
	@RequestMapping("/login1.do")
	public String login1(HttpServletRequest request) {
		//��ȡ�˺�����
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("username-"+username);
		System.out.println("password-"+password);
		//���˺��������request�У��ٽ���ת��
		request.setAttribute("username", username);
		request.setAttribute("password", password);
		return "show";
	}
	
	/**
	 * ͨ���ڷ���������β�����ȡǰ���ύ������
	 * Ҫ��:�������keyֵ����������ֵ�������뷽���Ĳ������Ʊ���һ��
	 * */
	@RequestMapping("/login2.do")
	public String login2(String username,String password, String age,HttpSession session) {
		System.out.println("username-"+username);
		System.out.println("password-"+password);
		System.out.println("age-"+age);
		session.setAttribute("username", username);
		session.setAttribute("password", password);
		session.setAttribute("age", age);
		return "show";
	}
	
	/**
	 * ͨ���ڷ���������β�����ȡǰ���ύ������
	 * ����������key���β����Ʋ�һ��
	 * @RequestParam(value="keyֵ") ����keyֵ����ȡ�ύ�����ݣ�Ȼ��Ϊ������β�ע��
	 * defaultValue="username" ���û��ֵ��Ĭ��ע��ֵ
	 * required=false ��ֵ���Ǳ�Ҫ
	 * 
	 * ����ModelMap��jsp�ش�ֵ
	 * */
	@RequestMapping("/login3.do")
	public String login3(
		@RequestParam(value="username",
					defaultValue="username",
					required=false) String name,
		@RequestParam("password") String pwd,
		ModelMap modelMap
						){
		System.out.println("name-"+name);
		System.out.println("pwd-"+pwd);
		modelMap.addAttribute("name", name);
		modelMap.addAttribute("pwd", pwd);
		return "show";
	}
	
	/**
	 * �ڷ��������ʵ������������ǰ�˵Ĵ�ֵ
	 * ͨ��medel��ҳ��ش�ֵ
	 * */
	@RequestMapping("login4.do")
	public String login4(User user,Model model){
		System.out.println("user:"+user);
		model.addAttribute("user",user);
		return "show";
	}
	
}
