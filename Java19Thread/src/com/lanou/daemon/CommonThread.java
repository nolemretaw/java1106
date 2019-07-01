package com.lanou.daemon;

public class CommonThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(this.getName() + "HelloWorld" + i);
		}
	}
}
