package com.lanou.excepton;

import java.io.IOException;
import java.net.ServerSocket;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo1 {
	public static void main(String[] args) throws ParseException {
		/*
		 	java中异常Exception与错误Error的区别
		 		异常能被程序本身处理,而错误不能被处理
		 		
		 	异常在java中,用Exception及其子类表示
		 	异常分为:编译期异常,运行时异常
		 		       可查异常,不可查异常
		 		       受检异常,非受检异常	 	
		 		       
		 	编译器异常:
		 		1.正常的程序在运行中,很容易出现的,情理可容的异常情况
		 	  	编译期异常虽然是异常状况,但在一定程度上它的发生是可以预计的,
		 	  	而且必须采取某种处理方式!!! 捕获或者抛出
		 		2.除了RuntimeException及其子类外,其他的Exception及其子类都是编译期异常
		 		3.Java编译器会自动检查,程序一旦出现这类异常,要么使用try catch进行捕获, 要么使用throw进行抛出
		 		
		 	运行时异常:
		 		1.都是RuntimeException本类及其子类,这些异常时不检查异常,程序中可以选择捕获处理,也可以不处理.这些异常一般都是有逻辑
		 	   	错误引起的,程序可以从逻辑角度尽可能避免此类异常的出现
		 	   	2.Java编译器不会检查它,也就是说,当程序中可能出现这类异常,即使没有try-catch语句捕获,有没有throws抛出,也会通过变异,
		 	   	只是在运行时出现问题
		 */
		//ArithmeticException数学异常
		/*
		 	异常如果不作处理,当异常报错时,程序也自然终止了
		 	异常发生之后的语句都不会执行了
		 */
		/*int a = 10, b = 0;
		System.out.println("a / b = " + a / b);*/
		
		/*int[] arr = new int[3];
		arr[3] = 10;*/
		
		/*
		 	选中有异常的代码 shift alt z 会出现代码提示
		 	此时我们可以选取try catch 语句进行捕获
		 */
		try {
			ServerSocket socket = new ServerSocket(8080);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String str = "2018-12-11 10:20:30";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(str);
		/*try {
			Date date = sdf.parse(str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}
}
