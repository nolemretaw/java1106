package com.lanou.polymorphic;

public class Initial {
	public static void main(String[] args) {
		Leader leader = new Leader();
		/*
	 	接口多态：
	 	接口的引用指向了实现了此接口类的对象
	 */
		TeachInterface teachInterface = new JavaTeacher();
		leader.watch(teachInterface);
		
		TeachInterface teachInterface1 = new H5Teacher();
		leader.watch(teachInterface1);
	}
}

