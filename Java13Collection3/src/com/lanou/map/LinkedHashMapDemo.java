package com.lanou.map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		/*
	 	LinkedHashMap是基于哈希表与链表实现的
	 	LinkedHashMap是有序的
	 	允许null键和null值得存在,null键只能有一个,而值可以有多个
	 	时限不同步,线程不安全
	 */
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put("白日鼠", "白胜");
		map.put("智多星", "吴用");
		map.put("入云龙", "公孙胜");
		map.put("赤发鬼", "刘唐");
		System.out.println(map);
		
		
		
	}
}
