package com.lanou.bean;

public class Teacher {
	private String name;
	private String gender;
	public Teacher(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	public void show() {
		System.out.println("��ʦ������"+name);
		System.out.println("��ʦ�Ա�"+gender);
	}
}
