package com.lanou.code;

public class HomeWork5 {
	public static void main(String[] args) {
		//һ��С���100�׵ĸ߿�����,ÿ�ε���ĸ߶�Ϊ֮ǰԭ���߶ȵ�һ��,�ʵ�ʮ�����ʱ,����߶�Ϊ����ʱ,������������?
		double up = 100;// �߶�100��
		double down = up / 2; //��һ�η��������߶�
		int i = 0;
		for (i = 2;i<= 10;i ++){
		up = up + down * 2; //��i����ؾ���������
		down = down / 2;//��i�η����ĸ߶�
		}
		System.out.println("��" + i + "����ؾ���" + up +"��");
		System.out.println("��" + i + "�η���" + down + "��");
	}
}
