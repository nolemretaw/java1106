package com.lanou.file;

import java.io.File;

public class FileDemo2 {

	public static void main(String[] args) {
		// �ļ����ļ��е�ɾ��
		//ɾ�����ļ����ļ��в���������վ
		File file = new File("haha.txt");
		file.delete();
		File file2 = new File("a/b/c");
		//�ǿ��ļ��в�����ֱ��ɾ��
		file2.delete();

	}

}
