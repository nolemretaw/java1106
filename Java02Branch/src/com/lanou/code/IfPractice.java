package com.lanou.code;
import java.util.Scanner;
public class IfPractice {
	public static void main(String[] args) {
		System.out.println("�������:");
		Scanner scanner=new Scanner(System.in);
		int year=scanner.nextInt();
		if (year%400==0 || (year%4==0 && year%100!=0)) 
			System.out.println(year+"������");
		else System.out.println(year+"��ƽ��");
		scanner.close();
	}
}
