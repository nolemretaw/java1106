package com.lanou.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lanou.bean.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	/**
	 * restful���·��
	 * */
	@RequestMapping(value="/findAll",method=RequestMethod.GET)
	@ResponseBody
	public List<User> findAll(){
		List<User> users = new ArrayList<>();
		users.add(new User(1, "����", "123"));
		users.add(new User(2, "����", "123"));
		return users;
	}
	
	/**
	 * ����id����һ��user����
	 * /SpringMvc06/user/5
	 * ��·����Я���Ĳ���5ӳ�䵽����������ȥ
	 * */
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	@ResponseBody
	public User findUserById(@PathVariable("id") int id) {
		System.out.println("id="+id);
		User user = new User(5, "����", "123");
		return user;
	
	}
	
	/**
	 * ����idɾ��һ��user����
	 * */
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public boolean deleteUserById(@PathVariable("id") int id) {
		System.out.println("ɾ��id:"+id);
		return true;
	}
	
	/**
	 * ���
	 * */
	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	@ResponseBody
	public boolean addUser(@RequestBody User user) {
		System.out.println("���user:"+user);
		return true;
	}
	
	/**
	 * �޸��û���Ϣ
	 * */
	@RequestMapping(value="/updateUser",method=RequestMethod.PUT)
	@ResponseBody
	public boolean updateUser(@RequestBody User user) {
		System.out.println("�޸�user:"+user);
		return true;
	}
}
