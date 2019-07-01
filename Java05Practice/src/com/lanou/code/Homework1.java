package com.lanou.code;

import java.util.Arrays;

//定义四个类型方法并调用测试
public class Homework1 {
	//打印两数的积
	public static void productNum( int num1, int num2) {
		System.out.println(num1 * num2);
	}
	//求[20, 30]区间内两随机数的和
	public static float randomNum() {
		int num1 = (int)(Math.random() * (30 - 20 + 1)) + 20;
		int num2 = (int)(Math.random() * (30 - 20 + 1)) + 20;
		System.out.println(num1 + num2);
		return 0 ;
	}
	//数组
	public static int[] num() {
		int[] num = {11, 22, 33, 44, 55, 66};
		System.out.println(Arrays.toString(num));
		return num;
	}
	//两整型数比大小
	public static int compare(int a, int b) {
		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
		return 0;
	}
	public static void main(String[] args) {
		productNum(22, 11);
		randomNum();
		num();
		compare(0, 7);
	}
}
