package com.lanou.practice;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(){
		HashSet<String> set = new HashSet<String>();
		set.add("ËïÎò¿Õ");
		set.add("ËïÎò·¹");
		set.add("ËïÎòÌì");
		set.add("Ä§ÈË²¼Å·");
		System.out.println(set);
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
//		for (String string : set ) {
//			System.out.println(string);
//		}
	}
}
