package com.lanou.randomAccessFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDEMO {
/**
 * RandomAccessFile
 * 	随机文件读取，可以向文件中写出数据，也可以读取文件中的数据
 * 将文件当作是一个大的字节数据，通过获取的文件指针当作是数组下标，调整下标位置，来对文件进行随机读写操作
 * 主要方法：
 * 	getFilePointer() 获取文件指针位置
 * 	seek(long pos) 将文件指针调整到pos位置
 * @throws IOException 
 * @throws Exception 
 * */
	public static void main(String[] args) throws IOException{
		// 创建对象
		RandomAccessFile raf = new RandomAccessFile("a.txt", "rw");
		//获取文件指针位置
		long pos = raf.getFilePointer();
		System.out.println("初始指针位置："+pos);
		//向文件中写入数据
		raf.write(1111111111);//write(),read()只返回数据的低八位
		System.out.println("write指针："+raf.getFilePointer());
		
		raf.writeBoolean(true);//1个字节
		System.out.println("bool指针："+raf.getFilePointer());
		
		raf.writeInt(100);//4个字节
		System.out.println("int指针："+raf.getFilePointer());
		
		raf.writeUTF("哈哈哈哈");//12个字节
		System.out.println("utf指针："+raf.getFilePointer());
		
		//读取文件中数据
		raf.seek(0);//将指针位置调回0
		int b = raf.read();
		System.out.println(b);
		
		boolean f = raf.readBoolean();
		System.out.println(f);
		
		int n = raf.readInt();
		System.out.println(n);
		
		String s = raf.readUTF();
		System.out.println(s);
		
		System.out.println("指针："+raf.getFilePointer());
	}
}