package com.tt.newcoder;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// 计算字符串最后一个单词的长度，单词以空格隔开
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		str.trim();
		int length = str.length();
		int i = length;
		for (; i >= 1 ; i--) {
			if (str.charAt(i-1)>'z'||str.charAt(i-1)<'A') {
				break;
			}
		}
		
		System.out.println("最后"+(length-i));
		in.close();
	}
}
