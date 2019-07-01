package com.lanou.file;

import java.io.File;

public class FileDemo5 {
	public static int level = 0;
	//定义一个方法，用来打印文件列表
	public static void printFile(File file) {
		//判断此文件对象是否存在
		if (!file.exists()) {
			System.out.println("文件不存在");
			return;
		}
		//判断此文件对象是否是文件夹
		if (!file.isDirectory()) {
			System.out.println("不是文件夹");
			return;
		}
		File[] files = file.listFiles();
		level++;
		for (File f : files) {
			for (int i = 0; i < level; i++) {
				System.out.print("\t");
			}
			//f 是文件还是文件夹
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
