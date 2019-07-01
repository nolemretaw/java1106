package com.lanou.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) {
		//使用字节输入流读取f.txt文件中的内容
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream("f.txt");
			/*
			 	int	read() 
				          从此输入流中读取一个数据字节。
				 int	read(byte[] b) 
				          从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中。
				 int	read(byte[] b, int off, int len) 
				          从此输入流中将最多 len 个字节的数据读入一个 byte 数组中。
			 */
			/*int num = fileInputStream.read();
			while ((num = fileInputStream.read()) != -1) {
				System.out.print((char)num);
			}*/
			
			byte[] bs = new byte[1024];
			int num = -1;
			while ((num = fileInputStream.read(bs)) != -1) {
				System.out.print(new String(bs, 0, num));
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
		
	}
}
