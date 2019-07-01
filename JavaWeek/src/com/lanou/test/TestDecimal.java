package com.lanou.test;

import java.math.BigDecimal;

public class TestDecimal {
	public static void main(String[] args) {
		double a = 0.33;
		float b = 0.11f;
		System.out.println(b+a);
//		BigDecimal a1 = new BigDecimal(a);
		BigDecimal b1 = new BigDecimal(b);
//		System.out.println(b1.add(a1));
		
	}
}
