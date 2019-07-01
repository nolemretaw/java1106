package com.lanou.copyfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileByBuffered {
	public static void main(String[] args) {
		//文件拷贝
		/*
		 	创建字符输入、输出流
		 	创建高效的字符输入、输出流
		 	将高效输入流读取的内容，通过高效输出流写入文件
		 */
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;
		try {
			fileReader = new FileReader("src/com/lanou/writer/IOCharWriterDemo2.java");
			fileWriter = new FileWriter("IOCharWriterDemo2.java");
			bufferedReader = new BufferedReader(fileReader);
			bufferedWriter = new BufferedWriter(fileWriter);
			
			//单个字符的拷贝
			/*int num = -1;
			while ((num = fileReader.read()) != -1) {
				fileWriter.write(num);
			}*/
			
			//字符数组的拷贝
			//通常声明的字符数组容量为1024
			char[] chs = new char[1024];
			int num = -1;
			while ((num = bufferedReader.read(chs)) != -1) {
//				fileWriter.write(chs, 0, num);
				bufferedWriter.write(new String(chs, 0, num));
			}
			
			bufferedWriter.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bufferedReader != null) {
					bufferedReader.close();
				}
				if (bufferedWriter != null) {
					bufferedWriter.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	}
}
