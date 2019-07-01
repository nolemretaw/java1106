package com.lanou.copyfile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileByChar {
	public static void main(String[] args) {
		//�ļ�����
		/*
		 	�����ַ����롢�����
		 	����������ȡ�����ݣ�ͨ�������д���ļ�
		 */
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		try {
			fileReader = new FileReader("src/com/lanou/writer/IOCharWriterDemo1.java");
			fileWriter = new FileWriter("IOCharWriterDemo1.java");
			
			//�����ַ��Ŀ���
			/*int num = -1;
			while ((num = fileReader.read()) != -1) {
				fileWriter.write(num);
			}*/
			
			//�ַ�����Ŀ���
			//ͨ���������ַ���������Ϊ1024
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
