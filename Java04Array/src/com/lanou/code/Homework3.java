package com.lanou.code;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Homework3 {
	public static void main(String[] args) {
		int[] aNum = {20, 35, 30, 20, 40, 50};
		int[] bNum = new int[aNum.length - 1];
		int c = 1;
		for (int i = c; i < aNum.length-1; i++) {
			aNum[i] = aNum[i+1];
			}
			for (int i = 0; i < bNum.length; i++) {
			bNum[i] = aNum[i];
			}
			aNum = bNum;
			for (int i = 0; i < bNum.length; i++) {
			System.out.println(Arrays.toString(aNum));
			break;
			}
	}
}
