package com.lanou.teachHomework;

public class 线程死锁 {
/**
 * 线程死锁
 * 产生原因：
 * 	1、当前线程拥有其他线程所需要地资源
 * 	2、当前线程需要等待其他线程释放资源
 * 	3、双方都不释放自己已有资源
 * */
	public static void main(String[] args) {
		// 创建两把锁
		Object innerLock = new Object();
		Object outerLock = new Object();
		//门里面的人
		Thread t1 = new Thread(){
			public void run() {
				//门里面的人拥有外面的锁
				synchronized (outerLock) {
					System.out.println(Thread.currentThread()
							.getName()+" t1-->outerLock");
					synchronized (innerLock) {
						System.out.println(Thread.currentThread()
								.getName()+" t1-->innerLock，出");
					}
				}
			}
		};
		//门外面的人
		Thread t2 = new Thread(){
			//门外面的人有门里面的锁
			public void run() {
				synchronized (innerLock) {
					System.out.println(Thread.currentThread()
							.getName()+" t2-->innerLock");
					synchronized (outerLock) {
						System.out.println(Thread.currentThread()
								.getName()+" t2-->outerLock，出");
					}
				}
			}
		};
		t1.start();
		t2.start();
	}

}
