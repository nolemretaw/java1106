package com.lanou.practice;

public class Contacts {
	private String name;//����
	private String gender;//�Ա�
	private String phone;//�绰
	private String group;//����
	private int age;//����
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Contacts() {
		
	}
	public Contacts(String name, String gender, String phone, String group, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.group = group;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Contacts [name=" + name + ", gender=" + gender + ", phone=" + phone + ", group=" + group + ", age="
				+ age + "]";
	}
	
	
}
