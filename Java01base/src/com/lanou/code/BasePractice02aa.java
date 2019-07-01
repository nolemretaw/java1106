package com.lanou.code;

public class BasePractice02aa {
	public static void main(String[] args) {
		int money = 134, a = 20, b = 10, c = 5, d = 1;
		int $20 = money / a;
		int $10 = money % a /b;
		int $5 = money % a % b /c;
		int $1 = money % a % b % c /d;
		System.out.println("20元张数" + $20 + "张");
		System.out.println("10元张数" + $10 + "张");
		System.out.println("5元张数" + $5 + '张');
		System.out.println("1元张数" +$1 + "张");
	}
}
