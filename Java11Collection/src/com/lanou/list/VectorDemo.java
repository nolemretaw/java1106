package com.lanou.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// Vector���߳�ͬ����
		Vector vector = new Vector();
		vector.add("����");
		vector.add("��ŷ");
		vector.add("����");
		vector.add("�ܿ�");
		System.out.println(vector);
		Enumeration elements = vector.elements();
		while (elements.hasMoreElements()) {
			Object object = (Object) elements.nextElement();
			if (object instanceof String) {
				String string = (String)object;
				if (string.equals("����")) {
					vector.add("����֮��");
				}
			}
		}
		System.out.println(vector);
	}

}
