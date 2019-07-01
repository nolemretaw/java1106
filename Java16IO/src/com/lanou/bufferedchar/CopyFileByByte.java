package com.lanou.bufferedchar;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileByByte {
	public static void copyFile() {
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		try {
			fileInputStream = new FileInputStream("src/com/lanou/copyfile/01-字符输出流的创建及使用.mp4");
			fileOutputStream = new FileOutputStream("haha.mp4");
			
			//单个字节的拷贝
			/*int num = -1;
			while ((num = fileInputStream.read()) != -1) {
				fileOutputStream.write(num);
			}*/
			
			//2、字节数组的拷贝
			int num = -1;
			byte[] bs = new byte[1024];
			while ((num = fileInputStream.read(bs)) != -1) {
				fileOutputStream.write(bs, 0, num);
			}
			fileOutputStream.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		copyFile();
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}
