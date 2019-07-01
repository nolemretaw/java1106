package com.tt.newcoder;

import java.util.Scanner;

public class É¾³ý×Ö·û´®×îÉÙ×Ö·û {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			
		String str = in.next();
		if (str.length()>20) {
			continue;
		}
		char[] arr = str.toCharArray();
		int[] max = new int[26];
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max[arr[i]-'a']++;
			min = min<max[arr[i]-'a']?min:max[arr[i]-'a'];
		}
		for (int i = 0; i < max.length; i++) {
			if (min==max[i]) {
				str=str.replaceAll(String.valueOf((char)(i+'a')), "");
			}
		}
		System.out.println(str);
	}
	}
}
