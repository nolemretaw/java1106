package com.lanou.charset;

import java.io.UnsupportedEncodingException;

public class CharSetDemo1 {
	public static void printByte(byte[] bs) {
		for (byte b : bs) {
			System.out.print(b + " ");
		}
	}
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		/*字符编码在项目中一定要做到统一,
		 * Eclipse 在Win下默认编码格式为GBK,
		 * 在MacOs下默认格式为utf-8
		 * 
		 * io流操作文件时,必须保证写入文件与读取文件的编码格式一致,否则文件会出现乱码
		 */
		String string = "中国";
		//getBytes()方法是得到一个操作系统默认的编码格式的字节数组
		byte[] bytes = string.getBytes();//GBK
		byte[] bytes2 =string.getBytes("utf-8");//utf-8
		printByte(bytes);
		System.out.println();
		printByte(bytes2);
		
		System.out.println(new String(bytes,"GBK"));
		System.out.println(new String(bytes2,"utf-8"));
	}

}
