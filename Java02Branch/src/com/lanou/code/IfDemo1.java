package com.lanou.code;

import java.util.Scanner;

public class IfDemo1 {

	public static void main(String[] args) {
	/*
	 * java�з�Ϊ
	 * ˳�� ��֧ ѭ��
	 * ��֧:��Ϊ��������ѡ���Ե�ִ�����
	 * if switch
	 */
		System.out.println("������һ������:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		/*
		 * if���ĵ�һ����ʽ
		 * if(�������ʽ)
		 * {���}
		 * ���������ʽΪ��ʱ,ִ�����,��������
		 * if���ĵڶ�����ʽ
		 * 	if(�������ʽ) {
		 * 		���1}
		 * 		else{
		 * 		���2
		 * 		}
		 */
//		if (num>0) {
//			System.out.println(num);
//		}
//		if (num>0) 
//			System.out.println(num+"����0");
//		else {
//			if (num<0) {
//				System.out.println(num+"С��0");
//			}
//			else{
//				System.out.println(num+"����0");
//				}
//			}
		if (num>0) {
			System.out.println(num+"����0");
		}else if(num<0) {
			System.out.println(num+"С��0");
		}else{
			System.out.println(num+"����0");
		}
		scanner.close();
	}
}
