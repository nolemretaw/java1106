package com.lanou.code;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		System.out.println("请输入两个整型数字:");
//		创建一个扫描对象,开启输入,并实现扫描
		Scanner scanner = new Scanner(System.in);
//		调用扫描对象的nextXX方法来实现扫描赋值变量
		//导包方式:1. alt + /  2. shift + ctrl + o
		int num = scanner.nextInt();
		int num1 = scanner.nextInt();
		double num2 = scanner.nextDouble();
		System.out.println(num);
		System.out.println(num1);
		System.out.println(num2);
		scanner.close();
		//关闭scanner扫描对象()
	 }

}
