package com.lanou.daemon;

public class CommandThread implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getName()+ "HelloWorld" + i);
		}
	}
	
}
