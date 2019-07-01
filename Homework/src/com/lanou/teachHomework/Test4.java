package com.lanou.teachHomework;

import java.io.File;
import java.util.Scanner;

/**
 * 删除指定目录下所有文件和子目录
 */
public class Test4 {
	static String parentFilePath;
	public static void main(String[] args) {
		System.out.println("请输入目录:");
		String filePath = new Scanner(System.in).nextLine();
		File fileDir = new File(filePath);
		parentFilePath = fileDir.getAbsolutePath();
		//如果不存在或者是标准文件,不删除
		if(!fileDir.exists()||fileDir.isFile())return;
		deletAllFiles(fileDir);
	}

	private static void deletAllFiles(File fileDir) {
		File[] files = fileDir.listFiles();
		for(File file:files){
			if(file.isFile()){
				file.delete();
			}else{
				deletAllFiles(file);
			}
		}
		//for循环执行完了,说明当前目录下所有
		//文件都被删除完了
		if(!fileDir.getAbsolutePath().
				equals(parentFilePath)){
			fileDir.delete();
		}
	}
}



