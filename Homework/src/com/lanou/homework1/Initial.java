package com.lanou.homework1;

import java.io.IOException;
import java.text.ParseException;

/*
 * File
作业1:将一个目录中所有文件从小到大进行输出(包括子目录)-----》printFile()
作业2:输入一个年份,以年份为目录,所有月份为子目录-------》createFile()
         在子目录中以当前月份的天数创建相应文件
作业3:输入一个目录,统计该目录大小(目录下所有文件大小加起来)--------》countValue()
作业4:删除指定目录下所有文件和子目录--------->deleteFiles()
 * */
public class Initial {

	public static void main(String[] args) throws ParseException, IOException {
		FileCatalog catalog = new FileCatalog("C:/Users/xalo/Documents/Tencent Files/1913657399/FileRecv");
//		catalog.printFile(); 
		
		//输出路径/年份
//		FileCatalog catalog = new FileCatalog("C:/Users/xalo/Desktop/2018");
//		catalog.createFile();
		catalog.countValue();
//		catalog.deleteFiles();
	}

}
