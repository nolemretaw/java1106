package com.tt.newcoder;

import java.util.Scanner;

public class Main12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String str = Integer.toString(num);
		StringBuilder builder = new StringBuilder();
		for (int i = str.length()-1; i >=0 ; i--) {
			builder.append(str.charAt(i));
		}
		System.out.println(builder.toString());
	}

}
