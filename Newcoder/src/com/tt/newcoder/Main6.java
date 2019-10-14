package com.tt.newcoder;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		System.out.println(getResult(num));
	
	}

	private static String getResult(long num) {
		int pum = 2;
		String result = "";
		while (num!=1) {
			while (num%pum==0) {
				num=num/pum;
				result = result + pum + " ";
			}
			pum++;
		}
		
		return result;
	}

}
