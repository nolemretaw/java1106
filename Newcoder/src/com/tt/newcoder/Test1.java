package com.tt.newcoder;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// �����ַ������һ�����ʵĳ��ȣ������Կո����
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		str.trim();
		String substring = str.substring(str.lastIndexOf(" ")+1);
		
		System.out.println(substring.length());
		in.close();
	}
}
