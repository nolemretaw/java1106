package com.landou.code;

import java.util.Scanner;

public class Game {
//猜拳游戏
	public static void main(String[] args) {
		int eaqual=0;
		int ywin=0;
		int ylose=0;
		int total=0;
		while (true) {
			System.out.println("请输入您的手势 (0石头 1 剪刀 2布 3退出)");
			Scanner scanner=new Scanner(System.in);
			int pNum=scanner.nextInt();
			int cNum=(int)(Math.random()*(2-0+1))+0;	
			if (pNum==3) {
				System.out.println("win: " + ywin +"\n"
						+ "lose: " + ylose + "\n" + 
						"eaqual: " + eaqual +"\n" + "total: " + total);
				System.out.println("欢迎下次光临");
				break;
			} else {
				total++;
				if (cNum==pNum) {
					eaqual++;
					System.out.println("平局");
				} else {
					if ((cNum==0 && pNum==1)||(cNum==1 && pNum==2)||(cNum==2 && pNum==0)) {
						ylose++;
						System.out.println("电脑赢");
					}else {
						ywin++;
						System.out.println("你赢了");
					}
				}
			}		
		}
	}
}
