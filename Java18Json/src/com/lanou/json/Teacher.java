package com.lanou.json;

public class Teacher {
	private String name;
	private String gender;
	private String age;
	private String hobby;
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public Teacher(String name, String gender, String age, String hobby) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.hobby = hobby;
	}
	public Teacher() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", gender=" + gender + ", age=" + age + ", hobby=" + hobby + "]";
	}
	
}
