package com.lanou.bean;


public class ExampleBean {
	/**������*/	
	public ExampleBean(){
		System.out.println("-------������-------");
	}
	/**��ʼ������*/
	private void init() {
		System.out.println("-------��ʼ��-------");
	}
	/**���ٷ���*/
	private void destroy(){
		System.out.println("-------����-------");
	}
	
}
