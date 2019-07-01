package com.lanou.practice;

public class MyThreadByInherit extends Thread {
	public MyThreadByInherit() {
		// TODO Auto-generated constructor stub
	}
	public MyThreadByInherit (String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(this.getName() + i);
		}
	}
}
