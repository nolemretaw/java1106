package com.lanou.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Practice {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("1");
		list.add("3");
		list.add("1");
		
		//1.set集合去除重复元素
		HashSet<String> set = new HashSet<String>(list);
		System.out.println(set);
		
		//2.Map集合key的不重复性
		HashMap<String, String> map = new HashMap<String, String>();
		for (String string : set) {
			map.put(string, "");
		}
		System.out.println(map.keySet());
		
		
		
		String str = "i have a dream i have a dream i have";
		//统计每个单词出现的次数
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		//分割
		String[] strs = str.split(" ");
		for (String string : strs) {
			if (map1.containsKey(string)) {
				Integer integer= map1.get(string);//取次数
				integer++;
				map1.put(string, integer);//刷新次数
			} else {
				map1.put(string, 1);
			}
		}
		System.out.println(map1);
		
		
		
		
	}
}
