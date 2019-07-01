package com.lanou.reflect;

public class ClassDemo2 {
	public static void main(String[] args) {
		Class c1 = int.class;
		Class c2 = String.class;
		Class c3 = double.class;
		Class c4 = Double.class;
		Class c5 = Void.class;
		
		/*
		 	Class对象的getName()可以获取类型名,包含包名
		 	getSimpleName()也可以获取类型名,但是不包含包名.只包含类名
		 */
		System.out.println(c1.getName());
		System.out.println(c2.getSimpleName());
		System.out.println(c3.getName());
		System.out.println(c4.getName());
		System.out.println(c5.getName());
	}
}
