package com.lanou.code;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		System.out.println("������������������:");
//		����һ��ɨ�����,��������,��ʵ��ɨ��
		Scanner scanner = new Scanner(System.in);
//		����ɨ������nextXX������ʵ��ɨ�踳ֵ����
		//������ʽ:1. alt + /  2. shift + ctrl + o
		int num = scanner.nextInt();
		int num1 = scanner.nextInt();
		double num2 = scanner.nextDouble();
		System.out.println(num);
		System.out.println(num1);
		System.out.println(num2);
		scanner.close();
		//�ر�scannerɨ�����()
	 }

}
