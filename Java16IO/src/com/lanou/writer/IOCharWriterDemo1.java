package com.lanou.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IOCharWriterDemo1 {
	public static void main(String[] args) {
		//FileWriter 用来写入字符文件的便捷类 字符输出流
		//往a.txt文件中写入HelloWorld!
		/*
		 	创建文件
		 	创建字符输出流对象
		 	将文件与流对象进行绑定
		 	写入内容
		 */
		File file = new File("a.txt");
		/*
		 	以下两种构造流对象的方法，写入内容相当于覆盖！！！
		 	1、FileWriter(File file) 
          	根据给定的 File 对象构造一个 FileWriter 对象。
          	2、FileWriter(String fileName) 
          	根据给定的文件名构造一个 FileWriter 对象。
          	
          	以下两种构造流对象的方法，写入内容时，如果表示是否
          	可以追加的布尔值为true，则内容追加到原有文件后面！
          	3、FileWriter(File file, boolean append) 
          	根据给定的 File 对象构造一个 FileWriter 对象。
			4、FileWriter(String fileName, boolean append) 
          	根据给定的文件名以及指示是否附加写入数据的 boolean 值来构造 
		 */
		//同时访问此文件，比如删除、写入，就会出现异常
		FileWriter fileWriter = null;
		try {
//			fileWriter = new FileWriter(file);
//			fileWriter = new FileWriter("b.txt");
			fileWriter = new FileWriter("b.txt", true);
			/*
			 	write(String str) 
          			写入字符串。
			 */
			fileWriter.write("你好世界！");
			/*
			 	字符输出流对象写内容不是直接将内容写入文件
			 	而是写入缓存区，如果想要将缓存区内的内容调入
			 	文件，需要执行清空或者刷新缓存区的方法
			 */
			fileWriter.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fileWriter != null) {
				try {
					/*
					 	字符输出流对象关闭时，会自动清空缓存区
					 	此时哪怕没有flush()方法，也可以写入文件
					 	但是出于规范，flush()不能省略！
					 */
					fileWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
		
		
	}
}
