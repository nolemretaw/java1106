package com.lanou.common;

import java.util.Scanner;

public class PhoneNemInitial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("����һ��11λ�绰����,�Լ�Ҫ��ȥ�ĵ�aλ����bλ");
		System.out.println(PhoneNum.anonymity(scanner.next(),scanner.nextInt(),
				scanner.nextInt()));
	}
}
