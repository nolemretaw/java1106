package com.lanou.practice.thread;

public class Mythread extends Thread {
	public Mythread() {
		super();
	}
	
	public Mythread(Runnable target, String name) {
		super(target, name);
		// TODO Auto-generated constructor stub
	}

	public Mythread(Runnable target) {
		super(target);
		// TODO Auto-generated constructor stub
	}

	public Mythread(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Mythread(ThreadGroup group, Runnable target, String name, long stackSize) {
		super(group, target, name, stackSize);
		// TODO Auto-generated constructor stub
	}

	public Mythread(ThreadGroup group, Runnable target, String name) {
		super(group, target, name);
		// TODO Auto-generated constructor stub
	}

	public Mythread(ThreadGroup group, Runnable target) {
		super(group, target);
		// TODO Auto-generated constructor stub
	}

	public Mythread(ThreadGroup group, String name) {
		super(group, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println("�߳�"+i+this.getName());
		}
	}
}
