package com.lanou.code;

public class Dog {
	private String nickname;
	private int age;
	private float weight;
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public Dog() {
		
	}
	public Dog(String nickname, int age, float weight) {
		this.nickname = nickname;
		this.age = age;
		this.weight = weight;
	}
	
	//¶ÀÓÐ·½·¨
	public void eatShit() {
		System.out.println("¹·³ÔÊº~");
	}
	public void sleep() {
		System.out.println("¹·Ë¯¾õ~");
	}
	
}
