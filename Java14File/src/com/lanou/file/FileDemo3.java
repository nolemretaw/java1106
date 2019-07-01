package com.lanou.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo3 {

	public static void main(String[] args) {
		/*�ļ����жϷ���
		 * 	exists() �ļ����ļ����Ƿ����
		 * 	isFile() �Ƿ�ʱ�ļ�
		 * 	isDirectory() �Ƿ���һ���ļ���
		 * 	isAbsolute() �Ƿ�ʱ����·��
		 * 	canRead() �Ƿ�ɶ�
		 * 	canWrite() �Ƿ��д
		 *�ļ��Ļ�ȡ����
		 *	getAbsolutePath() ��ȡ������·��
	 		getPath() ��ȡ�����·��
	 		getName() ��ȡ���ļ������ļ��е�����
	 		length() ��ȡ���ļ������ļ��еĴ�С
	 		lastModified() �ϴ��޸�ʱ��
  
		 */
		File file = new File("D:/haha.txt");
		System.out.println("�Ƿ����: " + file.exists());
		System.out.println("�Ƿ����ļ�: " + file.isFile());
		System.out.println("�Ƿ����ļ���: " + file.isDirectory());
		System.out.println("�Ƿ�ɶ�: " + file.canRead());
		System.out.println("�Ƿ��д: " + file.canWrite());
		System.out.println("�Ƿ��Ǿ���·��: " + file.isAbsolute());
		
		File file1 =new File("C:/Users/xalo/Pictures/Camera Roll/131213115254-12.jpg");
		System.out.println("����·��: " + file1.getAbsolutePath());
		System.out.println("���·��: " + file1.getPath());
		System.out.println("�ļ�����: " + file1.getName());
		System.out.println("�ļ���С: " + file1.length());
		System.out.println("�ϴ��޸�ʱ��: " + file1.lastModified());
		
		//���ϴ��޸�ʱ��� ת��Ϊ����
		Date date = new Date(file1.lastModified());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss��" );
		String dateStr = sdf.format(date);
		System.out.println(dateStr);
	}

}
