package com.lanou.common;
//隐藏手机号中间四位。
public class HomeworkPhone {
	public static void replace(String num) {
		String pNum = num.substring(3, 7);
		String mNum = num.replace(pNum, "xxxx");
		System.out.println(mNum);
	}
	
	public static void main(String[] args) {
		replace("17719707087");
	}
}
