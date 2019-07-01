package com.lanou.code;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		//游戏的死循环
		//声明局数变量
		int equalCount =0, winCount = 0, loseCount = 0, totalCount = 0;
		while (true) {
			System.out.println("请输入您的手势(0石头 1剪刀 2布 3退出)");
			Scanner scanner =new Scanner(System.in);
			int pNum = scanner.nextInt(); //用户的手势
			int cNum = (int)(Math.random() * (2 - 0 + 1)) + 0; //电脑手势
			//玩家游戏与退出的分支结构
			if (pNum == 3) {
				System.out.println("欢迎下次光临猜拳系统");
				System.out.println("总局数:" + totalCount);
				System.out.println("胜局数:" + winCount);
				System.out.println("失败局数:" + loseCount);
				System.out.println("平局数:" + equalCount);
				break;
			} else {
				//平局或者胜负的分支结构
				if (pNum == cNum) {
					equalCount++;
					System.out.println("您与电脑是平手");
				} else {
					//玩家赢或者电脑赢得分支结构
					/*
					 	p  c
					 	0  1
					 	1  2
					 	2  0
					 */
					if ((pNum < cNum && cNum == 1) || pNum - cNum == 2) {
						winCount++;
						System.out.println("您完胜了电脑");
					} else {
						loseCount++;
						System.out.println("您被电脑血虐");
					}
				}
			}
			
			
			
		}
	}
}
