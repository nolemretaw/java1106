package com.tt.newcoder;

import java.util.Scanner;

public class Main16 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int count = 0;
		while (num!=0) {
			count++;
			num&=(num-1);
		}
	}

}
