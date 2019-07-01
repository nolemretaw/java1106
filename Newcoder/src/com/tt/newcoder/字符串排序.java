package com.tt.newcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ×Ö·û´®ÅÅÐò {

	public static void main(String[] args) throws IOException {
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	String str = bf.readLine();
	StringBuilder builder = new StringBuilder();
	for (int i = 0; i < 26; i++) {
		char c = (char)(i+'A');
		for (int j = 0; j < str.length(); j++) {
			char sc = str.charAt(j);
			if (sc == c||c==sc-32) {
				builder.append(sc);
			}
		}
	}
	for (int i = 0; i < str.length(); i++) {
		char c = str.charAt(i);
		if (!(c>='A'&&c<='Z')&&!(c>='a'&&c<='z')) {
			builder.insert(i, c);
		}
	}
	System.out.println(builder.toString());
	}

}
