package com.tt.newcoder;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		//功能:输入一个正整数，按照从小到大的顺序输出它的所有质数的因子
		//（如180的质数因子为2 2 3 3 5 ）
		//最后一个数后面也要有空格
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()) {
			String result = "";
			int num = in.nextInt();
			int pum = 2;
			while (num!=1) {
				while (num%pum==0) {//质数，除了1和本身，无法被任何数整除。无法除尽时跳出
					num=num/pum;
					result = result + pum +" ";
				}
				pum++;
			}
			System.out.println(result);
		}
	}

}
