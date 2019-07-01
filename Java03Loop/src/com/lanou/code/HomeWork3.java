package com.lanou.code;

public class HomeWork3 {
	public static void main(String[] args) {
		//abc+bca=1333
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					if (100 * i + 10 * j + k + 100 * k + 10 * j + i ==1333 ) {
						System.out.print("a的值" + i);
						System.out.print("b的值" + j);
						System.out.println("c的值" + k);
					}
				}
			}
		}
	}
}
