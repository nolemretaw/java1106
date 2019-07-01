package com.lanou.practice;

import java.util.Scanner;

public class Practice1 {
	//判断是不是质数
	public static boolean isPrime(int a) {
		boolean float1 = true;
		if (a < 2) {//质数不小于2
			float1 = false;
		} else {
			for (int i = 2; i < Math.sqrt(a); i++) {
				if (a % i == 0) {//如果整除,不是素数
					float1 = false;
					break;
				}
			}
		}
		return float1;
	}
	
	//从控制台获取想要输入的数字，判断是否可以写成两素数之和，并显示出来
	public static void main(String[] args) {
		System.out.println("请输入一个大于6的偶数");
		Scanner reader = new Scanner(System.in);
		int m = reader.nextInt();	
		if ((m <= 6) || m % 2 != 0 ) {
			System.out.println("请输入一个大于6的的偶数");
		} else {
			for (int i = 0; i <= m; i++) {
				for (int j = 0; j <= m; j++) {
					if ((isPrime(i)) && (isPrime(j)) && (i + j == m)){
						if (i != j) {
							System.out.println(m + "=" + i + "+" + j);
						}
					} 
				}
			}
		}
	}
}
