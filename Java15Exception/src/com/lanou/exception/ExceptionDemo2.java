package com.lanou.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		/*
		 	处理异常的机制
		 	抛出异常、捕获异常
		 	对于运行时异常、编译期异常、错误，java技术所要求的
		 	异常处理方式不同。
		 	运行时异常：为了更合理，更容易的实现应用程序的功能，
		 	java规定，运行时异常将由java运行时系统自动抛出，允许
		 	应用程序忽略运行时异常，但为了保证程序的执行，可以捕获！
		 	Error:程序内部可以不做处理，因为大多数Error属于永远不能被
		 	允许发生的情况，也属于合理的应用程序不该捕捉的异常。
		 	编译期异常：Java规定，异常必须捕获或者抛出方法之外。也就是说，
		 	如果不对编译期异常进行捕获时，可以选择在方法上抛出！
		 	
		 	throw：任何的java代码都可以抛出异常，如：自己编写的代码，
		 	java开发环境中的代码，java的运行时系统，不管是谁，都可以通过
		 	java的throw来抛出异常
		 	throws：从方法上抛出异常
		 	try-catch 或者 try-catch-finally 捕获异常
		 	
			总体来说：java规定，对于编译期异常必须捕获或者抛出
			允许忽略运行时异常及错误Error
		 */
		int a = 10, b = 0;
		/*
		 	try-catch语句的语法格式：
		 	try {
		 		监控区域，书写有可能会发生异常的程序代码
		 	} catch (异常类型 异常变量名) {
		 		捕获并处理try中抛出的异常类型
		 	}
		 */
		/*
		 	try后面的大括号将一块可能发生异常的代码包裹起来，
		 	称为监控区域
		 	java方法在运行时出现异常，则创建异常对象，并将
		 	创建的异常对象抛出监控区域之外，由java运行时系统
		 	试图寻找匹配的catch子句处理。
		 	如果有匹配的catch子句，则运行其异常处理代码，try-catch结束。
		 	如果没有匹配的catch子句，则报错。
		 	匹配的原则：
		 	如果产生的异常对象属于catch子句中的异常类或者其子类，则认为
		 	生成的异常对象与catch子句捕获的异常类型匹配。
		 */
		try {
			//如果b是0，此时抛出异常
			if (b == 0) {
				/*
				 	手动抛出异常
				 	异常抛出之后，代码块内部异常之后的代码将不会执行
				 	throw关键字的作用：
				 	支持在代码段内部的任意位置，手动抛出异常，但是
				 	一般会与if语句连用。手动抛出的异常，同样也要去捕获处理
				 	否则程序终止
				 */
				throw new ArithmeticException();
			}
			System.out.println("a / b = " + a / b);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String str = "2018-12-11 11:42:30";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date date = sdf.parse(str);
			System.out.println(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		System.out.println("程序正常执行！");
	}
}
