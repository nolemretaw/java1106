package com.lanou.yield;

public class YieldThread extends Thread{
	public YieldThread() {
		// TODO Auto-generated constructor stub
	}
	public YieldThread(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println(this.getName() + "HelloWorld" + i);
		}
		//�ȴ��߳�,��ÿ���߳����ᵽCPU��Դ�ĸ��ʸ��Ӿ���
		Thread.yield();
	}
	
}
