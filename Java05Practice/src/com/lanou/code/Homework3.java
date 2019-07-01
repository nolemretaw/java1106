package com.lanou.code;

import java.util.Arrays;

//½«Ã°ÅÝÅÅÐò·â×°³É·½·¨

public class Homework3 {
	public static void maoPao(int[] arr) {
		//ÉýÐò Arrays.sort(arr);
		//½µÐò
		int team = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
			
			
			
	public static void main(String[] args) {
		int [] arr = {10, 9, 20, 33, 11, 8};
		maoPao(arr);
	}
}
