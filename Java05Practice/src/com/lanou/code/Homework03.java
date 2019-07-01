package com.lanou.code;

import java.util.Arrays;
import java.util.Scanner;

//����һ�����飬���䡢������̬����֤Ԫ�ز��ظ�
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
		System.out.println("����max min count");
		Scanner scanner = new Scanner(System.in);
		int max = scanner.nextInt();
		int min = scanner.nextInt();
		int count = scanner.nextInt();
		int[]arr = createArray(max, min, count);
		System.out.println(Arrays.toString(arr));
	}

}
