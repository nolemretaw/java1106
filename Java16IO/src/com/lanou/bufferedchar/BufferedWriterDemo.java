package com.lanou.bufferedchar;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	public static void main(String[] args) {
		/*
		 	BufferedWriter
		 	���ı�д���ַ����������������ַ���
		 	�Ӷ��ṩ�����ַ���������ַ����ĸ�Чд��
		 */
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		try {
			fileWriter = new FileWriter("e.txt");
			bufferedWriter = new BufferedWriter(fileWriter);
			
			//��ͨ�ַ��������д�뷽�����������Ч�Ķ�����ʹ�ã�
			for (int i = 0; i < 10; i++) {
				bufferedWriter.write("java̫���ˣ����ѧ~~~");
				// д��һ���зָ���,Ҳ���ǻ���
				bufferedWriter.newLine();
			}
			
			bufferedWriter.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (bufferedWriter != null) {
				try {
					/*
					 	��Ч�����������ر�ʱ���󶨵���ͨ��Ҳ���Զ��ر�
					 */
					bufferedWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
		
	}
}
