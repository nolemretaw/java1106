package com.lanou.seril;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerilDemo1 {
	//д�����,���л�����
	public static void write() {
		ObjectOutputStream oStream = null;
		try {
			oStream = new ObjectOutputStream(new FileOutputStream("person.txt"));
			//��������
			Person person = new Person("����", 18, 180.0f);
			oStream.writeObject(person);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (oStream != null) {
				try {
					oStream.close();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
	}
	//��ȡ����,�����л�
	public static void read() {
		ObjectInputStream  iStream = null;
		try {
			iStream = new ObjectInputStream(new FileInputStream("person.txt"));
			Object object = iStream.readObject();
			if (object instanceof Person) {
				Person person = (Person)object;
				System.out.println(person);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (iStream != null) {
				try {
					iStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) {
		/*
		 	����ĳ־û��洢��Ϊ���л�,��������ļ��л�ȡ�Ĺ��� ��Ϊ�����л�
		 	ObjectOutputStream �� Java ����Ļ����������ͺ�ͼ��д�� OutputStream��

			ObjectInputStream ����ǰʹ�� ObjectOutputStream д��Ļ������ݺͶ�����з����л���

		 */
		write();
		read();
	}
}
