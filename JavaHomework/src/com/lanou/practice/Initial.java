package com.lanou.practice;

import java.util.Scanner;

public class Initial {
	public static void main(String[] args) {
		int Container = 5;//�������
		int sum = 0;//����
		int sums = 0;//�ܼ�
		for (int i = 1; i < 6; i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("������Ҫ�����ˮ��");
			String Fruit = scanner.next();
			if (Fruit.equals("apple")) {
				System.out.println("����ƻ��һ��");
				sum = new Apple().getMoney();
				System.out.println(sum);
				sums =  sum + sums;
			} 
			if (Fruit.equals("orange")) {
				System.out.println("�������һ��");
				sum = new Orange().getMoney();
				System.out.println(sum);
				sums = sum + sums;
			}
			if (Fruit.equals("banana")) {
				System.out.println("�����㽶һ��");
				sum = new Banana().getMoney();
				System.out.println(sum);
				sums = sum + sums;
			}
			if (i == Container) {
				System.out.println("��������Ѿ�װ��,���ܼ�");
			}
		}
		System.out.println("�ܼ۸� = " + sums);
	}
}
