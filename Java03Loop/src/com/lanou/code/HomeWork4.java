package com.lanou.code;

import java.util.Scanner;

public class HomeWork4 {
	public static void main(String[] args) {
		//������� ��󹫱���
		System.out.println("������������");
		Scanner scanner = new Scanner(System.in);
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		int d = a * b;
		for (int c= 0;;) {//������
			if (a > b) {
				if (a % b == 0) {
					System.out.println("�������:" + b);
					System.out.println("��С������:" + d / b);
					break;
				}
				c = a % b;
				a = c;
			} else if (a < b) {
				if (b % a == 0){
					System.out.println("�������:"+ a);
					System.out.println("��С������:" + d/a);
					break;
				}
				c = b % a;
				b = c;
			}
			
		}
	}
}
