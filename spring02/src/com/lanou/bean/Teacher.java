package com.lanou.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("tea")
public class Teacher {
	@Value("${jdbc.username}")
	private String name;
	@Value("${jdbc.password}")
	private String password;
	
	public void show(){
		System.out.println("��ʦ�˺�:"+name);
		System.out.println("��ʦ����:"+password);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}

