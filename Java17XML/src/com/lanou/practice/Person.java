package com.lanou.practice;

import java.io.Serializable;
/*��������л��뷴���л���Ҫע��:
 * 1. Ϊ��Ҫ�������л�(�洢)�Ķ�������ڲ�,ʵ��Serializable
 * 2. Ϊ�˱�֤�����л������޸�֮��һ�����Գɹ�,��Ҫ��Ӱ汾ID
 */
public class Person implements Serializable{
	/**
	 * ���л��汾ID��Ϊ�˱�֤д�����֮��Դ˶���������޸�ʱ,����Ӱ�췴���л�
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
