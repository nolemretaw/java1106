package com.lanou.code;

import java.util.Arrays;

public class ArrayDemo03 {
//�����10-30
	public static void main(String[] args) {
		int[] nums=new int[10];
		int max=10,min=30;
		for (int i = 0; i < nums.length; i++) {
			nums[i]=(int)(Math.random()*(30-10+10))+1;
			 max=max>nums[i]?max:nums[i];
			 min=min<nums[i]?min:nums[i];
		}
		System.out.println(Arrays.toString(nums));
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]==max) {
				System.out.println("����±�"+i);
			}
			if(nums[i]==min){
				System.out.println("��С�±�"+i);
			}
		}
		System.out.println("��� "+max +"��С "+ min+"�� "+ (min+max));
	}
}
