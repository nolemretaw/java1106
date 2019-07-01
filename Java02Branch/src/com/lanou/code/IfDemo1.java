package com.lanou.code;

import java.util.Scanner;

public class IfDemo1 {

	public static void main(String[] args) {
	/*
	 * java中分为
	 * 顺序 分支 循环
	 * 分支:即为根据条件选择性的执行语句
	 * if switch
	 */
		System.out.println("请输入一个整数:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		/*
		 * if语句的第一种形式
		 * if(条件表达式)
		 * {语句}
		 * 当条件表达式为真时,执行语句,否则跳过
		 * if语句的第二种形式
		 * 	if(条件表达式) {
		 * 		语句1}
		 * 		else{
		 * 		语句2
		 * 		}
		 */
//		if (num>0) {
//			System.out.println(num);
//		}
//		if (num>0) 
//			System.out.println(num+"大于0");
//		else {
//			if (num<0) {
//				System.out.println(num+"小于0");
//			}
//			else{
//				System.out.println(num+"等于0");
//				}
//			}
		if (num>0) {
			System.out.println(num+"大于0");
		}else if(num<0) {
			System.out.println(num+"小于0");
		}else{
			System.out.println(num+"等于0");
		}
		scanner.close();
	}
}
