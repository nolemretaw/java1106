package com.lanou.singleton;

public class Test {
	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		Singleton instance1 = Singleton.getInstance();
		System.out.println(instance);
		System.out.println(instance1);
	}
}
