package com.lanou.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 测试DI依赖注入注解
 */
@Component("stu")
public class Student {
	private String name;
	private int age;
	
	public void show(){
		System.out.println("学生姓名:"+name);
		System.out.println("学生年龄:"+age);
	}

	public String getName() {
		return name;
	}
	@Value("张三")
	public void setName(String name) {
		this.name = name;
	}
	@Value("30")
	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	
}







