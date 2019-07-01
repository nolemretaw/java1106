package com.lanou.code;

public class HomeWork2 {
	public static void main(String[] args) {
		//水仙花 三位数 个十百位上的数字的立方之和=这个数字本身
		System.out.println("三位数中水仙花数有:");
		for (int i = 100; i < 1000; i++) {
			int gNum = i / 100 % 10;//个位
			int sNum = i / 10 % 10;//十位
			int bNum = i % 10;//百位
			//水仙花的判定
			if (i == (gNum * gNum * gNum + sNum * sNum * sNum + bNum * bNum * bNum)) {
				System.out.println(i);
			}
		}
	}
}
