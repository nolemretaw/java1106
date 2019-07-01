package com.lanou.file;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		/*File���Ƕ��ļ������ļ��еĳ���,������˵�����ǳ�����
		 * 
		 */
		/*1.
		 * File(String pathname) 
          ͨ��������·�����ַ���ת��Ϊ����·����������һ���� File ʵ��
		 */
		//ֻ���ڱ�ʾһ���ļ�����,�����Ǵ����ļ�
		File file =new File("D:/haha.txt");
		System.out.println(file);
		
		File file1 =new File("D:/ɳĮ����.MP3");
		/*2.
		 * File(String parent, String child) 
          ���� parent ·�����ַ����� child ·�����ַ�������һ���� File ʵ����
		 * 
		 */
		File file2 = new File("D:/", "meinv.png");
		System.out.println(file2);
		/*3.
		 * File(File parent, String child) 
          ���� parent ����·������ child ·�����ַ�������һ���� File ʵ����
		 */
		File pfile = new File("D:/");
		File file3 = new File(pfile, "av.mp4");
		System.out.println(file3);
		
		//��δ����ļ�
		/*
		 * boolean createNewFile() 
          ���ҽ��������ھ��д˳���·����ָ�����Ƶ��ļ�ʱ�����ɷֵش���һ���µĿ��ļ���

		 */
		/*
		 * �����ļ�ʱ,���뱣֤�ļ�·����ʽ��ȷ���ļ�������,����ᴴ��ʧ��.�����������ļ����ǿ��ļ�
		 */
		boolean isSuccess = file.createNewFile();
		boolean isSuccess1 = file1.createNewFile();
		boolean isSuccess2 = file2.createNewFile();
		boolean isSuccess3 = file3.createNewFile();
		System.out.println(isSuccess);
		System.out.println(isSuccess1);
		System.out.println(isSuccess2);
		System.out.println(isSuccess3);
		
		//��δ����ļ���
		/*
		 *  boolean 	mkdir()
          	�����˳���·����ָ����Ŀ¼��
 			boolean 	mkdirs()
          	�����˳���·����ָ����Ŀ¼���������б��赫�����ڵĸ�Ŀ¼��
		 */
		/*mkdir()ֻ�ܴ��������ļ���
		 * mkdirs()���Դ��������ļ���,Ҳ���Դ����༶�ļ���
		 * ͬ��,���뱣֤�ļ�·����ʽ��ȷ���ļ�������,����ᴴ��ʧ��.�����������ļ����ǿ��ļ�
		 */
		File dFile = new File("D:/С��Ƶ/����/XXX");
		boolean isCreate = dFile.mkdirs();
		System.out.println(isCreate);
		//���·�������ļ�
		File aFile = new File("haha.txt");
		aFile.createNewFile();
		//��com.lanou.file���д���һ�� �ջ�����ɽ.MP3
		/*����Ժ���Ҫ�õ�ĳ����Ŀ����ĳ���ļ���ĳ���ļ���·��ʱ,���ļ����ļ������Ҽ����copy qualified name
		 * 
		 */
		File aFile1 = new File("src/com/lanou/file/�ջ�����ɽ.MP3");
		aFile1.createNewFile();
		
		File dFile2 = new File("a/b/c");
		dFile2.mkdirs();
	}

}
