package com.lanou.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class ClassDemo4 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("来了");
		//list2.add(10);//错误的
		Class class1 = list1.getClass();
		Class class2 = list2.getClass();
		/*
		 	反射的操作都是编译之后的操作
		 	c1 = c2 说明 编译之后,集合和泛型是去泛型化的
		 	java中集合的泛型是防止输入错误的,只在编译期有效
		 绕过编译之后泛型就不起作用了
		 */
		System.out.println(class1 == class2);
		try {
			Method method = class2.getMethod("add", Object.class);
			method.invoke(list2, "来了");
			method.invoke(list2, 10);
			System.out.println(list2);
			System.out.println(list2.size());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
