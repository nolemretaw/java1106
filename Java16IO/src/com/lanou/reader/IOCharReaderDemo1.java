package com.lanou.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOCharReaderDemo1 {
	public static void main(String[] args) {
		//FileReader ������ȡ�ַ��ļ��ı���� �ַ�������
		//��ȡa.txt�ļ��е�����
		/*
		 	�����ļ�����
		 	��������������
		 	���ļ���������������а�
		 	��ȡ����
		 */
		File file = new File("a.txt");
		FileReader fileReader = null;
		try {
			/*
			 	FileReader(String fileName) 
          		�ڸ������ж�ȡ���ݵ��ļ���������´���һ���� FileReader��
	
				FileReader(File file)
          		�ڸ������ж�ȡ���ݵ� File ������´���һ���� FileReader��
			 */
//			fileReader = new FileReader(file);
			fileReader = new FileReader("a.txt");
			/*
			 	 int	read() 
          			��ȡ�����ַ���
				 int	read(char[] cbuf) 
				          ���ַ��������顣
				abstract  int	read(char[] cbuf, int off, int len) 
				          ���ַ����������ĳһ���֡�
			 */
			//read()��ȡ�����ַ�,��ȡ�����ַ���Ӧ�ı���ֵ��
			/*int num = fileReader.read();
			System.out.print((char)num);
			num = fileReader.read();
			System.out.print((char)num);
			num = fileReader.read();
			System.out.print(num);*/
			/*//1��
			int num = -1;
			while ((num = fileReader.read()) != -1) {
				System.out.print((char)num);
			}*/
			
			/*
			 	��ȡ��������Ƕ�ȡ���ַ������еĻ�
			 	����ֵnum�����ζ�ȡ���ַ�������
			 	���num��-1��������ȡ���
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
