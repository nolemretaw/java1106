package com.tt.newcoder;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// �����ַ������һ�����ʵĳ��ȣ������Կո����
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
		
		System.out.println("���"+(length-i));
		in.close();
	}
}
