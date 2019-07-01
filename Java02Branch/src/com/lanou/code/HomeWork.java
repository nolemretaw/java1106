package com.lanou.code;

import java.util.Scanner;

public class HomeWork {
	/*
	 * ����һ�����,һ���·�,�õ����·��ڵ������ж�����
	 */
	public static void main(String[] args) {
		System.out.println("���� һ�����,һ���·�");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		if ((month > 12 || month < 1) || (year < 0))
			System.out.println("��������������");
		else {
			boolean tag = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
			System.out.println("����������" + (tag == true ? "����" : "ƽ��"));
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("������31��");
				break;
			case 2:
				System.out.println("������" + (tag == true ? 29 : 28) + "��");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("������30��");
				break;
			}
		}
		scanner.close();
	}
}
