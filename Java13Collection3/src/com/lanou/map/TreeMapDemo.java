package com.lanou.map;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		/*
		 	TreeMap的构造方法
			 	1.无参构造,对key的排序采用自然排序,需要在key的类内部实现Compareble接口,并对compareTo方法进行实现
			 	2.有参构造,key在创建TreeMap时,传入一个比较其对象, 比较器内部实现了Comparator接口,并对compare方法进行实现
			 	比较器是对key的类型进行的比较
			 
			 TreeMap是基于红黑树实现的,带有排序功能的map集合
			 TreeMap是有序的
			 允许null值的存在,但不允许null键的存在
			 实现是不同步的,线程不安全
		 */
		TreeMap<String, String>map = new TreeMap<String, String>();
		map.put("tuanzhang", "李云龙");
		map.put("heshang", "魏大勇");
		map.put("zhengwei", "赵刚");
		map.put("kaipao", "秀芹");
		System.out.println(map);
		
		
		
		TreeMap<Student, String> map1 = new TreeMap<Student, String>();
		map1.put(new Student("chenchen", 18), "阿黄");
		map1.put(new Student("guoxin", 22), "迷糊");
		map1.put(new Student("jianhui", 24), "见多识广");
		map1.put(new Student("huangxuan", 19), "轩神");
		System.out.println(map1);
	}
}
