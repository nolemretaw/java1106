package com.lanou.exception;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		//多catch语句
		/*
		 	如果一段代码内部，可能存在多个异常，此时可以使用
		 	多重try-catch语句。
		 	一旦某个catch捕获到匹配的异常类型，将进入异常处理代码。
		 	一经处理结束，就意味着整个try-catch语句的结束。
		 	其他的catch语句不再有匹配和捕获异常的机会
		 	
		 	非常重要的一条内容~~~
		 	java通过异常类描述异常，对于多个catch子句的异常程序而言，
		 	应该尽量将捕获底层异常类的catch子句放在前面，同时尽量将
		 	捕获相对高层的异常类的catch子句放在后面。否则，捕获
		 	底层异常类的catch子句将可能被屏蔽！！！
		 	并且，通常多catch的最后一个catch子句捕获的异常类型为
		 	Exception!
		 */
		int[] arr = new int[3];
		try {
			for (int i = 0; i <= arr.length; i++) {
				arr[i] = i;
				System.out.println("arr[" + i + "] = " + arr[i]);
				System.out.println("arr[" + i + "]除" + (i - 2) +
									"的值:" + arr[i] / (i - 2));
			}
		} catch (ArithmeticException e) {
			System.out.println("除数为0异常");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数组下标越界异常");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("其他异常");
			e.printStackTrace();
		}
		
		System.out.println("程序正常执行！");
		
		
		
	}
}
 