package com.lanou.code;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		/*
		 * ð������:
		 * ������һ��һ�˵�����
		 * �����������Ƚ�,���ǰ��ıȺ���Ĵ�,�򽻻�λ��,ÿһ�˶����Եõ�����������ֵ,
		 * �Ӷ��õ���������
		 * ����		����
		 * 1		4
		 * 2		3
		 * 3		2
		 * 4		1
		 * ���� + ����==Ԫ�ظ���
		 * ���ѭ����������,�ڲ�ѭ�����ƴ���
		 */
		int[] nums={18, 25, 9, 57, 36};
//		for (int i = 1; i < nums.length; i++) {//����
//			for (int j = 1; j < nums.length-i+1; j++) {//����
//				if (nums[j-1]<nums[j]) {
//					int temp=nums[j-1];
//					nums[j-1]=nums[j];
//					nums[j]=temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(nums));
		
		for (int i = 0; i < nums.length-1; i++) {//����  ���� + ����==Ԫ�ظ���
			for (int j = 0; j < nums.length-i-1; j++) {//����
				if (nums[j]<nums[j+1]) {
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
	}
}
