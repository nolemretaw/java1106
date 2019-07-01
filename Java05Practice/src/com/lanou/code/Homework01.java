package com.lanou.code;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class Homework01 {
//定义方法实现求两个整数、三个整数、四个整数、五个整数最大值
	public static int getMax(int[] arrays) {//冒泡排序
		for (int i = 0; i < arrays.length-1; i++) {
			for (int j = 0; j < arrays.length-1-i; j++) {
				if (arrays[j+1] < arrays[j]) {
					int temp = arrays[j];
					arrays[j] = arrays[j+1];
					arrays[j+1] = temp;
				} 
			}
		}
		return arrays[0];
	}

	public static int[] getArray() {//获得数组
		Scanner scanner=new Scanner(System.in);
		int[] nums=new int[20];
		int i = 0;
		int num = 0;
		do {
			num = scanner.nextInt();
			nums[i++] = num;
		} while (num != 0);
		return nums; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=getArray();
		System.out.println("请输入一组数, 以0为结尾,来求其最大值");
		System.out.println("最大的是" + getMax(nums));
	}

}
