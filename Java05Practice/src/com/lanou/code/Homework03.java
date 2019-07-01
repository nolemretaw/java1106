package com.lanou.code;

import java.util.Arrays;
import java.util.Scanner;

//生成一个数组，区间、容量动态，保证元素不重复
public class Homework03 {
	public static int[] createArray(int max, int min, int count) {
		if (max - min < count) {
			System.out.println("error");
			return null;
		} else {
			int[] arr = new int[count];
			int index = 0;
			while (arr[count - 1] == 0) {
				int num = (int)(Math.random()*(max - min + 1)) + min;
				int i = 0;
				for (; i < arr.length; i++) {
					if (arr[i] == num) {
						break;
					}
				}
				if (i == arr.length) {
					arr[index++] = num;
				}
			}
			return arr;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入max min count");
		Scanner scanner = new Scanner(System.in);
		int max = scanner.nextInt();
		int min = scanner.nextInt();
		int count = scanner.nextInt();
		int[]arr = createArray(max, min, count);
		System.out.println(Arrays.toString(arr));
	}

}
