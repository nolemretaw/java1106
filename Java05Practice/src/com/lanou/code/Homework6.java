package com.lanou.code;

import java.util.Scanner;

//������λ����װ�ɷ���

public class Homework6 {
	public static void dight() {
		//����λ��:��������һ��������С��10λ����������λ��
		Scanner scan = new Scanner(System.in);
		System.out.print("��������һ��������С��10λ����");
		int num = scan.nextInt();
		int count=0;
		do{
			num/=10;
			count++;
		} while(num > 0);
		System.out.print("���������λ���ǣ�"+ count);
		
	}
	public static void main(String[] args) {
		dight();
	}
}
