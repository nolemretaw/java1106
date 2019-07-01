package com.lanou.bufferedchar;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	public static void main(String[] args) {
		/*
		 	BufferedWriter
		 	将文本写入字符输出流，缓冲各个字符，
		 	从而提供单个字符、数组和字符串的高效写入
		 */
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		try {
			fileWriter = new FileWriter("e.txt");
			bufferedWriter = new BufferedWriter(fileWriter);
			
			//普通字符输出流的写入方法，五个，高效的都可以使用！
			for (int i = 0; i < 10; i++) {
				bufferedWriter.write("java太简单了，真好学~~~");
				// 写入一个行分隔符,也就是换行
				bufferedWriter.newLine();
			}
			
			bufferedWriter.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (bufferedWriter != null) {
				try {
					/*
					 	高效缓冲区的流关闭时，绑定的普通流也会自动关闭
					 */
					bufferedWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
		
	}
}
