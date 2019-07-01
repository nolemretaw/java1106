package com.lanou.singleton;

public class Singleton {
	// 懒汉
	// 外界能访问的单个实例
	/*
	 * private static Singleton instance; //构造方法私有化，保证外界不能允许new 本类实例 private
	 * Singleton() { }
	 * 
	 * public static Singleton getInstance() { 
	 * if (instance == null) { 
	 * instance= new Singleton();//本类new 
	 * } 
	 * return instance; 
	 * }
	 */
	// 饿汉，会造成内存的浪费
	// private static Singleton instance = new Singleton();
	//
	// private Singleton (){}
	//
	// public static Singleton getInstance() {
	// return instance;
	// }
	// 懒汉线程安全，效率低
//	private static Singleton instance;
//
//	private Singleton() {
//	}
//
//	public static synchronized Singleton getInstance() {
//		if (instance == null) {
//			instance = new Singleton();
//		}
//		return instance;
//	}
	//懒汉线程安全，效率高，双重校验
	private static Singleton instance = null;

	private Singleton() {}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

}