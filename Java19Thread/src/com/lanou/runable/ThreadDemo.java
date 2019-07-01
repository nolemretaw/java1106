package com.lanou.runable;

public class ThreadDemo {
	public static void main(String[] args) {
		//创建线程对象
		/*构造方法摘要
		Thread(Runnable target) 
		          分配新的 Thread 对象。
		Thread(Runnable target, String name) 
		          分配新的 Thread 对象。
*/
		Thread thread = new Thread(new RunThread());
		thread.setName("晨晨");
		Thread thread2 = new Thread(new RunThread());
		thread2.setName("黄黄");
		Thread thread3 = new Thread(new RunThread(), "小黄");
		Thread thread4 = new Thread(new RunThread(), "大黄");
		
		thread.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}
}
