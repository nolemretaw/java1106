package com.landou.code;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		// ���Լ��,��С������
		System.out.println("�����벻��ȵ�������");
		Scanner scanner=new Scanner(System.in);
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		int all=num1*num2;
		int max=num1>num2?num1:num2;
		int min=num1<num2?num1:num2;
		while (min!=0) {
			max%=min;
			if (max==0) break;
			min%=max;
		}
		int a=(max==0 ? min : max);
		System.out.println("���Լ��Ϊ " + a);
		System.out.println("��С������Ϊ " + all/a);
	}

}
