package com.lanou.code;

import java.util.Scanner;

public class WhileDemo {
	public static void main(String[] args) {
		//while
		//��ӡ1-100֮�����е�����
		/*
		 	whileѭ��
		 	while (ѭ������) {
		 		ѭ�������
		 	}
		 	��ѭ������Ϊ��ʱ,ִ��ѭ�������
		 	�ٽ��������ж�,�����ִ�����,������ѭ��
		 	������ν����ֹѭ��
		 */
		int num = 1;
		while (num < 101) {
			System.out.println(num);
			num++;
		}
		
		//��ӡ1-100֮��7�ı���
		System.out.println("----�����ķָ���----");
		num = 1;
		while (num < 101) {
			if (num % 7 == 0){
				System.out.println(num);
			}
			num++;
		}
		
		//��ӡ1-100֮�䲻��7�ı���Ҳ��������7����
		System.out.println("----�����ķָ���----");
		num = 1;
		while (num < 101) {
			if (num % 7 != 0 && 
					num % 10 != 7 && 
					num % 100 / 10 != 7 && 
					num / 100 != 7) {
				System.out.println(num);
			}
			num++;
		}
		
		//�ӿ���̨����һ������,�õ��������ж���λ
		System.out.println("----�ָ���----");
		System.out.println("������һ������");
		Scanner scanner = new Scanner (System.in);
		long num1 = scanner.nextLong();
		int count = 1;
		while (num1 / 10 != 0) {
			num1 /= 10;//num1 = num1 /10;
			count++;
		}
		System.out.println(count);
		scanner.close();
	}
}
