package com.lanou.yield;

public class YieldThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YieldThread yThread1 = new YieldThread("�߳�1");
		YieldThread yThread2 = new YieldThread("�߳�2");
		YieldThread yThread3 = new YieldThread("�߳�3");
		yThread1.start();
		yThread2.start();
		yThread3.start();
	}

}
