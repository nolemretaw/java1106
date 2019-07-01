package com.tt.newcoder;

import java.util.Scanner;
import java.util.regex.Pattern;

//接受一个十六进制的数值字符串，输出该数值的十进制字符串。（多组同时输入 ）
public class Main5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextLine()) {
			String str = in.next();
			String substring = str.substring(2).toUpperCase();
			System.out.println(substring);
			String[] split = substring.split("");
			int hxNum = 0;
			String regex = "[A-F]";
			Pattern pattern = Pattern.compile(regex);
			for (int i = split.length , j = 0; i >0 ; i--,j++) {
				int weiNum = 0;
				if (pattern.matches(regex, split[j])) {
					weiNum = ((int) split[j].charAt(0)) - 65 + 10;
				}else {
					weiNum = Integer.parseInt(split[j]);
				}
				hxNum+=weiNum*(int)Math.pow(16.0, i-1);
			}
			System.out.println(hxNum);
		}
		
//		System.out.println(Integer.);
	}
}
