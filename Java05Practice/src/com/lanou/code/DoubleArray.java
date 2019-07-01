package com.lanou.code;

public class DoubleArray {

	public static void main(String[] args) {
		// 数组的维度
		int[] nums = new int[5];
		int[][] nums1 = new int[5][5];
		/*
		 *定义二维数组时,行数必须指定,列数可以不指定
		 */
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums1[i].length; j++) {
				nums1[i][j] = (int)(Math.random()*(20-10+1))+10;
			}
		}
		/*
		 * 二维数组在遍历时,需要用到两层循环,
		 * 一层控制遍历的行数
		 * 一层控制遍历每一行的列数
		 */
		for (int[] is : nums1) {
			for (int i : is) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
