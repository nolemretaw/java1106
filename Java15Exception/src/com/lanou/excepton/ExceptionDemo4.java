package com.lanou.excepton;

public class ExceptionDemo4 {
	public static void main(String[] args) {
		String[] strs = {"晨晨", "阿黄", "小黄"};
		int i = 0;
		/*
		 	try catch finally的语法格式
		 	try {
		 		可能会产生异常的代码
		 	} catch (Type1 t1) {
		 		捕获并处理try抛出的异常类型type1
		 	} catch (Type2 t2) {
		 		捕获并处理try抛出的异常类型type2
		 	} finally {
		 		无论是否抛出异常,都会执行的代码
		 		通常用来释放资源,eg:io流的关闭,数据库连接的关闭
		 	}
		 */
		/*
		 	try catch finally 三者不允许单独存在
		 	try-catch
		 	try-finally 没有意义
		 	try-catch-finally
		 */
		/*
		 	1.try内部没有产生异常,跳过catch 执行finally
		 	2.try内部产生了异常,但没有匹配的catch语句,则抛给JVM,finally语句还是会执行,但是finally之后的语句不执行,程序终止
		 	3.try内部产生了异常,有匹配的catch语句,执行完catch语句之后,执行finally内部代码
		 */
		while (i < 4) {
			try {
				System.out.println(strs[i++]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("数组下标越界");
				e.printStackTrace();
			} finally {
				//无论try中的语句是否抛出异常,finally内中的代码都会执行
				System.out.println("---------");
			}
		}
		System.out.println("程序正常执行");
		
		/*
		 	try catch finally小结:
		 	try:用于监控异常,其后可以接零个或者多个catch语句,如果没有catch语句,则必须接finally
		 	catch:用于处理try中抛出的异常
		 	finally:无论是否发生异常,都会执行,当在try,catch语句中遇到return关键字,finally语句块会在方法返回之前执行!
		 	以下四种情况,finally语句不执行:
		 		finally语句块中产生了异常
		 		在前面的代码中使用了System.exit()退出程序
		 		程序所在的线程死亡
		 		关闭CPU
		 */
	}
}
