package com.lala.test;

public class �ַ�����ת {
	public static void main(String[] args) {
		String str = "My Name,is tom!!!";
		String[] strs = str.split("");
		for (int i = strs.length-1; i >=0 ; i--) {
			System.out.print(strs[i]+" ");
		}
	}
}
