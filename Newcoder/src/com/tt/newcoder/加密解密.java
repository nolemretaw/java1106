package com.tt.newcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class º”√‹Ω‚√‹ {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		while ((str=bf.readLine())!=null) {
			String str1 =  Encrypt(str);
			System.out.println(str1);
			str = bf.readLine();
			String str2 = unEncryt(str);
			System.out.println(str2);
		}
	}

	private static String unEncryt(String str) {
		StringBuilder builder = new StringBuilder();
		char[] cs = str.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			if (cs[i]>='a'&&cs[i]<='z') {
				if (cs[i]=='a') {
					builder.append('Z');
				}else
				builder.append((char)(cs[i]-1-32));
			}else if(cs[i]>='A'&&cs[i]<='Z') {
				if (cs[i]=='A') {
					builder.append('z');
				}else
				builder.append((char)(cs[i]-1+32));
			}else if (cs[i]>='0'&&cs[i]<='9') {
				if (cs[i]=='0') {
					builder.append('9');
				}else
				builder.append((char)(cs[i]-1));
			}else {
				builder.append(cs[i]);
			}
			
		}
		return builder.toString();
	}

	private static String Encrypt(String str) {
		char[] array = str.toCharArray();
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			if (array[i]>='a'&&array[i]<='z') {
				if (array[i]=='z') {
					builder.append('A');
				}else {
					builder.append((char)(array[i]+1-32));
				}
			}else if (array[i]>='A'&&array[i]<='Z') {
				if (array[i]=='Z') {
					builder.append('a');
				}else {
					builder.append((char)(array[i]+1+32));
				}
			}else if (array[i]>='0'&&array[i]<='9') {
				if (array[i]=='9') {
					builder.append('0');
				}else {
					builder.append((char)(array[i]+1));
				}
			}else {
				builder.append(array[i]);
			}
		}
		return builder.toString();
	}

}
