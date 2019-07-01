package com.lanou.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerialDemo2 {
	
	public static void write() {
		ObjectOutputStream oStream = null;
		try {
			oStream = new ObjectOutputStream(new FileOutputStream("Person.txt"));
			Person person = new Person("好哈",22,343.0f);
			Person person1 = new Person("给电饭锅",25,33.0f);
			Person person2 = new Person("规划图",43,55.0f);
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
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		write();
		read();
	}

}
