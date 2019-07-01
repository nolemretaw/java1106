package com.lanou.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 	如何获取一个方法
 	方法的名称和方法参数列表,才能唯一决定一个方法
 */
public class MethodDemo1 {
	public static void main(String[] args) {
		A a = new A();
		Class c = a.getClass();
		try {
			/*
			 	获取一个方法,需要知道名称与参数列表
			 	getMethod()通过传递名称与可变参数来确定方法
			 	getMetho()获取的是public修饰的
			 	getDeclaredMethod()获取的是所有的方法
			 */
			Method m = c.getMethod("print", int.class, int.class);
			//执行完是有返回值的,但是是Object类型的,需要做转换
			m.invoke(a, 10, 20);
			
			Method method = c.getMethod("print", String.class, String.class);
			method.invoke(a, "来了", "老弟");
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class A {
	public void print(int a, int b) {
		System.out.println(a + b);
	}
	public void print(String a, String b) {
		System.out.println(a + b);
	}
}
