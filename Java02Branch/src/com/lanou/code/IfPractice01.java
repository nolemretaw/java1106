package com.lanou.code;

import java.util.Scanner;

public class IfPractice01 {
	public static void main(String[] args) {
		System.out.println("输入两个整数:");
		Scanner scanner=new Scanner(System.in);
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
//		if (num1>num2) {
//			System.out.println(num1+"最大");
//		} else {
//			System.out.println(num2+"最大");
//		}
		int max = num1 > num2 ? num1 : num2;
		System.out.println(max+"最大");
	}
}