package com.lanou.code;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		// 输入一个月份和日期,得出星座
		System.out.println("请输入一个日期,月份与日期用空格隔开:");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		int day = scanner.nextInt();
		if (month < 0 || month > 12 || day < 0 || day > 31) {
			System.out.println("error");
		} else {
			switch (month) {
				case 1:
					if (day>=20) {
						System.out.println("水瓶座");
					} else
						System.out.println("摩羯座");
					break;
				case 2:
					if (day>=19) {
						System.out.println("双鱼座");
					} else
						System.out.println("水瓶座");	
					break;
				case 3:
					if (day<=20) {
						System.out.println("双鱼座");
					} else
						System.out.println("白羊座");	
					break;
				case 4:
					if (day<=19) {
						System.out.println("白羊座");
					} else
						System.out.println("金牛座");	
					break;
				case 5:
					if (day<=20) {
						System.out.println("金牛座");
					} else
						System.out.println("双子座");	
					break;
				case 6:
					if (day<=21) {
						System.out.println("双子座");
					} else
						System.out.println("巨蟹座");	
					break;
				case 7:
					if (day>=23) {
						System.out.println("狮子座");
					} else
						System.out.println("巨蟹座");	
					break;
				case 8:
					if (day<=22) {
						System.out.println("狮子座");
					} else
						System.out.println("处女座");	
					break;
				case 9:
					if (day>=23) {
						System.out.println("天平座");
					} else
						System.out.println("处女座");	
					break;
				case 10:
					if (day>=24) {
						System.out.println("天蝎座");
					} else
						System.out.println("天平座");	
					break;
				case 11:
					if (day>=23) {
						System.out.println("射手座");
					} else
						System.out.println("天蝎座");	
					break;
				case 12:
					if (day>=22) {
						System.out.println("摩羯座");
					} else
						System.out.println("射手座");	
					break;
				}
		}
	}
}
