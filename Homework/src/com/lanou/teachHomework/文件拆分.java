package com.lanou.teachHomework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class 文件拆分 {

	public static void main(String[] args) {
		System.out.println("输入拆分文件路径");
		String path = new Scanner(System.in).nextLine();
		System.out.println("输入拆分文件大小（kb）");
		long size = new Scanner(System.in).nextLong();
		split(path,size * 1024);
	}

	private static void split(String path, long size) throws IOException {
		File file = new File(path);
		if (!file.exists()||file.isDirectory()) {
			return;
		}
		File dir = new File(path+"_split");
		if (dir.exists()) {
			File[] files = dir.listFiles();
			for (File file2 : files) {
				file2.delete();
			}
		}else {
			dir.mkdirs();
		}
		String name = file.getName();
		InputStream in = new FileInputStream(file);
		OutputStream out = null;
		long byteCount = 0;
		int b = 0;
		while ((b=in.read())!=-1) {
			if (out==null||byteCount==size) {
				
			}
		}
	}

}
