package com.lanou.seril;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerilDemo1 {
	//写入对象,序列化方法
	public static void write() {
		ObjectOutputStream oStream = null;
		try {
			oStream = new ObjectOutputStream(new FileOutputStream("person.txt"));
			//创建对象
			Person person = new Person("晨晨", 18, 180.0f);
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
	//读取对象,反序列化
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
		 	对象的持久化存储称为序列化,而对象从文件中获取的过程 称为反序列化
		 	ObjectOutputStream 将 Java 对象的基本数据类型和图形写入 OutputStream。

			ObjectInputStream 对以前使用 ObjectOutputStream 写入的基本数据和对象进行反序列化。

		 */
		write();
		read();
	}
}
