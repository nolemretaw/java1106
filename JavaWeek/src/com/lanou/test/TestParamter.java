package com.lanou.test;

public class TestParamter {
	private static int a = 10;
	
	
	public void primitive(){
		System.out.println("a:"+a);
	} 
	public void addA() {
		a++;
		System.out.println("a:"+a);
	}
	public void subA(){
		a--;
		System.out.println("a:"+a);
	}
}
