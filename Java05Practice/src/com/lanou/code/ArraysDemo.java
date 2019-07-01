package com.lanou.code;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		/*
		 * Arrays数组工具类,是为了让数组的使用更加方便
		 * 
		 */
		int[] nums =new int[10];
		Arrays.fill(nums, 8);//填充方法 第一个参数 数组名 第二个参数 参数数值
		System.out.println(Arrays.toString(nums));
		int[] nums1 = {2, 9, 6, 4, 11, 3, 7};
//		Arrays.sort(nums1);
		//此排序功能只支持升序
		System.out.println(Arrays.toString(nums1));
		//包含fromIndex 不包含toIndex
		Arrays.sort(nums1, 1, 6);
		System.out.println(Arrays.toString(nums1));
	}

}
