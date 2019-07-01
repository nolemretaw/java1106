package com.landou.code;

public class LoopNext {

	public static void main(String[] args) {
		/**
		 * 此类代表循环嵌套
		 * @author xalo
		 */
//		for (int i = 1; i < 6; i++) {
//			for (int j = 1; j < i+1; j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();	
//		}
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < i+1; j++) {
				System.out.print(j + "×" + i + "=" + i * j + "\t");
			}
			System.out.println();	
		}
	}
}
