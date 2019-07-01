package com.lanou.practice;

public class InterfaceThreadTest {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new ThreadByInterface(),"¼×");
		Thread thread2 = new Thread(new ThreadByInterface(), "ÒÒ");
		thread1.start();
		thread2.start();
	}

}
