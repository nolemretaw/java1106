package com.lanou.code;
//���巽��ʵ�������������������������ĸ�����������������ֵ

public class Homework2 {
	//2������
	public static int getMax(int a,int b) {
		return a>b?a:b;
	}
	//3������
	public static int getMax(int a,int b,int c) {
		return getMax(getMax(a,b), c);
	}
	//4������
	public static int getMax(int a,int b,int c,int d) {
		return getMax(getMax(getMax(a, b),c), d);
	}
	//5������
	public static int getMax(int a, int b, int c, int d, int e) {
		return getMax(getMax(getMax(getMax(a, b), c), d), e);
	}
	public static void main(String[] args) {
		int max = getMax(119,99,11,222,109);
		System.out.println(max);
	}
}
