package com.lanou.exception;

public class ExceptionDemo5 {
	public static int finallyTest() {
		int r = 1;
		try {
			r = 3;
			return r;
		} catch (Exception e) {
			return 0;
		} finally {
			//finally里面如果对返回的基本数据类型的值改变，没有影响
			r = 5;
			System.out.println("基本数据类型");
		}
	}
	
	public static StringBuilder test() {
		//shift alt r 可以全部修改
		StringBuilder sb = new StringBuilder("Hello");
		try {
			sb.append("World");
			return sb;
		} catch (Exception e) {
			return null;
		} finally {
			/*
			 	引用类型的值在finally做修改会产生变化
			 	因为方法内部定义的变量在栈区，当方法结束时，变量就会
			 	被回收，所以return的值不是返回变量的值，而是做了一份
			 	拷贝，将拷贝之后的值返回给外界了！
			 */
			sb.append("!");
			System.out.println("引用数据类型");
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(finallyTest());
		System.out.println(test());
	}
}
