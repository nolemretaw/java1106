package com.lanou.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


/**
 * 处理器
 * 	处理器 Handler:	专门处理请求的
 * 	控制器Controller:	针对MVC设计模式的
 * 	核心控制器，后端控制器
 * 		相对于前端控制器DispatcherServlet
 * 	作用：相当于处理请求的servlet组件
 * */
public class HelloController implements Controller{
	/**
	 * 处理器处理请求的方法
	 * request:请求对象
	 * response:相应对象
	 * 
	 * @return ModelAndView 模型数据和视图
	 * 作用：封装业务层返回的数据，以及要转发的JSP页面名称
	 * */
	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("====handleRequest====");
		ModelAndView mav = new ModelAndView();
		//往mav对象中存入数据，转发到页面进行显示
		//在SpringMvc底层执行的是
		//resquest.setAttribute("username", "张三")
		Map<String, Object> map = mav.getModel();
		map.put("username", "张三");
		ModelMap modelMap = mav.getModelMap();
		modelMap.addAttribute("password", "123");
		//封装要转发的视图名称,不用写后缀
		mav.setViewName("hello");
		return mav;
		
	}
	
}

