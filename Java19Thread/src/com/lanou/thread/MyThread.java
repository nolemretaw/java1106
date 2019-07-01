package com.lanou.thread;
/*
 * 线程的第一种创建方式:
 * 新建类,继承Thread类,并且重写run方法
 */
public class MyThread extends Thread{
	public MyThread() {
		// TODO Auto-generated constructor stub
	}
	public MyThread(String name) {
		super(name);
	}
	@Override
	public void run() {
		/*run方法中的代码就是程序中操作耗时较大的代码,run方法中的功能就是此线程的功能
		 * 线程是功能过执行,代码依赖执行的
		 * 
		 */
		for (int i = 0; i < 50; i++) {
			System.out.println(this.getName() + "HelloWorld" + i);
		}
	}
}
