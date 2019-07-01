package com.lanou.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		System.out.println("=======handlerequest=======");
		ModelAndView mav = new ModelAndView();
		ModelMap map = mav.getModelMap();
		map.addAttribute("username", "ÕÅÈý");
		map.addAttribute("password","123");
		mav.setViewName("hello");
		return mav;
	}

}
