package com.lanou.code;
/**
 * 此类表示循环嵌套
 * @author admin
 *
 */
public class LoopNest {
	public static void main(String[] args) {
		/*
		 	打印三行 123
		 	1 2 3
		 	1 2 3
		 	1 2 3
		 */
		for (int i = 0; i < 3; i++) {
			for (int j = 1; j < 4; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		
		/*
		 	1
		 	1 2 
		 	1 2 3
		 	1 2 3 4
		 	1 2 3 4 5
		 */
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		/*
		 	99乘法表
		 */
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print(j + "x" + i + "=" + i * j +"\t");
			}
			System.out.println();
		}
	}
}
