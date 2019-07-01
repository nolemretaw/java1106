package com.lanou.code;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		// 输入出生年月日,输出日期在当年中为第几天
		System.out.println("输入出生年月日,输出日期在当年中为第几天:");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();//年
		int month = scanner.nextInt();//月
		int day = scanner.nextInt();//日
		int[]months = {31,28,31,30,31,30,31,31,30,31,30,31};//天
		int birth = 0, i = 0;//生日
		boolean isRun = (year%4 == 0 && year % 100 !=0)||year % 400 == 0;
		for (; i < month - 1; i++) {
			birth += months[i];
		}
		if (month>2) {
			birth += (isRun == true ? 1 : 0);
		}
		birth += day;
		System.out.println("该年为  " + (isRun == true ? "闰年" : "平年") + 
				"  生日为第  " + birth + "天");
	}
}
