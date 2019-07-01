package com.lanou.list;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("白胡子");
		list.add("黑胡子");
		list.add("赤犬");
		list.add("黄源");
		list.add("青雉");
		list.addFirst("路飞");
		System.out.println(list);
		list.addLast("索隆");
		System.out.println(list);
		//返回列表的第一个元素以及最后一个元素
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		//移除并返回
		list.push("娜美");
		System.out.println(list);
		System.out.println(list.pop());
		/*ArrayList与LinkedList都不是线程同步的,所以不能遍历的同时,进行删除添加
		 * 
		 * ArrayList与LinkedList的区别:
		 * 1. ArrayList是基于动态数组实现的,而LinkedList是基于链表实现的
		 * 2. ArrayList在添加删除时效率低,因为要移动数据
		 * 3. LinkedList在获取查找时效率低,因为要移动指针,反之,如果想要添加删除时效率高
		 * 
		 */
	}
}