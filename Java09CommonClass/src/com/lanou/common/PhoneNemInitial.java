package com.lanou.common;

import java.util.Scanner;

public class PhoneNemInitial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入一个11位电话号码,以及要隐去的第a位到第b位");
		System.out.println(PhoneNum.anonymity(scanner.next(),scanner.nextInt(),
				scanner.nextInt()));
	}
}
