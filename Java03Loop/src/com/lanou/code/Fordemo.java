package com.lanou.code;

public class Fordemo {
	public static void main(String[] args) {
		/*
		 	循环变量的初始化
		 	循环条件
		 	循环增量
		 	循环语句
		 */
		/*//打印1-100之间所有的数字
		for (int i = 1; i < 101; i++) {
			System.out.println(i);
		}*/
	
		
		//生成十个[10,20]之间的随机数,得到其中的最大值,最小值,和
		int sum = 0;//保存求和结果
		int max = 10, min = 20;
		for (int i = 0; i < 10; i++) {
			int num = (int)(Math.random() * (20 -10 + 1)) + 10 ;
			System.out.print(num + " ");
			sum += num; //sum = sum + num;
			max = max > num ? max : num; // ?  : (等同于if else)
			min = min < num ? min : num;
		}
		System.out.println("\n" + sum);
		System.out.println(max);
		System.out.println(min);
	}
}
