package com.lanou.teacherpractice;

public class Contact {
	private String name;
	private String gender;
	private String phone;
	private String group;
	private String age;
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public Contact() {
		
	}
	public Contact(String name, String gender, String phone, String age) {
		super();
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.age = age;
		this.group = PinYinUtil.getFirstSpell(name).substring(0, 1).toUpperCase();
	}
	
	@Override
	public String toString() {
		return "Contact [name=" + name + ", gender=" + gender + ", phone=" + phone + ", group=" + group + ", age=" + age
				+ "]";
	}
	
	
	
	
	
	
	
}
