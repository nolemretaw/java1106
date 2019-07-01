package com.lanou.code;

import java.util.Arrays;
import java.util.Scanner;

public class Homework4 {
	public static void main(String[] args) {
		//{12, 1, 3, 6, 29, 10, 19}
		
		/*for (int i = 1; i < num1.length; i++) {
			for (int j = 1; j < num1.length - i + 1; j++) {
				if (num1[j - 1] > num1[j]) {
					int temp = num1[j - 1];
					num1[j - 1] = num1[j];
					num1[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(num1));*/
		
		int[] num1 = {12, 1, 3, 6, 29, 10, 19};
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数:");
		int nb = scanner.nextInt();
		int[] num2 = {nb};
		int[] num3 = new int[num1.length + num2.length];
		for (int i = 0; i < num3.length; i++) {
			if (i < num1.length) {
				num3[i] = num1[i];
			}	else {
				num3[i] = num2[i - num1.length];
			}
		}
		System.out.println("合并后:");
		System.out.println(Arrays.toString(num3));
		
		for (int i = 0; i < num3.length - 1; i++) {
			for (int j = 0; j < num3.length - i - 1; j++) {
				if (num3[j] > num3[j + 1]) {
					int temp = num3[j];
					num3[j] = num3 [j + 1];
					num3[j + 1] = temp;
				}
			}
		}
		System.out.println("升序后:");
		System.out.println(Arrays.toString(num3));
	}
}
