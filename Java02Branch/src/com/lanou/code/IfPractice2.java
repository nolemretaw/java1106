package com.lanou.code;

import java.util.Scanner;

public class IfPractice2 {
	public static void main(String[] args) {
		System.out.println("������������:");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		/*if (num1 > num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}*/
		int max = num1 > num2 ? num1 : num2 ;//?ǰΪ�����:ǰ ����֮
		System.out.println(max);
		scanner.close();
	}
}
