package com.lanou.practice;

import java.util.Scanner;

public class Practice1 {
	//�ж��ǲ�������
	public static boolean isPrime(int a) {
		boolean float1 = true;
		if (a < 2) {//������С��2
			float1 = false;
		} else {
			for (int i = 2; i < Math.sqrt(a); i++) {
				if (a % i == 0) {//�������,��������
					float1 = false;
					break;
				}
			}
		}
		return float1;
	}
	
	//�ӿ���̨��ȡ��Ҫ��������֣��ж��Ƿ����д��������֮�ͣ�����ʾ����
	public static void main(String[] args) {
		System.out.println("������һ������6��ż��");
		Scanner reader = new Scanner(System.in);
		int m = reader.nextInt();	
		if ((m <= 6) || m % 2 != 0 ) {
			System.out.println("������һ������6�ĵ�ż��");
		} else {
			for (int i = 0; i <= m; i++) {
				for (int j = 0; j <= m; j++) {
					if ((isPrime(i)) && (isPrime(j)) && (i + j == m)){
						if (i != j) {
							System.out.println(m + "=" + i + "+" + j);
						}
					} 
				}
			}
		}
	}
}
