package com.lanou.code;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDemo3 {
	public static void main(String[] args) {
		//�������
		int[] nums = {1, 2, 3, 4};
		/*
		 	forѭ��ͨ�������������õ�
		 	���������̶�,forͨ��������֪����
		 	����ѭ����ֵΪ0,�������������1
		 	���ÿ����������±��Ӧ
		 */
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		
		int[] ages = new int[5];
		for (int i = 0; i < ages.length; i++) {
			ages[i] = (int)(Math.random() * (20 - 10 + 1)) + 10;
		}
		System.out.println(Arrays.toString(ages));
		
		
/*		int[] numb = new int[10];
		int max = 10, min = 10, sum = 0;
		for (int i = 0; i < 20; i++) {
			numb[i] = (int)(Math.random() *  (30 - 10 + 1)) + 10;
			sum = sum + numb[i];
			max = max > numb[i] ? max : numb[i];
			min = min < numb[i] ? min : numb[i];
		}
		System.out.println(max);
		System.out.println(min);*/
		
		
		/*
	 	����һ��10����������������
	 	�����ֵ[10, 30]�����ڵ�����
	 	�����ֵ����Сֵ���� �Լ�
	 	���ֵ����Сֵ���ڵ��±�
	 */

		int[] numb = new int[10];
		int max = 0, min = 100, sum = 0;
		for (int i = 0; i < numb.length; i++) {
			numb[i] = (int)(Math.random() *  (30 - 10 + 1)) + 10;
			sum = sum + numb[i];
			max = max > numb[i] ? max : numb[i];
			min = min < numb[i] ? min : numb[i];
		}
		System.out.println(Arrays.toString(numb));
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
		for (int i = 0; i < numb.length; i++) {
			if (numb[i] == max ) {
				System.out.println("����±�" + i);
			}
			if (numb[i] == min) {
				System.out.println("��С�±�" + i);
			}
		}
	}
}
