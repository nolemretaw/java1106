package com.lanou.code;

public class Fordemo {
	public static void main(String[] args) {
		/*
		 	ѭ�������ĳ�ʼ��
		 	ѭ������
		 	ѭ������
		 	ѭ�����
		 */
		/*//��ӡ1-100֮�����е�����
		for (int i = 1; i < 101; i++) {
			System.out.println(i);
		}*/
	
		
		//����ʮ��[10,20]֮��������,�õ����е����ֵ,��Сֵ,��
		int sum = 0;//������ͽ��
		int max = 10, min = 20;
		for (int i = 0; i < 10; i++) {
			int num = (int)(Math.random() * (20 -10 + 1)) + 10 ;
			System.out.print(num + " ");
			sum += num; //sum = sum + num;
			max = max > num ? max : num; // ?  : (��ͬ��if else)
			min = min < num ? min : num;
		}
		System.out.println("\n" + sum);
		System.out.println(max);
		System.out.println(min);
	}
}
