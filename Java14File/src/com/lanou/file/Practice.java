package com.lanou.file;

import java.io.File;

public class Practice {
	//定义一个方法,用来打呀文件列表
	public static void find(File file) {
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
		File[] listFiles = file.listFiles();
		for (File f : listFiles) {
			//f是文件还是文件夹
			System.out.println(f.getName());
			if (f.isDirectory()) {
				find(f);
			}
		}
	}
	
	public static void main(String[] args) {
	
	}
}
