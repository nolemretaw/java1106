package com.lanou.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IOCharWriterDemo2 {
	public static void main(String[] args) {
		//FileWriter ����д���ַ��ļ��ı���� �ַ������
		//��a.txt�ļ���д��HelloWorld!
		/*
		 	�����ļ�
		 	�����ַ����������
		 	���ļ�����������а�
		 	д������
		 */
		File file = new File("a.txt");
		/*
		 	�������ֹ���������ķ�����д�������൱�ڸ��ǣ�����
		 	1��FileWriter(File file) 
          	���ݸ����� File ������һ�� FileWriter ����
          	2��FileWriter(String fileName) 
          	���ݸ������ļ�������һ�� FileWriter ����
          	
          	�������ֹ���������ķ�����д������ʱ�������ʾ�Ƿ�
          	����׷�ӵĲ���ֵΪtrue��������׷�ӵ�ԭ���ļ����棡
          	3��FileWriter(File file, boolean append) 
          	���ݸ����� File ������һ�� FileWriter ����
			4��FileWriter(String fileName, boolean append) 
          	���ݸ������ļ����Լ�ָʾ�Ƿ񸽼�д�����ݵ� boolean ֵ������ 
		 */
		//ͬʱ���ʴ��ļ�������ɾ����д�룬�ͻ�����쳣
		FileWriter fileWriter = null;
		try {
//			fileWriter = new FileWriter(file);
			fileWriter = new FileWriter("c.txt");
//			fileWriter = new FileWriter("b.txt", true);
			
			/*
			 	void	write(char[] cbuf) 
				          д���ַ����顣
				abstract  void	write(char[] cbuf, int off, int len) 
				          д���ַ������ĳһ���֡�
				 void	write(int c) 
				          д�뵥���ַ���
				 void	write(String str) 
				          д���ַ�����
				 void	write(String str, int off, int len) 
				          д���ַ�����ĳһ���֡�
			 */
//			fileWriter.write("������磡");
			char[] chs = {'c', 'h', 'e', 'n', 'c', 'h', 'e', 'n'};
//			fileWriter.write(chs);
//			fileWriter.write(chs, 1, 5);
			
			fileWriter.write("����������ú�ѧϰ��", 1, 4);
			fileWriter.write(65);
			
			/*
			 	�ַ����������д���ݲ���ֱ�ӽ�����д���ļ�
			 	����д�뻺�����������Ҫ���������ڵ����ݵ���
			 	�ļ�����Ҫִ����ջ���ˢ�»������ķ���
			 */
			fileWriter.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fileWriter != null) {
				try {
					/*
					 	�ַ����������ر�ʱ�����Զ���ջ�����
					 	��ʱ����û��flush()������Ҳ����д���ļ�
					 	���ǳ��ڹ淶��flush()����ʡ�ԣ�
					 */
					fileWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
		
		
	}
}
