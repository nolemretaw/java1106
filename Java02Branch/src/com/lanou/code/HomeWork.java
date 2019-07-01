package com.lanou.code;

import java.util.Scanner;

public class HomeWork {
	/*
	 * 输入一个年份,一个月份,得到此月份在当年中有多少天
	 */
	public static void main(String[] args) {
		System.out.println("输入 一个年份,一个月份");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		if ((month > 12 || month < 1) || (year < 0))
			System.out.println("请检查输入的年或月");
		else {
			boolean tag = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
			System.out.println("该年是闰年" + (tag == true ? "闰年" : "平年"));
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("该月是31天");
				break;
			case 2:
				System.out.println("该月是" + (tag == true ? 29 : 28) + "天");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("该月是30天");
				break;
			}
		}
		scanner.close();
	}
}
