package com.lanou.copyfile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileByChar {
	public static void main(String[] args) {
		//文件拷贝
		/*
		 	创建字符输入、输出流
		 	将输入流读取的内容，通过输出流写入文件
		 */
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		try {
			fileReader = new FileReader("src/com/lanou/writer/IOCharWriterDemo1.java");
			fileWriter = new FileWriter("IOCharWriterDemo1.java");
			
			//单个字符的拷贝
			/*int num = -1;
			while ((num = fileReader.read()) != -1) {
				fileWriter.write(num);
			}*/
			
			//字符数组的拷贝
			//通常声明的字符数组容量为1024
			char[] chs = new char[1024];
			int num = -1;
			while ((num = fileReader.read(chs)) != -1) {
//				fileWriter.write(chs, 0, num);
				fileWriter.write(new String(chs, 0, num));
			}
			
			fileWriter.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}
