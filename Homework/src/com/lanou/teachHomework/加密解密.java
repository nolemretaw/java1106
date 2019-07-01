package com.lanou.teachHomework;

import java.io.File;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class 加密解密 {

	public static void main(String[] args) {
		System.out.println("输入文件路径:");
		String path = new Scanner(System.in).nextLine();
		System.out.println("输入秘钥:");
		int key = new Scanner(System.in).nextInt();
		
		try {
			long t1 = System.currentTimeMillis();
			encript(path,key);
			long t2 = System.currentTimeMillis();
			System.out.println("加密/解密完成,耗时:"+(t2-t1));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("加密/解密失败");
		}
	}
	/**
	 * 加密和解密的方法
	 * @throws Exception 
	 */
	private static void encript(String path, int key) throws Exception {
		//封装path为File
		File file = new File(path);
		if(!file.exists() || file.isDirectory()){
			return;
		}
		RandomAccessFile raf = 
			new RandomAccessFile(file,"rw");
		/*int b;
		while((b=raf.read())!=-1){
			//把指针往前挪动一个位置
			raf.seek(raf.getFilePointer()-1);
			raf.write(b^key);
		}*/
		
		//批量字节加密解密
		byte[] buf = new byte[1024];
		int len;
		while((len=raf.read(buf))!=-1){
			//遍历字节数组,对其中的每个数据进行加密
			//将加密完后的数据覆盖数组中原来数据
			for(int i=0;i<len;i++){
//				buf[i] = buf[i]^key;
				buf[i] ^= key;
			}
			//指针向前挪动len
			raf.seek(raf.getFilePointer()-len);
			raf.write(buf,0,len);
		}
		raf.close();
	}
}
