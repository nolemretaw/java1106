package com.lanou.code;

import java.util.Scanner;

//年月日求天数封装成方法

public class Homework5 {
	public static void numDay() {
		//输入年月日，输出第几天
				Scanner scanner = new Scanner(System.in);
				System.out.println("请输入年月日，以空格隔开：");
				int year = scanner.nextInt();
				int month = scanner.nextInt();
				int day = scanner.nextInt();
				//1 声明月份天数数组
				int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
				//2 通过闰年判断，改变二月份的月份天数
				boolean is400 = year % 400 == 0;
				boolean is4 = year % 4 == 0;
				boolean is100 = year % 100 == 0;
				if (is400 || (is4 && !is100)) {
					months[1] = 29;
				}
				//3 将输入的月份之前所有月份的天数累加
				int days = 0;
				for (int i = 0; i < month - 1; i ++) {
					days += months[i];
				}
				//4 再加上当月的天数即为总天数
				days += day;
				System.out.println(days);
	}
	public static void main(String[] args) {
		numDay();
	}
}
