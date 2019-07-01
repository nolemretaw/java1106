package com.tt.newcoder;

import java.util.Scanner;

public class Main7 {
/*
 * 写出一个程序，接受一个正浮点数值，
 * 输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
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
