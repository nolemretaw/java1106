package com.lanou.code;
//定义方法实现求两个整数、三个整数、四个整数、五个整数最大值

public class Homework2 {
	//2个整数
	public static int getMax(int a,int b) {
		return a>b?a:b;
	}
	//3个整数
	public static int getMax(int a,int b,int c) {
		return getMax(getMax(a,b), c);
	}
	//4个整数
	public static int getMax(int a,int b,int c,int d) {
		return getMax(getMax(getMax(a, b),c), d);
	}
	//5个整数
	public static int getMax(int a, int b, int c, int d, int e) {
		return getMax(getMax(getMax(getMax(a, b), c), d), e);
	}
	public static void main(String[] args) {
		int max = getMax(119,99,11,222,109);
		System.out.println(max);
	}
}
