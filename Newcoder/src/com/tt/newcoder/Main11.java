package com.tt.newcoder;

import java.util.HashSet;
import java.util.Scanner;

public class Main11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String string = in.nextLine();
		HashSet<Object> set = new HashSet<>();
		for (int i = 0; i < string.length(); i++) {
			if (Integer.valueOf(string.charAt(i))<=127&&
					Integer.valueOf(string.charAt(i))>=0) {
				set.add(string.charAt(i));
			}
		}
		System.out.println(set.size());
	}

}
