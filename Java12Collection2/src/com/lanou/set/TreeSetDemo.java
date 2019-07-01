package com.lanou.set;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Student> set = new TreeSet<Student>();
		set.add(new Student("zhangsan",18,1));
		set.add(new Student("lisi",9,10));
		set.add(new Student("wangermazi",38,4));
		set.add(new Student("zhangerlvzi",11,9));
		System.out.println(set);
		System.out.println("zhangsan".compareTo("zhangsan0"));
		/*TreeSet提供了默认的自然排序功能,以及元素不重复功能,方式采用的是Compareble中的compareTo功能
		 * TreeSet接口中的泛型类有自然排序功能
		 * 此方法的返回值为整数,如果为0,则代表元素重复,此时元素不会添加到Treeset集合中,
		 * 如果返回值不为0,大于0代表前面的元素大,会放到集合的末尾,若小于0,代表前面的元素小,会放到头部
		 * 
		 * TreeSet是有序集合,并且实现是不同步的
		 */
	}

}
