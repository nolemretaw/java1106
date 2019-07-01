package com.lanou.josn;

import java.security.KeyStore.PrivateKeyEntry;

public class Student {
	private String name;
	private String gender;
	private String wife;
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
	public String getWife() {
		return wife;
	}
	public void setWife(String wife) {
		this.wife = wife;
	}
	public Student() {
		
	}
	public Student(String name, String gender, String wife) {
		super();
		this.name = name;
		this.gender = gender;
		this.wife = wife;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", wife=" + wife + "]";
	}
	
}
