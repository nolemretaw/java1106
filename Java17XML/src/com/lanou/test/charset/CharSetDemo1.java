package com.lanou.test.charset;

import java.io.UnsupportedEncodingException;

public class CharSetDemo1 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "ÖÐ¹ú";
		byte[] bytes = str.getBytes();
		byte[] bytes2 = str.getBytes("utf-8");
		printByte(bytes);
		System.out.println();
		printByte(bytes2);
		System.out.println(new String(bytes,"GBK"));
		System.out.println(new String(bytes2,"utf-8"));
	}

	private static void printByte(byte[] bytes) {
		for (byte b : bytes) {
			System.out.println(b+" ");
		}
	}

}
