package com.lanou.list;

import java.util.List;
import java.util.ArrayList;

public class ListDemo1 {
	public static void main(String[] args) {
		/*list 接口是有序的相对于父接口,存在索引,所以在元素操作,如赋值,取值,改值,查询等一系列操作都变得更加灵活
		 * 而父接口collection的方法同样可用
		 */
		//创建一个list集合
		List list = new ArrayList();
		//1.添加元素方法
		list.add("哈士奇");
		list.add("金毛");
		list.add("八哥");
		list.add("斗牛");
		System.out.println(list);
		//在指定下标下添加元素
		list.add(1,"牛头梗");
		System.out.println(list);
		//2.获取元素的方法
		System.out.println(list.get(1));
		//3.删除元素的方法
		//删除制定下标下的元素,下标不能越界
		list.remove(3);
		System.out.println(list);
		//4.修改方法
		list.set(1, "比熊");
		System.out.println(list);
		//5.获取元素下标
		/*indexOf方法返回的是元素在list集合中的第一个出现的位置,若元素不存在则返回-1
		 */
		System.out.println(list.indexOf("比熊"));
		/*lastIndexOf方法返回的是元素在list集合中的最后一个出现的位置,若元素不存在则返回-1
		 */
		System.out.println(list.lastIndexOf("斗牛"));
	}
}
