package com.lanou.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
	如何获取某个方法
	方法名和参数列表一定才能确定一个方法

*/
public class MethodDemo1 {
	public static void main(String[] args) {
		A a = new A();
		Class c = a.getClass();	
		try {
//			c.getMethod("print", new Class[]{int.class, int.class});
			/*
			 * 获取一个方法需要需要知道名称与参数列表
			 * getMethod()通过传递名称与可变参数来确定方法，获取的是public修饰的
			 * getDeclaredMethod()获取的是全部的方法
			 * 
			 */
			Method m = c.getMethod("print", int.class, int.class);
			//执行完是Object类型的返回值
			m.invoke(a,10,20);
			Method m1 = c.getMethod("print", String.class, String.class);
			m1.invoke(a,"Hello", "World");
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		a.print(10, 20);
//		a.print("Hello", "World");
		catch (IllegalAccessException e) {
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
