package com.lanou.code;

import java.util.Arrays;

public class Practice {
	public static void maoPao(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}	
		}
	}
	public static void main(String[] args) {
		int[] arr = {10, 2, 5, 22, 14};
		maoPao(arr);
		System.out.println(Arrays.toString(arr));
	}
}
