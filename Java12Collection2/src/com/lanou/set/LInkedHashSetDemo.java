package com.lanou.set;

import java.util.LinkedHashSet;

public class LInkedHashSetDemo {

	public static void main(String[] args) {
		/*LinkedHashSet是有序的,基于哈希表与链表实现的
		 * HashSet无序
		 * TreeSet有序是因为有自然排序功能
		 * LinkedHashSet有序是指添加顺序,并且实现是不同步的
		 */
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("火娃");
		set.add("水娃");
		set.add("大力娃");
		set.add("小蝴蝶");
		System.out.println(set);
	}

	
	
	
}

