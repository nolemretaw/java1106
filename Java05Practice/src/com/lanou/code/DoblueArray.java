package com.lanou.code;

public class DoblueArray {
	public static void main(String[] args) {
		/*
		 	数组的维度代表一个空间范围
		 	int[] nums = new int[5]; 一维数组
		 */
		//两个中括号内部代表二维数组的行,列
		//定义时,可以不指定列数,但是行数必须给定! 当然列数也可以指定!!!
		int[][] nums = new int[5][5];
		/*
		 	二维数组遍历时需要用到两层循环
		 	一层控制遍历的行数
		 	一层控制每一行的列数
		 */
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = (int)(Math.random() * (20 - 10 + 1)) + 10;
			}
		}
		//二维数组的元素时一维数组
		for (int[] is : nums) {
			for (int i : is) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
