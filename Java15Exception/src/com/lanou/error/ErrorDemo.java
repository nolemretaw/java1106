package com.lanou.error;

public class ErrorDemo {
	public static void main(String[] args) {
		/*
		 	错误Error是程序无法处理的，表示程序运行时出现的
		 	较为严重的问题。
		 	大多数错误与代码编写和操作无关，而代表程序运行时
		 	JVM出现的问题。
		 	比如：VirtualMachineError中的内存溢出OutOfMemoryError
		 	错误是不可查的，因为他们在应用程序的控制和处理能力之外
		 	错误在java中通过Error与其子类表示
		 */
		int[] arr = new int[1024 * 1024 * 1024];
		
	}
}
