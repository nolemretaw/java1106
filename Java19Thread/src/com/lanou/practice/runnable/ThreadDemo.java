package com.lanou.practice.runnable;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Thread thread = new Thread(new RunThread(),"qq");
		 Thread thread2 = new Thread(new RunThread(), "wechat");
		 thread.start();
		 thread2.start();
	}

}
