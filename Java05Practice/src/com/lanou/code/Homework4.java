package com.lanou.code;
//����һ�����飬���䡢������̬����֤Ԫ�ز��ظ�

public class Homework4 {
	public static int[] createArray(int min, int max, int count) {
		if (count > (max - min + 1)) {
			System.out.println("��������");
			return null;
		} else {
			int [] arr = new int[count];
			int index = 0;
			while (arr[count - 1] == 0) {
				boolean isRepeat = false;
				int num = (int)(Math.random() * (max - min + 1)) + min;
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
	public static void main(String[] args) {
		
	}
}
