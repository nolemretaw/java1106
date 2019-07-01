package com.lala.test;

public class ½»Ìæ´òÓ¡2 {
	static final Object obj = new Object();
	public static void mian(String[] args) {
		new Thread(new Runnable() {
			
				@Override
				public void run() {
					for (char a = 'A';; a++) {
						synchronized (obj) {
							if (a=='Z'+1) {
								a='A';
							}
							System.out.println(a+" ");
							try {
								obj.wait();
								obj.notify();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				}
			}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (char i = '1'; ; i++) {
					synchronized (obj) {
						if (i=='9'+1) {
							i='1';
						}
						System.out.println(i+" ");
						try {
							obj.notify();
							obj.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}).start();
	}
}
