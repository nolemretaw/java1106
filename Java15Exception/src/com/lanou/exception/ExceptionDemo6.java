package com.lanou.exception;

import java.io.IOException;
import java.net.ServerSocket;

public class ExceptionDemo6 {
	/*
	 	如果一个方法可能内部代码产生异常，但是又没有能力处理，
	 	可以在方法定义时使用throws声明抛出异常！！！
	 	举个栗子：
	 	汽车抛锚了，汽车本身没有办法处理这个异常，那就让开车的人或者
	 	修车的人来处理
	 */
	/*
	 	如果抛出的是Exception类型的异常，就代表此方法声明抛出所有异常
	 	如果是具体的异常类型，多个异常之间使用逗号隔开
	 	使用throws关键字将异常抛给调用者，如果调用者不想处理该异常，
	 	可以继续往上抛出，但最终要由能够处理该异常的调用者，如果没有，
	 	则会抛给JVM，程序就崩溃了！
	 	使用throws关键字将异常抛给调用者，调用者也可以使用try-catch语句
	 	对抛出的异常进行捕获处理！
	 */
	/*
	 	throws抛出异常的原则：
	 	1、如果是运行时异常，那么可以不使用throws关键字来声明要抛出
	 	的异常，编译可以顺利通过，但在运行时会由系统自动抛出
	 	2、如果是编译期异常，要么使用try-catch捕获，要么使用throws抛出
	 	3、只有抛出了异常，该方法的调用者才必须处理或者重新抛出！
	 	当调用者没有能力处理时，应该向上继续抛出！
	 	4、调用方法必须遵循任何编译期异常的处理和声明规则。
	 	若重写一个方法，则不能声明与被重写方法不同的异常类型。
	 	声明的异常类型只能是被重写方法声明异常的同类或者子类。(不能是Exception)
	 */
	public static void method1() throws NegativeArraySizeException {
		//声明数组
		int[] arr = new int[-10];
	}
	
	public void method2() throws IOException {
		ServerSocket socket = new ServerSocket(8080);
	}
	
	public void method3() throws RuntimeException {
		System.out.println(5 / 0);
	}
	
	
	public static void main(String[] args) {
		try {
			method1();
		} catch (NegativeArraySizeException e) {
			System.out.println("数组容量异常");
			e.printStackTrace();
		}
		
		try {
			ExceptionDemo6 e = new ExceptionDemo6();
			e.method2();
		} catch (IOException e) {
			System.out.println("IO异常");
			e.printStackTrace();
		}
		
		
		
		System.out.println("程序正常执行！");
		
		
		
		
		
	}
}
