package com.lanou.homework;

public class Contact {
	private String name;
	private String gender;
	private String phone;
	private String group;
	private int age;
	public void setName(String name) {
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public String getGender(){
		return gender;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}
	public String getPhone(){
		return phone;
	}
	public void setGroup(String group){
		this.group = group;
	}
	public String getGroup(){
		return group;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public Contact(){}
	public Contact(String name, String gender, String phone, String group, int age){
	setName(name);
	setGender(gender);
	setPhone(phone);
	setGroup(group);
	setAge(age);
	}
	@Override
	public String toString() {
		return " name: " + name + ", gender: " + gender + ", phone: " + phone + ", group: " + group + ", age: " + age
				+ " ";
	}
}
