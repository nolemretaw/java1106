package com.lanou.code;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		// ����������������������
		System.out.println("������������,һ���������������,�ÿո����");
		Scanner scanner=new Scanner(System.in);
		double num1 = scanner.nextDouble();
		char sign = scanner.next().charAt(0);
		double num2 = scanner.nextDouble();
		switch (sign) {
			case '+':
				System.out.println(num1 + "+" + num2 + "=" +(num1 + num2) );	
				break;
			case '-':
				System.out.println(num1 + "-" + num2 + "=" +(num1 - num2) );	
				break;
			case '*':
				System.out.println(num1 + "*" + num2 + "=" +(num1 * num2) );	
					break;
			case '/':
				System.out.println(num1 + "��" + num2 + "=" +(num1 / num2) );	
					break;		
		}
		scanner.close();
	}
}
