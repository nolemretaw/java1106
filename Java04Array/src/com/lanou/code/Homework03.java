package com.lanou.code;

import java.util.Arrays;

public class Homework03 {

	public static void main(String[] args) {
		//ɾ��35���Ԫ��
		int[] arr = {20, 35, 30, 20, 40, 50};
		System.out.println("ԭ����Ϊ:  " + Arrays.toString(arr));
		System.out.println("ɾ��35���Ԫ��");
		int[] arr1 = new int[5];
		int i = 0, j = 0;
		for (; i < arr.length; i++) {
			if (arr[i] == 35) //����
				i++;
			arr1[j++] = arr[i];
		}
		System.out.println("ɾ����Ϊ:  " + Arrays.toString(arr1));
	}
}
