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
			fileInputStream = new FileInputStream("src/com/lanou/copyfile/01-�ַ�������Ĵ�����ʹ��.mp4");
			fileOutputStream = new FileOutputStream("haha.mp4");
			
			//�����ֽڵĿ���
			/*int num = -1;
			while ((num = fileInputStream.read()) != -1) {
				fileOutputStream.write(num);
			}*/
			
			//2���ֽ�����Ŀ���
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
