package com.lanou.practice;

public class ThreadByInterface implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() + i);
		}
	}
	
}
