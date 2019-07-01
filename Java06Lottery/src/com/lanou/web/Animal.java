package com.lanou.web;

public class Animal {
	private String name;
	private String color;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	public Animal(String name) {
		super();
		this.name = name;
	}
	public Animal(String name, String color) {
		this(name);
		this.color = color;
	}
	
	//�Զ����ķ���
	public void eat() {
		System.out.println("�������ڳԶ���");
	}
	
	/*
	 	@Overrideע��ĺ����Ǳ�ʾ���·�������д����
	 */
	@Override
	/*
	 	toString()�����ڴ�ӡ����ʱ���ã�Ĭ�ϴ�ӡ����
	 	�������Լ���ַ�������Ҫ��ӡ���е�����ֵ
	 	�Ϳ��Զ�toString()����������д
	 */
	public String toString() {
		return "Animal [name=" + name + ", color=" + color + "]";
	}
	
	
	
	
	
}
