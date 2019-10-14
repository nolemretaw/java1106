package com.tt.newcoder;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = sc.nextLine();
			StringBuilder sb = new StringBuilder(s);
			char[] cs = sb.reverse().toString().toCharArray();
			Set<Character> set = new HashSet<Character>();
			for (Character c : cs) {
				set.add(c);
			}
			s = "";
			for (Character c : set) {
				s +=c;
			}
			System.out.println(Integer.parseInt(s));
		}
	}

}
