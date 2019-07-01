package com.lanou.code;

import java.util.Scanner;

//整数求位数封装成方法

public class Homework6 {
	public static void dight() {
		//整数位数:任意输入一个整数（小于10位），求它的位数
		Scanner scan = new Scanner(System.in);
		System.out.print("任意输入一个整数（小于10位）：");
		int num = scan.nextInt();
		int count=0;
		do{
			num/=10;
			count++;
		} while(num > 0);
		System.out.print("输入的数字位数是："+ count);
		
	}
	public static void main(String[] args) {
		dight();
	}
}
