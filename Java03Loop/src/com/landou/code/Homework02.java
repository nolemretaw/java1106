package com.landou.code;

public class Homework02 {

	public static void main(String[] args) {
		// //10�ڣ�ÿ�컨һ�룬С��1�Ʋ������Ի�������
		double money=1000000000, i=0;
		while (money>=1) {
			money/=2;
			++i;
		}
		System.out.println("���Ի�" + i + "��");
	}

}
