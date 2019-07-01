package com.lanou.code;

import java.util.Scanner;

//输入一个年份,一个月份,得到此月在当年中有多少天
public class HomeWork1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入年份和月份");
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		int day = 0;
		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(31);
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(30);
			case 2:
				if( year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
					System.out.println(29);
				} else{
					System.out.println(28);
				}
				break;
			default:
				break;
		}
	}
}
