package com.tt.newcoder;

import java.util.Scanner;
import java.util.regex.Pattern;

//接受一个十六进制的数值字符串，输出该数值的十进制字符串。（多组同时输入 ）
public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str = sc.nextLine();
			System.out.println(fun(str.substring(2)));
		}
	}

	private static int fun(String s) {
		// TODO Auto-generated method stub
		int n = 0;
		int count = 0;
		int temp = 0;
		char ch;
		
		while(count<s.length()) {
			ch = s.charAt(s.length()-1-count);
			if (ch>='0'&&ch<='9') {
				temp = ch - '0';
			}else if (ch>='A'&&ch<='Z') {
				temp = ch-'A'+10;
			}else if (ch>='a'&&ch<='z') {
				temp = ch-'z'+10;
			}else {
				break;
			}
			n += temp*Math.pow(16, count++);
		}
		
		return n;
	}
}
