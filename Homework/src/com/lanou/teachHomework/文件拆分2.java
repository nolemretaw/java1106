package com.lanou.teachHomework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class �ļ����2 {

	public static void main(String[] args) {
		System.out.println("�������ļ�·��");
		String path = new Scanner(System.in).nextLine();
		System.out.println("���������ļ���С(kb)");
		long size = new Scanner(System.in).nextLong();
		try {
			split(path,size*1024);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void split(String path, long size) throws Exception {
		//����ļ�
		File file = new File(path);
		//��������ڻ��Ǳ�׼�ļ�
		if (!file.exists()||file.isDirectory()) {
			return;
		}
		//��ֺ�����ļ����Ŀ¼
		File dir = new File(path+"_split");
		if (dir.exists()) {
			File[] files = dir.listFiles();
			for (File f : files) {
				f.delete();
			}
		}else {
			dir.mkdirs();
		}
		
		//��ȡ����ļ����ļ���
		String name = file.getName();
		
		//ѭ����д
		//��������Դ�ļ�
		InputStream in = new FileInputStream(file);
		//�����
		OutputStream out = null; 
		//ͳ�ƶ�ȡ�˶��ٸ��ֽ�
		long byteCount = 0;
		//ͳ�Ʋ���˶��ٸ����ļ�
		long fileCount = 0;
		
		//ÿ�ζ�ȡ���ֽ�
		int b;
		while ((b=in.read())!=-1) {
			//���ʱ��һ�����ļ�������һ���ļ�д��
			if (out==null||byteCount==size) {
				if (out!=null) {//������һ��������ܵ�������ر�
					out.close();
				}
				//�����µ�����������µĲ�����ļ�
				File spFile = new File(dir, name+"."+(++fileCount));
				out = new FileOutputStream(spFile);
				//byteCount��������ͳ��
				byteCount = 0;
			}
			out.write(b);
			byteCount++;
		}
		in.close();
		out.close();
		System.out.println("��ֳɹ�:"+fileCount+"��"+size/1014+"kb"+"�ļ�");
	}

}
