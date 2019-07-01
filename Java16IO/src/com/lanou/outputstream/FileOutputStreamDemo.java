package com.lanou.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args) {
		//ʹ���ֽ��������f.txt�ļ�д��HelloWorld!
		/*
		 	�����ļ�����
		 	�����ֽ����������
		 	���ļ��������ֽ������������а�
		 	д������
		 */
		/*
		 	FileOutputStream(File file) 
			          ����һ����ָ�� File �����ʾ���ļ���д�����ݵ��ļ��������
			FileOutputStream(File file, boolean append) 
			          ����һ����ָ�� File �����ʾ���ļ���д�����ݵ��ļ��������
			
			FileOutputStream(String name) 
			          ����һ�������ָ�����Ƶ��ļ���д�����ݵ�����ļ�����
			FileOutputStream(String name, boolean append) 
			          ����һ�������ָ�� name ���ļ���д�����ݵ�����ļ�����
		 */
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream("f.txt");
			/*
			 	void	write(byte[] b) 
				          �� b.length ���ֽڴ�ָ�� byte ����д����ļ�������С�
				 void	write(byte[] b, int off, int len) 
				          ��ָ�� byte �����д�ƫ���� off ��ʼ�� len ���ֽ�д����ļ��������
				 void	write(int b) 
				          ��ָ���ֽ�д����ļ��������
			 */
			//д�뵥���ֽ�
//			fileOutputStream.write(65);
			
			String str = "HelloWorld!";
			//�ַ��������getBytes()���Եõ��ַ������ֽ�����
			byte[] bytes = str.getBytes();
			fileOutputStream.write(bytes);
			fileOutputStream.write(bytes, 1, 5);
			
 			fileOutputStream.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
		
		
	}
}
