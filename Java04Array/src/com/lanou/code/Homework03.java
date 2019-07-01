package com.lanou.code;

import java.util.Arrays;

public class Homework03 {

	public static void main(String[] args) {
		//删除35这个元素
		int[] arr = {20, 35, 30, 20, 40, 50};
		System.out.println("原数组为:  " + Arrays.toString(arr));
		System.out.println("删除35这个元素");
		int[] arr1 = new int[5];
		int i = 0, j = 0;
		for (; i < arr.length; i++) {
			if (arr[i] == 35) //跳过
				i++;
			arr1[j++] = arr[i];
		}
		System.out.println("删除后为:  " + Arrays.toString(arr1));
	}
}
