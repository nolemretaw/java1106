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
	 * 如果请求是Ajax发起的，在返回字符串的时候，
	 * 会根据字符串以及视图解析器的找到相应的JSP页面，
	 * 将JSP页面的源码返回给Ajax,而不是显示页面
	 * 
	 * 	@ResponseBody 会保证数据不会走视图解析器流程，而是直接返回给Ajax
	 * */
	@RequestMapping("/ajax1.do")
	public @ResponseBody String ajax1(){
		return "hello";
	}
	
	/**
	 * 给前端Ajax返回javaBean实体对象
	 * 
	 * */
	@RequestMapping("/ajax2.do")
	public @ResponseBody int ajax2(){
		return 100;
	}
	
	/**
	 * 给前端Ajax返回javabean实体对象
	 * 前端JS会解析成JSON对象
	 * */
	@RequestMapping("/ajax3.do")
	public @ResponseBody User ajax3(){
		User user = new User(1,"雄安","123");
		return user;
	}
	
	/**
	 * 给前端Ajax返回map集合数据
	 * 前端JS解析成json对象
	 * */
	@RequestMapping("/ajax4.do")
	public @ResponseBody Map<String, Object> ajax4(){
		Map<String, Object> map = new HashMap<>();
		map.put("msg", "明天放假");
		map.put("user", new User(1, "卡拉", "333"));
		return map;
	}
	
	/**
	 * 给前端ajax返回list集合
	 * */
	@RequestMapping("/ajax5.do")
	@ResponseBody
	public List<User> ajax5(){
		List<User> users = new ArrayList<>();
		users.add(new User(1, "张三", "111"));
		users.add(new User(2, "李四", "222"));
		users.add(new User(3, "王五", "333"));
		return users;
	}
}
