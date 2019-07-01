package com.lanou.daemon;

public class DaemonThreadTest {
	public static void main(String[] args) {
		DaemonThread dThread = new DaemonThread();
		dThread.setName("守护线程");
		
		CommonThread cThread = new CommonThread();
		cThread.setName("非守护线程");
		
		/*
		 	设置守护线程的代码,必须在启动start()之前,
		 	如果程序中没有任意一条非守护线程,则守护线程终止销毁
		 	守护线程是伴随非守护线程
		 	eg:JVM垃圾回收就是非常称职的一个守护线程
		 */
		dThread.setDaemon(true);
		
		dThread.start();
		cThread.start();
	}
}
