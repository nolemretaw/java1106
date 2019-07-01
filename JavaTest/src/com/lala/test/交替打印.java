package com.lala.test;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public  class  ½»Ìæ´òÓ¡{
	private static Lock lock = new ReentrantLock();
	private static Condition condition1 = lock.newCondition();
	private static Condition condition2 = lock.newCondition();
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Task1());
		Thread thread2 = new Thread(new Task2());
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread1.start();
		thread2.start();
		
	}
	
	static class Task1 implements Runnable{

		@Override
		public void run() {
			
			for (char a = 'A';;a++ ) {
				lock.lock();
				try {
					if (a=='W'+1) {
						a='A';
					}
					System.out.print(a+" ");
					condition1.await();
					condition2.signal();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				lock.unlock();
			}
		}
		
	}

	static class Task2 implements Runnable{

		@Override
		public void run() {
			for (char a = '1';;a++ ) {
				lock.lock();
				try {
					if (a=='9'+1) {
						a='1';
					}
					System.out.print(a+" ");
					condition1.signal();
					condition2.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				lock.unlock();
			}
		}	
	}	
}

