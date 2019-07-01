package com.lanou.bean;

import java.io.Serializable;
import java.util.Arrays;

public class User implements Serializable{
	private int id;
	private String name;
	private int age;
	private String sex;
	private String[] hobbies;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public User(int id, String name, int age, String sex, String[] hobbies) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.hobbies = hobbies;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/*@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + ", hobbies="
				+ Arrays.toString(hobbies) + "]";
	}*/
	
	 
}
