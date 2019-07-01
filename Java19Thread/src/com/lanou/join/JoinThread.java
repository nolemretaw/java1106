package com.lanou.join;

public class JoinThread extends Thread{
	public JoinThread() {
		// TODO Auto-generated constructor stub
	}
	public JoinThread(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println(this.getName() + "HelloWorld" + i);
		}
	}
	
}
