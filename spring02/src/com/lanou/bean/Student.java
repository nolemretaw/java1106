package com.lanou.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * ����DI����ע��ע��
 */
@Component("stu")
public class Student {
	private String name;
	private int age;
	
	public void show(){
		System.out.println("ѧ������:"+name);
		System.out.println("ѧ������:"+age);
	}

	public String getName() {
		return name;
	}
	@Value("����")
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







