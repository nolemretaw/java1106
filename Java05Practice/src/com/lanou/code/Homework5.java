package com.lanou.code;

import java.util.Scanner;

//��������������װ�ɷ���

public class Homework5 {
	public static void numDay() {
		//���������գ�����ڼ���
				Scanner scanner = new Scanner(System.in);
				System.out.println("�����������գ��Կո������");
				int year = scanner.nextInt();
				int month = scanner.nextInt();
				int day = scanner.nextInt();
				//1 �����·���������
				int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
				//2 ͨ�������жϣ��ı���·ݵ��·�����
				boolean is400 = year % 400 == 0;
				boolean is4 = year % 4 == 0;
				boolean is100 = year % 100 == 0;
				if (is400 || (is4 && !is100)) {
					months[1] = 29;
				}
				//3 ��������·�֮ǰ�����·ݵ������ۼ�
				int days = 0;
				for (int i = 0; i < month - 1; i ++) {
					days += months[i];
				}
				//4 �ټ��ϵ��µ�������Ϊ������
				days += day;
				System.out.println(days);
	}
	public static void main(String[] args) {
		numDay();
	}
}
