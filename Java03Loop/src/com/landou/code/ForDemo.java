package com.landou.code;

public class ForDemo {

	public static void main(String[] args) {
/*
 * ѭ�������ĳ�ʼ��
 * ѭ������
 * ѭ������
 * ѭ����� 
 */		
		int sum=0;
		int max=0, min=100;
		for (int i = 0; i < 10; i++) {
			int num=(int)(Math.random()*(20-10+1))+10;
			System.out.print(num+ " ");
			sum+=num;
			max=max>num?max:num;
			min=min<num?min:num;
		}
		System.out.println("\n"+sum);
		System.out.println(min);
		System.out.println(max);
	}
}
