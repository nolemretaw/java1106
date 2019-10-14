package com.tt.newcoder;

import java.util.Scanner;

public class Main7 {
/*
 * 写出一个程序，接受一个正浮点数值，
 * 输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
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
