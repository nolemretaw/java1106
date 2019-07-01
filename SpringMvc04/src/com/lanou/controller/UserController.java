package com.lanou.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lanou.bean.User;
import com.lanou.service.UserService;
import com.lanou.util.GlobalConst;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	/**
	 * 访问登录页面
	 * */
	@RequestMapping("toLogin.do")
	public String toLogin() {
		return "login";
	}
	
	/**
	 * 处理用户登陆业务
	 * */
	/*@RequestMapping("/login.do")
	public String login(User user,HttpSession session){
		System.out.println("user:"+user);
		boolean loginSuccess = userService.loginUser(user);
		if (loginSuccess) {//登陆成功
			System.out.println("登陆成功");
			
			session.setAttribute("username",user.getUsername());
			//listAll.do 为相对路径 /listAll.do为绝对路径，从项目根目录开始
			return "redirect:/emp/listAll.do";
			return "redirect:"+GlobalConst.BASE_URL+"emp/listAll.do";//推荐
			
			*//**----转发到显示列表页面--*//*
			//转发到/emp/listAll.do组件
			return "forward:/emp/listAll.do";

		}else {//登陆失败
			System.out.println("登陆失败");
			session.setAttribute("errorMsg", "账号或密码错误");
			return "redirect:toLogin.do";
		}
		
	}*/
	
	
	/**
	 * 处理用户登陆业务
	 * */
	@RequestMapping("/login.do")
	public ModelAndView login(User user,HttpSession session){
		System.out.println("user:"+user);
		boolean loginSuccess = userService.loginUser(user);
		ModelAndView mav = new ModelAndView();
		if (loginSuccess) {//登陆成功
			System.out.println("登陆成功");
			
			session.setAttribute("username",user.getUsername());
			//listAll.do 为相对路径 /listAll.do为绝对路径，从项目根目录开始
			
			/**----转发到显示列表页面--*/
			//转发到/emp/listAll.do组件

			mav.setViewName("redirect:/emp/listAll.do");
//			mav.setViewName("forward:/emp/listAll.do");
		}else {//登陆失败
			System.out.println("登陆失败");
//			session.setAttribute("errorMsg", "账号或密码错误");

			mav.setViewName("redirect:toLogin.do");
			mav.setViewName("login");
		}
		return mav;
	}
}
