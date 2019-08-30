package com.tt.newcoder;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// 计算字符串最后一个单词的长度，单词以空格隔开
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		str.trim();
		String substring = str.substring(str.lastIndexOf(" ")+1);
		
		System.out.println(substring.length());
		in.close();
	}
}
