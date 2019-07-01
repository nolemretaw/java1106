package com.tt.newcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class 字符串合并处理 {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			StringBuffer rs = new StringBuffer();
			char[] cs = (in.next()+in.next()).toCharArray();
			String string1="";
			String string2="";
			for (int i = 0; i < cs.length; i++) {
				if (i%2==0) {
					string1+=cs[i];
				}else {
					string2+=cs[i];
				}
			}
			char[] evens = string1.toCharArray();
			char[] odds = string2.toCharArray();
			Arrays.sort(evens);
			Arrays.sort(odds);
			String strx = "";
			int k = 0;
			
		}
	}

}
