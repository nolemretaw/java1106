package com.lanou.teachHomework;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 输入一个目录,统计该目录大小(
 * 目录下所有文件大小加起来)
 */
public class Test3 {
	/**统计所有文件大小*/
	static long count = 0;
	public static void main(String[] args) {
		System.out.println("请输入一个目录路径:");
		String filePath =                   
			new Scanner(System.in).nextLine();
		//将路径封装成一个File
		File fileDir = new File(filePath);
		//判断文件是否存在
		if(!fileDir.exists())return;
		//如果输入的不是目录路径,是一个标准文件路径
		if(fileDir.isFile()){
			count = fileDir.length();
			return;
		}
		countFiles(fileDir);
		System.out.println("目录总大小:"+count);
	}
	private static void countFiles(File fileDir) {
		File[] files = fileDir.listFiles();
		//如果是空目录
		if(files.length==0)return;
		for(File file:files){
			if(file.isFile()){
				count += file.length();
			}else{
				countFiles(file);
			}
		}
	}
}

