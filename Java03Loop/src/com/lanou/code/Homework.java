package com.lanou.code;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//最大公约数、最小公倍数
		/*System.out.println("请输入两个正整数，以空格隔开：");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		//1、普通
		int min = num1 < num2 ? num1 : num2;*/
		/*
		for (int i = min; i > 0; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				System.out.println("最大公约数为:" + i);
				System.out.println("最小公倍数为:" + num1 * num2 / i);
				break;
			}
		}*/
		/*while (true) {
			if (num1 % min == 0 && num2 % min == 0) {
				System.out.println("最大公约数为:" + min);
				System.out.println("最小公倍数为:" + num1 * num2 / min);
				break;
			}
			min--;
		}*/
		/*int n1 = num1, n2 = num2;
		int yu = num1 % num2;
		while (yu != 0) {
			num1 = num2;
			num2 = yu;
			yu = num1 % num2;
		}
		System.out.println("最大公约数为:" + num2);
		System.out.println("最小公倍数为:" + n1 * n2 / num2);*/
		
		//小球弹起
		/*double total = 100.0;
		double per = 100.0;
		for (int i = 1; i < 11; i++) {
			per /= 2;
			if (i == 10) {
				System.out.println("总路程：" + total);
				System.out.println("弹起高度：" + per);
			}
			total += per * 2;
		}*/
		
		//花钱
		/*double money = 10;
		int day = 0;
		while (money >= 1) {
			money /= 2;
			day++;
		}
		System.out.println(day);*/
		
		//水仙花数
		for (int i = 100; i < 1000; i++) {
			int hun = i / 100;
			int ten = i % 100 / 10;
			int per = i % 10;
			/*if (hun * hun * hun + ten * ten * ten + per * per * per == i) {
				System.out.println(i);
			}*/
			if (hun == per && hun != ten) {
				System.out.println(i);
			}
		}
		
		//abc + cba = 1333
		/*for (int i = 0; i < 10; i++) {//a
			for (int j = 0; j < 10; j++) {//b
				for (int k = 0; k < 10; k++) {//c
					if (i * 100 + j * 10 + k + k * 100 + j * 10 + i == 1333) {
						System.out.println(i + ", " + j + ", " + k);
					}
				}
			}
		}*/
		
		
		
		
	}
}
