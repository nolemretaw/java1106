package com.lanou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lanou.bean.User;

@Controller
public class UserController {
	/**
	 * ����ajax���������˺�
	 * �ж��˺��Ƿ����
	 * ���ڷ���true,�����ڷ���false
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
	 * ����ajax���͵ĵ�¼����
	 * ������ʽ:username=zhangsan&password=123
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
	 * ����ajax�ύ��json�ַ�����ʽ
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
