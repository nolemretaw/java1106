package com.lanou.code;

import java.util.Scanner;

public class Homework05 {
	// ������λ��
	int num = 0, places = 1;
	public static int getPlaces(int num ,int places) {
		if(num == 0) return places;
		num = getPlaces(num /= 10 , ++places);
		return 0;
	}
	public static void main(String[] args) {
		System.out.println("������һ������,���ж�λ��");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int places = getPlaces(num,1);
		System.out.println("λ��Ϊ" + places);
	}

}
