package com.lanou.teachHomework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class �ϵ����� {
/**�ϵ�����
 * @throws IOException 
 * */
	public static void main(String[] args) throws IOException {
		// Դ�ļ�
		File src = new File("C:/Users/xalo/Desktop/PRACTICE50.SQL");
		RandomAccessFile readRaf = new RandomAccessFile(src, "rw");
		
		//Ŀ���ļ�
		File dest = new File("C:/Users/xalo/Desktop/����.SQL");
		RandomAccessFile writeRaf = new RandomAccessFile(dest,"rw");
		
		//��ָ���¼�ļ�raf.txt/pointerFile�л�ȡָ��λ��
		long pointer;
		File pointerFile = new File("raf.txt");
		if (!pointerFile.exists()) {//��һ�δ���
			pointer = 0;
		}else {//�ǵ�һ�Σ�ȡ���ϴζ���ʱ��¼��ָ��λ��
			pointer=getFilepointerFromFile(pointerFile);
		}
		
		//������д�ļ���ָ��λ��
		readRaf.seek(pointer);
		writeRaf.seek(pointer);
		
		//ѭ����д
		//ͳ�ƶ�д�˶��ٸ��ֽ�
		long byteCount = 0;
		//��ÿ�ζ�ȡ�����ֽڸ���b
		int b;
		while((b=readRaf.read())!=-1){
			byteCount++;
			System.out.println("������"+byteCount+"���ֽ�");
			writeRaf.write(b);
//			if (byteCount==1000) {//ģ�����
//				try {
//					throw new Exception("������");
//				} catch (Exception e) {
//					//���쳣����ȡ����λ��ָ�룬��¼���ļ�
//					e.printStackTrace();
//					long breakPointer = readRaf.getFilePointer();
//					writePointerToFile(breakPointer,pointerFile);
//					//��ֹѭ����д����
//					break;
//				}
//			}
		}
	}
	//������λ��ָ���¼���ļ���
	private static void writePointerToFile(long breakPointer, File pointerFile) {
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile(pointerFile, "rw");
			raf.writeLong(breakPointer);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				raf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
}

	//���ļ���ȡ������λ��ָ��
	private static long getFilepointerFromFile(File pointerFile){
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile(pointerFile, "rw");
			pointerFile.delete();//Ҫɾ����¼ָ���ļ�
			return raf.readLong();//���ض���ָ��
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				raf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		return 0;
	}

}
