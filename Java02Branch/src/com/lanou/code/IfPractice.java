package com.lanou.code;
import java.util.Scanner;
public class IfPractice {
	public static void main(String[] args) {
		System.out.println("输入年份:");
		Scanner scanner=new Scanner(System.in);
		int year=scanner.nextInt();
		if (year%400==0 || (year%4==0 && year%100!=0)) 
			System.out.println(year+"是闰年");
		else System.out.println(year+"是平年");
		scanner.close();
	}
}
