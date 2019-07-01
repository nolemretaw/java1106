package com.lanou.bufferedchar;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
	public static void main(String[] args) {
		/*
		 	BufferedReader
		 	从字符输入流中读取文本，缓冲各个字符，
		 	从而实现字符、数组和行的高效读取。
		 */
		/*
		 	BufferedReader(Reader in) 
          	创建一个使用默认大小输入缓冲区的缓冲字符输入流。
		 */
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try {
			fileReader = new FileReader("e.txt");
			bufferedReader = new BufferedReader(fileReader);
			
			//单个字符的读取
			/*int num = -1;
			while ((num = bufferedReader.read()) != -1) {
				System.out.print((char)num);
			}*/
			
			//字符数组的读取
			/*char[] chs = new char[1024];
			int num = -1;
			while ((num = bufferedReader.read(chs)) != -1) {
				System.out.print(new String(chs, 0, num));
			}*/
			
//			System.out.println(bufferedReader.readLine());
			String str = null;
			while ((str = bufferedReader.readLine()) != null) {
				System.out.println(str);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}
