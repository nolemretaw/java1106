package com.lanou.test;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		// 验证哥德巴赫猜想(即任意一个大于2的偶数都能够被拆解为两个质数的和)
		System.out.println("输入一个大于2的偶数");
		Goldbach();
		
	}
	public static void Goldbach() {
		int a = new Scanner(System.in).nextInt();
		while(!(a>2 && (a%2)==0)) {
			System.out.println("请输入一个大于2的偶数");
			a = new Scanner(System.in).nextInt();
		}
		for(int i = 2 ; i<= a/2; i++){
			if (isPrimeNumber(i)&&isPrimeNumber(a-i)) {
				System.out.println("可将"+a+"拆解为"+i+"+"+(a-i));
				System.out.println("哥德巴赫猜想得到验证");
				return;
			}
			
		}
		System.out.println("无法将"+a+"拆解为两个质数");
	}
	public static boolean isPrimeNumber(int a) {//判断是否为质数
		for (int b = a-1;b>1;b--) {
			if (a%b == 0) {
				return false;
			}
		}
		return true;
	}

}
