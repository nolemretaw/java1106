package com.lanou.daemon;

public class DaemoThreadTest {

	public static void main(String[] args) {
		Thread dthread = new Thread(new DaemonThread(), "守护线程");
		Thread cthread = new Thread(new CommandThread(), "非守护线程");
		/*
		 * 设置守护线程的代码必须再start()之前,如果程序中没有任意一条非守护线程,则守护线程终止销毁
		 * 守护线程是伴随非守护线程的
		 * 比如:JVM垃圾回收就是一条守护线程
		 */
		dthread.setDaemon(true);
		dthread.start();
		cthread.start();
	}
}



