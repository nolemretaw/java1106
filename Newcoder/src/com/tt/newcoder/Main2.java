package com.tt.newcoder;

import java.util.Scanner;

public class Main2 {
//写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str1 = in.next().toUpperCase();
		char a = in.next().toUpperCase().charAt(0);
		
		int count = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i)==a) {
				count++;
			}
		}
		System.out.println(count);
	}

}
