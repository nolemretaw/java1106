package com.lanou.code;

public class HomeWork5a {
	public static void main(String[] args) {
		double high = 100;//�߶�100
		double down = high / 2;//���
		int i = 0;
		for (i = 1; i < 10; i++) {
			high = high + down *2;
			down = down / 2;
		}
		System.out.println("�ܾ���" + high);
		System.out.println("��ʮ��" + down);
	}
}
