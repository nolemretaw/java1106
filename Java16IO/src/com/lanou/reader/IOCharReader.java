package com.lanou.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOCharReader {
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
		try {
			/*
			FileReader(String fileName) 
          	�ڸ������ж�ȡ���ݵ��ļ���������´���һ���� FileReader��

			FileReader(File file) 
          	�ڸ������ж�ȡ���ݵ� File ������´���һ���� FileReader��

			 */
			FileReader fileReader = new FileReader(file);
			/*
				int	read() 
				          ��ȡ�����ַ���
				int	read(char[] cbuf) 
				          ���ַ��������顣
				abstract  int	read(char[] cbuf, int off, int len) 
				          ���ַ����������ĳһ���֡�

			 */
			//read()��ȡ�����ַ�;��ȡ�����ַ���Ӧ�ı���ֵ!
			/*int num= fileReader.read();
			System.out.println((char)num);*/
			
			/*//1.
			 * int num = -1;
			while ((num = fileReader.read()) != -1) {
				System.out.print((char)num);
			}*/
		
			/*
			 	��ȡ��������Ƕ�ȡ���ַ������еĻ�,
			 	����ֵnum�����ζ�ȡ���ַ�����
			 	���num��-1,������ȡ���
			 */
		/*	char[] chs = new char[5];
			int num = fileReader.read(chs);
			System.out.println(num);
			num = fileReader.read(chs);
			System.out.println(num);
			num = fileReader.read(chs);
			System.out.println(num);
			num = fileReader.read(chs);
			System.out.println(num);*/
			
			char[] chs = new char[5];
			int num = -1;
			while ((num = fileReader.read(chs)) != -1) {
				System.out.println(new String(chs, 0, num));
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
		
		}
	}
}
