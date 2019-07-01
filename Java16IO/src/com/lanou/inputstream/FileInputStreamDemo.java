package com.lanou.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) {
		//ʹ���ֽ���������ȡf.txt�ļ��е�����
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream("f.txt");
			/*
			 	int	read() 
				          �Ӵ��������ж�ȡһ�������ֽڡ�
				 int	read(byte[] b) 
				          �Ӵ��������н���� b.length ���ֽڵ����ݶ���һ�� byte �����С�
				 int	read(byte[] b, int off, int len) 
				          �Ӵ��������н���� len ���ֽڵ����ݶ���һ�� byte �����С�
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
