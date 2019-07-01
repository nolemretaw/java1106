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
	private LazySingleton() {System.out.println("������");}
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
	private HungerySingleton() {System.out.println("����һ����������");}
	public static void method() {
		System.out.println("�޹ط���");
	}
	static class HungeryHold{ 
		private static HungerySingleton instance = new HungerySingleton();
		
	}
	public static HungerySingleton getInstance() {
		return HungeryHold.instance;
	}
}