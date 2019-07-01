package com.lanou.code;

import java.util.Arrays;
import java.util.Scanner;

public class Homework02 {
	//将冒泡排序封装成方法
	public static int[] getArray() {//获得数组
		Scanner scanner=new Scanner(System.in);
		int[] nums=new int[20];
		int i = 0;
		int num = 0;
		do {
			num = scanner.nextInt();
			
			nums[i++] = num;
		} while (num != (int)'N');
		System.out.println(Arrays.toString(nums));
		return nums; 
	}
	public static int[] bubbleSort(int[] arrays) {//冒泡排序
		for (int i = 0; i < arrays.length-1; i++) {
			for (int j = 0; j < arrays.length-1-i; j++) {
				if (arrays[j+1] > arrays[j]) {
					int temp = arrays[j];
					arrays[j] = arrays[j+1];
					arrays[j+1] = temp;
				} 
			}
		}
		return arrays;
	}
	public static void main(String[] args) {
		System.out.println("输出一个数组,用空格隔开,用N结束");
		int[] nums=getArray();
//		nums = bubbleSort(nums);
//		System.out.println(nums);
	}

}
