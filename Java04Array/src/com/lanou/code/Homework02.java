package com.lanou.code;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		// �������������,��������ڵ�����Ϊ�ڼ���
		System.out.println("�������������,��������ڵ�����Ϊ�ڼ���:");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();//��
		int month = scanner.nextInt();//��
		int day = scanner.nextInt();//��
		int[]months = {31,28,31,30,31,30,31,31,30,31,30,31};//��
		int birth = 0, i = 0;//����
		boolean isRun = (year%4 == 0 && year % 100 !=0)||year % 400 == 0;
		for (; i < month - 1; i++) {
			birth += months[i];
		}
		if (month>2) {
			birth += (isRun == true ? 1 : 0);
		}
		birth += day;
		System.out.println("����Ϊ  " + (isRun == true ? "����" : "ƽ��") + 
				"  ����Ϊ��  " + birth + "��");
	}
}
