package com.lanou.polymorphic;

public class Leader {
	//巡班
	/*
	 	接口多态：
	 	接口的引用指向了实现了此接口类的对象
	 */
	public void watch(TeachInterface teacher) {
		System.out.println("开始巡班");
		teacher.teach();//接口的引用指向了实现了此接口类的对象
		System.out.println("结束巡班");
	}
	
	/*public void watch(H5Teacher h5Teacher) {
		System.out.println("开始巡班");
		h5Teacher.teach();
		System.out.println("结束巡班");
	}
	public void watch(JavaTeacher javaTeacher) {
		System.out.println("开始巡班");
		javaTeacher.teach();
		System.out.println("结束巡班");
	}*/
}
