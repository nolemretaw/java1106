package com.lanou.teachHomework;

import java.io.File;
import java.util.Scanner;

/**
 * ɾ��ָ��Ŀ¼�������ļ�����Ŀ¼
 */
public class Test4 {
	static String parentFilePath;
	public static void main(String[] args) {
		System.out.println("������Ŀ¼:");
		String filePath = new Scanner(System.in).nextLine();
		File fileDir = new File(filePath);
		parentFilePath = fileDir.getAbsolutePath();
		//��������ڻ����Ǳ�׼�ļ�,��ɾ��
		if(!fileDir.exists()||fileDir.isFile())return;
		deletAllFiles(fileDir);
	}

	private static void deletAllFiles(File fileDir) {
		File[] files = fileDir.listFiles();
		for(File file:files){
			if(file.isFile()){
				file.delete();
			}else{
				deletAllFiles(file);
			}
		}
		//forѭ��ִ������,˵����ǰĿ¼������
		//�ļ�����ɾ������
		if(!fileDir.getAbsolutePath().
				equals(parentFilePath)){
			fileDir.delete();
		}
	}
}



