package com.lanou.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerialDemo2 {
	//д�����, ���л�����
	public static void write() {
		ObjectOutputStream oStream = null;
		try {
			oStream = new ObjectOutputStream(new FileOutputStream("Person.txt"));
			//��������
			Person person = new Person("����", 18, 180.0f);
			Person person1 = new Person("����", 19, 178.0f);
			Person person2 = new Person("����", 30, 150.0f);
			ArrayList<Person> list = new ArrayList<Person>();
			list.add(person);
			list.add(person1);
			list.add(person2);
			oStream.writeObject(list);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (oStream != null) {
				try {
					oStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public static void read() {
		ObjectInputStream iStream = null;
		try {
			iStream = new ObjectInputStream(new FileInputStream("person.txt"));
			Object object = iStream.readObject();
			if (object instanceof ArrayList) {
				ArrayList<Person> person = (ArrayList<Person>) object;
				for (Person p : person) {
					System.out.println(p);
				}
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
		}finally {
			if (iStream != null) {
				try {
					iStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) {
		/*����ĳ־û��洢,��Ϊ���л�, ������ļ��л�ȡ�Ĺ���,��Ϊ�����л�
		 * ObjectOutputStream �� Java ����Ļ����������ͺ�ͼ��д�� OutputStream��
		 * 
		 * ObjectInputStream ����ǰʹ�� ObjectOutputStream д��Ļ������ݺͶ�����з����л���
		 */
//		write();
		read();
	}

}
