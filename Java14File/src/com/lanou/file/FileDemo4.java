package com.lanou.file;

import java.io.File;

public class FileDemo4 {

	public static void main(String[] args) {
		// 子文件的获取
		//listRoots()获取系统根目录下的子文件,类方法
		File[] listRoots = File.listRoots();
		for (File file : listRoots) {
			System.out.println(file);
		}
		File file = new File("C:/Users/xalo/Pictures/Camera Roll");
		/*
		 * listFiles()可以得到一个文件夹下所有的子文件对象,包含了路径以及文件名
		 */
		File[] listFiles = file.listFiles();
		for (File file1 : listFiles) {
			System.out.println(file1);
		}
		
		/*list() 得到的是文件夹下所有子文件的名称并没有路径
		 * 
		 */
		String[] strs = file.list();
		for (String string : strs) {
			System.out.println(string);
		}
	}

}
