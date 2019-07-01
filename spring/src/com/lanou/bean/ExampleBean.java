package com.lanou.bean;


public class ExampleBean {
	/**构造器*/	
	public ExampleBean(){
		System.out.println("-------构造器-------");
	}
	/**初始化方法*/
	private void init() {
		System.out.println("-------初始化-------");
	}
	/**销毁方法*/
	private void destroy(){
		System.out.println("-------销毁-------");
	}
	
}
