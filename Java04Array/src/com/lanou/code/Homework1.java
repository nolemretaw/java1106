package com.lanou.code;

import java.util.Arrays;

public class Homework1 {
	public static void main(String[] args) {
		//�������飬���Ԫ�أ��������ٺϲ���һ����������

		int[] num1 = { 1, 22, 33, 66, 88};
		int[] num2 = { 18, 26, 9, 57, 36};
		/*for (int i = 1; i < num1.length; i++) {//��������
			for (int j = 1; j < num1.length - i + 1; j++) {//���ƴ���
				if (num1[j - 1] > num1[j]) {
					int temp = num1[j - 1];
					num1[j - 1] = num1[j];
					num1[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(num1));
		
		for (int i = 1; i < num2.length; i++) {
			for(int j = 1; j< num2.length - i + 1; j++) {
				if (num2[j - 1] > num2[j]) {
					int temp = num2[j - 1];
					num2[j - 1] = num2[j];
					num2[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(num2));
		*/
		int[] num3 = new int[num1.length + num2.length];
		for (int i = 0; i < num3.length; i++) {
			if (i < num1.length) {
				num3[i] = num1[i];
			} else {
				num3[i] = num2[i - num1.length];
			}
		}
		System.out.println("�ϲ���:");
		System.out.println(Arrays.toString(num3));
		for (int i = 1; i < num3.length; i++) {
			for (int j = 1; j < num3.length- i + 1; j++) {
				if (num3[j - 1] > num3[j]) {
					int temp = num3[j -1];
					num3[j - 1] = num3[j];
					num3[j] = temp;
				}
			}
		}
		System.out.println("�����:");
		System.out.println(Arrays.toString(num3));
	}
}
