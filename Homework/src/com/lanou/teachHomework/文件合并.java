package com.lanou.teachHomework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.lanou.teachHomework.NameComparator;

public class 文件合并 {
	private static ArrayList<File> fileArr = new ArrayList<File>();//用于存放碎片文件
	private static String regex = null;//正则表达式
	private static File befAddr = null;//源合并文件目录路径(前)
	private static String fileName = null;//将合并文件的名称
	private static File desAddr = null;//合并后文件名及路径(后)
	
	public static void main(String[] args) {
		System.out.println("输入合并文件目录路径");
		String pathStr = new Scanner(System.in).nextLine();
		System.out.println("输入合并后文件名及路径(路径使用/)");
		String desAddrStr = new Scanner(System.in).nextLine();
		try {
			operateData(pathStr,desAddrStr);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}//数据预处理
		select(befAddr);//删选目录及子目录，递归并通过正则匹配，筛选出全部文件
		try {
			merge();//排序并合并
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//对输入数据进行处理/创建目标文件/删除已有
	private static void operateData(String pathStr, String desAddrStr) throws IOException {
		befAddr = new File(pathStr);//源目录文件
		if (!befAddr.exists()||befAddr.isFile()) {
			return;
		}
		desAddr = new File(desAddrStr);
		if (desAddr.exists() && desAddr.isFile()) {//存在且为之前的合并文件
			desAddr.delete();
		}
		desAddr.createNewFile();//创建目标文件
		//将要合并的文件名
		fileName = desAddrStr.substring(desAddrStr.lastIndexOf("/")+1);
		System.out.println(fileName);
		//匹配格式  name.文件后缀.序号
		regex = fileName+"\\.\\d+$";
		System.out.println(fileName+regex);
	}

//找出并筛选源目录及其子目录中全部的碎片文件
	private static void select(File file) {
		if (file != null ) {//是否存在
			if (file.isDirectory()) {//是否目录
				File f[] = file.listFiles();//可得到一个文件夹下全部子文件对象
				for (File file2 : f) {
				select(file2);	//递归
				}//foreach
			}//是目录非文件
		else {//正则表达式判断是否为目标源碎片文件
			String fName = file.getName();
			if (fName.matches(regex)) {
				fileArr.add(file);	
				}
			}//非目录是文件	
		}	
	}
	
	//排序并合并
	private static void merge() throws IOException {
		Collections.sort(fileArr,new NameComparator());//排序
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = new FileOutputStream(desAddr);
		for (File f : fileArr) {
			fileInputStream = new FileInputStream(f);
			int num =-1;
			byte[] bs = new byte[1024];
			while ((num=fileInputStream.read(bs))!=-1) {
				fileOutputStream.write(bs, 0, num);	
			}
			fileInputStream.close();
		}
		fileOutputStream.flush();
		fileOutputStream.close();
	}
}
