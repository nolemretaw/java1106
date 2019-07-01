package com.lanou.practice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileByBuffered {

	public static void main(String[] args) {
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		BufferedInputStream bufferedInputStream = null;
		BufferedOutputStream bufferedOutputStream = null;
		try {
			fileInputStream = new FileInputStream("src/com/lanou/copyfile/panghu.jpg");
			fileOutputStream = new FileOutputStream("ÎÄ¼þ¿½±´.jpg");
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
