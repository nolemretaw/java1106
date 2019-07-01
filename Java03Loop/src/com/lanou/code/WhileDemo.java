package com.lanou.code;

import java.util.Scanner;

public class WhileDemo {
	public static void main(String[] args) {
		//while
		//打印1-100之间所有的数字
		/*
		 	while循环
		 	while (循环条件) {
		 		循环的语句
		 	}
		 	当循环条件为真时,执行循环的语句
		 	再进行条件判断,真继续执行语句,假跳出循环
		 	就是所谓的终止循环
		 */
		int num = 1;
		while (num < 101) {
			System.out.println(num);
			num++;
		}
		
		//打印1-100之间7的倍数
		System.out.println("----华丽的分割线----");
		num = 1;
		while (num < 101) {
			if (num % 7 == 0){
				System.out.println(num);
			}
			num++;
		}
		
		//打印1-100之间不是7的倍数也不不包含7的数
		System.out.println("----华丽的分割线----");
		num = 1;
		while (num < 101) {
			if (num % 7 != 0 && 
					num % 10 != 7 && 
					num % 100 / 10 != 7 && 
					num / 100 != 7) {
				System.out.println(num);
			}
			num++;
		}
		
		//从控制台输入一个整数,得到此整数有多少位
		System.out.println("----分割线----");
		System.out.println("请输入一个整数");
		Scanner scanner = new Scanner (System.in);
		long num1 = scanner.nextLong();
		int count = 1;
		while (num1 / 10 != 0) {
			num1 /= 10;//num1 = num1 /10;
			count++;
		}
		System.out.println(count);
		scanner.close();
	}
}
