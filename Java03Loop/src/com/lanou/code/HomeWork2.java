package com.lanou.code;

public class HomeWork2 {
	public static void main(String[] args) {
		//ˮ�ɻ� ��λ�� ��ʮ��λ�ϵ����ֵ�����֮��=������ֱ���
		System.out.println("��λ����ˮ�ɻ�����:");
		for (int i = 100; i < 1000; i++) {
			int gNum = i / 100 % 10;//��λ
			int sNum = i / 10 % 10;//ʮλ
			int bNum = i % 10;//��λ
			//ˮ�ɻ����ж�
			if (i == (gNum * gNum * gNum + sNum * sNum * sNum + bNum * bNum * bNum)) {
				System.out.println(i);
			}
		}
	}
}
