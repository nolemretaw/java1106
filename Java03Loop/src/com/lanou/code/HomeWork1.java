package com.lanou.code;

public class HomeWork1 {
	public static void main(String[] args) {
		//10�ڣ�ÿ�컨һ�룬С��1�Ʋ������Ի�������
		int money = 1000000000;//ʮ����
		int day = 0;//�ɻ�������
		while (money >= 1) {
			money = money / 2;
			day++;
		}
		System.out.println(day);
	}
}
