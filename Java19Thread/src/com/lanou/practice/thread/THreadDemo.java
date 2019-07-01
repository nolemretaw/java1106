package com.lanou.practice.thread;


public class THreadDemo {
	public static void main(String[] args) {
		Mythread mythread1 = new Mythread("QQ");
		Mythread myThread2 = new Mythread();
		myThread2.setName("Wechat");
		mythread1.start();
		myThread2.start();
	}
}
