package com.lanou.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args) {
		//使用字节输出流往f.txt文件写入HelloWorld!
		/*
		 	创建文件对象
		 	创建字节输出流对象
		 	将文件对象与字节输出流对象进行绑定
		 	写入内容
		 */
		/*
		 	FileOutputStream(File file) 
			          创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
			FileOutputStream(File file, boolean append) 
			          创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
			
			FileOutputStream(String name) 
			          创建一个向具有指定名称的文件中写入数据的输出文件流。
			FileOutputStream(String name, boolean append) 
			          创建一个向具有指定 name 的文件中写入数据的输出文件流。
		 */
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream("f.txt");
			/*
			 	void	write(byte[] b) 
				          将 b.length 个字节从指定 byte 数组写入此文件输出流中。
				 void	write(byte[] b, int off, int len) 
				          将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此文件输出流。
				 void	write(int b) 
				          将指定字节写入此文件输出流。
			 */
			//写入单个字节
//			fileOutputStream.write(65);
			
			String str = "HelloWorld!";
			//字符串对象的getBytes()可以得到字符串的字节数组
			byte[] bytes = str.getBytes();
			fileOutputStream.write(bytes);
			fileOutputStream.write(bytes, 1, 5);
			
 			fileOutputStream.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
		
		
	}
}
