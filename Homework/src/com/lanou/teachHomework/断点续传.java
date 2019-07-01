package com.lanou.teachHomework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class 断点续传 {
/**断点续传
 * @throws IOException 
 * */
	public static void main(String[] args) throws IOException {
		// 源文件
		File src = new File("C:/Users/xalo/Desktop/PRACTICE50.SQL");
		RandomAccessFile readRaf = new RandomAccessFile(src, "rw");
		
		//目标文件
		File dest = new File("C:/Users/xalo/Desktop/副本.SQL");
		RandomAccessFile writeRaf = new RandomAccessFile(dest,"rw");
		
		//从指针记录文件raf.txt/pointerFile中获取指针位置
		long pointer;
		File pointerFile = new File("raf.txt");
		if (!pointerFile.exists()) {//第一次创建
			pointer = 0;
		}else {//非第一次，取出上次断网时记录的指针位置
			pointer=getFilepointerFromFile(pointerFile);
		}
		
		//调整读写文件的指针位置
		readRaf.seek(pointer);
		writeRaf.seek(pointer);
		
		//循环读写
		//统计读写了多少个字节
		long byteCount = 0;
		//将每次读取到的字节赋给b
		int b;
		while((b=readRaf.read())!=-1){
			byteCount++;
			System.out.println("下载了"+byteCount+"个字节");
			writeRaf.write(b);
//			if (byteCount==1000) {//模拟断网
//				try {
//					throw new Exception("断网了");
//				} catch (Exception e) {
//					//报异常并获取断网位置指针，记录到文件
//					e.printStackTrace();
//					long breakPointer = readRaf.getFilePointer();
//					writePointerToFile(breakPointer,pointerFile);
//					//终止循环读写过程
//					break;
//				}
//			}
		}
	}
	//将断网位置指针记录到文件中
	private static void writePointerToFile(long breakPointer, File pointerFile) {
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile(pointerFile, "rw");
			raf.writeLong(breakPointer);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				raf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
}

	//从文件中取出断网位置指针
	private static long getFilepointerFromFile(File pointerFile){
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile(pointerFile, "rw");
			pointerFile.delete();//要删除记录指针文件
			return raf.readLong();//返回断网指针
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				raf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		return 0;
	}

}
