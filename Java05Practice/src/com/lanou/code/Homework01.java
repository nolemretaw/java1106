package com.lanou.code;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class Homework01 {
//���巽��ʵ�������������������������ĸ�����������������ֵ
	public static int getMax(int[] arrays) {//ð������
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

	public static int[] getArray() {//�������
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
		System.out.println("������һ����, ��0Ϊ��β,���������ֵ");
		System.out.println("������" + getMax(nums));
	}

}
