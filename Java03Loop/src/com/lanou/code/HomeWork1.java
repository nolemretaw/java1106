package com.lanou.code;

public class HomeWork1 {
	public static void main(String[] args) {
		//10亿，每天花一半，小于1破产，可以花多少天
		int money = 1000000000;//十个亿
		int day = 0;//可花的天数
		while (money >= 1) {
			money = money / 2;
			day++;
		}
		System.out.println(day);
	}
}
