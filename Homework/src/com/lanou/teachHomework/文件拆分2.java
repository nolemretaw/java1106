package com.lanou.teachHomework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class 文件拆分2 {

	public static void main(String[] args) {
		System.out.println("输入拆分文件路径");
		String path = new Scanner(System.in).nextLine();
		System.out.println("输入拆分子文件大小(kb)");
		long size = new Scanner(System.in).nextLong();
		try {
			split(path,size*1024);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void split(String path, long size) throws Exception {
		//拆分文件
		File file = new File(path);
		//如果不存在或不是标准文件
		if (!file.exists()||file.isDirectory()) {
			return;
		}
		//拆分后的子文件存放目录
		File dir = new File(path+"_split");
		if (dir.exists()) {
			File[] files = dir.listFiles();
			for (File f : files) {
				f.delete();
			}
		}else {
			dir.mkdirs();
		}
		
		//获取拆分文件的文件名
		String name = file.getName();
		
		//循环读写
		//输入流接源文件
		InputStream in = new FileInputStream(file);
		//输出流
		OutputStream out = null; 
		//统计读取了多少个字节
		long byteCount = 0;
		//统计拆分了多少个子文件
		long fileCount = 0;
		
		//每次读取的字节
		int b;
		while ((b=in.read())!=-1) {
			//如果时第一个子文件或者上一个文件写满
			if (out==null||byteCount==size) {
				if (out!=null) {//存在上一个输出流管道，将其关闭
					out.close();
				}
				//构建新的输出流，接新的拆分子文件
				File spFile = new File(dir, name+"."+(++fileCount));
				out = new FileOutputStream(spFile);
				//byteCount归零重新统计
				byteCount = 0;
			}
			out.write(b);
			byteCount++;
		}
		in.close();
		out.close();
		System.out.println("拆分成功:"+fileCount+"个"+size/1014+"kb"+"文件");
	}

}
