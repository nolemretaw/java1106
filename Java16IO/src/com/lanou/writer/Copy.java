package com.lanou.writer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
	public static void copyFile() {
		BufferedOutputStream bufferedOutputStream = null;
		BufferedInputStream bufferedInputStream = null;
		FileOutputStream fileOutputStream = null;
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream("src/com/lanou/reader/IOCharReader.java");
			fileOutputStream = new FileOutputStream("hehe.java");
			bufferedInputStream = new BufferedInputStream(fileInputStream);
			bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
			int num = -1;
			byte[] bs = new byte[1024];
			while ((num = bufferedInputStream.read(bs)) != -1) {
				bufferedOutputStream.write(bs, 0, num);
			}
			bufferedOutputStream.flush();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO: handle exception
		} finally {
			if (fileInputStream != null) {
				try {
					bufferedInputStream.close();
					bufferedOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
