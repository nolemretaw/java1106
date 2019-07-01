package com.lanou.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IOCharWriterDemo3 {
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
			fileWriter = new FileWriter("d.txt");
			for (int i = 0; i < 100; i++) {
				/*
				 	windows \r\n
				 	Linux \r
				 	Mac \n
				 */
				fileWriter.write("HelloWorld" + i + "\r\n");
				/*
				 	���ܱ�֤Ч�ʣ��ֿ��Ա�֤�����������ݳ���
				 */
				if (i % 10 == 0) {
					fileWriter.flush();
				}
			}
			//��֤�������ݶ�����д���ļ�
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
