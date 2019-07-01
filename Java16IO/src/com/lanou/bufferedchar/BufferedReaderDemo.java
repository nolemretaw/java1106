package com.lanou.bufferedchar;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
	public static void main(String[] args) {
		/*
		 	BufferedReader
		 	���ַ��������ж�ȡ�ı�����������ַ���
		 	�Ӷ�ʵ���ַ���������еĸ�Ч��ȡ��
		 */
		/*
		 	BufferedReader(Reader in) 
          	����һ��ʹ��Ĭ�ϴ�С���뻺�����Ļ����ַ���������
		 */
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try {
			fileReader = new FileReader("e.txt");
			bufferedReader = new BufferedReader(fileReader);
			
			//�����ַ��Ķ�ȡ
			/*int num = -1;
			while ((num = bufferedReader.read()) != -1) {
				System.out.print((char)num);
			}*/
			
			//�ַ�����Ķ�ȡ
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
