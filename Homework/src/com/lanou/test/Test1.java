package com.lanou.test;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		// ��֤��°ͺղ���(������һ������2��ż�����ܹ������Ϊ���������ĺ�)
		System.out.println("����һ������2��ż��");
		Goldbach();
		
	}
	public static void Goldbach() {
		int a = new Scanner(System.in).nextInt();
		while(!(a>2 && (a%2)==0)) {
			System.out.println("������һ������2��ż��");
			a = new Scanner(System.in).nextInt();
		}
		for(int i = 2 ; i<= a/2; i++){
			if (isPrimeNumber(i)&&isPrimeNumber(a-i)) {
				System.out.println("�ɽ�"+a+"���Ϊ"+i+"+"+(a-i));
				System.out.println("��°ͺղ���õ���֤");
				return;
			}
			
		}
		System.out.println("�޷���"+a+"���Ϊ��������");
	}
	public static boolean isPrimeNumber(int a) {//�ж��Ƿ�Ϊ����
		for (int b = a-1;b>1;b--) {
			if (a%b == 0) {
				return false;
			}
		}
		return true;
	}

}
