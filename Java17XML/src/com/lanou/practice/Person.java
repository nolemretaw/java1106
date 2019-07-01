package com.lanou.practice;

import java.io.Serializable;
/*对象的序列化与反序列化需要注意:
 * 1. 为了要进行序列化(存储)的对象的类内部,实现Serializable
 * 2. 为了保证反序列化在类修改之后一样可以成功,需要添加版本ID
 */
public class Person implements Serializable{
	/**
	 * 序列化版本ID是为了保证写入对象之后对此对象类进行修改时,不会影响反序列化
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private float height;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public Person(String name, int age, float height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}
	public Person(){}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + "]";
	}
	
	public void sayHi() {
		System.out.println("hhhhh");
	}
}
