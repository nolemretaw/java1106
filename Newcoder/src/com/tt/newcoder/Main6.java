package com.tt.newcoder;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		//����:����һ�������������մ�С�����˳�����������������������
		//����180����������Ϊ2 2 3 3 5 ��
		//���һ��������ҲҪ�пո�
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()) {
			String result = "";
			int num = in.nextInt();
			int pum = 2;
			while (num!=1) {
				while (num%pum==0) {//����������1�ͱ����޷����κ����������޷�����ʱ����
					num=num/pum;
					result = result + pum +" ";
				}
				pum++;
			}
			System.out.println(result);
		}
	}

}
