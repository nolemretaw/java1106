package com.lanou.code;

import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {
		// int num[5] [1,5] 不重复
		int[] nums=new int[5];
		int index=0, count=0;
		while (nums[nums.length - 1]==0) {
			count++;
			int rNum = (int)(Math.random()*(5-1+1))+1;
			int i = 0;//boolean isRepeat=false;
			for (; i < nums.length; i++) {//排除重复
					if (rNum==nums[i]) {
						//isRepeat=true;
						break;
					}
			}	
			if (i==nums.length) {//加入
				nums[index++]=rNum;
			}	
		}
		System.out.println(Arrays.toString(nums));
		System.out.println(count);
	}
}
