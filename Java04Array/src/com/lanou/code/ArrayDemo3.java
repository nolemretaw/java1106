package com.lanou.code;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDemo3 {
	public static void main(String[] args) {
		//数组遍历
		int[] nums = {1, 2, 3, 4};
		/*
		 	for循环通常是与数组连用的
		 	数组容量固定,for通常用于已知次数
		 	所以循环初值为0,最大到数组容量减1
		 	正好可以与数组下标对应
		 */
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		
		int[] ages = new int[5];
		for (int i = 0; i < ages.length; i++) {
			ages[i] = (int)(Math.random() * (20 - 10 + 1)) + 10;
		}
		System.out.println(Arrays.toString(ages));
		
		
/*		int[] numb = new int[10];
		int max = 10, min = 10, sum = 0;
		for (int i = 0; i < 20; i++) {
			numb[i] = (int)(Math.random() *  (30 - 10 + 1)) + 10;
			sum = sum + numb[i];
			max = max > numb[i] ? max : numb[i];
			min = min < numb[i] ? min : numb[i];
		}
		System.out.println(max);
		System.out.println(min);*/
		
		
		/*
	 	定义一个10个容量的整型数组
	 	随机赋值[10, 30]区间内的整数
	 	求最大值、最小值、和 以及
	 	最大值、最小值所在的下标
	 */

		int[] numb = new int[10];
		int max = 0, min = 100, sum = 0;
		for (int i = 0; i < numb.length; i++) {
			numb[i] = (int)(Math.random() *  (30 - 10 + 1)) + 10;
			sum = sum + numb[i];
			max = max > numb[i] ? max : numb[i];
			min = min < numb[i] ? min : numb[i];
		}
		System.out.println(Arrays.toString(numb));
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
		for (int i = 0; i < numb.length; i++) {
			if (numb[i] == max ) {
				System.out.println("最大下标" + i);
			}
			if (numb[i] == min) {
				System.out.println("最小下标" + i);
			}
		}
	}
}
