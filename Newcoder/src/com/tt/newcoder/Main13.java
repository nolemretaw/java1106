package com.tt.newcoder;

import java.util.Scanner;

public class Main13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String[] strs = str.split("");
		StringBuilder builder = new StringBuilder();
		for (int i = strs.length-1; i >=0 ; i--) {
			builder.append(strs[i]);
		}
		System.out.println(builder.toString());
	}

}
