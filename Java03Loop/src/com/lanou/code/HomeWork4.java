package com.lanou.code;

import java.util.Scanner;

public class HomeWork4 {
	public static void main(String[] args) {
		//最大公因数 最大公倍数
		System.out.println("请输入两个数");
		Scanner scanner = new Scanner(System.in);
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		int d = a * b;
		for (int c= 0;;) {//存余数
			if (a > b) {
				if (a % b == 0) {
					System.out.println("最大公因素:" + b);
					System.out.println("最小公倍数:" + d / b);
					break;
				}
				c = a % b;
				a = c;
			} else if (a < b) {
				if (b % a == 0){
					System.out.println("最大公因数:"+ a);
					System.out.println("最小公倍数:" + d/a);
					break;
				}
				c = b % a;
				b = c;
			}
			
		}
	}
}
