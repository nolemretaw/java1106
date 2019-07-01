package com.lanou.code;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		/*
		 * 冒泡排序:
		 * 排序是一趟一趟的排序
		 * 相邻两个数比较,如果前面的比后面的大,则交换位置,每一趟都可以得到当趟最大的数值,
		 * 从而得到有序数列
		 * 趟数		次数
		 * 1		4
		 * 2		3
		 * 3		2
		 * 4		1
		 * 趟数 + 次数==元素个数
		 * 外层循环控制趟数,内层循环控制次数
		 */
		int[] nums={18, 25, 9, 57, 36};
//		for (int i = 1; i < nums.length; i++) {//趟数
//			for (int j = 1; j < nums.length-i+1; j++) {//次数
//				if (nums[j-1]<nums[j]) {
//					int temp=nums[j-1];
//					nums[j-1]=nums[j];
//					nums[j]=temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(nums));
		
		for (int i = 0; i < nums.length-1; i++) {//趟数  趟数 + 次数==元素个数
			for (int j = 0; j < nums.length-i-1; j++) {//次数
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
