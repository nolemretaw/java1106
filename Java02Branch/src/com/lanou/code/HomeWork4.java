package com.lanou.code;

import java.util.Scanner;

public class HomeWork4 {
	public static void main(String[] args) {
		// ����ʯͷ��
		System.out.println("����0,ʯͷ1,��2:");
		int a=(int)(Math.random()*(2-0+1)+0);
		Scanner scanner=new Scanner(System.in);
		int b=scanner.nextInt();
		if (a==b) 
			System.out.println("��"+b+"����"+a+"ƽ��");
		else if(a>b&&(a-b)==1) 
			System.out.println("��"+b+"����"+a+"����");
			else
				System.out.println("��"+b+"����"+a+"Ӯ��");
		scanner.close();	
	}
}
