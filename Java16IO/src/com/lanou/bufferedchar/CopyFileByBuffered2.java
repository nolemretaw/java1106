package com.lanou.bufferedchar;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileByBuffered2 {
	public static void copyFile() {
		BufferedOutputStream bufferedOutputStream = null;
		BufferedInputStream bufferedInputStream = null;
		FileOutputStream fileOutputStream = null;
		FileInputStream fileInputStream = null;
		
		try {
			fileInputStream = new FileInputStream("´üÊó.mp4");
			fileOutputStream = new FileOutputStream("hehe.mp4");
			bufferedInputStream = new BufferedInputStream(fileInputStream);
			bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
			int num = -1;
			byte[] bs = new byte[1024];
			while ((num = bufferedInputStream.read(bs)) != -1) {
				bufferedOutputStream.write(bs, 0, num);
			}
			bufferedOutputStream.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (bufferedInputStream != null &&
						bufferedOutputStream != null) {
					bufferedInputStream.close();
					bufferedOutputStream.close();
				}
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		copyFile();
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		
		
		
		
		
		
	}
}
