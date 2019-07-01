package com.lanou.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo3 {

	public static void main(String[] args) {
		/*文件的判断方法
		 * 	exists() 文件或文件夹是否存在
		 * 	isFile() 是否时文件
		 * 	isDirectory() 是否是一个文件夹
		 * 	isAbsolute() 是否时绝对路径
		 * 	canRead() 是否可读
		 * 	canWrite() 是否可写
		 *文件的获取方法
		 *	getAbsolutePath() 获取到绝对路径
	 		getPath() 获取到相对路径
	 		getName() 获取到文件或者文件夹的名称
	 		length() 获取到文件或者文件夹的大小
	 		lastModified() 上次修改时间
  
		 */
		File file = new File("D:/haha.txt");
		System.out.println("是否存在: " + file.exists());
		System.out.println("是否是文件: " + file.isFile());
		System.out.println("是否是文件夹: " + file.isDirectory());
		System.out.println("是否可读: " + file.canRead());
		System.out.println("是否可写: " + file.canWrite());
		System.out.println("是否是绝对路径: " + file.isAbsolute());
		
		File file1 =new File("C:/Users/xalo/Pictures/Camera Roll/131213115254-12.jpg");
		System.out.println("绝对路径: " + file1.getAbsolutePath());
		System.out.println("相对路径: " + file1.getPath());
		System.out.println("文件名称: " + file1.getName());
		System.out.println("文件大小: " + file1.length());
		System.out.println("上次修改时间: " + file1.lastModified());
		
		//把上次修改时间戳 转换为日期
		Date date = new Date(file1.lastModified());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒" );
		String dateStr = sdf.format(date);
		System.out.println(dateStr);
	}

}
