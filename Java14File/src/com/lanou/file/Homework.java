package com.lanou.file;

import java.io.File;
import java.io.IOException;

public class Homework {

	public static void delet (File file) {
		if (!file.exists()) {
			System.out.println("文件不存在");
			return;
		}
		
		if (!file.isDirectory()) {
			System.out.println("非文件夹");
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
		// 创建三级文件夹并删除
		File dFile = new File("C:/Users/xalo/Desktop/文件/第一个/第二个/第三个/");
		dFile.mkdirs();
		File file3 = new File(dFile, "fff.txt");
		file3.createNewFile();
		File file2 = new File("C:/Users/xalo/Desktop/文件/第一个/第二个/","ggg.txt");
		file2.createNewFile();
		File file1 = new File("C:/Users/xalo/Desktop/文件/第一个/","eee.txt");
		file1.createNewFile();
	delet(new File("C:/Users/xalo/Desktop/文件/"));
	
	}

}
