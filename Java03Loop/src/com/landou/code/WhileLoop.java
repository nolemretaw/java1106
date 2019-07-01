package com.landou.code;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * while循环
		 * while(循环条件){
		 * 循环的语句
		 * }
		 * 当循环条件为真时,执行循环语句
		 * 在进行条件判断,真则继续执行语句,假则跳出循环(即终止循环)
		 */
		int num = 1;
		while (num<101) {
			if (num%7==0) {
				System.out.printf(" %d",num);	
			}
			num++;
		}
		System.out.println();
		System.out.println("----------------------------");
		num = 1;
		while (num < 101) {
			if (num%7!=0 && num%10!=7 && num%100/10!=7 && num/100!=7) {
				System.out.printf(" %d",num);
			}
			num++;
		}
		System.out.println();
		System.out.println("----------------------------");
		System.out.println("输入一个数");
		Scanner scanner=new Scanner(System.in);
		int count = 0;
		for (int n=scanner.nextInt();  n != 0; n /= 10) {
			count ++;
		}
		System.out.println(count);
		scanner.close();
	}
}
