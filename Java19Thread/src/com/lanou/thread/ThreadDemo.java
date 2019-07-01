package com.lanou.thread;

public class ThreadDemo {

	public static void main(String[] args) {
		// 创建线程对象
		/*构造方法摘要
			Thread() 
			          分配新的 Thread 对象。
			
			Thread(String name) 
			          分配新的 Thread 对象。 
		 */
		MyThread myThread = new MyThread();
		myThread.setName("晨晨");
		MyThread myThread1 = new MyThread();
		myThread1.setName("黄黄");
		
		MyThread myThread2 = new MyThread("小黄");
		MyThread myThread3 = new MyThread("阿黄");
		//线程的启动不是run()方法.它只是用来封装线程功能方法的
		//线程的启动是执行start方法,而非run()方法
		myThread.start();
		myThread1.start();
		myThread2.start();
		myThread3.start();
		
	}

}
