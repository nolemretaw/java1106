package com.lanou.file;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		/*File类是对文件或者文件夹的抽象,并不是说此类是抽象类
		 * 
		 */
		/*1.
		 * File(String pathname) 
          通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例
		 */
		//只是在表示一个文件对象,并不是创建文件
		File file =new File("D:/haha.txt");
		System.out.println(file);
		
		File file1 =new File("D:/沙漠骆驼.MP3");
		/*2.
		 * File(String parent, String child) 
          根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。
		 * 
		 */
		File file2 = new File("D:/", "meinv.png");
		System.out.println(file2);
		/*3.
		 * File(File parent, String child) 
          根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
		 */
		File pfile = new File("D:/");
		File file3 = new File(pfile, "av.mp4");
		System.out.println(file3);
		
		//如何创建文件
		/*
		 * boolean createNewFile() 
          当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件。

		 */
		/*
		 * 创建文件时,必须保证文件路径格式正确且文件不存在,否则会创建失败.创建出来的文件都是空文件
		 */
		boolean isSuccess = file.createNewFile();
		boolean isSuccess1 = file1.createNewFile();
		boolean isSuccess2 = file2.createNewFile();
		boolean isSuccess3 = file3.createNewFile();
		System.out.println(isSuccess);
		System.out.println(isSuccess1);
		System.out.println(isSuccess2);
		System.out.println(isSuccess3);
		
		//如何创建文件夹
		/*
		 *  boolean 	mkdir()
          	创建此抽象路径名指定的目录。
 			boolean 	mkdirs()
          	创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。
		 */
		/*mkdir()只能创建单级文件夹
		 * mkdirs()可以创建单级文件夹,也可以创建多级文件夹
		 * 同理,必须保证文件路径格式正确且文件不存在,否则会创建失败.创建出来的文件都是空文件
		 */
		File dFile = new File("D:/小视频/国产/XXX");
		boolean isCreate = dFile.mkdirs();
		System.out.println(isCreate);
		//相对路径创建文件
		File aFile = new File("haha.txt");
		aFile.createNewFile();
		//在com.lanou.file包中创建一个 菊花爆满山.MP3
		/*如果以后想要得到某个项目工程某个文件或某个文件夹路径时,在文件或文件夹上右键点击copy qualified name
		 * 
		 */
		File aFile1 = new File("src/com/lanou/file/菊花爆满山.MP3");
		aFile1.createNewFile();
		
		File dFile2 = new File("a/b/c");
		dFile2.mkdirs();
	}

}
