package com.lanou.teachHomework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * */
public class �ļ��ϲ�2 {

	public static void main(String[] args) {
		System.out.println("����ϲ���Ŀ¼");
		String path = new Scanner(System.in).nextLine();
		System.out.println("����ϲ���Ŀ���ļ�");
		String fileName = new Scanner(System.in).nextLine();
		try {
			merge(path,fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**�ϲ�pathĿ¼���������ļ���fileName�ļ�
	 * @throws IOException 
	 * */
	private static void merge(String path, String fileName) throws IOException {
		//��װpath·��
		File dir = new File(path);
		//�ж�Ŀ¼�Ƿ�����Լ��Ƿ�ΪĿ¼
		if (!dir.exists()||dir.isFile()) {
			return;
		}
		//�г�Ŀ¼�����з��������Ĳ�����ļ�
		File[] files = dir.listFiles(new FilenameFilter() {
			/**
			 * �����ļ����ж�������Щ�ļ�
			 * dir:�ļ��ĸ�Ŀ¼
			 * name:���������ļ���
			 * 
			 * ���� name.jpg.1��ʽ�ļ�
			 * */
			@Override
			public boolean accept(File dir,String name) {
				// ����������ʽ���ж��ļ�����ʽ
				String regex = "\\w+\\.\\w+\\.\\d+";
				name = name.substring(name.lastIndexOf("."));
				return name.matches(regex);	
			}
		});
		//�������������ļ���������
		Arrays.sort(files, new Comparator<File>() {
			/**
			 * ������files������file������ָ�������������
			 * */
			@Override
			public int compare(File file1, File file2) {
				String name1 = file1.getName();
				String name2 = file2.getName();
				name1 = name1.substring(name1.lastIndexOf(".")+1);
				name1 = name1.substring(name1.lastIndexOf(".")+1);
				return Integer.parseInt(name1)-Integer.parseInt(name2);
			}
		});
		//ѭ����д
		OutputStream out = new FileOutputStream(fileName);
		InputStream in = null;
		int b;
		for (File f : files) {
			in = new FileInputStream(f);
			while ((b=in.read())!=-1) {
				out.write(b);
			}
			in.close();
		}
		in.close();
		out.close();
	}
}


