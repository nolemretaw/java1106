package com.tt.newcoder;

import java.util.Scanner;

public class ºÚµ•√‹¬Î {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		StringBuilder builder = new StringBuilder();
		String m2 = "abc";
		String m3 = "def";
		String m4 = "ghi";
		String m5 = "jkl";
		String m6 = "mno";
		String m7 = "pqrs";
		String m8 = "tuv";
		String m9 = "wxyz";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c>'z'||c<'A') {
				builder.append(c);
				continue;
			}
			if (c=='Z') {
				c='a';
				builder.append(c);
				continue;
			}else if (c<'Z'&&c>='A') {
				char ch = Character.toLowerCase(c);
				ch = (char)(Integer.valueOf(ch)+1);
				builder.append(ch);
				continue;
			}
			String cStr = String.valueOf(c);
			if (m2.contains(cStr)) {
				builder.append("2");
			}
			if (m3.contains(cStr)) {
				builder.append("3");
			}
			if (m4.contains(cStr)) {
				builder.append("4");
			}
			if (m5.contains(cStr)) {
				builder.append("5");
			}
			if (m6.contains(cStr)) {
				builder.append("6");
			}
			if (m7.contains(cStr)) {
				builder.append("7");
			}
			if (m8.contains(cStr)) {
				builder.append("8");
			}
			if (m9.contains(cStr)) {
				builder.append("9");
			}
		}
		System.out.println(builder.toString());
	}

}
