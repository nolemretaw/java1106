package com.lanou.practice;

public class Leader {
	//巡班
	public void watch(Teacher teacher) {
		System.out.println("开始巡班");
		teacher.teach();
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
