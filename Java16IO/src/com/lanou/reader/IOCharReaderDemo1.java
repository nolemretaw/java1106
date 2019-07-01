package com.lanou.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOCharReaderDemo1 {
	public static void main(String[] args) {
		//FileReader 用来读取字符文件的便捷类 字符输入流
		//读取a.txt文件中的内容
		/*
		 	创建文件对象
		 	创建输入流对象
		 	将文件对象与流对象进行绑定
		 	读取内容
		 */
		File file = new File("a.txt");
		FileReader fileReader = null;
		try {
			/*
			 	FileReader(String fileName) 
          		在给定从中读取数据的文件名的情况下创建一个新 FileReader。
	
				FileReader(File file)
          		在给定从中读取数据的 File 的情况下创建一个新 FileReader。
			 */
//			fileReader = new FileReader(file);
			fileReader = new FileReader("a.txt");
			/*
			 	 int	read() 
          			读取单个字符。
				 int	read(char[] cbuf) 
				          将字符读入数组。
				abstract  int	read(char[] cbuf, int off, int len) 
				          将字符读入数组的某一部分。
			 */
			//read()读取单个字符,读取的是字符对应的编码值！
			/*int num = fileReader.read();
			System.out.print((char)num);
			num = fileReader.read();
			System.out.print((char)num);
			num = fileReader.read();
			System.out.print(num);*/
			/*//1、
			int num = -1;
			while ((num = fileReader.read()) != -1) {
				System.out.print((char)num);
			}*/
			
			/*
			 	读取内容如果是读取到字符数组中的话
			 	返回值num代表当次读取的字符个数！
			 	如果num是-1，则代表读取完毕
			 */
			/*char[] chs = new char[5];
			int num = fileReader.read(chs);
			System.out.println(num);
			System.out.println(new String(chs));
			
			num = fileReader.read(chs);
			System.out.println(num);
			System.out.println(new String(chs));
			
			num = fileReader.read(chs);
			System.out.println(num);
			System.out.println(new String(chs));
			
			num = fileReader.read(chs);
			System.out.println(num);*/
			
			char[] chs = new char[1024];
			int num = -1;
			while ((num = fileReader.read(chs)) != -1) {
				System.out.print(new String(chs, 0, num));
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
		
	}
}
