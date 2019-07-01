package com.lanou.runnable;

public class ThreadDemo {

	public static void main(String[] args) {
		//创建线程对象
		/*
		 * 	Thread(Runnable target) 
			          分配新的 Thread 对象。
			Thread(Runnable target, String name) 
			          分配新的 Thread 对象。
		 */
		Thread thread  = new Thread(new RunThead(),"甲");
		Thread thread1  = new Thread(new RunThead(),"乙");
		
		thread.start();
		thread1.start();
	}

}
