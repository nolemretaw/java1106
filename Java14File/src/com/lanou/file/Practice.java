package com.lanou.file;

import java.io.File;

public class Practice {
	//����һ������,������ѽ�ļ��б�
	public static void find(File file) {
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
		File[] listFiles = file.listFiles();
		for (File f : listFiles) {
			//f���ļ������ļ���
			System.out.println(f.getName());
			if (f.isDirectory()) {
				find(f);
			}
		}
	}
	
	public static void main(String[] args) {
	
	}
}
