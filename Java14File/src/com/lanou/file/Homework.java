package com.lanou.file;

import java.io.File;
import java.io.IOException;

public class Homework {

	public static void delet (File file) {
		if (!file.exists()) {
			System.out.println("�ļ�������");
			return;
		}
		
		if (!file.isDirectory()) {
			System.out.println("���ļ���");
			return;
		}
		File[] listfiles = file.listFiles();
		for (File f : listfiles ) {
			if (f.isDirectory()) {
				delet(f);
			}
			f.delete();
		}
	}
	public static void main(String[] args) throws IOException {
		// ���������ļ��в�ɾ��
		File dFile = new File("C:/Users/xalo/Desktop/�ļ�/��һ��/�ڶ���/������/");
		dFile.mkdirs();
		File file3 = new File(dFile, "fff.txt");
		file3.createNewFile();
		File file2 = new File("C:/Users/xalo/Desktop/�ļ�/��һ��/�ڶ���/","ggg.txt");
		file2.createNewFile();
		File file1 = new File("C:/Users/xalo/Desktop/�ļ�/��һ��/","eee.txt");
		file1.createNewFile();
	delet(new File("C:/Users/xalo/Desktop/�ļ�/"));
	
	}

}
