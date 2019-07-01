package com.lanou.teachHomework;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Ŀ¼�ļ���� {
	/**
	 * ��һ��Ŀ¼��
	 * �����ļ���С����������(������Ŀ¼)
	 */
	static List<File> list = new ArrayList<File>();
	public static void main(String[] args) {
		System.out.println("������һ��Ŀ¼·����");
		String filePath = new Scanner(System.in).nextLine();
		File fileDir = new File(filePath);
		if (!fileDir.exists()) {
			return;
		}
		if (fileDir.isFile()) {
			list.add(fileDir);
			return;
		}
		addFiles(fileDir);
		Collections.sort(list,new Comparator<File>() {
			@Override
			public int compare(File o1, File o2) {
				if (o1.length()>o2.length()) {
					return 1;
				}
				if (o1.length()<o2.length()) {
					return -1;
				}
				return 0;
			}
		});
		for (File f : list) {
			System.out.println(f.getAbsolutePath()+"===>"+f.length()/1024+"KB");
		}
	}
	private static void addFiles(File fileDir) {
		File[] files = fileDir.listFiles();
		if (files.length==0) {
			return;
		}
		for (File file : files) {
			if (file.isFile()) {
				list.add(file);
			}else {
				addFiles(file);
			}                                                                                                     
		}
	}

}
