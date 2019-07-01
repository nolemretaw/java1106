package com.lanou.test;

public class Person {
	private String name;
	private int age;
	private String gender;
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public String getGender(){
		return gender;
	}
	public Person(){}
	public Person(String name, int age, String gender) {
		setName(name);
		setAge(age);
		setGender(gender);
	}
	public void eat(){
		System.out.println(name+ "�Է�");
	}
	public String toString(){
		return "����: " + name + "����: " + age + "�Ա�: " + gender;   
	}
}
