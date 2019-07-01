package com.lanou.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class BeanUtils {
	/*
	 * 通过反射获取一个类中的方法
	 */
	public static void getClassMethod(Object obj) {
		// 要获取类的内部信息，首先要获取该类的类型，类类型
		//传递的是哪个子类的对象，c 就表示那个子类的类型
		Class c = obj.getClass();
		//获取此类的名称
		System.out.println("该类的名称是 ： " + c.getSimpleName());
		//Method类表示的是方法对象，一个成员方法就是一个Method对象
		//getMethods()方法获取的是所有public修饰的方法，包括父类继承的
		//getDeclaredMethods()方法获取的只有该类自己声明的方法
		Method[] methods = c.getMethods();
		for (Method method : methods) {
			//先获取方法的返回值的类型
			Class returnType = method.getReturnType();
			System.out.print(returnType.getSimpleName() + " ");
			//获取方法名
			System.out.print(method.getName() + "(");
			//获取参数类型
			Class[] parameterTypes = method.getParameterTypes();
			for (Class c1 : parameterTypes) {
				System.out.print(c.getSimpleName() + ",");
			}
			System.out.println(") {}");
		}
	}
	public static void getClassProperty(Object obj) {
		Class c = obj.getClass();
		/*
		 * Field表示成员变量的对象
		 * java.lang.reflect.Field
		 * Field类封装了关于成员变量的操作
		 * getField()获取到的是public的成员变量的信息
		 * getDeclaredField()获取到的是该类中所有成员变量的信息
		 */
//		Field[] fields = c.getFields();
		Field[] fields = c.getDeclaredFields();
		for (Field field : fields) {
			//获取成员变量的类型
			Class type = field.getType();
			System.out.print(type.getName() + " ");
			//获取成员变量的名称
			System.out.println(field.getName());
			
		}
	}
	//获取一个类中的构造方法
	public static void getClassConstructor(Object obj) {
		Class c = obj.getClass();
		/*
		 * 构造方法也是对象
		 * java.lang.Constructor中封装了构造方法的信息
		 * getConstructors()这个方法得到的是public修饰的构造方法
		 * getDeclaredConstructors()这个方法得到的是所有构造方法
		 */
		Constructor[] constructors = c.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			//获取构造方法名
			System.out.print(constructor.getName() + "(");
			//获取构造方法的参数列表
			Class[] parameterTypes = constructor.getParameterTypes();
			for (int i = 0; i < parameterTypes.length; i++) {
				if (i == parameterTypes.length -1) {
					System.out.println(parameterTypes[i].getSimpleName() + ")");
				} else {
					System.out.print(parameterTypes[i].getSimpleName() + ",");
				}
			}
		}
	}
	
}
