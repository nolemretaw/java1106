package com.landou.code;

public class Homework04 {

	public static void main(String[] args) {
		// abc + cba = 1333;
			for (int a = 1; a < 10; a++) {
				for (int b = 1; b < 10; b++) {
					for (int c = 1; c < 10; c++) {
						int num1=a*100+b*10+c, num2=c*100+b*10+a;
						if(num1+num2 == 1333) {
							System.out.println(num1+"+"+num2+"="+"1333");
						}
					}
				}
			}
		}
}
