package com.lanou.code;

public class DoWhileDemo {
	public static void main(String[] args) {
		//��ӡ1-100֮�����е�����
		int num = 1;
		/*
		 	do...whileѭ��β���ķֺŲ���ʡ��!!!
		 	do {
		 		ѭ�����
		 	} while (ѭ������);
		 	while (ѭ������) {
		 		ѭ�����
		 	}
		 	����:
		 	do...whileѭ��,��ִ��������ж�����,��������ִ�д���>=1
		 	whileѭ��,���ж�������ִ�����,��������ִ�д���>=0
		 	do...while������
		 */
		do {
			System.out.println(num);
			num++;
		} while (num < 101);
	}
}
