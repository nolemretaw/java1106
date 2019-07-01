package com.lanou.teacher;

public class Contact {
	//存储联系人信息
	private String name;
	private String gender;
	private String group;
	private String phone;
	private int age;
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
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Contact() {
		// TODO Auto-generated constructor stub
	}
	public Contact(String name, String gender, String group, String phone, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.group = group;
		this.phone = phone;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Contact [name=" + name + ", gender=" + gender + ", group=" + group + ", phone=" + phone + ", age=" + age
				+ "]";
	}
	
	
	
	
	
	
	
	
	
}
