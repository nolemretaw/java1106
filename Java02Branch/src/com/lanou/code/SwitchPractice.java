package com.lanou.code;

import java.util.Scanner;

public class SwitchPractice {

	public static void main(String[] args) {
		System.out.println("����ɼ�:");
		Scanner scanner=new Scanner(System.in);
		char grade=scanner.next().charAt(0);
		switch (grade) {
			case 'A':
				System.out.println("����");
				break;
			case 'B':
				System.out.println("����");
				break;	
			case 'C':
				System.out.println("�ϸ�");
				break;
			case 'F':
				System.out.println("������");
				break;		
			default:
				break;
		}
	}

}
