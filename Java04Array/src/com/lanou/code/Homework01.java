package com.lanou.code;
import java.util.Arrays;
public class Homework01 {//两个数组,五个元素,先升序 再合并成一个升序数组
	public static void main(String[] args) {
			int[] nums1={22, 33, 3, 2, 7};
			int[] nums2={34, 546, 45, 67, 4};
			int[] nums3=new int[10];
			System.out.println("数组1为 : "+Arrays.toString(nums1));
			for (int i = 0; i < nums1.length-1; i++) {//冒泡关键:趟数+次数==总容量length-1
				for (int j = 0; j < nums1.length-i-1; j++) {
					if (nums1[j]>nums1[j+1]) {
						int temp=nums1[j+1];
						nums1[j+1]=nums1[j];
						nums1[j]=temp;
					}
				}		
			}
			System.out.println("升序为 :  "+ Arrays.toString(nums1)+"\n"+
					"数组2为 : "+Arrays.toString(nums2));
			for (int i = 0; i < nums2.length-1; i++) {//冒泡关键:趟数+次数==总容量length-1
				for (int j = 0; j < nums2.length-i-1; j++) {
					if (nums2[j]>nums2[j+1]) {
						int temp=nums2[j+1];
						nums2[j+1]=nums2[j];
						nums2[j]=temp;
					}
				}
			}
			System.out.println("升序为 :  "+Arrays.toString(nums2));
			int i=0, j=0, k=0;//算法思想:利用之前分别的排序,将其中一数组未遍历过的部分
			//,直接接在新数组后面,时间复杂度最多为O(2n+m)
			while (i!=nums1.length && j!=nums2.length) {//两组都没有遍历完
				if (nums1[i]<nums2[j]) 
					nums3[k++]=nums1[i++];	
				
				else nums3[k++]=nums2[j++]; 
			}
			if (i==nums1.length) {//数组1遍历完了
				while (j!=nums2.length) {
					nums3[k++]=nums2[j++];
				}
			} else {//数组2遍历完了
				while (i!=nums1.length) {
					nums3[k++]=nums1[i++];
				}
			}
			System.out.println("总和升序为 :  "+Arrays.toString(nums3));
			}			
	}


