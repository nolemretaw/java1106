package com.lanou.code;

/*
 	类定义的语法格式
 	访问修饰符 class 类名 {
 		属性、特性
 		方法、行为
 	}
 	1、类名首字母大写！
 	2、类是对一组具有相同特性和行为的事物的抽象！
 	类和对象的区别：
 		类是抽象的，而对象是具体的
 		类的范围更广
 		类是对象的模板，对象是类的实例
 		万事万物皆对象
 */
public class Person {
	
	//特征，就是属性(成员变量)，用来描述一个类中的信息
	String name;//姓名
	String gender;//性别
	int age;//年龄
	double height;//身高
	
	//行为、方法
	public void eat() {
		System.out.println("人在吃东西。");
	}
	public void sleep() {
		System.out.println("人在睡觉觉。");
	}
	//自我介绍
	public void introduce() {
		System.out.println("姓名: " + name +
							"性别: " + gender +
							"年龄: " + age +
							"身高: " + height);
	}
	
	
	
	
	
	
}
