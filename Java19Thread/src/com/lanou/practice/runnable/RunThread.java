package com.lanou.practice.runnable;

public class RunThread implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println("Ïß³Ì"+Thread.currentThread().getName()+i);
		}
		
	}

}
