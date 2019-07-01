package com.lanou.map;

import java.util.Hashtable;
import java.util.Set;

public class HashtableDemo {
	public static void main(String[] args) {
		/*
		 	1.Hashtable基于哈希表实现的,保证key的类型一定要实现hashCode 与 equals方法
		 	2.Hashtable是无序的
		 	3.Hashtable中不允许存在null值和null键
		 	4.线程同步
		 */
		Hashtable<String, String> map = new Hashtable<String, String>();
		map.put("立地太岁", "阮小二");
		map.put("短命二郎", "阮小五");
		map.put("活阎罗", "阮小七");
		System.out.println(map);
		
		
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			if (key.equals("短命二郎")) {
				map.put("小霸王", "周通");
			}
			System.out.println(map);
		}
		
		
		
		
		
		
	}
}
