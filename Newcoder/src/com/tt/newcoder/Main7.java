package com.tt.newcoder;

import java.util.Scanner;

public class Main7 {
/*
 * д��һ�����򣬽���һ����������ֵ��
 * �������ֵ�Ľ�������ֵ�����С�������ֵ���ڵ���5,����ȡ����С��5��������ȡ����
 * */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextDouble()) {
			double d = in.nextDouble();
			long round = Math.round(d);
			System.out.println(round);
		}

	}

}
