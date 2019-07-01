package com.lanou.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("zhangsan", 18 ,1));
		list.add(new Student("lisi", 38 ,10));
		list.add(new Student("wangermazi", 20 ,9));
		list.add(new Student("zhangerlvzi", 14 ,3));
		//1. 反转
		Collections.reverse(list);
		System.out.println(list);
		//2. 洗牌
		Collections.shuffle(list);
		System.out.println(list);
		//3. 排序
		Collections.sort(list);
		System.out.println(list);
		
		IdComparator idComparator =new IdComparator();
		Collections.sort(list, idComparator);
		System.out.println(list);
		/*
	 	TreeSet默认有排序的功能，而List接口没有
	 	Collections工具类扩展了List接口中排序的功能
	 	TreeSet与Collections.sort(list集合对象(一个参数))
	 	默认采用的都是自然排序
	 	自然排序：
	 	在想要排序的类内部实现Comparable接口，并实现compareTo方法
	 	根据需求制定我们的排序方案，可以实现综合排序，但实现单一排序时，只能修改源代码
	 	
	 	单一排序，借助比较器：
	 	不需要在想要排序的类内部做什么操作，只需要 创建比较器类 实现Comparator接口
	 	并实现compare方法，根据需求制定单一的排序方法，升序或者降序
	 	Collections.sort
	 */
	}

}
