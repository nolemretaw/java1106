package com.landou.code;

public class Homework02 {

	public static void main(String[] args) {
		// //10亿，每天花一半，小于1破产，可以花多少天
		double money=1000000000, i=0;
		while (money>=1) {
			money/=2;
			++i;
		}
		System.out.println("可以花" + i + "天");
	}

}
