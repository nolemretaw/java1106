package com.lanou.file;

import java.io.File;

public class FileDemo2 {

	public static void main(String[] args) {
		// 文件或文件夹的删除
		//删除的文件或文件夹不会进入回收站
		File file = new File("haha.txt");
		file.delete();
		File file2 = new File("a/b/c");
		//非空文件夹不允许直接删除
		file2.delete();

	}

}
