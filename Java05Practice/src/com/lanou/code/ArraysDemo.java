package com.lanou.code;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		/*
		 * Arrays���鹤����,��Ϊ���������ʹ�ø��ӷ���
		 * 
		 */
		int[] nums =new int[10];
		Arrays.fill(nums, 8);//��䷽�� ��һ������ ������ �ڶ������� ������ֵ
		System.out.println(Arrays.toString(nums));
		int[] nums1 = {2, 9, 6, 4, 11, 3, 7};
//		Arrays.sort(nums1);
		//��������ֻ֧������
		System.out.println(Arrays.toString(nums1));
		//����fromIndex ������toIndex
		Arrays.sort(nums1, 1, 6);
		System.out.println(Arrays.toString(nums1));
	}

}
