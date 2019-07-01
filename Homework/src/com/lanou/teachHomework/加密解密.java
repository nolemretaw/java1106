package com.lanou.teachHomework;

import java.io.File;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class ���ܽ��� {

	public static void main(String[] args) {
		System.out.println("�����ļ�·��:");
		String path = new Scanner(System.in).nextLine();
		System.out.println("������Կ:");
		int key = new Scanner(System.in).nextInt();
		
		try {
			long t1 = System.currentTimeMillis();
			encript(path,key);
			long t2 = System.currentTimeMillis();
			System.out.println("����/�������,��ʱ:"+(t2-t1));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("����/����ʧ��");
		}
	}
	/**
	 * ���ܺͽ��ܵķ���
	 * @throws Exception 
	 */
	private static void encript(String path, int key) throws Exception {
		//��װpathΪFile
		File file = new File(path);
		if(!file.exists() || file.isDirectory()){
			return;
		}
		RandomAccessFile raf = 
			new RandomAccessFile(file,"rw");
		/*int b;
		while((b=raf.read())!=-1){
			//��ָ����ǰŲ��һ��λ��
			raf.seek(raf.getFilePointer()-1);
			raf.write(b^key);
		}*/
		
		//�����ֽڼ��ܽ���
		byte[] buf = new byte[1024];
		int len;
		while((len=raf.read(buf))!=-1){
			//�����ֽ�����,�����е�ÿ�����ݽ��м���
			//�������������ݸ���������ԭ������
			for(int i=0;i<len;i++){
//				buf[i] = buf[i]^key;
				buf[i] ^= key;
			}
			//ָ����ǰŲ��len
			raf.seek(raf.getFilePointer()-len);
			raf.write(buf,0,len);
		}
		raf.close();
	}
}
