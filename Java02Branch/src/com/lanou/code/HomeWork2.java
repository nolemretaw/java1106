package com.lanou.code;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		// ����һ���·ݺ�����,�ó�����
		System.out.println("������һ������,�·��������ÿո����:");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		int day = scanner.nextInt();
		if (month < 0 || month > 12 || day < 0 || day > 31) {
			System.out.println("error");
		} else {
			switch (month) {
				case 1:
					if (day>=20) {
						System.out.println("ˮƿ��");
					} else
						System.out.println("Ħ����");
					break;
				case 2:
					if (day>=19) {
						System.out.println("˫����");
					} else
						System.out.println("ˮƿ��");	
					break;
				case 3:
					if (day<=20) {
						System.out.println("˫����");
					} else
						System.out.println("������");	
					break;
				case 4:
					if (day<=19) {
						System.out.println("������");
					} else
						System.out.println("��ţ��");	
					break;
				case 5:
					if (day<=20) {
						System.out.println("��ţ��");
					} else
						System.out.println("˫����");	
					break;
				case 6:
					if (day<=21) {
						System.out.println("˫����");
					} else
						System.out.println("��з��");	
					break;
				case 7:
					if (day>=23) {
						System.out.println("ʨ����");
					} else
						System.out.println("��з��");	
					break;
				case 8:
					if (day<=22) {
						System.out.println("ʨ����");
					} else
						System.out.println("��Ů��");	
					break;
				case 9:
					if (day>=23) {
						System.out.println("��ƽ��");
					} else
						System.out.println("��Ů��");	
					break;
				case 10:
					if (day>=24) {
						System.out.println("��Ы��");
					} else
						System.out.println("��ƽ��");	
					break;
				case 11:
					if (day>=23) {
						System.out.println("������");
					} else
						System.out.println("��Ы��");	
					break;
				case 12:
					if (day>=22) {
						System.out.println("Ħ����");
					} else
						System.out.println("������");	
					break;
				}
		}
	}
}
