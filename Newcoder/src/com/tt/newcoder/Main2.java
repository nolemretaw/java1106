package com.tt.newcoder;

import java.util.Scanner;

public class Main2 {
//д��һ�����򣬽���һ������ĸ��������ɵ��ַ�������һ���ַ���Ȼ����������ַ����к��и��ַ��ĸ����������ִ�Сд��
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
