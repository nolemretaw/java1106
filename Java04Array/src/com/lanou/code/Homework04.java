package com.lanou.code;

import java.util.Arrays;
import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		// 控制台输入一个数，插入到原数组中，形成新的升序数组
		int[] arr = {12, 1, 3, 6, 29, 10, 19};
		System.out.println("排序前:  " + Arrays.toString(arr));
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length - i -1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("排序后 :  " + Arrays.toString(arr));
		System.out.println("输入一个数,将形成新的升序数组:  ");
		Scanner scanner=new Scanner(System.in);
		int num = scanner.nextInt();
		int[] arr1 = new int[8];//思想:利用之前排序好的数组,将小于num的数存入新数组,
		//遇到第一个不小于num的数之后将num以及剩余的数组依次存入新数组
		int i = 0, j = 0;
		boolean isInsert = false;//是否插入
		for (; j < arr1.length; j++) {
			if (isInsert == false) {//未插入
				if (num > arr[i] && num != arr[arr.length-1]) {//寻找第一个不小于num
					arr1[j] = arr[i++];
				} else {
					if (num == arr[arr.length-1]) 
					arr1[j]=num;
					isInsert = true;
				}
			} else //已插入
				arr1[j] = arr[i++];
		}
		System.out.println("再次排序后为:  " + Arrays.toString(arr1));
	}

}
