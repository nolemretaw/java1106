package com.lanou.code;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		// 输入两个数进行四则运算
		System.out.println("请输入两个数,一个运算符进行运算,用空格隔开");
		Scanner scanner=new Scanner(System.in);
		double num1 = scanner.nextDouble();
		char sign = scanner.next().charAt(0);
		double num2 = scanner.nextDouble();
		switch (sign) {
			case '+':
				System.out.println(num1 + "+" + num2 + "=" +(num1 + num2) );	
				break;
			case '-':
				System.out.println(num1 + "-" + num2 + "=" +(num1 - num2) );	
				break;
			case '*':
				System.out.println(num1 + "*" + num2 + "=" +(num1 * num2) );	
					break;
			case '/':
				System.out.println(num1 + "÷" + num2 + "=" +(num1 / num2) );	
					break;		
		}
		scanner.close();
	}
}
