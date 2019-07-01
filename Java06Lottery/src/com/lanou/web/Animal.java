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
	
	//吃东西的方法
	public void eat() {
		System.out.println("动物正在吃东西");
	}
	
	/*
	 	@Override注解的含义是表示以下方法是重写方法
	 */
	@Override
	/*
	 	toString()方法在打印对象时调用，默认打印的是
	 	所在类以及地址，如果想要打印类中的属性值
	 	就可以对toString()方法进行重写
	 */
	public String toString() {
		return "Animal [name=" + name + ", color=" + color + "]";
	}
	
	
	
	
	
}
