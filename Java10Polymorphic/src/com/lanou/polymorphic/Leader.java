package com.lanou.polymorphic;

public class Leader {
	//巡班
	/*
	 	接口多态:
	 		接口的引用指向了实现了此接口类的对象
	 */
	public void watch(TeachInterface teacher) {
		System.out.println("开始巡班");
		teacher.teach();
		System.out.println("结束巡班");
	}
}
