package com.lanou.code;

public class BasePractice02aa {
	public static void main(String[] args) {
		int money = 134, a = 20, b = 10, c = 5, d = 1;
		int $20 = money / a;
		int $10 = money % a /b;
		int $5 = money % a % b /c;
		int $1 = money % a % b % c /d;
		System.out.println("20Ԫ����" + $20 + "��");
		System.out.println("10Ԫ����" + $10 + "��");
		System.out.println("5Ԫ����" + $5 + '��');
		System.out.println("1Ԫ����" +$1 + "��");
	}
}
