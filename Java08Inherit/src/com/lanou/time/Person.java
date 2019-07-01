package com.lanou.time;

public class Person {
	private String name;
	private int age;
	private String gender;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void getGender(String gender) {
		this.gender = gender;
	}
	public String setGender() {
		return gender;
	}
	public Person() {
		
	}
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String toString() {
		return "Person[name = "+ name +", age = "+ age +", gender ="+ gender +"]";
		
	}
}
