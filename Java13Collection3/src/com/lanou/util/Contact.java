package com.lanou.util;

public class Contact {
	private String name;
	private String gender;
	private int age;
	private String group;
	private String phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String name) {
		this.group = PinYinUtil.getFirstSpell(name).substring(0, 1).toUpperCase();
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Contact(String name, String gender, int age, String phone) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		setGroup(name); 
	}
	public Contact() {}
	
	public String toString(){
		return "姓名: " + name + " 性别: " + gender + " 年龄: "+age+
				" 分组: "+group+" 电话: "+phone;
	}
}
