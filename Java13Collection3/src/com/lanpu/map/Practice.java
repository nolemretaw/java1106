package com.lanpu.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("1");
		list.add("3");
		list.add("1");
		//去除重复元素
		//1. 利用Set集合的不重复性
		HashSet<String> set = new HashSet<String>(list);
		System.out.println(set);
		
		//2. 利用Map集合的不重复性
		HashMap<String, String> map = new HashMap<String,String>();
		for (String string : list) {
			map.put(string, "");
		}
		System.out.println(map.keySet());
		
		String str = "i have a dream i have a dream i have";
		//统计每个单词出现的次数
		HashMap<String, Integer> map1 = new HashMap<String , Integer>();
		//分割
		String[] strs = str.split(" ");
		for (String string : strs) {
			if (map1.containsKey(string)) {
				Integer integer = map1.get(string);
				integer++;//Integer是int的应用包装类型
				map1.put(string, integer);
			}else {
				map1.put(string, 1);
			}
		}
		System.out.println(map1);
		
		
	}

}
