package com.landou.code;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		// 最大公约数,最小公倍数
		System.out.println("请输入不相等的两个数");
		Scanner scanner=new Scanner(System.in);
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		int all=num1*num2;
		int max=num1>num2?num1:num2;
		int min=num1<num2?num1:num2;
		while (min!=0) {
			max%=min;
			if (max==0) break;
			min%=max;
		}
		int a=(max==0 ? min : max);
		System.out.println("最大公约数为 " + a);
		System.out.println("最小公倍数为 " + all/a);
	}

}
