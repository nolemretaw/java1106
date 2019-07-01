package com.lanou.code;

import java.util.Arrays;

public class InitialArray {
	public static void main(String[] args) {
		int[] nums = {1, 5, 3, 2, 9, 7};
		ArrayUtils.bubbleSort(nums);
		System.out.println(Arrays.toString(nums));
		int[] arr = ArrayUtils.createArr(1000, 9999, 4);
		System.out.println(Arrays.toString(arr));
	}
}
