package com.landou.code;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * whileѭ��
		 * while(ѭ������){
		 * ѭ�������
		 * }
		 * ��ѭ������Ϊ��ʱ,ִ��ѭ�����
		 * �ڽ��������ж�,�������ִ�����,��������ѭ��(����ֹѭ��)
		 */
		int num = 1;
		while (num<101) {
			if (num%7==0) {
				System.out.printf(" %d",num);	
			}
			num++;
		}
		System.out.println();
		System.out.println("----------------------------");
		num = 1;
		while (num < 101) {
			if (num%7!=0 && num%10!=7 && num%100/10!=7 && num/100!=7) {
				System.out.printf(" %d",num);
			}
			num++;
		}
		System.out.println();
		System.out.println("----------------------------");
		System.out.println("����һ����");
		Scanner scanner=new Scanner(System.in);
		int count = 0;
		for (int n=scanner.nextInt();  n != 0; n /= 10) {
			count ++;
		}
		System.out.println(count);
		scanner.close();
	}
}
