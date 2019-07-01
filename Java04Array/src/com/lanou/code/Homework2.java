package com.lanou.code;

import java.util.Arrays;
import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {
		//输入出生年月日，输出日期在当年中为第几天
		int y, m, d;
		int sum = 0;
		int feb = 28;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年份");
		y = scanner.nextInt();
		System.out.println("请输入月份");
		m = scanner.nextInt();
		System.out.println("请输入日期");
		d = scanner.nextInt();
		if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
			feb = 29;
		}
		switch (m) {
		case 1:
			sum = d;
			break;
		case 2:
			sum = 31 + d;
			break;
		case 3:
			sum = 31 + feb + d;
			break;
		case 4:
			sum = 31 + feb + 31 + d;
			break;
		case 5:
			sum = 31 + feb + 31 + 30 + d;
			break;
		case 6:
			sum = 31 + feb + 31 + 30 + 31 + d;
			break;
		case 7:
			sum = 31 + feb + 31 + 30 + 31 +30 + d;
			break;
		case 8:
			sum = 31 + feb + 31 + 30 + 31 + 30 + 31 + d;
			break;
		case 9:
			sum = 31 + feb + 31 + 30 + 31 + 30 + 31 + 31 + d;
			break;
		case 10:
			sum = 31 + feb + 31 + 30 + 31 + 30 + 31 + 31 + 30 +d;
			break;
		case 11:
			sum = 31 + feb + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + d;
			break;
		case 12:
			sum = 31 + feb + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + d;

		default:
			break;
		}
		System.out.println(sum);
	}
}
