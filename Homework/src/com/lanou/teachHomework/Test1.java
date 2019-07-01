package com.lanou.teachHomework;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * 将一个目录中
 * 所有文件从小到大进行输出(包括子目录)
 */
public class Test1 {
	/**创建集合,用于存放所有文件*/
	static List<File> list = new ArrayList<>();
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
			list.add(fileDir);
			return;
		}
		//是目录
		addFiles(fileDir);
		//对集合中文件进行从小到大排序输出
		Collections.sort(list,new Comparator<File>() {
			/**比较规则*/
			@Override
			public int compare(File file1, File file2) {
				if(file1.length()>file2.length())return 1;
				if(file1.length()<file2.length())return -1;
				return 0;
			}
		});
		for(File f:list){
			System.out.println(f.getAbsolutePath()+"-->"
					+f.length()/1024+"KB");
		}
	}
	
	
	/**将目录下所有文件加入到集合中*/
	private static void addFiles(File fileDir) {
		//列出目录下所有的file
		File[] files = fileDir.listFiles();
		//如果是空目录
		if(files.length==0)return;
		//遍历
		for(File file:files){
			if(file.isFile()){//是文件,直接加入
				list.add(file);
			}else{//是目录,递归进去遍历
				addFiles(file);
			}
		}
	}
}



