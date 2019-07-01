package com.lanou.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lanou.bean.User;

@Controller
public class AjaxController {
	/**
	 * ���������Ajax����ģ��ڷ����ַ�����ʱ��
	 * ������ַ����Լ���ͼ���������ҵ���Ӧ��JSPҳ�棬
	 * ��JSPҳ���Դ�뷵�ظ�Ajax,��������ʾҳ��
	 * 
	 * 	@ResponseBody �ᱣ֤���ݲ�������ͼ���������̣�����ֱ�ӷ��ظ�Ajax
	 * */
	@RequestMapping("/ajax1.do")
	public @ResponseBody String ajax1(){
		return "hello";
	}
	
	/**
	 * ��ǰ��Ajax����javaBeanʵ�����
	 * 
	 * */
	@RequestMapping("/ajax2.do")
	public @ResponseBody int ajax2(){
		return 100;
	}
	
	/**
	 * ��ǰ��Ajax����javabeanʵ�����
	 * ǰ��JS�������JSON����
	 * */
	@RequestMapping("/ajax3.do")
	public @ResponseBody User ajax3(){
		User user = new User(1,"�۰�","123");
		return user;
	}
	
	/**
	 * ��ǰ��Ajax����map��������
	 * ǰ��JS������json����
	 * */
	@RequestMapping("/ajax4.do")
	public @ResponseBody Map<String, Object> ajax4(){
		Map<String, Object> map = new HashMap<>();
		map.put("msg", "����ż�");
		map.put("user", new User(1, "����", "333"));
		return map;
	}
	
	/**
	 * ��ǰ��ajax����list����
	 * */
	@RequestMapping("/ajax5.do")
	@ResponseBody
	public List<User> ajax5(){
		List<User> users = new ArrayList<>();
		users.add(new User(1, "����", "111"));
		users.add(new User(2, "����", "222"));
		users.add(new User(3, "����", "333"));
		return users;
	}
}
