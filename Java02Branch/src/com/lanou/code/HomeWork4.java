package com.lanou.code;

import java.util.Scanner;

public class HomeWork4 {
	public static void main(String[] args) {
		// 剪刀石头布
		System.out.println("剪刀0,石头1,布2:");
		int a=(int)(Math.random()*(2-0+1)+0);
		Scanner scanner=new Scanner(System.in);
		int b=scanner.nextInt();
		if (a==b) 
			System.out.println("我"+b+"电脑"+a+"平局");
		else if(a>b&&(a-b)==1) 
			System.out.println("我"+b+"电脑"+a+"输了");
			else
				System.out.println("我"+b+"电脑"+a+"赢了");
		scanner.close();	
	}
}
