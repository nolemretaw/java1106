package com.landou.code;

public class Homework01 {
//һ��С���100�׵ĸ߿����£�ÿ�ε���ĸ߶�Ϊ֮ǰԭ���߶ȵ�һ�룬
//	�ʵ�ʮ�����ʱ������߶�Ϊ���٣��������˶�����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double height=100, all=100;
		for (int i = 0; i < 10; i++) {
			height/=2;
			if (i==9) {
				System.out.println("��ʮ�ε��� " + height + "�� " + 
						"������" + all + "��");		
			}
			all+=height*2;
		}
		
	}

}