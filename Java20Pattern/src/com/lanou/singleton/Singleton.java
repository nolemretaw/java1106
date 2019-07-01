package com.lanou.singleton;

public class Singleton {
	//外界能访问的单个实例
	private static Singleton instance;

	//构造方法私有化,保证外界不允许new本类实例
	private Singleton() {
		
	}

	//提供给外界的访问方法
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
