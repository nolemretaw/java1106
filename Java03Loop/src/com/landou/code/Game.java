package com.landou.code;

import java.util.Scanner;

public class Game {
//��ȭ��Ϸ
	public static void main(String[] args) {
		int eaqual=0;
		int ywin=0;
		int ylose=0;
		int total=0;
		while (true) {
			System.out.println("�������������� (0ʯͷ 1 ���� 2�� 3�˳�)");
			Scanner scanner=new Scanner(System.in);
			int pNum=scanner.nextInt();
			int cNum=(int)(Math.random()*(2-0+1))+0;	
			if (pNum==3) {
				System.out.println("win: " + ywin +"\n"
						+ "lose: " + ylose + "\n" + 
						"eaqual: " + eaqual +"\n" + "total: " + total);
				System.out.println("��ӭ�´ι���");
				break;
			} else {
				total++;
				if (cNum==pNum) {
					eaqual++;
					System.out.println("ƽ��");
				} else {
					if ((cNum==0 && pNum==1)||(cNum==1 && pNum==2)||(cNum==2 && pNum==0)) {
						ylose++;
						System.out.println("����Ӯ");
					}else {
						ywin++;
						System.out.println("��Ӯ��");
					}
				}
			}		
		}
	}
}
