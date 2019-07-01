package com.lanou.teachHomework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.lanou.teachHomework.NameComparator;

public class �ļ��ϲ� {
	private static ArrayList<File> fileArr = new ArrayList<File>();//���ڴ����Ƭ�ļ�
	private static String regex = null;//������ʽ
	private static File befAddr = null;//Դ�ϲ��ļ�Ŀ¼·��(ǰ)
	private static String fileName = null;//���ϲ��ļ�������
	private static File desAddr = null;//�ϲ����ļ�����·��(��)
	
	public static void main(String[] args) {
		System.out.println("����ϲ��ļ�Ŀ¼·��");
		String pathStr = new Scanner(System.in).nextLine();
		System.out.println("����ϲ����ļ�����·��(·��ʹ��/)");
		String desAddrStr = new Scanner(System.in).nextLine();
		try {
			operateData(pathStr,desAddrStr);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}//����Ԥ����
		select(befAddr);//ɾѡĿ¼����Ŀ¼���ݹ鲢ͨ������ƥ�䣬ɸѡ��ȫ���ļ�
		try {
			merge();//���򲢺ϲ�
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//���������ݽ��д���/����Ŀ���ļ�/ɾ������
	private static void operateData(String pathStr, String desAddrStr) throws IOException {
		befAddr = new File(pathStr);//ԴĿ¼�ļ�
		if (!befAddr.exists()||befAddr.isFile()) {
			return;
		}
		desAddr = new File(desAddrStr);
		if (desAddr.exists() && desAddr.isFile()) {//������Ϊ֮ǰ�ĺϲ��ļ�
			desAddr.delete();
		}
		desAddr.createNewFile();//����Ŀ���ļ�
		//��Ҫ�ϲ����ļ���
		fileName = desAddrStr.substring(desAddrStr.lastIndexOf("/")+1);
		System.out.println(fileName);
		//ƥ���ʽ  name.�ļ���׺.���
		regex = fileName+"\\.\\d+$";
		System.out.println(fileName+regex);
	}

//�ҳ���ɸѡԴĿ¼������Ŀ¼��ȫ������Ƭ�ļ�
	private static void select(File file) {
		if (file != null ) {//�Ƿ����
			if (file.isDirectory()) {//�Ƿ�Ŀ¼
				File f[] = file.listFiles();//�ɵõ�һ���ļ�����ȫ�����ļ�����
				for (File file2 : f) {
				select(file2);	//�ݹ�
				}//foreach
			}//��Ŀ¼���ļ�
		else {//������ʽ�ж��Ƿ�ΪĿ��Դ��Ƭ�ļ�
			String fName = file.getName();
			if (fName.matches(regex)) {
				fileArr.add(file);	
				}
			}//��Ŀ¼���ļ�	
		}	
	}
	
	//���򲢺ϲ�
	private static void merge() throws IOException {
		Collections.sort(fileArr,new NameComparator());//����
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = new FileOutputStream(desAddr);
		for (File f : fileArr) {
			fileInputStream = new FileInputStream(f);
			int num =-1;
			byte[] bs = new byte[1024];
			while ((num=fileInputStream.read(bs))!=-1) {
				fileOutputStream.write(bs, 0, num);	
			}
			fileInputStream.close();
		}
		fileOutputStream.flush();
		fileOutputStream.close();
	}
}
