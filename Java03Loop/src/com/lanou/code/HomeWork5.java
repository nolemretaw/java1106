package com.lanou.code;

public class HomeWork5 {
	public static void main(String[] args) {
		//一个小球从100米的高空落下,每次弹起的高度为之前原本高度的一半,问第十次落地时,弹起高度为多少时,共经过多少米?
		double up = 100;// 高度100米
		double down = up / 2; //第一次反弹反弹高度
		int i = 0;
		for (i = 2;i<= 10;i ++){
		up = up + down * 2; //第i次落地经过多少米
		down = down / 2;//第i次反弹的高度
		}
		System.out.println("第" + i + "次落地经过" + up +"米");
		System.out.println("第" + i + "次反弹" + down + "米");
	}
}
