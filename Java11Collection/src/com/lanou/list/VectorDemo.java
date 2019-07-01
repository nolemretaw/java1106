package com.lanou.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// Vector是线程同步的
		Vector vector = new Vector();
		vector.add("赛文");
		vector.add("雷欧");
		vector.add("迪迦");
		vector.add("杰克");
		System.out.println(vector);
		Enumeration elements = vector.elements();
		while (elements.hasMoreElements()) {
			Object object = (Object) elements.nextElement();
			if (object instanceof String) {
				String string = (String)object;
				if (string.equals("迪迦")) {
					vector.add("奥特之父");
				}
			}
		}
		System.out.println(vector);
	}

}
