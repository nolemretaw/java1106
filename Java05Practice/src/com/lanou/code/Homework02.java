package com.lanou.code;

import java.util.Arrays;
import java.util.Scanner;

public class Homework02 {
	//��ð�������װ�ɷ���
	public static int[] getArray() {//�������
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
	public static int[] bubbleSort(int[] arrays) {//ð������
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
		System.out.println("���һ������,�ÿո����,��N����");
		int[] nums=getArray();
//		nums = bubbleSort(nums);
//		System.out.println(nums);
	}

}
