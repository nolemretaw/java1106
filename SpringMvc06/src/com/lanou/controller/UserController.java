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
	 * restful风格路径
	 * */
	@RequestMapping(value="/findAll",method=RequestMethod.GET)
	@ResponseBody
	public List<User> findAll(){
		List<User> users = new ArrayList<>();
		users.add(new User(1, "张三", "123"));
		users.add(new User(2, "李四", "123"));
		return users;
	}
	
	/**
	 * 根据id查找一个user对象
	 * /SpringMvc06/user/5
	 * 将路径上携带的参数5映射到方法参数中去
	 * */
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	@ResponseBody
	public User findUserById(@PathVariable("id") int id) {
		System.out.println("id="+id);
		User user = new User(5, "王五", "123");
		return user;
	
	}
	
	/**
	 * 根据id删除一个user对象
	 * */
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public boolean deleteUserById(@PathVariable("id") int id) {
		System.out.println("删除id:"+id);
		return true;
	}
	
	/**
	 * 添加
	 * */
	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	@ResponseBody
	public boolean addUser(@RequestBody User user) {
		System.out.println("添加user:"+user);
		return true;
	}
	
	/**
	 * 修改用户信息
	 * */
	@RequestMapping(value="/updateUser",method=RequestMethod.PUT)
	@ResponseBody
	public boolean updateUser(@RequestBody User user) {
		System.out.println("修改user:"+user);
		return true;
	}
}
