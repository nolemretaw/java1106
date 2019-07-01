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

//表明当前类是一个处理器
@Controller
@RequestMapping("/user")
public class HelloController {
	/**自己编写请求处理的方法
	 * @RequestMapping("/hello.do")表示
	 * 下面这个方法用于处理/hello.do这个请求
	 * */
	@RequestMapping("/hello.do")
	public ModelAndView handlerRequest(HttpSession session){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello");
		session.setAttribute("msg", "今天是愚人节");
		return mav;
	}
	/**
	 * 访问登录页面的方法
	 * 返回结果login代表执行转发的jsp页面的名称，相当于返回了new ModelAndView("login")
	 * */
	@RequestMapping("/toLogin.do")
	public String toLogin(){
		return "login";
	}
	
	/**
	 * 用于处理用户登录请求的方法
	 * 利用request接收JSP页面传值以及向JSP回传值
	 * */
	@RequestMapping("/login1.do")
	public String login1(HttpServletRequest request) {
		//获取账号密码
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("username-"+username);
		System.out.println("password-"+password);
		//将账号密码存入request中，再进行转发
		request.setAttribute("username", username);
		request.setAttribute("password", password);
		return "show";
	}
	
	/**
	 * 通过在方法中添加形参来获取前端提交的数据
	 * 要求:请求参数key值（表单的属性值）必须与方法的参数名称保持一致
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
	 * 通过在方法中添加形参来获取前端提交的数据
	 * 如果请求参数key和形参名称不一致
	 * @RequestParam(value="key值") 根据key值来获取提交的数据，然后为后面的形参注入
	 * defaultValue="username" 如果没有值的默认注入值
	 * required=false 此值不是必要
	 * 
	 * 利用ModelMap向jsp回传值
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
	 * 在方法中添加实体对象参数接收前端的传值
	 * 通过medel向页面回传值
	 * */
	@RequestMapping("login4.do")
	public String login4(User user,Model model){
		System.out.println("user:"+user);
		model.addAttribute("user",user);
		return "show";
	}
	
}
