package com.lanpu.map;

import java.util.LinkedHashMap;

public class LInkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String,String> map = new LinkedHashMap<String,String>();
		map.put("白日鼠", "白胜");
		map.put("智多星", "吴用");
		map.put("入云龙", "公孙胜");
		map.put("赤发鬼", "刘唐");
		System.out.println(map);
		/*
		 * HashMap是基于哈希表实现的, HashMap是无序的
		 * 允许null键,null值存在的,但是null键只能有一个
		 * 线程不同步
		 */
	}

}
