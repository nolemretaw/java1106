package com.landou.code;

public class Homework03 {

	public static void main(String[] args) {
		// 三位数 水仙花数
		int num=100;
		while (num<1000) {
			int a=num/100;
			int b=num/10%10;
			int c=num%100%10;
			if (num==(a*a*a+b*b*b+c*c*c)) {
				System.out.print( num+" ");
			}
			num++;
		}
	}
}
