package com.tt.newcoder;

import java.util.Scanner;

public class Main7 {
/*
 * д��һ�����򣬽���һ����������ֵ��
 * �������ֵ�Ľ�������ֵ�����С�������ֵ���ڵ���5,����ȡ����С��5��������ȡ����
 * */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();
		System.out.println(getReturn(d));
	}

private static int getReturn(double d) {
	int i = (int) d;
	return i =(d-i)>=0.5?i+1:i;
	
}

}
