package com.lanou.runnable;

public class ThreadDemo {

	public static void main(String[] args) {
		//�����̶߳���
		/*
		 * 	Thread(Runnable target) 
			          �����µ� Thread ����
			Thread(Runnable target, String name) 
			          �����µ� Thread ����
		 */
		Thread thread  = new Thread(new RunThead(),"��");
		Thread thread1  = new Thread(new RunThead(),"��");
		
		thread.start();
		thread1.start();
	}

}
