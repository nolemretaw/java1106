package com.lala.singleton;


public class SingletonTest {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(LazySingleton.getInstance());
				
			}
		}).start();
	}
}
class LazySingleton{
	private static LazySingleton instance;
	private LazySingleton() {System.out.println("懒加载");}
	public static LazySingleton getInstance() {
		if (instance==null) {
			synchronized (LazySingleton.class) {
				if (instance==null) {
					instance=new LazySingleton();
				}
			}
		}
		return instance;
	}
}
class HungerySingleton{
	private HungerySingleton() {System.out.println("这是一个饿汉单例");}
	public static void method() {
		System.out.println("无关方法");
	}
	static class HungeryHold{ 
		private static HungerySingleton instance = new HungerySingleton();
		
	}
	public static HungerySingleton getInstance() {
		return HungeryHold.instance;
	}
}