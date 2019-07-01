package com.lanou.code;

public class ArrayUtils {
	
	public static void bubbleSort(int[] arr) {
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
	
	public static int[] createArr(int min, int max, int count) {
		int[] arr = new int[count];
		int index = 0;
		while (arr[count - 1] == 0) {
			int num = (int)(Math.random() * (max - min + 1)) + min;
			boolean isRepeat = false;
			for (int i = 0; i < arr.length; i++) {
				if (num == arr[i]) {
					isRepeat = true;
					break;
				}
			}
			if (!isRepeat) {
				arr[index] = num;
				index++;
			}
		}
		return arr;
	}
}
