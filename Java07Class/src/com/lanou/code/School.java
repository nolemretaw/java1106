package com.lanou.code;

public class School {
	private String name;
	private String level;
	private String address;
	
	public void thing(String name) {
		System.out.println(name + "��������");
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public School(String level){
		setLevel(level);
	}
	public School() {
		
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public School (String name, String level, String address){
		
	}
	
	public static void main(String[] args) {
		School school = new School();
		school.name = "�������ӿƼ���ѧ";
		school.address = "̫����·";
		System.out.println(school.name);
		System.out.println(school.address);
	}
}
