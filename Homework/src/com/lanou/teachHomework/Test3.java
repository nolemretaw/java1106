package com.lanou.teachHomework;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ����һ��Ŀ¼,ͳ�Ƹ�Ŀ¼��С(
 * Ŀ¼�������ļ���С������)
 */
public class Test3 {
	/**ͳ�������ļ���С*/
	static long count = 0;
	public static void main(String[] args) {
		System.out.println("������һ��Ŀ¼·��:");
		String filePath =                   
			new Scanner(System.in).nextLine();
		//��·����װ��һ��File
		File fileDir = new File(filePath);
		//�ж��ļ��Ƿ����
		if(!fileDir.exists())return;
		//�������Ĳ���Ŀ¼·��,��һ����׼�ļ�·��
		if(fileDir.isFile()){
			count = fileDir.length();
			return;
		}
		countFiles(fileDir);
		System.out.println("Ŀ¼�ܴ�С:"+count);
	}
	private static void countFiles(File fileDir) {
		File[] files = fileDir.listFiles();
		//����ǿ�Ŀ¼
		if(files.length==0)return;
		for(File file:files){
			if(file.isFile()){
				count += file.length();
			}else{
				countFiles(file);
			}
		}
	}
}

