package com.lanou.code;

import java.util.Arrays;
//冒泡排序最终
public class ArraySort1 {
	public static void main(String[] args) {
		int[] nums = { 18, 26, 9, 57, 36};
		for (int i = 0; i < nums.length - 1; i++) {//控制趟数
			for (int j = 0; j < nums.length- i - 1; j++) {//控制次数
				if (nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
		//只支持升序排列 Arrays.sort(arr);
		System.err.println(Arrays.toString(nums));
	}
}
