package com.tt.newcoder;

import java.util.Scanner;

public class Main14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String next = in.next();
		String[] split = next.split(" ");
		StringBuilder builder = new StringBuilder();
		for (int i = split.length-1; i >=0 ; i--) {
			builder.append(split[i]).append(" ");
		}
		System.out.println(builder.toString());
	}

}
