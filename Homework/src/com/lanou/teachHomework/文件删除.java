package com.lanou.teachHomework;

import java.io.File;
import java.util.Scanner;
/**
 * 删除指定目录下所有文件和子目录
 */
public class 文件删除 {
	static String parentFilePath;
	public static void main(String[] args) {
		System.out.println("请输入目录：");
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
