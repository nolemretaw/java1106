package com.lanou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lanou.bean.User;

@Controller
public class UserController {
	/**
	 * 接收ajax传过来的账号
	 * 判断账号是否存在
	 * 存在返回true,不存在返回false
	 * */
	@RequestMapping("/checkName.do")
	@ResponseBody
	public boolean checkName(String username) {
		System.out.println(username);
		if ("admin".equals(username)) {
			return true;
		}
		return false;
	}
	
	/**
	 * 处理ajax发送的登录请求
	 * 数据样式:username=zhangsan&password=123
	 * */
	@RequestMapping("/login.do")
	@ResponseBody
	public boolean login (User user){
		System.out.println("user:"+user);
		if ("zhangsan".equals(user.getUsername())
				&&"123".equals(user.getPassword())) {
			return true;
		}
		return false;
	}
	
	/**
	 * 接收ajax提交的json字符串格式
	 * */
	@RequestMapping("/login2.do")
	@ResponseBody
	public boolean login2(@RequestBody User user){
		System.out.println("user:"+user);
		if ("lisa".equals(user.getUsername())&&
				"123".equals(user.getPassword())) {
			return true;
		}
		return false;
	}
	
	
}
