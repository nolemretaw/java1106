package com.lanou.teachHomework;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * ��һ��Ŀ¼��
 * �����ļ���С����������(������Ŀ¼)
 */
public class Test1 {
	/**��������,���ڴ�������ļ�*/
	static List<File> list = new ArrayList<>();
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
			list.add(fileDir);
			return;
		}
		//��Ŀ¼
		addFiles(fileDir);
		//�Լ������ļ����д�С�����������
		Collections.sort(list,new Comparator<File>() {
			/**�ȽϹ���*/
			@Override
			public int compare(File file1, File file2) {
				if(file1.length()>file2.length())return 1;
				if(file1.length()<file2.length())return -1;
				return 0;
			}
		});
		for(File f:list){
			System.out.println(f.getAbsolutePath()+"-->"
					+f.length()/1024+"KB");
		}
	}
	
	
	/**��Ŀ¼�������ļ����뵽������*/
	private static void addFiles(File fileDir) {
		//�г�Ŀ¼�����е�file
		File[] files = fileDir.listFiles();
		//����ǿ�Ŀ¼
		if(files.length==0)return;
		//����
		for(File file:files){
			if(file.isFile()){//���ļ�,ֱ�Ӽ���
				list.add(file);
			}else{//��Ŀ¼,�ݹ��ȥ����
				addFiles(file);
			}
		}
	}
}



