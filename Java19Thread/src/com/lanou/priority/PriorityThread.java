package com.lanou.priority;

public class PriorityThread extends Thread{
	public PriorityThread() {
		// TODO Auto-generated constructor stub
	}
	public PriorityThread(String name){
		super(name);
	}
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println(this.getName() + "HelloWorld" + i);
		}
	}
}
