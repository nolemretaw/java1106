package com.lanou.teachHomework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * */
public class 文件合并2 {

	public static void main(String[] args) {
		System.out.println("输入合并的目录");
		String path = new Scanner(System.in).nextLine();
		System.out.println("输入合并后目标文件");
		String fileName = new Scanner(System.in).nextLine();
		try {
			merge(path,fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**合并path目录下所有子文件到fileName文件
	 * @throws IOException 
	 * */
	private static void merge(String path, String fileName) throws IOException {
		//封装path路径
		File dir = new File(path);
		//判断目录是否存在以及是否为目录
		if (!dir.exists()||dir.isFile()) {
			return;
		}
		//列出目录下所有符合条件的拆分子文件
		File[] files = dir.listFiles(new FilenameFilter() {
			/**
			 * 根据文件名判断留下哪些文件
			 * dir:文件的父目录
			 * name:传过来的文件名
			 * 
			 * 留下 name.jpg.1格式文件
			 * */
			@Override
			public boolean accept(File dir,String name) {
				// 定义正则表达式，判断文件名格式
				String regex = "\\w+\\.\\w+\\.\\d+";
				name = name.substring(name.lastIndexOf("."));
				return name.matches(regex);	
			}
		});
		//对数组中所有文件进行排序
		Arrays.sort(files, new Comparator<File>() {
			/**
			 * 对数组files中所有file，按照指定规则进行排序
			 * */
			@Override
			public int compare(File file1, File file2) {
				String name1 = file1.getName();
				String name2 = file2.getName();
				name1 = name1.substring(name1.lastIndexOf(".")+1);
				name1 = name1.substring(name1.lastIndexOf(".")+1);
				return Integer.parseInt(name1)-Integer.parseInt(name2);
			}
		});
		//循环读写
		OutputStream out = new FileOutputStream(fileName);
		InputStream in = null;
		int b;
		for (File f : files) {
			in = new FileInputStream(f);
			while ((b=in.read())!=-1) {
				out.write(b);
			}
			in.close();
		}
		in.close();
		out.close();
	}
}


