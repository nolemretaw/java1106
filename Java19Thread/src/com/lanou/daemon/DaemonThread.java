package com.lanou.daemon;

public class DaemonThread implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+ "HelloWorld" + i);
		}
	}
	
}
