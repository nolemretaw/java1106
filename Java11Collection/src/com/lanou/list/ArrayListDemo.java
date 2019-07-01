package com.lanou.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("行者孙");
		list.add("孙行者");
		list.add("者行孙");
		list.add("弼马温");
		list.add("孙猴子");
		/*如果多个线程同时访问一个ArrayList实例,而其中至少一个线程从结构上修改了列表,结构上的
		 * 修改是指任何添加或删除一个或多个元素的操作,此时就会抛出异常
		 */
		/*如果以后想要在遍历list集合时,对其结构进行修改,采用for循环
		 * 而如果只是想对其元素进行遍历,就采用foreach或迭代器
		 * 
		 * ArrayList的实现不是线程同步的,线程是不安全的,同一时间多条线程可以同时访问同一个AtrraysList实例
		 */
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("者行孙")) {
				list.add("大师兄");
			}	
			System.out.println(list.get(i));
		}	
		
	}
}
