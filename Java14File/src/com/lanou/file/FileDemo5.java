package com.lanou.file;

import java.io.File;

public class FileDemo5 {
	public static int level = 0;
	//����һ��������������ӡ�ļ��б�
	public static void printFile(File file) {
		//�жϴ��ļ������Ƿ����
		if (!file.exists()) {
			System.out.println("�ļ�������");
			return;
		}
		//�жϴ��ļ������Ƿ����ļ���
		if (!file.isDirectory()) {
			System.out.println("�����ļ���");
			return;
		}
		File[] files = file.listFiles();
		level++;
		for (File f : files) {
			for (int i = 0; i < level; i++) {
				System.out.print("\t");
			}
			//f ���ļ������ļ���
			System.out.println(f.getName());
			if (f.isDirectory()) {
				printFile(f);
			}
		}
		level--;
	}
	
	public static void main(String[] args) {
		printFile(new File("C:/Users/xalo/Desktop/"));
	}
}
