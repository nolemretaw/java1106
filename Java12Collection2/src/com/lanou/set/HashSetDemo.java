package com.lanou.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSetDemo {

	public static void main(String[] args) {
		/* 因为重写的equal()里一般比较的比较全面比较复杂，这样效率就比较低，
		 * 而利用hashCode()进行对比，则只要生成一个hash值进行比较就可以了，效率很高，
		 * 那么hashCode()既然效率这么高为什么还要equal()呢？
 
           因为hashCode()并不是完全可靠，有时候不同的对象他们生成的hashcode也会一样
			（生成hash值得公式可能存在的问题），所以hashCode()只能说是大部分时候可靠，
			并不是绝对可靠，所以我们可以得出：
 
         1.equal()相等的两个对象他们的hashCode()肯定相等，也就是用equal()对比是绝对可靠的。
         2.hashCode()相等的两个对象他们的equal()不一定相等，也就是hashCode()不是绝对可靠的。
 
			所有对于需要大量并且快速的对比的话如果都用equal()去做显然效率太低,
			所以解决方式是，每当需要对比的时候，首先用hashCode()去对比，如果hashCode()不一样，
			则表示这两个对象肯定不相等（也就是不必再用equal()去再对比了）,
			如果hashCode()相同，此时再对比他们的equal()，如果equal()也相同，则表示这两个对象是真的相同了，
			这样既能大大提高了效率也保证了对比的绝对正确性
		 */
		HashSet<String> set = new HashSet<String>();
		set.add("d");
		set.add("c");
		set.add("a");
		set.add("b");
		System.out.println(set);
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		for (String string : set) {
			System.out.println(string);
		}
		
	}
		
	/*HashSet是线程不同步的,不能在遍历是进行结构修改,(不能增删)
	 * 1. 迭代器
	 * 2. foreach
	 */
	
}
