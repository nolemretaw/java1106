package com.lanou.code;

import java.util.Arrays;
//ð����������
public class ArraySort1 {
	public static void main(String[] args) {
		int[] nums = { 18, 26, 9, 57, 36};
		for (int i = 0; i < nums.length - 1; i++) {//��������
			for (int j = 0; j < nums.length- i - 1; j++) {//���ƴ���
				if (nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
		//ֻ֧���������� Arrays.sort(arr);
		System.err.println(Arrays.toString(nums));
	}
}
