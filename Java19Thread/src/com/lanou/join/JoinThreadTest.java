package com.lanou.join;

public class JoinThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoinThread jThread1 = new JoinThread("线程1");
		JoinThread jThread2 = new JoinThread("线程2");
		JoinThread jThread3 = new JoinThread("线程3");
		jThread1.start();
		try {
			/*
		当多个线程执行时,需要依赖某一线程执行下之后的资源或者结果时,可以将依赖的这条线程设置为加入线程.
		加入线程为优先执行完毕,其余线程才能执行
		*/
			jThread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jThread2.start();
		jThread3.start();
	}

}
