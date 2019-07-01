package com.lanou.yield;

public class YieldThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YieldThread yThread1 = new YieldThread("线程1");
		YieldThread yThread2 = new YieldThread("线程2");
		YieldThread yThread3 = new YieldThread("线程3");
		yThread1.start();
		yThread2.start();
		yThread3.start();
	}

}
