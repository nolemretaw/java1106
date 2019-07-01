package com.lanou.code;

import java.util.Scanner;

public class SwitchPractice {

	public static void main(String[] args) {
		System.out.println("输入成绩:");
		Scanner scanner=new Scanner(System.in);
		char grade=scanner.next().charAt(0);
		switch (grade) {
			case 'A':
				System.out.println("优秀");
				break;
			case 'B':
				System.out.println("良好");
				break;	
			case 'C':
				System.out.println("合格");
				break;
			case 'F':
				System.out.println("不及格");
				break;		
			default:
				break;
		}
	}

}
