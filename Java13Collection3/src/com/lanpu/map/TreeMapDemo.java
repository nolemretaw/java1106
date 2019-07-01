package com.lanpu.map;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		/*TreeMap的构造方法,
		 * 1. 无参构造,对key的排序采用的是自然排序,需要的是在key的类内部实现Comparable接口,
		 * 并对compareTo方法进行实现
		 * 2. 有参构造, 可以在创建TreeMap时,传入一个比较器对象,比较器内部实现了Comparator接口,
		 * 并对compare方法进行实现,比较器是对key的类进行的比较
		 * 
		 * 
		 * Treemap是基于红黑树实现的,带有排序功能的map集合,TreeMap是有序的
		 * 允许null值的存在,但不允许null键的存在,实现是不同步的,线程不安全
		 */
		TreeMap<String, String> map = new TreeMap<String,String>();
		map.put("tuanzhang", "李云龙");
		map.put("heshang", "魏大勇");
		map.put("kaipao", "秀芹");
		map.put("zhengwei", "赵刚");
		System.out.println(map);
		
		TreeMap<Student, String> map1 = new TreeMap<Student,String>();
		map1.put(new Student("a", 18),"甲");
		map1.put(new Student("b", 22),"乙");
		map1.put(new Student("c", 24),"丙");
		map1.put(new Student("e", 19),"丁");
		System.out.println(map1);
		int size = map.size();
	}

}
