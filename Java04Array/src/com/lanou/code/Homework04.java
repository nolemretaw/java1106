package com.lanou.code;

import java.util.Arrays;
import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		// ����̨����һ���������뵽ԭ�����У��γ��µ���������
		int[] arr = {12, 1, 3, 6, 29, 10, 19};
		System.out.println("����ǰ:  " + Arrays.toString(arr));
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length - i -1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("����� :  " + Arrays.toString(arr));
		System.out.println("����һ����,���γ��µ���������:  ");
		Scanner scanner=new Scanner(System.in);
		int num = scanner.nextInt();
		int[] arr1 = new int[8];//˼��:����֮ǰ����õ�����,��С��num��������������,
		//������һ����С��num����֮��num�Լ�ʣ����������δ���������
		int i = 0, j = 0;
		boolean isInsert = false;//�Ƿ����
		for (; j < arr1.length; j++) {
			if (isInsert == false) {//δ����
				if (num > arr[i] && num != arr[arr.length-1]) {//Ѱ�ҵ�һ����С��num
					arr1[j] = arr[i++];
				} else {
					if (num == arr[arr.length-1]) 
					arr1[j]=num;
					isInsert = true;
				}
			} else //�Ѳ���
				arr1[j] = arr[i++];
		}
		System.out.println("�ٴ������Ϊ:  " + Arrays.toString(arr1));
	}

}
