package com.lanou.file;

import java.io.File;

public class FileDemo4 {

	public static void main(String[] args) {
		// ���ļ��Ļ�ȡ
		//listRoots()��ȡϵͳ��Ŀ¼�µ����ļ�,�෽��
		File[] listRoots = File.listRoots();
		for (File file : listRoots) {
			System.out.println(file);
		}
		File file = new File("C:/Users/xalo/Pictures/Camera Roll");
		/*
		 * listFiles()���Եõ�һ���ļ��������е����ļ�����,������·���Լ��ļ���
		 */
		File[] listFiles = file.listFiles();
		for (File file1 : listFiles) {
			System.out.println(file1);
		}
		
		/*list() �õ������ļ������������ļ������Ʋ�û��·��
		 * 
		 */
		String[] strs = file.list();
		for (String string : strs) {
			System.out.println(string);
		}
	}

}
