package com.lanou.test;
//接口多态 接口引用指向实现了此接口的类对象
//接口引用: 接口名(XXIntyerface)   类对象
//接口的多态是采用实现接口的方式来实现多态
public class Leader {
	public void watch(TeachInterface teacher){
		System.out.println("查班");
		teacher.teach();
	} 
}
