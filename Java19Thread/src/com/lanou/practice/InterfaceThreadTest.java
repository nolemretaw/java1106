package com.lanou.practice;

public class InterfaceThreadTest {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new ThreadByInterface(),"��");
		Thread thread2 = new Thread(new ThreadByInterface(), "��");
		thread1.start();
		thread2.start();
	}

}
