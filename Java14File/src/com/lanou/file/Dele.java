package com.lanou.file;

import java.io.File;

public class Dele {
	private static boolean deleteDir(File dir) {
		if (dir.isDirectory()) {
			String[] children = dir.list();
		//�ݹ�ɾ��Ŀ¼�е���Ŀ¼��
			for (int i=0; i<children.length; i++) {
				boolean success = deleteDir(new File(dir, children[i]));
				if (!success) {
					return false;
				}
			}
		}
		// Ŀ¼��ʱΪ�գ�����ɾ��
		return dir.delete();
	}
	public static void main(String[] args) {
		deleteDir(new File("C:/Users/admin/Desktop/A"));
	}
}
