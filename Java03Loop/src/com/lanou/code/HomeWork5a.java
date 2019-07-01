package com.lanou.code;

public class HomeWork5a {
	public static void main(String[] args) {
		double high = 100;//高度100
		double down = high / 2;//落地
		int i = 0;
		for (i = 1; i < 10; i++) {
			high = high + down *2;
			down = down / 2;
		}
		System.out.println("总距离" + high);
		System.out.println("第十次" + down);
	}
}
