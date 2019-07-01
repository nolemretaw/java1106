package com.landou.code;

public class Homework01 {
//一个小球从100米的高空落下，每次弹起的高度为之前原本高度的一半，
//	问第十次落地时，弹起高度为多少，共经过了多少米
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double height=100, all=100;
		for (int i = 0; i < 10; i++) {
			height/=2;
			if (i==9) {
				System.out.println("第十次弹起 " + height + "米 " + 
						"共经过" + all + "米");		
			}
			all+=height*2;
		}
		
	}

}