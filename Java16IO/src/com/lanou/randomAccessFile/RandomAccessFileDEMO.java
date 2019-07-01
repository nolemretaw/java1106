package com.lanou.randomAccessFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDEMO {
/**
 * RandomAccessFile
 * 	����ļ���ȡ���������ļ���д�����ݣ�Ҳ���Զ�ȡ�ļ��е�����
 * ���ļ�������һ������ֽ����ݣ�ͨ����ȡ���ļ�ָ�뵱���������±꣬�����±�λ�ã������ļ����������д����
 * ��Ҫ������
 * 	getFilePointer() ��ȡ�ļ�ָ��λ��
 * 	seek(long pos) ���ļ�ָ�������posλ��
 * @throws IOException 
 * @throws Exception 
 * */
	public static void main(String[] args) throws IOException{
		// ��������
		RandomAccessFile raf = new RandomAccessFile("a.txt", "rw");
		//��ȡ�ļ�ָ��λ��
		long pos = raf.getFilePointer();
		System.out.println("��ʼָ��λ�ã�"+pos);
		//���ļ���д������
		raf.write(1111111111);//write(),read()ֻ�������ݵĵͰ�λ
		System.out.println("writeָ�룺"+raf.getFilePointer());
		
		raf.writeBoolean(true);//1���ֽ�
		System.out.println("boolָ�룺"+raf.getFilePointer());
		
		raf.writeInt(100);//4���ֽ�
		System.out.println("intָ�룺"+raf.getFilePointer());
		
		raf.writeUTF("��������");//12���ֽ�
		System.out.println("utfָ�룺"+raf.getFilePointer());
		
		//��ȡ�ļ�������
		raf.seek(0);//��ָ��λ�õ���0
		int b = raf.read();
		System.out.println(b);
		
		boolean f = raf.readBoolean();
		System.out.println(f);
		
		int n = raf.readInt();
		System.out.println(n);
		
		String s = raf.readUTF();
		System.out.println(s);
		
		System.out.println("ָ�룺"+raf.getFilePointer());
	}
}