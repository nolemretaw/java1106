package com.lanou.teachHomework;

import java.io.File;
import java.util.Scanner;
/**
 * ɾ��ָ��Ŀ¼�������ļ�����Ŀ¼
 */
public class �ļ�ɾ�� {
	static String parentFilePath;
	public static void main(String[] args) {
		System.out.println("������Ŀ¼��");
		String filePath = new Scanner(System.in).nextLine();
		File fileDir = new File(filePath);
		parentFilePath = fileDir.getAbsolutePath();
		System.out.println(parentFilePath);
		if (!fileDir.exists()||fileDir.isFile()) {
			return;
		}
		deleteAllFiles(fileDir);
	}
	private static void deleteAllFiles(File fileDir) {
		File[] listFiles = fileDir.listFiles();
		for (File file : listFiles) {
			if (file.isFile()) {
				file.delete();
			}else {
				deleteAllFiles(file);
			}
		}
		if (!fileDir.getAbsolutePath().equals(parentFilePath)) {
			fileDir.delete();
		}
	}

}
