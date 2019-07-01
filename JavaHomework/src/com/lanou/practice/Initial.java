package com.lanou.practice;

import java.util.Scanner;

public class Initial {
	public static void main(String[] args) {
		int Container = 5;//五个篮子
		int sum = 0;//单价
		int sums = 0;//总价
		for (int i = 1; i < 6; i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入要购买的水果");
			String Fruit = scanner.next();
			if (Fruit.equals("apple")) {
				System.out.println("购买苹果一个");
				sum = new Apple().getMoney();
				System.out.println(sum);
				sums =  sum + sums;
			} 
			if (Fruit.equals("orange")) {
				System.out.println("购买橙子一个");
				sum = new Orange().getMoney();
				System.out.println(sum);
				sums = sum + sums;
			}
			if (Fruit.equals("banana")) {
				System.out.println("购买香蕉一个");
				sum = new Banana().getMoney();
				System.out.println(sum);
				sums = sum + sums;
			}
			if (i == Container) {
				System.out.println("五个篮子已经装满,算总价");
			}
		}
		System.out.println("总价格 = " + sums);
	}
}
