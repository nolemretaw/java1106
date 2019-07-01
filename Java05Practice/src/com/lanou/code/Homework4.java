package com.lanou.code;
//生成一个数组，区间、容量动态，保证元素不重复

public class Homework4 {
	public static int[] createArray(int min, int max, int count) {
		if (count > (max - min + 1)) {
			System.out.println("输入有误");
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
