package com.lanou.code;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		//��Ϸ����ѭ��
		//������������
		int equalCount =0, winCount = 0, loseCount = 0, totalCount = 0;
		while (true) {
			System.out.println("��������������(0ʯͷ 1���� 2�� 3�˳�)");
			Scanner scanner =new Scanner(System.in);
			int pNum = scanner.nextInt(); //�û�������
			int cNum = (int)(Math.random() * (2 - 0 + 1)) + 0; //��������
			//�����Ϸ���˳��ķ�֧�ṹ
			if (pNum == 3) {
				System.out.println("��ӭ�´ι��ٲ�ȭϵͳ");
				System.out.println("�ܾ���:" + totalCount);
				System.out.println("ʤ����:" + winCount);
				System.out.println("ʧ�ܾ���:" + loseCount);
				System.out.println("ƽ����:" + equalCount);
				break;
			} else {
				//ƽ�ֻ���ʤ���ķ�֧�ṹ
				if (pNum == cNum) {
					equalCount++;
					System.out.println("���������ƽ��");
				} else {
					//���Ӯ���ߵ���Ӯ�÷�֧�ṹ
					/*
					 	p  c
					 	0  1
					 	1  2
					 	2  0
					 */
					if ((pNum < cNum && cNum == 1) || pNum - cNum == 2) {
						winCount++;
						System.out.println("����ʤ�˵���");
					} else {
						loseCount++;
						System.out.println("��������ѪŰ");
					}
				}
			}
			
			
			
		}
	}
}
